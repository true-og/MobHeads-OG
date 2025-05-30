import java.io.BufferedReader

plugins {
    kotlin("jvm") version "2.1.21"
    id("com.gradleup.shadow") version "8.3.5"
	id("eclipse")
}

val commitHash = Runtime
    .getRuntime()
    .exec(arrayOf("git", "rev-parse", "--short=10", "HEAD"))
    .let { process ->
        process.waitFor()
        val output = process.inputStream.use {
            it.bufferedReader().use(BufferedReader::readText)
        }
        process.destroy()
        output.trim()
    }

val apiVersion = "1.19"

group = "net.trueog"
version = "$apiVersion-$commitHash"

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.4-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

val targetJavaVersion = 17
kotlin {
    jvmToolchain(targetJavaVersion)
}

tasks.build {
    dependsOn("shadowJar")
}

tasks.jar {
    archiveClassifier.set("part")
}

tasks.shadowJar {
    archiveClassifier.set("")
    minimize()
}

tasks.processResources {
    val props = mapOf(
        "version" to version,
        "apiVersion" to apiVersion
    )
    inputs.properties(props)
    filteringCharset = "UTF-8"
    filesMatching("plugin.yml") {
        expand(props)
    }

    from("LICENSE") {
        into("/")
    }
}

tasks.withType<AbstractArchiveTask>().configureEach {
    isPreserveFileTimestamps = false
    isReproducibleFileOrder = true
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(targetJavaVersion)
        vendor = JvmVendorSpec.GRAAL_VM
    }
}
