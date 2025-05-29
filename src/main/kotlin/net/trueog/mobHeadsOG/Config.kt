package net.trueog.mobHeadsOG

import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.entity.EntityType
import java.io.File

class Config {
    val dropChances: MutableMap<EntityType, Double> = mutableMapOf()

    var chargedCreeperChance: Double = 0.0

    /**
     * @return True if successful
     */
    fun load(): Boolean {
        val file = File(MobHeadsOG.plugin.dataFolder, "config.yml")
        if (!file.exists()) {
            MobHeadsOG.plugin.saveDefaultConfig()
        }
        val config = YamlConfiguration.loadConfiguration(file)
        config.save(file)

        val dropChancesSection = config.getConfigurationSection("dropChances")
        if (dropChancesSection == null) {
            MobHeadsOG.plugin.logger.severe("Couldn't find a valid dropChances section in the config")
            return false
        }
        for (key in dropChancesSection.getKeys(false)) {
            if (key.lowercase() == "charged_creeper") {
                val dropChance = try {
                    dropChancesSection.get(key) as Double
                } catch (_: ClassCastException) {
                    MobHeadsOG.plugin.logger.severe("Failed to parse the drop chance of $key as a valid double")
                    return false
                }
                chargedCreeperChance = dropChance
                continue
            }

            val entityType = try {
                EntityType.valueOf(key.uppercase())
            } catch (_: IllegalArgumentException) {
                MobHeadsOG.plugin.logger.severe("Failed to parse $key as a valid EntityType")
                return false
            }

            val dropChance = try {
                dropChancesSection.get(key) as Double
            } catch (_: ClassCastException) {
                MobHeadsOG.plugin.logger.severe("Failed to parse the drop chance of $key as a valid double")
                return false
            }

            if (dropChance > 1 || dropChance < 0) {
                MobHeadsOG.plugin.logger.severe("The drop chance of $key is not a valid chance (the drop chance must not be smaller than 0 and not bigger than 1)")
                return false
            }

            dropChances[entityType] = dropChance
        }

        return true
    }
}