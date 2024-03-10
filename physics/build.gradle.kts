plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21

    withSourcesJar()
    withJavadocJar()
}

dependencies {
    implementation("org.joml:joml:1.10.5")

    implementation("com.zaxxer:SparseBitSet:1.3")

    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}
