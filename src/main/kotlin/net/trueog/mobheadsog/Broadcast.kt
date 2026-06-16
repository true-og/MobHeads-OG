package net.trueog.mobheadsog

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
import net.luckperms.api.LuckPermsProvider
import org.bukkit.Bukkit
import org.bukkit.entity.Creeper
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player

object Broadcast {
    private val mm = MiniMessage.miniMessage()
    private val legacy = LegacyComponentSerializer.builder().character('&').hexColors().build()

    /** Announce that [killer] beheaded [entity] to every online player in a whitelisted world. */
    fun beheaded(killer: Player, entity: Entity) {
        val config = MobHeadsOG.config
        if (!config.broadcastEnabled) {
            return
        }
        if (config.broadcastWorlds.isEmpty()) {
            return
        }

        val rawPrefix = (getPrefix(killer) ?: "").replace('§', '&')
        val prefix = legacy.deserialize(rawPrefix)
        val name = legacy.deserialize(trailingColor(rawPrefix) + killer.name)
        val mob = Component.text(mobName(entity))

        val message =
            mm.deserialize(
                config.broadcastMessage,
                Placeholder.component("prefix", prefix),
                Placeholder.component("name", name),
                Placeholder.component("mob", mob),
            )

        for (player in Bukkit.getOnlinePlayers()) {
            if (player.world.name in config.broadcastWorlds) {
                player.sendMessage(message)
            }
        }
    }

    /** @return The player's LuckPerms prefix, or null if LuckPerms is absent or the player has none. */
    private fun getPrefix(player: Player): String? {
        if (Bukkit.getPluginManager().getPlugin("LuckPerms") == null) {
            return null
        }
        return try {
            val luckPerms = LuckPermsProvider.get()
            val user = luckPerms.getPlayerAdapter(Player::class.java).getUser(player)
            user.cachedData.metaData.prefix
        } catch (_: Exception) {
            null
        }
    }

    /** @return The last color/hex code (with its '&') in [raw], or an empty string if there is none. */
    private fun trailingColor(raw: String): String {
        var result = ""
        var i = 0
        while (i < raw.length) {
            if (raw[i] != '&' || i + 1 >= raw.length) {
                i++
                continue
            }
            val code = raw[i + 1].lowercaseChar()
            when {
                code == '#' && i + 7 < raw.length -> {
                    result = raw.substring(i, i + 8) // &#rrggbb
                    i += 8
                }
                code in "0123456789abcdef" -> {
                    result = raw.substring(i, i + 2)
                    i += 2
                }
                code == 'r' -> {
                    result = "" // Reset clears the active color.
                    i += 2
                }
                code in "klmno" -> i += 2 // Formatting codes leave the color untouched.
                else -> i++
            }
        }
        return result
    }

    /** @return A human readable name for [entity] to display in the broadcast. */
    private fun mobName(entity: Entity): String {
        if (entity.type == EntityType.CREEPER) {
            return if ((entity as Creeper).isPowered) "Charged Creeper" else "Creeper"
        }
        return Heads.getNameForEntity(entity)
            ?: entity.type.name.split("_").joinToString(" ") { word ->
                word.lowercase().replaceFirstChar(Char::uppercase)
            }
    }
}
