import org.gradle.internal.os.OperatingSystem
import java.lang.IllegalStateException

plugins {
    id("application")
}

val os: OperatingSystem = OperatingSystem.current()

val cmakeBuildDirectory = layout.buildDirectory.map { it.file("cmake") }.get().asFile
val nativesOutputDirectory = layout.buildDirectory.map { it.file("native-gen") }.get().asFile
val makeGenerator = if (os.isWindows) "MinGW Makefiles" else "Unix Makefiles"
val make = if (os.isWindows) "mingw32-make" else "make"
val sharedLibraryExtension = when {
    os.isWindows -> "dll"
    os.isMacOsX -> "dylib"
    else -> "so"
}

val bindingsOutputDirectory = layout.buildDirectory.map { it.file("code-gen") }.get().asFile
val externDirectory = File(projectDir, "extern")

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22
}

dependencies {
    implementation("jpgen:generator:0")
    implementation("jpgen:api:0")
}

tasks.create("generateCMakeConfig") {
    group = "yionos"

    doFirst {
        exec {
            executable("cmake")
            args(listOf(
                "-S", ".", "-B", cmakeBuildDirectory,
                "-G", makeGenerator
            ))
        }
    }
}

tasks.create("compileNativeLibraries") {
    group = "yionos"

    dependsOn("generateCMakeConfig")

    doFirst {
        exec {
            workingDir(cmakeBuildDirectory)
            executable(make)
        }
    }

    doLast {
        if (!nativesOutputDirectory.exists() && !nativesOutputDirectory.mkdirs()) {
            throw IllegalStateException("Failed to create output directory.")
        }

        copy {
            from(cmakeBuildDirectory)
            include("**/*.$sharedLibraryExtension")
            into(nativesOutputDirectory)
            rename { filename ->
                if (filename.startsWith("lib")) filename.substring(3)
                else filename
            }

            includeEmptyDirs = false
            eachFile { path = name }
        }
    }
}

application {
    mainClass = "yionos.codegen.Main"
    applicationDefaultJvmArgs = listOf(
        "--enable-native-access=ALL-UNNAMED"
    )
}

tasks.named<JavaExec>("run") {
    dependsOn("generateCMakeConfig")

    mainClass = "yionos.codegen.Main"

    val vulkanSdkDirectory: String = System.getenv("VULKAN_SDK")
        ?: throw IllegalStateException("Vulkan SDK is either not installed or its path is missing from environment variables.")

    val debugMode = System.getProperty("DEBUG", "true").toBoolean()
    val programArgs = (project.property("programArgs") ?: "").toString().split(';')

    args = listOf(
        "--debug=$debugMode",
        "--output_directory=$bindingsOutputDirectory",
        "--vulkan_include=$vulkanSdkDirectory/Include",
        "--glfw_include=$externDirectory/glfw/include/GLFW",
        "--vma_include=$externDirectory/VulkanMemoryAllocator/include",
        "--stb_include=$externDirectory/stb",
        "--nuklear_include=$externDirectory/Nuklear",
        "--assimp_include=$externDirectory/assimp/include",
        "--assimp_config_include=$cmakeBuildDirectory/extern/assimp/include"
    ).plus(programArgs)
}
