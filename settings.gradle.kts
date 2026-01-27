rootProject.name = "MobHeads-OG"

ProcessBuilder("sh", "bootstrap.sh").directory(rootDir).inheritIO().start().let {
    if (it.waitFor() != 0) throw GradleException("bootstrap.sh failed")
}
