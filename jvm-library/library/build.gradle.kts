import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar

plugins {
    groovy
    codenarc
    jacoco
    alias(libs.plugins.maven.publish)
}

mavenPublishing.configure(JavaLibrary(JavadocJar.Javadoc(), true))

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
