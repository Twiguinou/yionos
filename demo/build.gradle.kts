import org.apache.tools.ant.taskdefs.condition.Os

plugins {
    id("edu.sc.seis.launch4j") version("3.0.5")
}

val log4jVersion by extra("2.22.1")
dependencies {
    implementation(project(":physics"))
    implementation("jpgen:api:0")

    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")

    implementation("org.joml:joml:1.10.5")

    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

launch4j {
    mainClassName = "yionos.demo.Main"
    jvmOptions.addAll(listOf(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED"
    ))
    requires64Bit = true
    headerType = "console"
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED",
            "-ea"
    ))

    if (Os.isFamily(Os.FAMILY_MAC)) {
        jvmArgs("-XstartOnFirstThread")
    }
}