val RELEASE_ARTIFACT: String by project

plugins {
    groovy
    codenarc
    jacoco
    alias(libs.plugins.maven.publish)
}

dependencies {
    codenarc(libs.codenarc)
    // codenarc(libs.rulebook.codenarc)

    implementation(project(":$RELEASE_ARTIFACT"))
    implementation(libs.groovy)

    testImplementation(libs.truth)
}
