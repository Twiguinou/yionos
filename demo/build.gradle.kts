import org.apache.tools.ant.taskdefs.condition.Os
import java.lang.IllegalStateException

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version("8.1.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22

    withSourcesJar()
}

val log4jVersion by extra("2.23.0")
dependencies {
    implementation(project(":physics"))
    implementation("jpgen:api:0")

    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")

    implementation("org.joml:joml:1.10.6")

    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

val shadersDirectory = File(projectDir, "shaders")
val spvOutputDirectory = layout.buildDirectory.map { it.file("shaders-spv") }.get().asFile
task("compileShaders") {
    group = "yionos"

    doFirst {
        if (!spvOutputDirectory.exists() && !spvOutputDirectory.mkdirs()) {
            throw IllegalStateException("Unable to create shaders output directory.")
        }
    }

    doLast {
        fileTree(shadersDirectory).onEach { file ->
            exec {
                workingDir(projectDir)
                executable("glslc")
                args(listOf(
                    "-finvert-y", "--target-env=vulkan1.2", "-O",
                    "-I$shadersDirectory",
                    "-o", "$spvOutputDirectory/${file.nameWithoutExtension}.${file.extension}.spv",
                    file
                ))
            }
        }
    }
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-native-access=ALL-UNNAMED"
    ))

    if (Os.isFamily(Os.FAMILY_MAC)) {
        jvmArgs("-XstartOnFirstThread")
    }
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "yionos.demo.Main"
    }
}

tasks.shadowJar {
    archiveBaseName = "yionos-demo"
    archiveClassifier = ""
    archiveVersion = ""
}
