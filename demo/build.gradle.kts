import org.apache.tools.ant.taskdefs.condition.Os

plugins {
    id("java")
    id("edu.sc.seis.launch4j") version("3.0.5")
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

launch4j {
    mainClassName = "yionos.demo.Main"
    jvmOptions.addAll(listOf(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED"
    ))
    bundledJrePath = System.getProperty("java.home")
    requires64Bit = true
    headerType = "console"
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-native-access=ALL-UNNAMED",
            "-ea"
    ))

    if (Os.isFamily(Os.FAMILY_MAC)) {
        jvmArgs("-XstartOnFirstThread")
    }
}
