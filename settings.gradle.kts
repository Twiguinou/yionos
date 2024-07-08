pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "yionos"

include("physics")
include("demo")
include("codegen")
include("native-libs")
