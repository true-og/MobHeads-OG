package net.trueog.mobheadsog

import org.bukkit.DyeColor
import org.bukkit.entity.TropicalFish

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
        YELLOW_TANG, // Yellow Flopper
    }

    data class FishKey(val bodyColor: DyeColor, val patternColor: DyeColor, val pattern: TropicalFish.Pattern)

    val specialFishTypeMap =
        mapOf<FishKey, SpecialFishType>(
            FishKey(DyeColor.ORANGE, DyeColor.GRAY, TropicalFish.Pattern.STRIPEY) to SpecialFishType.ANEMONE,
            FishKey(DyeColor.GRAY, DyeColor.GRAY, TropicalFish.Pattern.FLOPPER) to SpecialFishType.BLACK_TANG,
            FishKey(DyeColor.GRAY, DyeColor.BLUE, TropicalFish.Pattern.FLOPPER) to SpecialFishType.BLUE_TANG,
            FishKey(DyeColor.WHITE, DyeColor.GRAY, TropicalFish.Pattern.CLAYFISH) to SpecialFishType.BUTTERFLYFISH,
            FishKey(DyeColor.BLUE, DyeColor.GRAY, TropicalFish.Pattern.SUNSTREAK) to SpecialFishType.CICHLID,
            FishKey(DyeColor.ORANGE, DyeColor.WHITE, TropicalFish.Pattern.KOB) to SpecialFishType.CLOWNFISH,
            FishKey(DyeColor.PINK, DyeColor.LIGHT_BLUE, TropicalFish.Pattern.SPOTTY) to
                SpecialFishType.COTTON_CANDY_BETTA,
            FishKey(DyeColor.PURPLE, DyeColor.YELLOW, TropicalFish.Pattern.BLOCKFISH) to SpecialFishType.DOTTYBACK,
            FishKey(DyeColor.WHITE, DyeColor.RED, TropicalFish.Pattern.CLAYFISH) to SpecialFishType.EMPEROR_RED_SNAPPER,
            FishKey(DyeColor.WHITE, DyeColor.YELLOW, TropicalFish.Pattern.SPOTTY) to SpecialFishType.GOATFISH,
            FishKey(DyeColor.WHITE, DyeColor.GRAY, TropicalFish.Pattern.GLITTER) to SpecialFishType.MOORISH_IDOL,
            FishKey(DyeColor.WHITE, DyeColor.ORANGE, TropicalFish.Pattern.CLAYFISH) to
                SpecialFishType.ORNATE_BUTTERFLYFISH,
            FishKey(DyeColor.CYAN, DyeColor.PINK, TropicalFish.Pattern.DASHER) to SpecialFishType.PARROTFISH,
            FishKey(DyeColor.LIME, DyeColor.LIGHT_BLUE, TropicalFish.Pattern.BRINELY) to
                SpecialFishType.QUEEN_ANGELFISH,
            FishKey(DyeColor.RED, DyeColor.WHITE, TropicalFish.Pattern.BETTY) to SpecialFishType.RED_CICHLID,
            FishKey(DyeColor.GRAY, DyeColor.RED, TropicalFish.Pattern.SNOOPER) to SpecialFishType.RED_LIPPED_BLENNY,
            FishKey(DyeColor.RED, DyeColor.WHITE, TropicalFish.Pattern.BLOCKFISH) to SpecialFishType.RED_SNAPPER,
            FishKey(DyeColor.WHITE, DyeColor.YELLOW, TropicalFish.Pattern.FLOPPER) to SpecialFishType.THREADFIN,
            FishKey(DyeColor.RED, DyeColor.WHITE, TropicalFish.Pattern.KOB) to SpecialFishType.TOMATO_CLOWNFISH,
            FishKey(DyeColor.GRAY, DyeColor.WHITE, TropicalFish.Pattern.SUNSTREAK) to SpecialFishType.TRIGGERFISH,
            FishKey(DyeColor.CYAN, DyeColor.YELLOW, TropicalFish.Pattern.DASHER) to
                SpecialFishType.YELLOWTAIL_PARROTFISH,
            FishKey(DyeColor.YELLOW, DyeColor.YELLOW, TropicalFish.Pattern.FLOPPER) to SpecialFishType.YELLOW_TANG,
        )

    fun getSpecialFishType(fish: TropicalFish) = getSpecialFishType(fish.bodyColor, fish.patternColor, fish.pattern)

    fun getSpecialFishType(
        bodyColor: DyeColor,
        patternColor: DyeColor,
        pattern: TropicalFish.Pattern,
    ): SpecialFishType? {
        return specialFishTypeMap[FishKey(bodyColor, patternColor, pattern)]
    }
}
