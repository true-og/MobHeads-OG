package net.trueog.mobHeadsOG

import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class MobHeadsOG : JavaPlugin() {
    companion object {
        lateinit var plugin: MobHeadsOG
        val mm = MiniMessage.builder().tags(TagResolver.builder().resolver(StandardTags.color()).build()).build()
        lateinit var config: Config
    }

    override fun onEnable() {
        plugin = this

        Companion.config = Config()
        if (!Companion.config.load()) {
            Bukkit.getPluginManager().disablePlugin(this)
            return
        }

        this.server.pluginManager.registerEvents(Events(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
