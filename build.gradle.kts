plugins {
    id("java")
    id("idea")
}

idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}

allprojects {
    group = ""
    version = "0"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    subprojects {
        apply(plugin = "java")

        java {
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }

        tasks.withType<JavaCompile> {
            options.compilerArgs.addAll(listOf(
                    "--enable-preview"
            ))
        }
    }
}
