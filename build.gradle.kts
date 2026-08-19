plugins {
    kotlin("js") version "1.9.25"
}

group = "com.angus.software.website"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers") }
}

dependencies {
    testImplementation(kotlin("test-js"))
    implementation("org.jetbrains:kotlin-react:17.0.2-pre.156-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-react-dom:17.0.2-pre.156-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-styled:5.3.0-pre.156-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-react-router-dom:5.2.0-pre.156-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-redux:4.0.5-pre.156-kotlin-1.5.0")
    implementation("org.jetbrains:kotlin-react-redux:7.2.3-pre.156-kotlin-1.5.0")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}