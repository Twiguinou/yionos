import org.gradle.internal.os.OperatingSystem
import java.lang.IllegalStateException

plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21

    withSourcesJar()
}

dependencies {
    implementation("jpgen:generator:0")
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-native-access=ALL-UNNAMED",
            "-ea"
    ))
}

val vulkanSdkDirectory: String? = System.getenv("VULKAN_SDK")
if (vulkanSdkDirectory == null) {
    throw IllegalStateException("Vulkan SDK is either not installed or its path is missing from environment variables.")
}

val sharedLibrariesCommonDirectory = layout.buildDirectory.map { it.file("/native-libs/") }.get().asFile
val compilationFilesDirectory = "compilation-files"
val dependenciesDirectory = "dependencies"
val os: OperatingSystem = OperatingSystem.current()
val cmakeBuildType = "Release"

// I would have loved to use pattern matching for that but I encountered a compiler bug with the following lines:
//val (cmakeGenerator, makeCommand) = when {
//    os.isWindows -> arrayOf("MinGW Makefiles", "mingw32-make")
//    else -> throw UnsupportedOperationException("The current operating system is not supported for compilation.")
//}

var cmakeGenerator = ""
var makeCommand = "make"
var cppCompiler = "clang++"
var cCompiler = "clang"
var sharedLibraryExtension = ""
when {
    os.isWindows -> {
        cmakeGenerator = "MinGW Makefiles"
        makeCommand = "mingw32-make"
        sharedLibraryExtension = "dll"
    }
    else -> throw UnsupportedOperationException("The current operating system is not supported for compilation.")
}

task("generateGlfwSharedLibs") {
    group = "yionos"

    doFirst {
        exec {
            workingDir("${dependenciesDirectory}/glfw/")
            executable("cmake")
            args(listOf(
                "-S", ".", "-B", "build",
                "-DCMAKE_BUILD_TYPE=$cmakeBuildType",
                "-DBUILD_SHARED_LIBS=ON", "-DGLFW_BUILD_EXAMPLES=OFF", "-DGLFW_BUILD_TESTS=OFF", "-DGLFW_BUILD_DOCS=OFF", "-DGLFW_INSTALL=OFF",
                "-G", cmakeGenerator
            ))
        }

        exec {
            workingDir("${dependenciesDirectory}/glfw/build/")
            executable(makeCommand)
        }
    }

    doLast {
        copy {
            from("${dependenciesDirectory}/glfw/build/src/glfw3.$sharedLibraryExtension")
            into(sharedLibrariesCommonDirectory)
        }
    }
}

task("generateVMASharedLibs") {
    group = "yionos"

    doLast {
        exec {
            executable(cppCompiler)
            args(listOf(
                "-shared", "-O2", "-Wno-everything",
                "-I$vulkanSdkDirectory/Include/", "-I$dependenciesDirectory/vma/include/",
                "-o", "${sharedLibrariesCommonDirectory.path}/libvma.$sharedLibraryExtension",
                "$compilationFilesDirectory/VMA_SHARED_EXPORT.cpp"
            ))
        }
    }
}

// TODO: shaderc compilation task

task("generateNuklearSharedLibs") {
    group = "yionos"

    doLast {
        exec {
            executable(cCompiler)
            args(listOf(
                "-shared", "-O2", "-Wno-everything",
                "-I$dependenciesDirectory/nuklear/",
                "-o", "${sharedLibrariesCommonDirectory.path}/libnuklear.$sharedLibraryExtension",
                "$compilationFilesDirectory/NUKLEAR_SHARED_EXPORT.c"
            ))
        }
    }
}

task("generateStbImageSharedLibs") {
    group = "yionos"

    doLast {
        exec {
            executable(cCompiler)
            args(listOf(
                "-shared", "-O2", "-Wno-everything",
                "-I$dependenciesDirectory/stb/",
                "-o", "${sharedLibrariesCommonDirectory.path}/libstbimage.$sharedLibraryExtension",
                "$compilationFilesDirectory/STBIMAGE_SHARED_EXPORT.c"
            ))
        }
    }
}

task("generateAssimpSharedLibs") {
    group = "yionos"

    doFirst {
        exec {
            workingDir("${dependenciesDirectory}/assimp/")
            executable("cmake")
            args(listOf(
                "-S", ".", "-B", "build",
                "-DCMAKE_BUILD_TYPE=$cmakeBuildType",
                "-DASSIMP_BUILD_FRAMEWORK=OFF", "-DASSIMP_BUILD_TESTS=OFF", "-DASSIMP_INSTALL=OFF",
                "-DASSIMP_BUILD_ALL_IMPORTERS_BY_DEFAULT=FALSE", "-DASSIMP_BUILD_OBJ_IMPORTER=TRUE", "-DASSIMP_BUILD_FBX_IMPORTER=TRUE", "-DASSIMP_BUILD_COLLADA_IMPORTER=TRUE",
                "-G", cmakeGenerator
            ))
        }

        exec {
            workingDir("${dependenciesDirectory}/assimp/build/")
            executable(makeCommand)
        }
    }

    doLast {
        copy {
            from("${dependenciesDirectory}/assimp/build/bin/libassimp-5.$sharedLibraryExtension")
            into(sharedLibrariesCommonDirectory)
        }
    }
}

task("generateSharedLibs") {
    group = "yionos"

    doFirst {
        if (!(sharedLibrariesCommonDirectory.exists() || sharedLibrariesCommonDirectory.mkdir())) {
            throw IllegalStateException("Unable to create output directory.")
        }
    }

    dependsOn("generateGlfwSharedLibs")
    dependsOn("generateVMASharedLibs")
    dependsOn("generateNuklearSharedLibs")
    dependsOn("generateStbImageSharedLibs")
    dependsOn("generateAssimpSharedLibs")
}
