import org.gradle.internal.os.OperatingSystem
import java.lang.IllegalStateException

/**
 * TODO: Fix all this.
 */

data class Platform(val name: String, val extension: String, val buildArgs: List<String>, val target: String)
val platforms = listOf(
    Platform("Windows-x86_64", "dll", listOf(
        "-DCMAKE_SYSTEM_NAME=Windows", "-DCMAKE_SYSTEM_ARCH=x86_64"
    ), "x86_64-pc-windows-msvc"),
    Platform("Windows-arm64", "dll", listOf(
        "-DCMAKE_SYSTEM_NAME=Windows", "-DCMAKE_SYSTEM_ARCH=arm64"
    ), "arm64-pc-windows-msvc"),
    Platform("Windows-aarch64", "dll", listOf(
        "-DCMAKE_SYSTEM_NAME=Windows", "-DCMAKE_SYSTEM_ARCH=arm64"
    ), "aarch64-pc-windows-msvc")
)

val os: OperatingSystem = OperatingSystem.current()

val outputDirectory = layout.buildDirectory.map { it.file("native-gen") }.get().asFile
val externDirectory = File(projectDir, "extern")
val makeGenerator = if (os.isWindows) "MinGW Makefiles" else "Unix Makefiles"
val make = if (os.isWindows) "mingw32-make" else "make"

fun makeDirectory(directory: File) {
    if (!directory.exists() && !directory.mkdirs()) {
        throw IllegalStateException("Could not create output directory.")
    }
}

platforms.forEach { platform ->

    val platformOutputDirectory = File(outputDirectory, platform.name)
    val buildDirectoryName = "build_${platform.name}"

    tasks.register("${platform.name}_generateGlfw") {
        group = "yionos"

        val glfwDirectory = File(externDirectory, "glfw")
        val glfwBuildDirectory = File(glfwDirectory, buildDirectoryName)

        doFirst {
            makeDirectory(platformOutputDirectory)

            exec {
                workingDir(glfwDirectory)
                executable("cmake")
                args(listOf(
                    "-S", ".", "-B", buildDirectoryName,
                    "-DCMAKE_C_COMPILER=clang", "-DCMAKE_BUILD_TYPE=Release",
                    "-DBUILD_SHARED_LIBS=ON", "-DGLFW_BUILD_EXAMPLES=OFF", "-DGLFW_BUILD_TESTS=OFF", "-DGLFW_BUILD_DOCS=OFF", "-DGLFW_INSTALL=OFF",
                    "-G", makeGenerator
                ).plus(platform.buildArgs))
            }

            exec {
                workingDir(glfwBuildDirectory)
                executable(make)
            }
        }

        doLast {
            copy {
                from("$glfwBuildDirectory/src/glfw3.${platform.extension}")
                into(platformOutputDirectory)
            }
        }
    }

    tasks.register("${platform.name}_generateStbImage") {
        group = "yionos"

        doFirst {
            makeDirectory(platformOutputDirectory)
        }

        doLast {
            exec {
                executable("clang")
                args(listOf(
                    "-shared", "-O2", "-Wno-everything", "--target=${platform.target}", "-v",
                    "-I$externDirectory/stb/",
                    "-o", "${platformOutputDirectory.path}/stb_image.${platform.extension}",
                    "STB_IMAGE_IMPL.c"
                ))
            }
        }
    }

    tasks.register("${platform.name}_generateNuklear") {
        group = "yionos"

        doFirst {
            makeDirectory(platformOutputDirectory)
        }

        doLast {
            exec {
                executable("clang")
                args(listOf(
                    "-shared", "-O2", "-Wno-everything",
                    "-I$externDirectory/Nuklear/",
                    "-o", "${outputDirectory.path}/nuklear.${platform.extension}",
                    "NUKLEAR_IMPL.c"
                ))
            }
        }
    }

    tasks.register("${platform.name}_generateVma") {
        group = "yionos"

        val vulkanSdkDirectory: String = System.getenv("VULKAN_SDK")
            ?: throw IllegalStateException("Vulkan SDK is either not installed or its path is missing from environment variables.")

        doFirst {
            makeDirectory(platformOutputDirectory)
        }

        doLast {
            exec {
                executable("clang++")
                args(listOf(
                    "-shared", "-O2", "-Wno-everything",
                    "-I$externDirectory/VulkanMemoryAllocator/include/", "-I$vulkanSdkDirectory/Include/",
                    "-o", "${outputDirectory.path}/vma.${platform.extension}",
                    "VMA_IMPL.c"
                ))
            }
        }
    }

    tasks.register("${platform.name}_generateAssimp") {
        group = "yionos"

        doFirst {
            makeDirectory(platformOutputDirectory)

            exec {
                workingDir("${externDirectory}/assimp/")
                executable("cmake")
                args(listOf(
                    "--build", "build", "--target", "clean"
                ))
            }

            exec {
                workingDir("${externDirectory}/assimp/")
                executable("cmake")
                args(listOf(
                    "-S", ".", "-B", "build",
                    "-DCMAKE_BUILD_TYPE=Release",
                    "-DASSIMP_BUILD_FRAMEWORK=OFF", "-DASSIMP_BUILD_TESTS=OFF", "-DASSIMP_INSTALL=OFF", "-DASSIMP_BUILD_ASSIMP_VIEW=OFF",
                    "-DASSIMP_BUILD_ALL_IMPORTERS_BY_DEFAULT=OFF", "-DASSIMP_BUILD_OBJ_IMPORTER=ON",
                    "-DASSIMP_BUILD_ALL_EXPORTERS_BY_DEFAULT=OFF"
                ).plus(platform.buildArgs))
            }

            exec {
                workingDir("${externDirectory}/assimp/build/")
                executable("make")
            }
        }

        doLast {
            copy {
                from("${externDirectory}/assimp/build/bin/assimp-5.${platform.extension}")
                into(outputDirectory)
            }
        }
    }

    tasks.register("${platform.name}_generateAll") {
        group = "yionos"

        dependsOn("${platform.name}_generateGlfw")
        dependsOn("${platform.name}_generateStbImage")
        dependsOn("${platform.name}_generateNuklear")
        dependsOn("${platform.name}_generateVma")
        dependsOn("${platform.name}_generateAssimp")
    }
}
