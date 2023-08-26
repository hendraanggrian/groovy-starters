val RELEASE_ARTIFACT: String by project

plugins {
    groovy
    application
}

application.mainClass.set("com.example.App")

dependencies {
    implementation(libs.groovy)
    implementation(project(":$RELEASE_ARTIFACT"))
    implementation(project(":$RELEASE_ARTIFACT-extension"))
}
