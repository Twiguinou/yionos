plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22
}

dependencies {
    implementation("jpgen:generator:0")
    implementation("jpgen:api:0")
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
        "--enable-native-access=ALL-UNNAMED"
    ))
}
