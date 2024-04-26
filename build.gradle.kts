val gdxVersion by extra {"1.12.1"}
val gdxVfxVersion by extra {"0.5.4"}
val jUnitPlatformVersion by extra {"1.10.1"}
val jUnitJupiterVersion by extra {"5.10.1"}
val mockitoVersion by extra {"5.7.0"}
val assertJVersion by extra {"3.24.2"}
val logbackVersion by extra {"1.4.11"}

plugins {
    java
    `java-library`
    id("org.sonarqube") version "4.4.1.3373"
    id("checkstyle")
    id("pmd");
}

allprojects {

    version = "2.6.1"

    apply(plugin = "java")
    apply(plugin = "java-library")
    apply(plugin = "checkstyle")
    apply(plugin = "pmd")

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }

    repositories {
        mavenCentral() //keep an eye on this, see libgdx 1.10.0
    }

    dependencies {
        testImplementation("org.junit.platform:junit-platform-launcher:$jUnitPlatformVersion")
        testImplementation("org.junit.jupiter:junit-jupiter-api:$jUnitJupiterVersion")
        testImplementation("org.junit.jupiter:junit-jupiter-params:$jUnitJupiterVersion")
        testImplementation("org.mockito:mockito-core:$mockitoVersion")
        testImplementation("org.assertj:assertj-core:$assertJVersion")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jUnitJupiterVersion")
    }

    sonar {
        properties {
            property("sonar.projectKey", "src-gdxGame-es04")
            property("sonar.organization", "es04-ufcg")
            property("sonar.host.url", "https://liad.computacao.ufcg.edu.br:8080")
        }
    }

    checkstyle {
        toolVersion = "8.44"
        configFile = rootProject.file("config/checkstyle.xml");
        reportsDir = file("reports/checkstyle")
    }

    pmd {
        toolVersion = "6.55.0"
        ruleSetConfig = rootProject.resources.text.fromFile("config/pmd.xml")
        isIgnoreFailures = true
    }
}

project(":desktop") {

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(project(":core"))
        implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion");
        implementation("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-desktop");
    };"7.8.1"
}

project(":core") {

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("com.badlogicgames.gdx:gdx:$gdxVersion")
        implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
        implementation("com.crashinvaders.vfx:gdx-vfx-core:$gdxVfxVersion")
        implementation("com.crashinvaders.vfx:gdx-vfx-effects:$gdxVfxVersion")
        implementation("ch.qos.logback:logback-classic:$logbackVersion")
        testImplementation("com.badlogicgames.gdx:gdx-backend-headless:$gdxVersion")
    }

}
