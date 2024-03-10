allprojects {
    group = ""
    version = "0"

    repositories {
        mavenLocal()
        mavenCentral()

        maven(url = "https://jitpack.io")
    }

    tasks.withType<JavaCompile>().configureEach {
        options.compilerArgs.addAll(listOf(
            "--enable-preview"
        ))
    }

    tasks.withType<JavaExec>().configureEach {
        jvmArgs(listOf(
            "--enable-preview"
        ))
    }
}
