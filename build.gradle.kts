plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "4.0.4"
    id("maven-publish")
}

group = "es.angelillo15"
version = "1.4"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/central")
    maven("https://repo.dmulloy2.net/repository/public/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19.3-R0.1-SNAPSHOT")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    compileOnly("com.comphenix.protocol:ProtocolLib:4.8.0")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "es.angelillo15.glow"
            artifactId = "GlowAPI"
            version = version

            from(components["java"])
        }
    }
}