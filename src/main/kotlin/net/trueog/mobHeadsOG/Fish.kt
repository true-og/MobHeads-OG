package net.trueog.mobHeadsOG

import org.bukkit.DyeColor
import org.bukkit.entity.TropicalFish
import org.bukkit.material.Dye

object Fish {
    enum class SpecialFishType {
                 // bodyColor[-patternColor] pattern
        ANEMONE, // Orange-Gray Stripey
        BLACK_TANG, // Gray Flopper
        BLUE_TANG, // Gray-Blue Flopper
        BUTTERFLYFISH, // White-Gray Clayfish
        CICHLID, // Blue-Gray Sunstreak
        CLOWNFISH, // Orange-White Kob
        COTTON_CANDY_BETTA, // Pink-Light Blue Spotty
        DOTTYBACK, // Purple-Yellow Blockfish
        EMPEROR_RED_SNAPPER, // White-Red Clayfish
        GOATFISH, // White-Yellow Spotty
        MOORISH_IDOL, // White-Gray Glitter
        ORNATE_BUTTERFLYFISH, // White-Orange Clayfish
        PARROTFISH, // Cyan-Pink Dasher
        QUEEN_ANGELFISH, // Lime-Light Blue Brinely
        RED_CICHLID, // Red-White Betty
        RED_LIPPED_BLENNY, // Gray-Red Snooper
        RED_SNAPPER, // Red-White Blockfish
        THREADFIN, // White-Yellow Flopper
        TOMATO_CLOWNFISH, // Red-White Kob
        TRIGGERFISH, // Gray-White Sunstreak
        YELLOWTAIL_PARROTFISH, // Cyan-Yellow Dasher
        YELLOW_TANG // Yellow Flopper
    }

    fun getSpecialFishType(fish: TropicalFish): SpecialFishType? {
        if (fish.bodyColor == DyeColor.ORANGE && fish.patternColor == DyeColor.GRAY && fish.pattern === TropicalFish.Pattern.STRIPEY) {
            return SpecialFishType.ANEMONE
        }
        else if (fish.bodyColor == DyeColor.GRAY && fish.patternColor == DyeColor.GRAY && fish.pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.BLACK_TANG
        }
        else if (fish.bodyColor == DyeColor.GRAY && fish.patternColor == DyeColor.BLUE && fish.pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.BLUE_TANG
        }
        else if (fish.bodyColor == DyeColor.WHITE && fish.patternColor == DyeColor.GRAY && fish.pattern == TropicalFish.Pattern.CLAYFISH) {
            return SpecialFishType.BUTTERFLYFISH
        }
        else if (fish.bodyColor == DyeColor.BLUE && fish.patternColor == DyeColor.GRAY && fish.pattern == TropicalFish.Pattern.SUNSTREAK) {
            return SpecialFishType.CICHLID
        }
        else if (fish.bodyColor == DyeColor.ORANGE && fish.patternColor == DyeColor.WHITE && fish.pattern == TropicalFish.Pattern.KOB) {
            return SpecialFishType.CLOWNFISH
        }
        else if (fish.bodyColor == DyeColor.PINK && fish.patternColor == DyeColor.LIGHT_BLUE && fish.pattern == TropicalFish.Pattern.SPOTTY) {
            return SpecialFishType.COTTON_CANDY_BETTA
        }
        else if (fish.bodyColor == DyeColor.PURPLE && fish.patternColor == DyeColor.YELLOW && fish.pattern == TropicalFish.Pattern.BLOCKFISH) {
            return SpecialFishType.DOTTYBACK
        }
        else if (fish.bodyColor == DyeColor.WHITE && fish.patternColor == DyeColor.RED && fish.pattern == TropicalFish.Pattern.CLAYFISH) {
            return SpecialFishType.EMPEROR_RED_SNAPPER
        }
        else if (fish.bodyColor == DyeColor.WHITE && fish.patternColor == DyeColor.YELLOW && fish.pattern == TropicalFish.Pattern.SPOTTY) {
            return SpecialFishType.GOATFISH
        }
        else if (fish.bodyColor == DyeColor.WHITE && fish.patternColor == DyeColor.GRAY && fish.pattern == TropicalFish.Pattern.GLITTER) {
            return SpecialFishType.MOORISH_IDOL
        }
        else if (fish.bodyColor == DyeColor.WHITE && fish.patternColor == DyeColor.ORANGE && fish.pattern == TropicalFish.Pattern.CLAYFISH) {
            return SpecialFishType.ORNATE_BUTTERFLYFISH
        }
        else if (fish.bodyColor == DyeColor.CYAN && fish.patternColor == DyeColor.PINK && fish.pattern == TropicalFish.Pattern.DASHER) {
            return SpecialFishType.PARROTFISH
        }
        else if (fish.bodyColor == DyeColor.LIME && fish.patternColor == DyeColor.LIGHT_BLUE && fish.pattern == TropicalFish.Pattern.BRINELY) {
            return SpecialFishType.QUEEN_ANGELFISH
        }
        else if (fish.bodyColor == DyeColor.RED && fish.patternColor == DyeColor.WHITE && fish.pattern == TropicalFish.Pattern.BETTY) {
            return SpecialFishType.RED_CICHLID
        }
        else if (fish.bodyColor == DyeColor.GRAY && fish.patternColor == DyeColor.RED && fish.pattern == TropicalFish.Pattern.SNOOPER) {
            return SpecialFishType.RED_LIPPED_BLENNY
        }
        else if (fish.bodyColor == DyeColor.RED && fish.patternColor == DyeColor.WHITE && fish.pattern == TropicalFish.Pattern.BLOCKFISH) {
            return SpecialFishType.RED_SNAPPER
        }
        else if (fish.bodyColor == DyeColor.WHITE && fish.patternColor == DyeColor.YELLOW && fish.pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.THREADFIN
        }
        else if (fish.bodyColor == DyeColor.RED && fish.patternColor == DyeColor.WHITE && fish.pattern == TropicalFish.Pattern.KOB) {
            return SpecialFishType.TOMATO_CLOWNFISH
        }
        else if (fish.bodyColor == DyeColor.GRAY && fish.patternColor == DyeColor.WHITE && fish.pattern == TropicalFish.Pattern.SUNSTREAK) {
            return SpecialFishType.TRIGGERFISH
        }
        else if (fish.bodyColor == DyeColor.CYAN && fish.patternColor == DyeColor.YELLOW && fish.pattern == TropicalFish.Pattern.DASHER) {
            return SpecialFishType.YELLOWTAIL_PARROTFISH
        }
        else if (fish.bodyColor == DyeColor.YELLOW && fish.patternColor == DyeColor.YELLOW && fish.pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.YELLOW_TANG
        }
        return null
    }

    fun getSpecialFishType(bodyColor: DyeColor, patternColor: DyeColor, pattern: TropicalFish.Pattern): SpecialFishType? {
        if (bodyColor == DyeColor.ORANGE && patternColor == DyeColor.GRAY && pattern === TropicalFish.Pattern.STRIPEY) {
            return SpecialFishType.ANEMONE
        }
        else if (bodyColor == DyeColor.GRAY && patternColor == DyeColor.GRAY && pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.BLACK_TANG
        }
        else if (bodyColor == DyeColor.GRAY && patternColor == DyeColor.BLUE && pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.BLUE_TANG
        }
        else if (bodyColor == DyeColor.WHITE && patternColor == DyeColor.GRAY && pattern == TropicalFish.Pattern.CLAYFISH) {
            return SpecialFishType.BUTTERFLYFISH
        }
        else if (bodyColor == DyeColor.BLUE && patternColor == DyeColor.GRAY && pattern == TropicalFish.Pattern.SUNSTREAK) {
            return SpecialFishType.CICHLID
        }
        else if (bodyColor == DyeColor.ORANGE && patternColor == DyeColor.WHITE && pattern == TropicalFish.Pattern.KOB) {
            return SpecialFishType.CLOWNFISH
        }
        else if (bodyColor == DyeColor.PINK && patternColor == DyeColor.LIGHT_BLUE && pattern == TropicalFish.Pattern.SPOTTY) {
            return SpecialFishType.COTTON_CANDY_BETTA
        }
        else if (bodyColor == DyeColor.PURPLE && patternColor == DyeColor.YELLOW && pattern == TropicalFish.Pattern.BLOCKFISH) {
            return SpecialFishType.DOTTYBACK
        }
        else if (bodyColor == DyeColor.WHITE && patternColor == DyeColor.RED && pattern == TropicalFish.Pattern.CLAYFISH) {
            return SpecialFishType.EMPEROR_RED_SNAPPER
        }
        else if (bodyColor == DyeColor.WHITE && patternColor == DyeColor.YELLOW && pattern == TropicalFish.Pattern.SPOTTY) {
            return SpecialFishType.GOATFISH
        }
        else if (bodyColor == DyeColor.WHITE && patternColor == DyeColor.GRAY && pattern == TropicalFish.Pattern.GLITTER) {
            return SpecialFishType.MOORISH_IDOL
        }
        else if (bodyColor == DyeColor.WHITE && patternColor == DyeColor.ORANGE && pattern == TropicalFish.Pattern.CLAYFISH) {
            return SpecialFishType.ORNATE_BUTTERFLYFISH
        }
        else if (bodyColor == DyeColor.CYAN && patternColor == DyeColor.PINK && pattern == TropicalFish.Pattern.DASHER) {
            return SpecialFishType.PARROTFISH
        }
        else if (bodyColor == DyeColor.LIME && patternColor == DyeColor.LIGHT_BLUE && pattern == TropicalFish.Pattern.BRINELY) {
            return SpecialFishType.QUEEN_ANGELFISH
        }
        else if (bodyColor == DyeColor.RED && patternColor == DyeColor.WHITE && pattern == TropicalFish.Pattern.BETTY) {
            return SpecialFishType.RED_CICHLID
        }
        else if (bodyColor == DyeColor.GRAY && patternColor == DyeColor.RED && pattern == TropicalFish.Pattern.SNOOPER) {
            return SpecialFishType.RED_LIPPED_BLENNY
        }
        else if (bodyColor == DyeColor.RED && patternColor == DyeColor.WHITE && pattern == TropicalFish.Pattern.BLOCKFISH) {
            return SpecialFishType.RED_SNAPPER
        }
        else if (bodyColor == DyeColor.WHITE && patternColor == DyeColor.YELLOW && pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.THREADFIN
        }
        else if (bodyColor == DyeColor.RED && patternColor == DyeColor.WHITE && pattern == TropicalFish.Pattern.KOB) {
            return SpecialFishType.TOMATO_CLOWNFISH
        }
        else if (bodyColor == DyeColor.GRAY && patternColor == DyeColor.WHITE && pattern == TropicalFish.Pattern.SUNSTREAK) {
            return SpecialFishType.TRIGGERFISH
        }
        else if (bodyColor == DyeColor.CYAN && patternColor == DyeColor.YELLOW && pattern == TropicalFish.Pattern.DASHER) {
            return SpecialFishType.YELLOWTAIL_PARROTFISH
        }
        else if (bodyColor == DyeColor.YELLOW && patternColor == DyeColor.YELLOW && pattern == TropicalFish.Pattern.FLOPPER) {
            return SpecialFishType.YELLOW_TANG
        }
        return null
    }
}