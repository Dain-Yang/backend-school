plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // ✅ AssertJ 추가
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("net.datafaker:datafaker:2.4.2")
}

tasks.test {
    useJUnitPlatform()
}