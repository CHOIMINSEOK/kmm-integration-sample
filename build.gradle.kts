plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.1.2").apply(false)
    kotlin("android").version("2.0.0").apply(false)

    id("org.jetbrains.compose") version "1.6.11" apply false
    id("org.jetbrains.kotlin.multiplatform") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}