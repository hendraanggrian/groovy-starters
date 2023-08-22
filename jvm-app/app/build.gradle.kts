val RELEASE_GROUP: String by project

plugins {
    groovy
    application
    codenarc
    jacoco
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(libs.versions.jdk.get()))

application.mainClass.set("$RELEASE_GROUP.app.MyApp")

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
