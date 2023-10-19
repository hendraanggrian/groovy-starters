plugins {
    groovy
    codenarc
    jacoco
    alias(libs.plugins.maven.publish)
}

dependencies {
    // codenarc(libs.rulebook.codenarc)

    implementation(libs.groovy)

    testImplementation(libs.truth)
}
