package net.trueog.mobHeadsOG

import java.net.URL
import net.trueog.mobHeadsOG.Fish.SpecialFishType
import org.bukkit.DyeColor
import org.bukkit.entity.*

object Heads {
    private val headIndex =
        mapOf(
            EntityType.ALLAY to
                URL(
                    "http://textures.minecraft.net/texture/cc0389177dbaa92f0d5ffdf848862c7f9b36df222fbfd737e2639dc3059e0cf3"
                ),
            //        EntityType.AXOLOTL to
            // URL("http://textures.minecraft.net/texture/667e15eab73064b6680d1db98ba445ed0914ba35a799997c0da2b03ffc3a8826"),
            EntityType.BAT to
                URL(
                    "http://textures.minecraft.net/texture/8eb81c40b5b63f3d830340f8fcc4aab538d4e544e95eec9d70d61f786f6b6974"
                ),
            EntityType.BEE to
                URL(
                    "http://textures.minecraft.net/texture/59ac16f296b461d05ea0785d477033e527358b4f30c266aa02f020157ffca736"
                ),
            EntityType.BLAZE to
                URL(
                    "http://textures.minecraft.net/texture/dee23dc7a10c6a87ef937454c0e94ed42c23aa641a91ed8470a3042d05c52c52"
                ),
            //        EntityType.CAT to
            // URL("http://textures.minecraft.net/texture/de28d30db3f8c3fe50ca4f26f3075e36f003ae8028135a8cd692f24c9a98ae1b"),
            EntityType.CAVE_SPIDER to
                URL(
                    "http://textures.minecraft.net/texture/a6a1c2599fc91203a65a03d479c8dc87f662deac3663c16c5e04d625b3978a25"
                ),
            EntityType.CHICKEN to
                URL(
                    "http://textures.minecraft.net/texture/42af6e5847eea099e1b0ab8c20a9e5f3c7190158bda54e28133d9b271ec0cb4b"
                ),
            EntityType.COD to
                URL(
                    "http://textures.minecraft.net/texture/f246e19b32cf784549447e07b96072e1f656d78e93ccca5637485e6749734652"
                ),
            EntityType.COW to
                URL(
                    "http://textures.minecraft.net/texture/63d621100fea5883922e78bb448056448c983e3f97841948a2da747d6b08b8ab"
                ),
            EntityType.CREEPER to
                URL(
                    "http://textures.minecraft.net/texture/3511e4a3d5add6a54499abad10d799d06ce45cba9e520afd2008608a6288b7e7"
                ), // Charged Creeper
            EntityType.DOLPHIN to
                URL(
                    "http://textures.minecraft.net/texture/8e9688b950d880b55b7aa2cfcd76e5a0fa94aac6d16f78e833f7443ea29fed3"
                ),
            EntityType.DONKEY to
                URL(
                    "http://textures.minecraft.net/texture/4e25ee9273ad579d44bf406f6f6295586481ea198fd572076cd0c5882da7e6cc"
                ),
            EntityType.DROWNED to
                URL(
                    "http://textures.minecraft.net/texture/c3f7ccf61dbc3f9fe9a6333cde0c0e14399eb2eea71d34cf223b3ace22051"
                ),
            EntityType.ELDER_GUARDIAN to
                URL(
                    "http://textures.minecraft.net/texture/4a2d64f4a00e9c85f67262edcacb84523581ae0f37bdab22dd704524f62e169f"
                ),
            EntityType.ENDERMAN to
                URL(
                    "http://textures.minecraft.net/texture/8977a94f02498cad0cfdb65ca7cb72e23111a914d8c670acccc7a65b347d7776"
                ),
            EntityType.ENDERMITE to
                URL(
                    "http://textures.minecraft.net/texture/8c6b65c22b4465ba6793b2195cd5084ce83b88dca6e55eb9484540acd7352a50"
                ),
            EntityType.EVOKER to
                URL(
                    "http://textures.minecraft.net/texture/390fbd88f659d3963c68cbbcb7c7121d8195a8be65bbd2bf1257d1f69bccc0c7"
                ),
            //        EntityType.FOX to
            // URL("http://textures.minecraft.net/texture/d7e0043111bc57090856259155571c7906e707046df041b8b572704c451fcd82"),
            //        EntityType.FROG to
            // URL("http://textures.minecraft.net/texture/76877893e920ff5dfa4b5fbd14dabee2e6308a6f97c3a19b08e241a29eb9a5c3"),
            EntityType.GHAST to
                URL(
                    "http://textures.minecraft.net/texture/c53de31a2d0041a6ef75bf7a6c8468464db1aaa6201ebb1a6013edb2245c7607"
                ),
            EntityType.GLOW_SQUID to
                URL(
                    "http://textures.minecraft.net/texture/4b2e9b6581fed48a99e0323091ad5c3c326cda20073e28a902a0373f7382b59f"
                ),
            EntityType.GOAT to
                URL(
                    "http://textures.minecraft.net/texture/87473e055df6e7fd98664e9fdb63675f088106305d744024a41bb358918a142b"
                ),
            EntityType.GUARDIAN to
                URL(
                    "http://textures.minecraft.net/texture/e2ba34416670454b1a20496f80b9398529f49003fc613eb930248ea9b5d1a391"
                ),
            EntityType.HOGLIN to
                URL(
                    "http://textures.minecraft.net/texture/bc4a7f57fc03b13aa2f9d83cdd4822b936793096daf51e78025bbd241ed6f68d"
                ),
            //        EntityType.HORSE to
            // URL("http://textures.minecraft.net/texture/c7bc61609730f2cb010268fab0821bd47352699750a150599f21c3fc4e92591a"),
            EntityType.HUSK to
                URL(
                    "http://textures.minecraft.net/texture/7338318bc91a36cd5ab6aa885c9a4ee2bdacdaa5c66b2a99dfb0a560983f2480"
                ),
            EntityType.ILLUSIONER to
                URL(
                    "http://textures.minecraft.net/texture/d382701c67d6c54c907558891dc176225112518771e061c5d8bd918479e6bdd8"
                ),
            EntityType.IRON_GOLEM to
                URL(
                    "http://textures.minecraft.net/texture/fe7c0719fabe116dce605199bcadc69a538860864ef15706983ff662822d9fe3"
                ),
            //        EntityType.LLAMA to
            // URL("http://textures.minecraft.net/texture/4d67fd4bff293269cb908974dca83c33485e435ed5a8e1dbd6521c61687140"),
            EntityType.MAGMA_CUBE to
                URL(
                    "http://textures.minecraft.net/texture/b81718d4984847a4ad3ec081a4ebffd183743239aecab60322138a72609812c3"
                ),
            //        EntityType.MUSHROOM_COW to
            // URL("http://textures.minecraft.net/texture/da80606e82c642f141587733e3180ae57f646442c9fffd4e5997457e34311a29"),
            EntityType.MULE to
                URL(
                    "http://textures.minecraft.net/texture/41c224a1031be434d25ae1885bf4ff400c9894c69bfef56a49354c5625c0c09c"
                ),
            EntityType.OCELOT to
                URL(
                    "http://textures.minecraft.net/texture/9175cc43ea8ae20168a1f170810b4da4d9b4ebd3c9976e9fc22e9f995c3cbc3c"
                ),
            //        EntityType.PANDA to
            // URL("http://textures.minecraft.net/texture/e546e436d166b17f0521bd8538ea13cd6ee3b5df102eb32e3e425cb285d44063"),
            //        EntityType.PARROT to
            // URL("http://textures.minecraft.net/texture/40a3d47f54e71a58bf8f57c5253fb2d213f4f55bb7934a19104bfb94edc76eaa"),
            EntityType.PHANTOM to
                URL(
                    "http://textures.minecraft.net/texture/7e95153ec23284b283f00d19d29756f244313a061b70ac03b97d236ee57bd982"
                ),
            EntityType.PIG to
                URL(
                    "http://textures.minecraft.net/texture/41ee7681adf00067f04bf42611c97641075a44ae2b1c0381d5ac6b3246211bfe"
                ),
            EntityType.PIGLIN to
                URL(
                    "http://textures.minecraft.net/texture/81afd85391182a9f9de4fce29eaf02514cc2e04481577da5edeb58b17e757135"
                ),
            EntityType.PIGLIN_BRUTE to
                URL(
                    "http://textures.minecraft.net/texture/6488799c83ecb29452ceba89c3c0099219274ce5b2bfb8ad0b3ea4c65fac4630"
                ),
            EntityType.PILLAGER to
                URL(
                    "http://textures.minecraft.net/texture/c225f0b49c5295048a409c9c601cca79aa8eb52aff5e2033ebb865f4367ef43e"
                ),
            EntityType.POLAR_BEAR to
                URL(
                    "http://textures.minecraft.net/texture/cd8702911e616c0d32fbe778d195f21ecce9025bcbd09151e3d97af3192aa7ec"
                ),
            EntityType.PUFFERFISH to
                URL(
                    "http://textures.minecraft.net/texture/e2733d5da59c82eaf310b382aff40bd513c44354dbbabfe14b066a556810a7f9"
                ),
            //        EntityType.RABBIT to
            // URL("http://textures.minecraft.net/texture/51a57c3d0a9b10e13f66df74200cb8a6d484c672226812d74e25f6c027410616"),
            EntityType.RAVAGER to
                URL(
                    "http://textures.minecraft.net/texture/eb4db2986140e251e32e70ed08c8a081720313ce257632be1ef94a0737394db"
                ),
            EntityType.SALMON to
                URL(
                    "http://textures.minecraft.net/texture/791d9e69b795da4eaacfcf7350dfe8ae367fed833556706e040339dd7fe0240a"
                ),
            //        EntityType.SHEEP to
            // URL("http://textures.minecraft.net/texture/7ca38ccf417e99ca9d47eeb15a8a30edb1507aa52b678c220c717c474aa6fe3e"),
            EntityType.SHULKER to
                URL(
                    "http://textures.minecraft.net/texture/fb9e6af6b819f3d90e67ce2e7059fbef31da2aa953d35e3454f1021fa912efde"
                ),
            EntityType.SILVERFISH to
                URL(
                    "http://textures.minecraft.net/texture/f25e9fae371664de1a800c84d025124abb8f15111807c8bc1ab9126aacbd4f95"
                ),
            EntityType.SKELETON_HORSE to
                URL(
                    "http://textures.minecraft.net/texture/6e226705bd2a9e7bb8d6b0f4daa969b9e12d4ae5c66da693bb5f4a4a1e6aa296"
                ),
            EntityType.SLIME to
                URL(
                    "http://textures.minecraft.net/texture/c06424ec7a196b15f9ad5733a36a6d1f2e6a0d42ffce1e1508f90f312ac4caed"
                ),
            EntityType.SNOWMAN to
                URL(
                    "http://textures.minecraft.net/texture/caa3e17ef1b29a4b87fa43dee1db12c41fd39aa387fa13af2a079b5b378fde8b"
                ),
            EntityType.SPIDER to
                URL(
                    "http://textures.minecraft.net/texture/de28e6629b6ed1da94d4a818761612c36fb3a6813c4b63fb9fea5076415f3f0c"
                ),
            EntityType.SQUID to
                URL(
                    "http://textures.minecraft.net/texture/8351b7d9a4f36cfe31fd59d8c900e419a135144105e7a981caa5a168dcff325b"
                ),
            EntityType.STRAY to
                URL(
                    "http://textures.minecraft.net/texture/592b5597085e35db53d9bda008cae72b2f00cd7d4cd8dc69ff174a55b689e6e"
                ),
            EntityType.STRIDER to
                URL(
                    "http://textures.minecraft.net/texture/9c40fad1c11de9e6422b405426e9b97907f35bce345e3758604d3e7be7df884"
                ),
            EntityType.TADPOLE to
                URL(
                    "http://textures.minecraft.net/texture/3daf1653b5f59b5ec5a3f79609cb4233579fef07e693b61749e0900149edf563"
                ),
            //        EntityType.TRADER_LLAMA to
            // URL("http://textures.minecraft.net/texture/e89a2eb17705fe7154ab041e5c76a08d41546a31ba20ea3060e3ec8edc10412c"),
            EntityType.TROPICAL_FISH to
                URL(
                    "http://textures.minecraft.net/texture/34a0c84dc3c090df7bafc4367a9fc6c8520da2f73efffb80e934d1189eadac41"
                ),
            EntityType.TURTLE to
                URL(
                    "http://textures.minecraft.net/texture/304931200ad460b650a190e8d41227c3999fbeb933b51ca49fd9e5920d1f8e7d"
                ),
            EntityType.VEX to
                URL(
                    "http://textures.minecraft.net/texture/b9538f2830c4dea6996ed744785504e32e0e20d8663edab6b0222f2c022077bd"
                ),
            //        EntityType.VILLAGER to
            // URL("http://textures.minecraft.net/texture/1ef627f566ac0a7828bad93e9e4b9643d99a928a13d5f977bf441e40db1336bf"),
            EntityType.VINDICATOR to
                URL(
                    "http://textures.minecraft.net/texture/2dabafde27ee12b09865047aff6f183fdb64e04dae1c00ccbde04ad93dcc6c95"
                ),
            EntityType.WANDERING_TRADER to
                URL(
                    "http://textures.minecraft.net/texture/5f1379a82290d7abe1efaabbc70710ff2ec02dd34ade386bc00c930c461cf932"
                ),
            EntityType.WARDEN to
                URL(
                    "http://textures.minecraft.net/texture/b2f3879b737127485eb35ddee748d06cf914b193d97753ae34e92230842831fb"
                ),
            EntityType.WITCH to
                URL(
                    "http://textures.minecraft.net/texture/a520f12c63c7912186c4be4e30c33c5acaec0db0b6abd836d517d74a62275d4b"
                ),
            EntityType.WITHER to
                URL(
                    "http://textures.minecraft.net/texture/eda10828f63b7ecdefd767b3245fbdaa13c3ec0c6b13774f1ee8d307c034c383"
                ),
            EntityType.WOLF to
                URL(
                    "http://textures.minecraft.net/texture/b6439a43e5687008815a2dd1ff4a134c12221b782336678b979ad13dce39665e"
                ),
            EntityType.ZOGLIN to
                URL(
                    "http://textures.minecraft.net/texture/2e3493a956bfd7588ed1a8ea858759667659d58100cbecd6d96ccc0ca9b36923"
                ),
            EntityType.ZOMBIE_HORSE to
                URL(
                    "http://textures.minecraft.net/texture/6618ffbe1cfa2058fe80a065f70c128c225a1e0bc9deaf8b38b0395443f40909"
                ),
            //        EntityType.ZOMBIE_VILLAGER to
            // URL("http://textures.minecraft.net/texture/c8679e034767d518660d9416dc5eaf319d697682ac40c886e3c2bc8dfa1de1d"),
            EntityType.ZOMBIFIED_PIGLIN to
                URL(
                    "http://textures.minecraft.net/texture/2df03128b002a70708d6825ed6cf54ddf694b3766d78d5649030b1cb8b34c6fa"
                ),
        )

    private val mobsWithVariants =
        arrayOf(
            EntityType.AXOLOTL,
            EntityType.CAT,
            EntityType.HORSE,
            EntityType.MUSHROOM_COW,
            EntityType.PARROT,
            EntityType.RABBIT,
            EntityType.SHEEP,
            EntityType.TROPICAL_FISH,
            EntityType.VILLAGER,
            EntityType.FOX,
            EntityType.LLAMA,
            EntityType.PANDA,
            EntityType.TRADER_LLAMA,
            EntityType.ZOMBIE_VILLAGER,
            EntityType.FROG,
        )

    private val axolotlHeadIndex =
        mapOf(
            Axolotl.Variant.BLUE to
                URL(
                    "http://textures.minecraft.net/texture/357b32c2933bebcd6502cbf406f7df996c8e46e7c6cbfefc5dcdc2fbf5bb54bb"
                ), // Amy_Lan
            Axolotl.Variant.CYAN to
                URL(
                    "http://textures.minecraft.net/texture/1e8c70e6a56161ecdc6b75674070fb308714a2b2b70e1e6d76bc920ce6ce7de6"
                ), // Amy_Lan
            Axolotl.Variant.GOLD to
                URL(
                    "http://textures.minecraft.net/texture/405bea436985d1b759979c45f56b016486da10943dbf9480d38ea72141f10a81"
                ), // aBANANA159
            Axolotl.Variant.LUCY to
                URL(
                    "http://textures.minecraft.net/texture/7b910fbc216f724d29655155b2a3858a80f234a0cfed609e22fc670683ab777a"
                ), // RunnerLord
            Axolotl.Variant.WILD to
                URL(
                    "http://textures.minecraft.net/texture/4d7efe02012cf31ae2708e7d7df079726575c7ee8504328175fe544708187dce"
                ), // ML_Monster
        )

    private val catHeadIndex =
        mapOf(
            Cat.Type.TABBY to
                URL(
                    "http://textures.minecraft.net/texture/de28d30db3f8c3fe50ca4f26f3075e36f003ae8028135a8cd692f24c9a98ae1b"
                ), // PandaClod
            Cat.Type.BLACK to
                URL(
                    "http://textures.minecraft.net/texture/4fd10c8e75f67398c47587d25fc146f311c053cc5d0aeab8790bce36ee88f5f8"
                ), // PandaClod
            Cat.Type.RED to
                URL(
                    "http://textures.minecraft.net/texture/2113dbd3c6a078a17b4edb78ce07d836c38dace5027d4b0a83fd60e7ca7a0fcb"
                ), // PandaClod
            Cat.Type.SIAMESE to
                URL(
                    "http://textures.minecraft.net/texture/d5b3f8ca4b3a555ccb3d194449808b4c9d783327197800d4d65974cc685af2ea"
                ), // PandaClod
            Cat.Type.BRITISH_SHORTHAIR to
                URL(
                    "http://textures.minecraft.net/texture/5389e0d5d3e81f84b570e2978244b3a73e5a22bcdb6874b44ef5d0f66ca24eec"
                ), // PandaClod
            Cat.Type.CALICO to
                URL(
                    "http://textures.minecraft.net/texture/e0eeaa869f53fa989198f5595520aec9395509aba993596a86654b3a0f6ca4a6"
                ), // Soskun
            Cat.Type.PERSIAN to
                URL(
                    "http://textures.minecraft.net/texture/ff40c746260ef91c96b27159795e87191ae7ce3d5f767bf8c74faad9689af25d"
                ), // PandaClod
            Cat.Type.RAGDOLL to
                URL(
                    "http://textures.minecraft.net/texture/dc7a45d25889e3fdf7797cb258e26d4e94f5bc13eef00795dafef2e83e0ab511"
                ), // PandaClod
            Cat.Type.WHITE to
                URL(
                    "http://textures.minecraft.net/texture/21d15ac9558e98b89aca89d3819503f1c5256c2197dd3c34df5aac4d72e7fbed"
                ), // PandaClod
            Cat.Type.JELLIE to
                URL(
                    "http://textures.minecraft.net/texture/a0db41376ca57df10fcb1539e86654eecfd36d3fe75e8176885e93185df280a5"
                ), // PandaClod
            Cat.Type.ALL_BLACK to
                URL(
                    "http://textures.minecraft.net/texture/22c1e81ff03e82a3e71e0cd5fbec607e11361089aa47f290d46c8a2c07460d92"
                ), // PandaClod
        )

    private val horseHeadIndex =
        mapOf(
            Horse.Color.WHITE to
                URL(
                    "http://textures.minecraft.net/texture/60a2db2f1eb93e5978d2dc91a74df43d7b75d9ec0e694fd7f2a652fbd15"
                ),
            Horse.Color.CREAMY to
                URL(
                    "http://textures.minecraft.net/texture/628d1ab4be1e28b7b461fdea46381ac363a7e5c3591c9e5d2683fbe1ec9fcd3"
                ),
            Horse.Color.CHESTNUT to
                URL(
                    "http://textures.minecraft.net/texture/b66b2b32d31539c7383d923bae4faaf65da6715cd526c35d2e4e6825da11fb"
                ),
            Horse.Color.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/bedf73ea12ce6bd90a4ae9a8d15096749cfe918230dc829b2581d223b1a2a8"
                ), // neeeekolaz
            Horse.Color.BLACK to
                URL(
                    "http://textures.minecraft.net/texture/3efb0b9857d7c8d295f6df97b605f40b9d07ebe128a6783d1fa3e1bc6e44117"
                ), // titigillette
            Horse.Color.GRAY to
                URL(
                    "http://textures.minecraft.net/texture/d6676c4d6f0f5ed606a356f3cc5a29d14aafe65721ba1a1a95c5ac4c5e239e5"
                ), // neeeekolaz
            Horse.Color.DARK_BROWN to
                URL(
                    "http://textures.minecraft.net/texture/2661f23fb76624ffbabbda31ca4a38b404fe63ef37d4ba4e4c5441a21e3a6"
                ), // neeeekolaz
        )

    private val mooshroomHeadIndex =
        mapOf(
            MushroomCow.Variant.RED to
                URL(
                    "http://textures.minecraft.net/texture/43e75a01a398a31e2d282bbbfd2b6172d2ae67cd83876948485b85881a15af23"
                ), // DorkOrc
            MushroomCow.Variant.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/1051f5cd554d972050dfc53cecd5d75325489004ad08b3e54572acad96b25363"
                ), // DorkOrc
        )

    private val parrotHeadIndex =
        mapOf(
            Parrot.Variant.RED to
                URL(
                    "http://textures.minecraft.net/texture/a4ba8d66fecb1992e94b8687d6ab4a5320ab7594ac194a2615ed4df818edbc3"
                ),
            Parrot.Variant.CYAN to
                URL(
                    "http://textures.minecraft.net/texture/2b94f236c4a642eb2bcdc3589b9c3c4a0b5bd5df9cd5d68f37f8c83f8e3f1"
                ),
            Parrot.Variant.BLUE to
                URL(
                    "http://textures.minecraft.net/texture/aca580b051c63be29da545a9aa7ff7e136df77a81c67dc1ee9e6170c14fb310"
                ), // ChimpD
            Parrot.Variant.GRAY to
                URL(
                    "http://textures.minecraft.net/texture/3d6f4a21e0d62af824f8708ac63410f1a01bbb41d7f4a702d9469c6113222"
                ),
            Parrot.Variant.GREEN to
                URL(
                    "http://textures.minecraft.net/texture/ab9a36c5589f3a2e59c1caa9b3b88fada76732bdb4a7926388a8c088bbbcb"
                ),
        )

    private val rabbitHeadIndex =
        mapOf(
            Rabbit.Type.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/7d1169b2694a6aba826360992365bcda5a10c89a3aa2b48c438531dd8685c3a7"
                ), // ChimpD
            Rabbit.Type.WHITE to
                URL(
                    "http://textures.minecraft.net/texture/72c58116a147d1a9a26269224a8be184fe8e5f3f3df9b61751369ad87382ec9"
                ), // ChimpD
            Rabbit.Type.BLACK to
                URL(
                    "http://textures.minecraft.net/texture/19a675edb3cba0f3436ae9473cf03592b7a49d38813579084d637e7659999b8e"
                ), // ML_Monster
            Rabbit.Type.BLACK_AND_WHITE to
                URL(
                    "http://textures.minecraft.net/texture/32f39e0a603386ca1ee36236e0b490a1547e6e2a89911674509037fb6f711810"
                ), // ML_Monster
            Rabbit.Type.GOLD to
                URL(
                    "http://textures.minecraft.net/texture/2a6361fea24b111ed78c1fefc295212e8a59b0c88b656062527b17a2d7489c81"
                ), // ML_Monster
            Rabbit.Type.SALT_AND_PEPPER to
                URL(
                    "http://textures.minecraft.net/texture/cc4349fe9902dd76c1361f8d6a1f79bff6f433f3b7b18a47058f0aa16b9053f"
                ), // ML_Monster
            Rabbit.Type.THE_KILLER_BUNNY to
                URL(
                    "http://textures.minecraft.net/texture/ef98337b8242229d95da23090755789778b18bf5d07d61f620cdbdbbd29fa615"
                ), // ML_Monster
        )

    private val sheepHeadIndex =
        mapOf(
            DyeColor.WHITE to
                URL(
                    "http://textures.minecraft.net/texture/292df216ecd27624ac771bacfbfe006e1ed84a79e9270be0f88e9c8791d1ece4"
                ), // ML_Monster
            DyeColor.ORANGE to
                URL(
                    "http://textures.minecraft.net/texture/4271442d8a37db49f02a94c29352694962b5d0bd6bea05f1d93fe19eb4e7060e"
                ), // ML_Monster
            DyeColor.MAGENTA to
                URL(
                    "http://textures.minecraft.net/texture/fe228b04e9b979a10b70b8db6f3fb199deeb581594a5aa4a7febe948db17228b"
                ), // ML_Monster
            DyeColor.LIGHT_BLUE to
                URL(
                    "http://textures.minecraft.net/texture/c8eb0d17479870b3973e8e001b82dcde22efc9d10c90412c6733a0b136564d1f"
                ), // ML_Monster
            DyeColor.YELLOW to
                URL(
                    "http://textures.minecraft.net/texture/12a5354c230e861aac72734a4582d1317026454b807ac353fc3a0bd0d8c422ba"
                ), // ML_Monster
            DyeColor.LIME to
                URL(
                    "http://textures.minecraft.net/texture/1ce4090e1bccf992b36def74a6d7d3972c17db1b75554e2c509271680b8e7974"
                ), // ML_Monster
            DyeColor.PINK to
                URL(
                    "http://textures.minecraft.net/texture/2e7cf1c58dbb7c3255b94c6043fa8f0d776c134f4d98b81ca31410965f47a25a"
                ), // ML_Monster
            DyeColor.GRAY to
                URL(
                    "http://textures.minecraft.net/texture/e6c2a2755b20ddff551a6903f2dc7e61f13ebe39b1d5ca929c87bd8583ec801f"
                ), // ML_Monster
            DyeColor.LIGHT_GRAY to
                URL(
                    "http://textures.minecraft.net/texture/74a59be620ae8b3ee0dd0fa22c80affed4a0f729295cb8c41e78ee783f4633ad"
                ), // ML_Monster
            DyeColor.CYAN to
                URL(
                    "http://textures.minecraft.net/texture/60558387b6658f5e9dcffc719214b603f603c4b04e708b7aabe75bcae91e804c"
                ), // ML_Monster
            DyeColor.PURPLE to
                URL(
                    "http://textures.minecraft.net/texture/343cbdae1f20a79281d3a71adf242a35c8cc58562b415f1120bca9d94b76f254"
                ), // ML_Monster
            DyeColor.BLUE to
                URL(
                    "http://textures.minecraft.net/texture/e39efc4b4eadec48576a5700ec812395510327e5d1e7c108fd8abc7796685aa3"
                ), // ML_Monster
            DyeColor.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/e5813715c2f34f05649f8fa3eaaa67f1eda5e6f9cf930fa9c2e0412d1f9728e1"
                ), // ML_Monster
            DyeColor.GREEN to
                URL(
                    "http://textures.minecraft.net/texture/5753a8ec32be9c550d1c560acb941edd9e3b73ddbf1586923fb37b220b4553dd"
                ), // ML_Monster
            DyeColor.RED to
                URL(
                    "http://textures.minecraft.net/texture/e0ce5b5ca9165ac77a9c3e3f64df0d3170d5afcf9d5a5575e3f0c0f21e43b83"
                ), // ML_Monster
            DyeColor.BLACK to
                URL(
                    "http://textures.minecraft.net/texture/634ac5b398cf7c86e3f6f188a5127d8b283d772bf5885c70e0c130805f069950"
                ), // ML_Monster
        )

    private val specialFishHeadIndex =
        mapOf(
            SpecialFishType.ANEMONE to
                URL(
                    "http://textures.minecraft.net/texture/75cbde69c0bb3dfd8f710ee5f42c41e829a049a9df7099005ff745e32869c507"
                ),
            SpecialFishType.BLACK_TANG to
                URL(
                    "http://textures.minecraft.net/texture/c69c5a025a58be61a5258664807ecc5d2fa8f0433e4ccfabe3c81abd28925baa"
                ),
            SpecialFishType.BLUE_TANG to
                URL(
                    "http://textures.minecraft.net/texture/bcd25ad0dabec240d2ee792fe1426407d8fc9dd670aafe2d4e541c6226d9d813"
                ),
            SpecialFishType.BUTTERFLYFISH to
                URL(
                    "http://textures.minecraft.net/texture/400a8fb316faac20bb966c596a3bcbfcfbd01f3c048fa02e3b3fb6a80709e8ec"
                ),
            SpecialFishType.CICHLID to
                URL(
                    "http://textures.minecraft.net/texture/8b5274c9e487f67f9648510d1b3c5a70ee6060c9d71fdd1f19aa697427f290ec"
                ),
            SpecialFishType.CLOWNFISH to
                URL(
                    "http://textures.minecraft.net/texture/36389acd7c8280d2c8085e6a6a91e182465347cc898db8c2d9bb148e0271c3e5"
                ),
            SpecialFishType.COTTON_CANDY_BETTA to
                URL(
                    "http://textures.minecraft.net/texture/e3d7767de7acd9fe9e03832574b248344f0ae06f4c1a7c6cb5c4b0923aefe56d"
                ),
            SpecialFishType.DOTTYBACK to
                URL(
                    "http://textures.minecraft.net/texture/d1c01eb1abaed3df80c203c34246f9713eea5fbbe65d12f4cb1ecc9018e954aa"
                ),
            SpecialFishType.EMPEROR_RED_SNAPPER to
                URL(
                    "http://textures.minecraft.net/texture/bf2c006def4d873a58437128e779ffb49f46c693e85877ad7c78f5cabfd98548"
                ),
            SpecialFishType.GOATFISH to
                URL(
                    "http://textures.minecraft.net/texture/9dc47b40ac31034a6ac028ce5e96d6ae270b739f742b35572a99947b9306bd7"
                ),
            SpecialFishType.MOORISH_IDOL to
                URL(
                    "http://textures.minecraft.net/texture/7d39822c3c5b020acf68941af314b4579895a8cd76d0aa23003ef85130453d73"
                ),
            SpecialFishType.ORNATE_BUTTERFLYFISH to
                URL(
                    "http://textures.minecraft.net/texture/adedaf827713d8aafb210cb65cb9bb1c562a98f1c337bec4e639ae5633c00cda"
                ),
            SpecialFishType.PARROTFISH to
                URL(
                    "http://textures.minecraft.net/texture/fa16f5288b4dfc34486cc20b61ad20c4b4ac6b137bf9c831187997d002ef5ef6"
                ),
            SpecialFishType.QUEEN_ANGELFISH to
                URL(
                    "http://textures.minecraft.net/texture/adfb4d7dff5456de70496414e874c6650a1e839563cc75d4b99380b216cfdbcd"
                ),
            SpecialFishType.RED_CICHLID to
                URL(
                    "http://textures.minecraft.net/texture/38be3988d58ef595c57be9074f41122f47b2f67f379a39dc6f1ab9c45e2c4126"
                ),
            SpecialFishType.RED_LIPPED_BLENNY to
                URL(
                    "http://textures.minecraft.net/texture/f2d22be12e14664cae3fe226d1b3487ee2a7d8e76a0e29bca4dbf9964b2a0f63"
                ),
            SpecialFishType.RED_SNAPPER to
                URL(
                    "http://textures.minecraft.net/texture/2b8226ab9870b7c6c59d31b40b86edf7324eca674b70d55be8aae6a0b89e7d8b"
                ),
            SpecialFishType.THREADFIN to
                URL(
                    "http://textures.minecraft.net/texture/127f6c673de31386e04b5da2ad8ebbdaac25ff2d9e9673dbe6329a06943abcf"
                ),
            SpecialFishType.TOMATO_CLOWNFISH to
                URL(
                    "http://textures.minecraft.net/texture/7e92f0b0f79c7ba9dc81577be33a5c713fbe3972826b44bcf26feb6cc12b6434"
                ),
            SpecialFishType.TRIGGERFISH to
                URL(
                    "http://textures.minecraft.net/texture/fc0d1e6d2a9df4f0ebbcd54778ff31b7c249e0d9944fced4b1a83afbaeeacfca"
                ),
            SpecialFishType.YELLOWTAIL_PARROTFISH to
                URL(
                    "http://textures.minecraft.net/texture/5d7b92a1bdc733d2a53fb095c70b732b71a223a9ceca72b872e1ee990a6a907e"
                ),
            SpecialFishType.YELLOW_TANG to
                URL(
                    "http://textures.minecraft.net/texture/4e0b0a93cc61eeebb2539b8adb2f49e292f2073c1d312a99c87b12da1be44336"
                ),
        )

    private val villagerHeadIndex =
        mapOf(
            Pair(Villager.Type.PLAINS, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/94248dd0680305ad73b214e8c6b00094e27a4ddd8034676921f905130b858bdb"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/f76cf8b7378e889395d538e6354a17a3de6b294bb6bf8db9c701951c68d3c0e6"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/17532e90c573a394c7802aa4158305802b59e67f2a2b7e3fd0363aa6ea42b841"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/19e04a752596f939f581930414561b175454d45a0506501e7d2488295a5d5de"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/f522db92f188ebc7713cf35b4cbaed1cfe2642a5986c3bde993f5cfb3727664c"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/c6774d2df515eceae9eed291c1b40f94adf71df0ab81c7191402e1a45b3a2087"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/a8856eaafad96d76fa3b5edd0e3b5f45ee49a3067306ad94df9ab3bd5b2d142d"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/55a0b07e36eafdecf059c8cb134a7bf0a167f900966f1099252d903276461cce"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/ac15e5fb56fa16b0747b1bcb05335f55d1fa31561c082b5e3643db5565410852"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/e66a53fc707ce1ff88a576ef40200ce8d49fae4acad1e3b3789c7d1cc1cc541a"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/2c02c3ffd5705ab488b305d57ff0168e26de70fd3f739e839661ab947dff37b1"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/35e799dbfaf98287dfbafce970612c8f075168977aacc30989d34a4a5fcdf429"
                ), // Same as NONE
            Pair(Villager.Type.PLAINS, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/35e799dbfaf98287dfbafce970612c8f075168977aacc30989d34a4a5fcdf429"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/7dfa07fd1244eb8945f4ededd00426750b77ef5dfbaf03ed775633459ece415a"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/5e409b958bc4fe045e95d325e6e97a533137e33fec7042ac027b30bb693a9d42"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/a6f25ea1c39a3d73579e5330e04c2b173ba2fd5c0ca3452be5ff1aae083f6328"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/ee61ecbb86487ed16fedb275db92c9c5043a830f52d973ba44b28a7742006b43"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/fd4d13baf65ee197dfc6ec28657d25d89f472662204e13cbf761f9412c891335"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/ce36c366aeb30385cff151a8cf90bac5a8979a55bc2a808875e233d0f81b24a9"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/d0a3e6c961fb4d6efcf4576455fcd27bc78401256fdf39b25488f31984af96ba"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/4a6b7136db906a2af54fd446094f5d4d074c4625665bce5706ad6208b8b383f9"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/d24ba760a61dd256c52b325129f46016ae892232a0dea1715f997f7c4d622bef"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/355d61a2409eb0b49b3e88b2888467f20a3b06212a10e7b6efb9ce3bc1a0e20f"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/74111111e532d68f0e4f913a4e3aedd0c9dfb2847a8aaf1ffa52b3dabcff86ed"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/ebff5901b97efef922555325e910a6d35cc46967ff8a7c2a0e5753af23ddcff2"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/4c4d7ea038187770cc2e4817c9209e19b74f5d288ed633281ecccaf5c8ebc767"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/598a28aa588c44ff4c93446a7c29d83efac1e5fc8e90d1d6c386c4105dca8f77"
                ), // Same as NONE
            Pair(Villager.Type.DESERT, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/598a28aa588c44ff4c93446a7c29d83efac1e5fc8e90d1d6c386c4105dca8f77"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/29d904fdae68fb120e9ae0f3537460f2a7c1de9159ab3f2b44c844048febabeb"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/ebba69f6ee3e128bc2feec78c247b2a2f00c3aea11d8906c728de92c60a542ed"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/70880c4367c4162a1dbbb88cd84e52906b18612f1185bf6efe8244fee2939798"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/22a354db4b0a732dd847dfe4ad0a0729abbc7b8c500b9e6381950ce856f1de39"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/99e7c054a8ab2d7f6447de438d337323632e9c3fcdb30d39ac336b523f84e3e6"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/e38bc381f74ce58e86d9d417d5125fb72e758c58d93f34cafc86d1fc51447d53"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/adad6ca8eae505baea8a4f2ecffe719f3155a22d28f82d82d528440f1a77aa14"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/9a9e2421cdc09f2ee2710e80bbea3f64ff35f728cff8defa8d87540efe7966d"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/86e7a90bb53908c19ccf795e6ea5c19d097b19f1f111fc2f30a61e689da8a4fd"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/87f338bcd9fac0c666f2a925cf07d9b0f5fa9f5fd9443f5951ce54ec5b017610"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/d7a9e8b1afe5ee5dd498734cc221c17b71f1de1a6dc8eab2fc88c332ed244c97"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/7e5995106d080f10b2052de08e355f34a2213904d9d32f6dc2d1b27bec753b74"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/2fb93930f9d10a05adb84a6816bee930d52944a5e1a67f90f65c7fec4ec5a68a"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/9988795ae55682915ce2c70fbfbe24e414e882c50d52f2281d070488ac18115"
                ), // Same as NONE
            Pair(Villager.Type.JUNGLE, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/9988795ae55682915ce2c70fbfbe24e414e882c50d52f2281d070488ac18115"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/16ec61097e11bfe6f10aaa12e5c0a54c829bdbd9d9d7a32fc627e6b5a931e77"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/25fafa2be55bd15aea6e2925f5d24f8068e0f4a2616f3b92b380d94912f0ec5f"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/4143895b04cce7b3ad956620bb48d1aaaa6bbdcc10bb3a8c4aa0a55939f050be"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/b0e4aa6f5455e321059e202abc9d9e23675663070e92a079e8cb544f7be4c755"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/1e126158220e946517b2c20e13805928df06e19c1101bdea2bc5a4fc95f9c011"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/d1644a552dd06f797413c002d41da52904a7bcfd744c5d2c1fe348d9f66cbbeb"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/edcb21090cd7e97066a1f1dcae778cda032df8af953767d2a04f4a78dcfc2496"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/7bb5bfa9ac5412e7d116f9d424e0fd3fa40eedc2c3e7c906c055bb5f4c5c587a"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/7e3d3635ce411abf1e4f373d161d07b8c47e359b6c56f74b413cb494ac746e2d"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/fd95ad3f37bb323785f8d6816763e5a739e2814d611a7ab4afff976f91729faf"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/61d644761f706d31c99a593c8d5f7cbbd4372d73fbee8464f482fa6c139d97d4"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/1806f9767f087e3e4c09ad012bfd063d013ba4c3169fbb0efd7538e28d7d83d"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/f6a5a4b492cf3861d3044a911e1364dadf7a2be41fb2f9a5c619de5cc9a5af00"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/3cc02372f6292a131aa035cef8e52475efa966352e05c2dba374f1309e569dbb"
                ), // Same as NONE
            Pair(Villager.Type.SNOW, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/3cc02372f6292a131aa035cef8e52475efa966352e05c2dba374f1309e569dbb"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/fe7db3a5cb5dd6811fa87e2d113aa6057c669078dd62ff28b377f168277d95ce"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/2844e3ffcc17d4ab0d0eebb6bfdb9603e2f7a095d700028c9db275ae1a95e7f2"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/f2f944222ff693fe088bd543c8efdd3246eab6a34978acde774f7e295dee9e16"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/f45c99c80d0345c4be3fc3a2f0d05a3e23a5c4bf7e991568eee64a6806f048c0"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/fac222efc6ab4bd1c70351de007e37bf3d028c1d93f08efeaea8a07ecb62867b"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/431c0f4603b51eb6d8892f8ec0b520979041d671b8d378c8b26d097b8f7e1327"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/8b6cd9a9fb4b13f49d25b82a14040c045ff57aa8c279cce20a2503b8184d9b9c"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/366715115de766c949e8700b7650c8994fd3eeb97bd1836c2e16b5d8d5551b5d"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/46cc8fa8379665fbb8c924e45235da1c988c1c523af1b2479796d4a49af1c5c8"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/c9c94faa7ac9b0752dc7da7386b4d8fc34e2916da5b01789275bbcb7dfce7fcb"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/6acacef5f04bed42e8a808ccec39889e666fb1299e99a9e09060f8cf29e6baf6"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/71f714133ce78d1181c4d5d3e53711ece10c4c9a28201188ee1a6f35cc0fa3ca"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/d00364c98af059ae6d581fca6038bee14b869998fb3aa382b3c4775d54e8481f"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/dd9ee5d8b58fddd27bc679c0548f55baa845f9f1df5e88c7c5bda6eb9df2b399"
                ), // Same as NONE
            Pair(Villager.Type.SAVANNA, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/dd9ee5d8b58fddd27bc679c0548f55baa845f9f1df5e88c7c5bda6eb9df2b399"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/7d586f55be429db689c070c47aa9b1284cd51da493768559d7132df8c8916aed"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/c1beaa099c823332e7780a32110f5b0bfc2546e53fde8e206817325894018f3"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/2e040983328da42b4eda931bdcefb39a8816b32045da1ed9f335e538c18f3c41"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/5007c4a3e3b8d31b94a95173bc2aea4b718c150f0166f0c964ca9e04be664a22"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/12ed931ee6b77539d2fd7d271617db6b19365cb0e3c52eac005272301d07ac74"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/69cf18b0447ff1dfcfba9e4c4ac7f6e26a986352dd1878c6a1e00d0f5dd6211d"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/ea7abb127b69338a81b87a17b664214ee9fe0437c8b577a0e3674b1c6d0fca77"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/5393370444ee915595630cd900d065c03cc5c61f7a91edd8fec24f204b3eeb4f"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/1a8e3e224a768bb5771d6e4653e48a54fe6cd095fc399d3ec39b95c2544af054"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/e2cfc7eade016a969c2b3a87e010a02ac910df60d3714f76184b2c17a703101e"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/d223664886d96643d3afdc4a2ac72ebc2bcd229e517519e15c3e7c1570ad745e"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/e7473596a1cb40cf1b3ec5f46f2f9d590d5e78d0507680a7b9bc4304587da0c9"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/4b17427d4e9d89fa1e2cb297cd146ed2fdb49721a0eabf048e7e7d24c73fcda5"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/b8c0dd0797fd1ee9f1849d4ac1ebb871af7fe610c9ca61660ce112be842f6b41"
                ), // Same as NONE
            Pair(Villager.Type.SWAMP, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/b8c0dd0797fd1ee9f1849d4ac1ebb871af7fe610c9ca61660ce112be842f6b41"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/ad074b26b09c67feefea4e0245f63306e45cb935e98dbfaa3020eb40c7069719"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/4625c64beded1875b8cd9fdf810f16430e74197371572024b7307f26637573f6"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/3e1fb52b7ae82bb091c54c33b7fa6b80c8a0250372b9d1cbd6f796522f6479d"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/70c6c3a913af9293d6372b0bd4c2de2cc6d3b6e473e3fa0fff034741a612829d"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/99c45ed238e0b0c664dde09de64ba9e6038dd231dd58466fbdcdcc911e0ffbd2"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/45771b738349d1de0e01e894ae401686f598ca19a2088b095149fde9b76a4377"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/6fc9fbe1422d5b0edbe0650e511b1d9c2291460752b066c4f701c0297a6201e8"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/89b921ca9e5e7a43ebb904ca5b833d5c9b37f0fe039e9112303c0f9b188ab739"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/4bfad3b0fc8d19a7dda68087cf5a5e6865cc9faf2e79edf10af4bfa70a4d4bd9"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/608bdb53c55fef32a0658e1c7966614af0bff6091249b8fe3b77a0275da82e43"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/ac7f44b511f7063187d0fe12c74a0cb8c93f34d0f587338b2a9c22f3fa2f212"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/74f04eb20cd0b82aaef2520aed9867c3cca247a4cd975a12ea50df03a7176241"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/621ec612f8f78984a08f8290bd3f1c1892b4f7827b524dbab7eaacc9dd9e22b2"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/a50b633d21455010638035ff69d204fac44b3f9e29a70836e354bf726e01c83"
                ), // Same as NONE
            Pair(Villager.Type.TAIGA, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/a50b633d21455010638035ff69d204fac44b3f9e29a70836e354bf726e01c83"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/1a851258491341c00149a9c92de1acde665b131c8a74c9ffe0cb1e3a5ad9749"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/8e02febb4c52db1fb9e1e5c852a4e72d8dfe6c4c055a4649abf3d357d233fc1b"
                ),
        )

    private val foxHeadIndex =
        mapOf(
            Fox.Type.RED to
                URL(
                    "http://textures.minecraft.net/texture/d8954a42e69e0881ae6d24d4281459c144a0d5a968aed35d6d3d73a3c65d26a"
                ), // PandaClod
            Fox.Type.SNOW to
                URL(
                    "http://textures.minecraft.net/texture/41436377eb4c4b4e39fb0e1ed8899fb61ee1814a9169b8d08729ef01dc85d1ba"
                ), // PandaClod
        )

    private val llamaHeadIndex =
        mapOf(
            Llama.Color.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/7f832466dcc7d5e7702cdee4cd555dbd39637d20adf9367fb03cfd6888baaae7"
                ), // ML_Monster
            Llama.Color.CREAMY to
                URL(
                    "http://textures.minecraft.net/texture/bae25ddc2d2539c565dff2aa5006033f14cc06379fe28b0731c7bdc65ba0e016"
                ), // ML_Monster
            Llama.Color.GRAY to
                URL(
                    "http://textures.minecraft.net/texture/6d2ffce9a174fe1c084e2d82052182d94f95ed436b75ff7ea7a4e94d94c72d8a"
                ), // ML_Monster
            Llama.Color.WHITE to
                URL(
                    "http://textures.minecraft.net/texture/de703ab031ed66622f12957ef59a8b5c8a269cebd18f9326248b68c3bbe20163"
                ), // ML_Monster
        )

    private val pandaHeadIndex =
        mapOf(
            Panda.Gene.AGGRESSIVE to
                URL(
                    "http://textures.minecraft.net/texture/83fe1e782ae96a30336a03ef74681ce3a6905fcc673fa56c046aaee6aa28307d"
                ), // PandaClod
            Panda.Gene.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/c5d0d45bf992b072cf5c513e06beefe8bdc809c8150f3d14b883796a7b74e406"
                ), // PandaClod
            Panda.Gene.LAZY to
                URL(
                    "http://textures.minecraft.net/texture/7818b681cace1c641919f53edadecb142330d089a826b56219138c33b7a5e0db"
                ), // PandaClod
            Panda.Gene.NORMAL to
                URL(
                    "http://textures.minecraft.net/texture/dca096eea506301bea6d4b17ee1605625a6f5082c71f74a639cc940439f47166"
                ), // PandaClod
            Panda.Gene.PLAYFUL to
                URL(
                    "http://textures.minecraft.net/texture/b6463e64ce29764db3cb46806cee606afc24bdf0ce14b6660c270a96c787426"
                ), // PandaClod
            Panda.Gene.WEAK to
                URL(
                    "http://textures.minecraft.net/texture/5c2d25e956337d82791fa0e6617a40086f02d6ebfbfd5a6459889cf206fca787"
                ), // PandaClod
            Panda.Gene.WORRIED to
                URL(
                    "http://textures.minecraft.net/texture/c8e921c57e54dd07337ffba629e72caf3850d836b76562b1bc3bc5949f2d41d"
                ), // PandaClod
        )

    private val traderLlamaHeadIndex =
        mapOf(
            Llama.Color.BROWN to
                URL(
                    "http://textures.minecraft.net/texture/5a4eed85697c78f462c4eb5653b05b76576c1178f704f3c5676f505d8f3983b4"
                ), // ML_Monster
            Llama.Color.CREAMY to
                URL(
                    "http://textures.minecraft.net/texture/56307f42fc88ebc211e04ea2bb4d247b7428b711df9a4e0c6d1b921589e443a1"
                ), // ML_Monster
            Llama.Color.GRAY to
                URL(
                    "http://textures.minecraft.net/texture/20fdfa60c624fb667c8313b2fb1dab40e0ad2e6e469b567bf596ad26392319c5"
                ), // ML_Monster
            Llama.Color.WHITE to
                URL(
                    "http://textures.minecraft.net/texture/15ad6b69cc6b4769d3516a0ce98b99b2a5d406fea4912dec570ea4a4f2bcc0ff"
                ), // ML_Monster
        )

    private val zombieVillagerHeadIndex =
        mapOf(
            Pair(Villager.Type.PLAINS, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/317ab1f4a31be52a6c995e240878f01824cc905439d6642565d6091c641af8ea"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/7c8dcbdee983d254f9443670e2f7bf4679cd099232bfe6ef693c4e24ccb9b66d"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/d8d00c15b8feba87b1404663bdb15ae75e40e49ed140635ac80f438b52c221ec"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/568001f4f7d071b254be7f31205361ae4fab63ce3886471aa1c74e65f65e1e69"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/bab731b3253f03ab73923c93f62d1b14490d412a864a68cd3c15750e044083d9"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/e6a809495549d3c5b70d06a28a5fa6bed765da7673c6d3603c6498b368bcfc36"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/695722fc8f8723702c325caf4b6af651f9dcbc31086a7270a25a3d3c0e162c01"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/9b2388b23ddd6a9a5776ff2e8ca55b4efe3090caaf967c22769c576b0a40b885"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/7e38e8af075701ad40de5b2ef18e1ed39678e8558444ee91d563d5e5aeb32fab"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/8460e678ffa336450d3ae3b109ff13983aa30a948efa0570b96e228bef546afa"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/da27e420f44f9bb06c7b368402b22af6dc57bf9e8ca3475840f6f75e217809c1"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/c45c11e0327035649ca0600ef938900e25fd1e38017422bc9740e4cda2cba892"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/91cf0d9ad1034c34c04cb4d1d31303947e852c7573f3a4c47998030d656609bb"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/81b5f4fa6b2ac7f860586f748848f4f86d79cbc86ac77ff74396bc810ae9f844"
                ),
            Pair(Villager.Type.PLAINS, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/f354a4172a9ba9c47fb853ab284fdc0a344326013e5d73c4bec7800d83f4e399"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/625afec4f8ac72c349c5b5cb4cc66935333ce4456746814ab58f4b3c92c238b9"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/aa2534224c93588ac40177486ad1bc86668bc8f0b6ca8d083e3abd2a51cd9aba"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/2835374210c6c143d4db32f498187723889c23f59c7efdfe8fcd440c0bbfae39"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/b89d85f45c87f10b3de421426e3a83718d7806cefb0204bea0c629f363150f3f"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/e4bea5fe0d154654ecde42e1670fd430463190c29d4eaee7bf8ab5c273187369"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/c4bbb3cd6405baa49e0d1087554c2ce545c542f3a191ac9c3f6df38968e127d6"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/2589266ce3e2d1f97db894569926cb62fd87f9320b227c2e2890bea2f76369ca"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/272d98c9101c69e74d7ba65229a949716535bca7d9f41ed3a40b653e7fc903b4"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/31998f7638de5ad0e902b29d177edf940dcaddd0633fd00d90b146cfbc47ae15"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/e7ee6e76243879b217d1dee58d1407efbe75042ebd5f9c1d8b1411f5b712e9dd"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/41225ae82e4918eb84f4687fe97a83b291515e7a56e55499c8b046aed2d6e182"
                ), // Same as NONE
            Pair(Villager.Type.DESERT, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/41225ae82e4918eb84f4687fe97a83b291515e7a56e55499c8b046aed2d6e182"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/6f14f1a3f92f84337222f25ee3ab4bfa70328106eb46060d8753867ad8a1a2c0"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/d08d2d0b849c13ca1e5156f30bf2bbd3e7e4305a6ec269c01582c181710eabe4"
                ),
            Pair(Villager.Type.DESERT, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/649adf83a4f6e37fe3f61b46d73ebd8a342d1c75dd4835cbd299d2968d7023f4"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/6099ca8c012a3783a941d6e2660f1b623c2836d68f001b04b1da51b0f56a9b8"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/94eb5346f2c703bbc4963058c4d724d6c7100161252a2eb569cfebfd1065e46b"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/a7b295efb699b158df756364ad2b1d0a73eb4b3cb900c4c750d1241638235ffc"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/3485ea694f65e73eb546dc2c588cf2d0706bc5e08c14e7125f973b303ff4c8e8"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/532798797d818cb9908075ad3044329d9a9e6dc848015c6506455784f8a0c4eb"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/5753cb23b5720e2e365bb42992e403ae361e356cc4e4b66e54f6292536f3cc05"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/651bc09688df7fd324096bd7194e3d0e8968e54fdab9041de587da431ed989ca"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/bbb7d4349d39e1832c7192ef3a8efd7a975454a89febec5d33b6bf88a5d4d2a2"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/a08d71944cb941649c5bdabb698bf866ed0c2517b0fef3667fee4383f95e5f90"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/26bc2d9cc319e843cc6d6920430fe2d9aeb1d17ba9989a4450460c10b793d78e"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/a381c21916010024594bb862c9659b1677937b027599239c2ba6db3a794cd8cf"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/649a46275dec0c247df986dfb4b351d289f0242b5fcd620daae113725720c7c9"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/b613f70783086b6265aaf7d5290c7e8f018c77e30d7690ed68884324ff90d39d"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/8303903eeb9e4f88d4fe1490b46701a847ed23970181f34889bd38e89a034d87"
                ),
            Pair(Villager.Type.JUNGLE, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/2a0c85bac8990b4a051017a4f478ded4540c32aab0d84833b705081ffb36c980"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/9c245379093542564e5e13b068659381fad31960467425c982c2eae20263f60d"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/e809c16cfe6de25a083384dd66d7636b4a35dab4e54558a2acb19193a1b28737"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/14035aca26be97be8406406f1557fa990738770fe038194a4ab81ce0c8396c72"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/80568c2762b2ae6585c23a26d85cfd308f1218355e1ecd3b11f59b4024fbb133"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/da1ba81283af8aff7bc61e0a02fa70122ad618f535db27ed76b494a098c80453"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/de54659405e2a6383757f02efa7c5a9d4e19e554519e18e8da204808b1b565b9"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/fb4129222774c3fa5e80f75a31d8b4ee882c8ce61637b3d0a223de2e4e655b4"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/432e68ecff8f695e8c10248544abf99c8d4507a39e8d586fcbe7e3b23aaa7dec"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/fd6722041a12e2d11b0ad0992ef815f49ccca562c9c167592d9b40652d5c8f1c"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/9b88c239b80b0ac98d9761e8306dd2500be5f535437d5d6913b872cb04c3023c"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/3f050534b6d7b72cb34857084c4ee1ee9ec36db85e81aff93e254dd97eb8a3b9"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/d680ed3fa41eff171b30fee52452d3b89284957af5c5fd4aa61b8bf1f6f6bd2f"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/ba72000c58ae1b8378ad9b8d1a8213904d916e04bf5e5d40849f3a1cf23183ce"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/1f5255094bbc358c13b3c6228391c773d69c6a9794226db1ab6c2d8045e882b9"
                ),
            Pair(Villager.Type.SAVANNA, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/720429b3b9afa589086c1df68080dfcfe72824d65116d333856d19869b3f5f7a"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/d7595d772d85ced188bb6b05277dd909891a15a4bb87ca7b76346837f395226d"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/6a55f3d926573ad665ab845867106ffaaeef9421e68427ffb27177a07a771872"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/eab2ffa67277b05d8a5693c4fa6caab27714d9a9e56e46e21621a578bc71bbfd"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/4e687acf909ef6d399532829b7d06a6b1606782fcc9857716e83247133052520"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/2c5e247e030e6070e28c9de1a4f472450521e573da4d259235e702bda0911a75"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/fb3484cc9379d961c1ea02b628c3a0399de72b98387150791df7a4d41b8d12f2"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/1c8ab70cc5387901b290f7f81585ff19dad5e62564ad110b3e1da79df95e1c32"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/b080df37c34a3ebf71106e195d5ea92339bc7038919e7d8267fb3d8695b23936"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/42077f30357d5db9ad008c410f33319236fa551c42e48b639922fdfde8ea75e1"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/3345c618e4189d37cac464d7e801567e7d3a528210b4f3138ed9124cb60ddcb8"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/5b2390688d67a56e286e3b46397ba19148f59f53935828875f5d1a99007c8896"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/5de1fbe711a6812e53fd56280a8f7d9c3a5c9506678fdef8893418b0efac590a"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/65f00d16fb6f7d3e96a508236c21c2a64797e182f03ba1f60e3c96537c17edb6"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/371a3043f97a71591ae5c65e32a3b61c860eac582774e5d9d92a97149d75b443"
                ),
            Pair(Villager.Type.SNOW, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/fb68bb674a93c6b8d687c35200ada3afabaa940ddeede4a2d537e58dd741be1e"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/fac68897d7149ae67da8f4bad7ac63fc7cbdb94af52de0e4ad7b6db9f9cf349c"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/9f16584632160381b3c483e7174b2ee57c24276a187cfee0740a4a5c687ffad7"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/7f049dfa3fc4d2f72e9ea9b960f07d12369fe77a042ec70058f2aa6532135fa9"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/1289af53f506cb52bc2050649e5a7adc1199fa4fc4f9fff1854da5eb60966b58"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/e873650410d8557a81a27b9b7d85587dd5d04fa71d2c0f6866ce48430252008e"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/52b5f144e5dd24361f4c8f667c50804fe96d7a084f8ee4f2aad01aeb114fdbb"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/e9b9e280bfbc61b5a254d309dd083cc2722ed059c11a3a0eda9316bae7aaae15"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/273a674834c72e5548f4a1f6a101c82a33ec6486264627f00d1e073d7a40d4d6"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/eab95bb3a3eebf0e1a211af8c82c7182ba048dfad31609cfe88bab2e08bd664f"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/85296b3f412b2cc5eaa300cde852bb1179c6ddd51d7183865fba503f625c7b11"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/617c44035c4cbac190367fe01bbe5be482c550c47ae4c5cf6054ca3d4ba391c4"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/2a6e186a2b3d5d427172b74dbd4dacaf287e7e8ffd9bbd1a47ac4ece506ad2ff"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/fe7e586b762e8f69f115c47c36681c24267d42b7aacb1638e894980f39280779"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/23fdd29514f3b99547e7aa1d2a3e561770c3d3cd5ab72bba94a74c8f5c2a6b09"
                ),
            Pair(Villager.Type.SWAMP, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/62266ebadf7db4055becbcdc37541517996319c661aae981d30ac64b67877add"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.ARMORER) to
                URL(
                    "http://textures.minecraft.net/texture/70413a1422cc80d9dd5ebc89ef489256c7d288839aa37e3cc712eed9e979b9a1"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.BUTCHER) to
                URL(
                    "http://textures.minecraft.net/texture/444bca68151d59f22147e2eeb12343fe992715bd049b27943120b142790a6b9"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.CARTOGRAPHER) to
                URL(
                    "http://textures.minecraft.net/texture/ff2d5f830b4815c90bf4edd7c0c09bd7c915facd0c28ad0fd439f9b024c90b27"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.CLERIC) to
                URL(
                    "http://textures.minecraft.net/texture/8696f6c8557f10768cf086b2cef6fc0235aa5c191827ce0993c8e85b67c4272d"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.FARMER) to
                URL(
                    "http://textures.minecraft.net/texture/d0610924436e71266721e7c8cad7ecd6afd8d1d0ddfc24e38cf0788b620a0111"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.FISHERMAN) to
                URL(
                    "http://textures.minecraft.net/texture/302ed44fd0cc959f8b654fff7a27b2de6deb7a0ccf9445ad25ed0c7df3690ffb"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.FLETCHER) to
                URL(
                    "http://textures.minecraft.net/texture/af80cc4a5f1ba6e5a297de7bf4b367dbdcb9a6f46c6c68dab215d58d92ffcdd5"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.LEATHERWORKER) to
                URL(
                    "http://textures.minecraft.net/texture/14ceb35a0d1f8a5fd4a875f975d7a5b7bbc6ae87ef9e41e03dc4ff5098887222"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.LIBRARIAN) to
                URL(
                    "http://textures.minecraft.net/texture/84855647fc62ea9fdcebf03114acfbaae3ec547055324a752fbfa1238d329683"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.MASON) to
                URL(
                    "http://textures.minecraft.net/texture/3c6a3801f5846386e0c8d17147e6edb76b09d5e6024b1a74f431bd4397405a7c"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.NITWIT) to
                URL(
                    "http://textures.minecraft.net/texture/c61fbda493fe0ffb8fac6848829ccdb97501881b9ac8ba4696d7c613ccd3454f"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.NONE) to
                URL(
                    "http://textures.minecraft.net/texture/d58698448e316d4bdd833d9621c2db547b60cf5a5566a79f296fd7cc91e918d9"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.SHEPHERD) to
                URL(
                    "http://textures.minecraft.net/texture/40609d7220f9f44d54fdbff49dc50c2962663d9a270a3131d3cb67b0558a5016"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.TOOLSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/e47e2aeffd122d2e64d9188fd8e6310ab26680b450515adfb890f396f6329a94"
                ),
            Pair(Villager.Type.TAIGA, Villager.Profession.WEAPONSMITH) to
                URL(
                    "http://textures.minecraft.net/texture/ffe54f0fdcb17d8883de2b8ff79090dee3e9d8cef5633f5a941c6cdd24f1dfb0"
                ),
        )

    private val frogHeadIndex =
        mapOf(
            Frog.Variant.TEMPERATE to
                URL(
                    "http://textures.minecraft.net/texture/23ce6f9998ed2da757d1e6372f04efa20e57dfc17c3a06478657bbdf51c2f2a2"
                ), // DorkOrc
            Frog.Variant.WARM to
                URL(
                    "http://textures.minecraft.net/texture/f77314fa038ec31357845a93274b4dc884124686728ffe0ded9c35466aca0aab"
                ), // DorkOrc
            Frog.Variant.COLD to
                URL(
                    "http://textures.minecraft.net/texture/ce62e8a048d040eb0533ba26a866cd9c2d0928c931c50b4482ac3a3261fab6f0"
                ), // DorkOrc
        )

    fun getHeadUrl(entity: Entity): URL? {
        if (entity.type !in mobsWithVariants) {
            return headIndex[entity.type]
        }

        when (entity.type) {
            EntityType.AXOLOTL -> {
                val axolotl = entity as Axolotl
                return axolotlHeadIndex[axolotl.variant]
            }

            EntityType.CAT -> {
                val cat = entity as Cat
                return catHeadIndex[cat.catType]
            }

            EntityType.HORSE -> {
                val horse = entity as Horse
                return horseHeadIndex[horse.color]
            }

            EntityType.MUSHROOM_COW -> {
                val mooshroom = entity as MushroomCow
                return mooshroomHeadIndex[mooshroom.variant]
            }

            EntityType.PARROT -> {
                val parrot = entity as Parrot
                return parrotHeadIndex[parrot.variant]
            }

            EntityType.RABBIT -> {
                val rabbit = entity as Rabbit
                return rabbitHeadIndex[rabbit.rabbitType]
            }

            EntityType.SHEEP -> {
                val sheep = entity as Sheep
                return sheepHeadIndex[sheep.color]
            }

            EntityType.TROPICAL_FISH -> {
                val fish = entity as TropicalFish
                val specialFishType = Fish.getSpecialFishType(fish)
                if (specialFishType == null) {
                    return headIndex[fish.type]
                }
                return specialFishHeadIndex[specialFishType]
            }

            EntityType.VILLAGER -> {
                val villager = entity as Villager
                return villagerHeadIndex[Pair(villager.villagerType, villager.profession)]
            }

            EntityType.FOX -> {
                val fox = entity as Fox
                return foxHeadIndex[fox.foxType]
            }

            EntityType.LLAMA -> {
                val llama = entity as Llama
                return llamaHeadIndex[llama.color]
            }

            EntityType.PANDA -> {
                val panda = entity as Panda
                return pandaHeadIndex[panda.mainGene]
            }

            EntityType.TRADER_LLAMA -> {
                val traderLlama = entity as TraderLlama
                return traderLlamaHeadIndex[traderLlama.color]
            }

            EntityType.ZOMBIE_VILLAGER -> {
                val zombieVillager = entity as ZombieVillager
                return zombieVillagerHeadIndex[Pair(zombieVillager.villagerType, zombieVillager.villagerProfession)]
            }

            EntityType.FROG -> {
                val frog = entity as Frog
                return frogHeadIndex[frog.variant]
            }

            else -> {
                return null
            }
        }
    }

    fun toStringRepresentation(entity: Entity): String? {
        if (entity.type !in mobsWithVariants) {
            return entity.type.name
        }

        when (entity.type) {
            EntityType.AXOLOTL -> {
                val axolotl = entity as Axolotl
                return "${axolotl.variant} ${entity.type.name}"
            }

            EntityType.CAT -> {
                val cat = entity as Cat
                return "${cat.catType} ${entity.type.name}"
            }

            EntityType.HORSE -> {
                val horse = entity as Horse
                return "${horse.color} ${entity.type.name}"
            }

            EntityType.MUSHROOM_COW -> {
                val mooshroom = entity as MushroomCow
                return "${mooshroom.variant} ${entity.type.name}"
            }

            EntityType.PARROT -> {
                val parrot = entity as Parrot
                return "${parrot.variant} ${entity.type.name}"
            }

            EntityType.RABBIT -> {
                val rabbit = entity as Rabbit
                return "${rabbit.rabbitType} ${entity.type.name}"
            }

            EntityType.SHEEP -> {
                val sheep = entity as Sheep
                return "${sheep.color} ${entity.type.name}"
            }

            EntityType.TROPICAL_FISH -> {
                val fish = entity as TropicalFish
                return "${fish.bodyColor} ${fish.patternColor} ${fish.pattern} ${entity.type.name}"
            }

            EntityType.VILLAGER -> {
                val villager = entity as Villager
                return "${villager.villagerType} ${villager.profession} ${entity.type.name}"
            }

            EntityType.FOX -> {
                val fox = entity as Fox
                return "${fox.foxType} ${entity.type.name}"
            }

            EntityType.LLAMA -> {
                val llama = entity as Llama
                return "${llama.color} ${entity.type.name}"
            }

            EntityType.PANDA -> {
                val panda = entity as Panda
                return "${panda.mainGene} ${entity.type.name}"
            }

            EntityType.TRADER_LLAMA -> {
                val traderLlama = entity as TraderLlama
                return "${traderLlama.color} ${entity.type.name}"
            }

            EntityType.ZOMBIE_VILLAGER -> {
                val zombieVillager = entity as ZombieVillager
                return "${zombieVillager.villagerType} ${zombieVillager.villagerProfession} ${entity.type.name}"
            }

            EntityType.FROG -> {
                val frog = entity as Frog
                return "${frog.variant} ${entity.type.name}"
            }

            else -> {
                return null
            }
        }
    }

    fun getHeadUrlWithStringRepresentation(stringRepresentation: String): URL? {
        val split = stringRepresentation.split(" ")

        val entityType = EntityType.valueOf(split.last())

        if (entityType !in mobsWithVariants) {
            return headIndex[entityType]
        }

        when (entityType) {
            EntityType.AXOLOTL -> {
                return axolotlHeadIndex[Axolotl.Variant.valueOf(split[0])]
            }

            EntityType.CAT -> {
                return catHeadIndex[Cat.Type.valueOf(split[0])]
            }

            EntityType.HORSE -> {
                return horseHeadIndex[Horse.Color.valueOf(split[0])]
            }

            EntityType.MUSHROOM_COW -> {
                return mooshroomHeadIndex[MushroomCow.Variant.valueOf(split[0])]
            }

            EntityType.PARROT -> {
                return parrotHeadIndex[Parrot.Variant.valueOf(split[0])]
            }

            EntityType.RABBIT -> {
                return rabbitHeadIndex[Rabbit.Type.valueOf(split[0])]
            }

            EntityType.SHEEP -> {
                return sheepHeadIndex[DyeColor.valueOf(split[0])]
            }

            EntityType.TROPICAL_FISH -> {
                val bodyColor = DyeColor.valueOf(split[0])
                val patternColor = DyeColor.valueOf(split[1])
                val pattern = TropicalFish.Pattern.valueOf(split[2])
                val specialFishType = Fish.getSpecialFishType(bodyColor, patternColor, pattern)
                if (specialFishType == null) {
                    return headIndex[entityType]
                }
                return specialFishHeadIndex[specialFishType]
            }

            EntityType.VILLAGER -> {
                val villagerType = Villager.Type.valueOf(split[0])
                val profession = Villager.Profession.valueOf(split[1])
                return villagerHeadIndex[Pair(villagerType, profession)]
            }

            EntityType.FOX -> {
                return foxHeadIndex[Fox.Type.valueOf(split[0])]
            }

            EntityType.LLAMA -> {
                return llamaHeadIndex[Llama.Color.valueOf(split[0])]
            }

            EntityType.PANDA -> {
                return pandaHeadIndex[Panda.Gene.valueOf(split[0])]
            }

            EntityType.TRADER_LLAMA -> {
                return traderLlamaHeadIndex[Llama.Color.valueOf(split[0])]
            }

            EntityType.ZOMBIE_VILLAGER -> {
                val villagerType = Villager.Type.valueOf(split[0])
                val villagerProfession = Villager.Profession.valueOf(split[1])
                return zombieVillagerHeadIndex[Pair(villagerType, villagerProfession)]
            }

            EntityType.FROG -> {
                return frogHeadIndex[Frog.Variant.valueOf(split[0])]
            }

            else -> {
                return null
            }
        }
    }

    fun String.titleCase(): String {
        return this.lowercase().split("_", " ").joinToString(" ") { it.replaceFirstChar { char -> char.uppercase() } }
    }

    fun getNameForEntity(entity: Entity): String? {
        var name = ""

        if (entity.type !in mobsWithVariants && entity.type != EntityType.CREEPER) {
            name = entity.type.name
        }

        when (entity.type) {
            EntityType.AXOLOTL -> {
                val axolotl = entity as Axolotl
                name = "${axolotl.variant} ${entity.type.name}"
            }

            EntityType.CAT -> {
                val cat = entity as Cat
                name = "${cat.catType} ${entity.type.name}"
            }

            EntityType.CREEPER -> {
                name = "Charged ${entity.type.name}"
            }

            EntityType.HORSE -> {
                val horse = entity as Horse
                name = "${horse.color} ${entity.type.name}"
            }

            EntityType.MUSHROOM_COW -> {
                val mooshroom = entity as MushroomCow
                name = "${mooshroom.variant} Mooshroom"
            }

            EntityType.PARROT -> {
                val parrot = entity as Parrot
                name = "${parrot.variant} ${entity.type.name}"
            }

            EntityType.RABBIT -> {
                val rabbit = entity as Rabbit
                name = "${rabbit.rabbitType}${entity.type.name}"
            }

            EntityType.SHEEP -> {
                val sheep = entity as Sheep
                name = "${sheep.color} ${entity.type.name}"
            }

            EntityType.TROPICAL_FISH -> {
                val fish = entity as TropicalFish
                val specialFishType = Fish.getSpecialFishType(fish)
                name =
                    specialFishType?.name
                        ?: "${fish.bodyColor} ${fish.patternColor} ${fish.pattern} ${entity.type.name}"
            }

            EntityType.VILLAGER -> {
                val villager = entity as Villager
                val professionName =
                    if (villager.profession == Villager.Profession.NONE) {
                        "UNEMPLOYED"
                    } else {
                        villager.profession.name
                    }
                name = "${villager.villagerType} $professionName ${entity.type.name}"
            }

            EntityType.FOX -> {
                val fox = entity as Fox
                name = "${fox.foxType} ${entity.type.name}"
            }

            EntityType.LLAMA -> {
                val llama = entity as Llama
                name = "${llama.color} ${entity.type.name}"
            }

            EntityType.PANDA -> {
                val panda = entity as Panda
                name = "${panda.mainGene} ${entity.type.name}"
            }

            EntityType.TRADER_LLAMA -> {
                val traderLlama = entity as TraderLlama
                name = "${traderLlama.color} ${entity.type.name}"
            }

            EntityType.ZOMBIE_VILLAGER -> {
                val zombieVillager = entity as ZombieVillager
                val professionName =
                    if (zombieVillager.villagerProfession == Villager.Profession.NONE) {
                        "UNEMPLOYED"
                    } else {
                        zombieVillager.villagerProfession?.name
                    }
                name = "${zombieVillager.villagerType} $professionName ${entity.type.name}"
            }

            EntityType.FROG -> {
                val frog = entity as Frog
                name = "${frog.variant} ${entity.type.name}"
            }

            else -> {}
        }

        if (name == "") {
            return null
        }

        return name.titleCase()
    }

    fun getNameForEntity(stringRepresentation: String): String? {
        val split = stringRepresentation.split(" ")

        val entityType = EntityType.valueOf(split.last())

        if (
            entityType != EntityType.TROPICAL_FISH &&
                entityType != EntityType.VILLAGER &&
                entityType != EntityType.ZOMBIE_VILLAGER &&
                entityType != EntityType.MUSHROOM_COW
        ) {
            return stringRepresentation.titleCase()
        }

        if (entityType == EntityType.MUSHROOM_COW) {
            return stringRepresentation.replace("MUSHROOM_COW", "MOOSHROOM").titleCase()
        }

        if (entityType == EntityType.VILLAGER || entityType == EntityType.ZOMBIE_VILLAGER) {
            return stringRepresentation.replace("NONE", "UNEMPLOYED").titleCase()
        }

        val bodyColor = DyeColor.valueOf(split[1])
        val patternColor = DyeColor.valueOf(split[2])
        val pattern = TropicalFish.Pattern.valueOf(split[3])
        val specialFishType = Fish.getSpecialFishType(bodyColor, patternColor, pattern)
        return specialFishType?.name?.titleCase() ?: return stringRepresentation.titleCase()
    }
}
