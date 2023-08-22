plugins {
    groovy
    application
}

application.mainClass.set("com.example.MyApp")

dependencies {
    implementation(libs.groovy)
    implementation(project(":library"))
}
