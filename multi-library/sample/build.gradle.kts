val RELEASE_ARTIFACT: String by project

plugins {
    groovy
    application
}

application.mainClass.set("com.example.MyApp")

dependencies {
    implementation(libs.groovy)
    implementation(project(":$RELEASE_ARTIFACT-a"))
    implementation(project(":$RELEASE_ARTIFACT-b"))
}
