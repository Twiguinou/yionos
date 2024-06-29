pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "yionos"

include("physics")
include("bindings")
include("demo")
include("codegen")
