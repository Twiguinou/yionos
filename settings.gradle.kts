pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "yionos"

include("physics")
include("native")
project(":native").projectDir = file("physics/native")

include("bindings")
include("demo")
include("experiments")
