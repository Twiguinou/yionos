plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22

    withSourcesJar()
    withJavadocJar()
}

dependencies {
    implementation("org.joml:joml:1.10.6")

    implementation("com.zaxxer:SparseBitSet:1.3")

    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}
