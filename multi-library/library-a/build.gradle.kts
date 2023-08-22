plugins {
    groovy
    codenarc
    jacoco
    alias(libs.plugins.maven.publish)
}

codenarc {
    toolVersion = libs.versions.codenarc.get()
    configFile = rootDir.resolve("rulebook_codenarc.xml")
}

dependencies {
    codenarc(libs.codenarc)
    // codenarc(libs.rulebook.codenarc)

    implementation(libs.groovy)

    testImplementation(libs.truth)
}
