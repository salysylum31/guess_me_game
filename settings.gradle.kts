pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://jitpack.io")
        }
        maven {
            name = "ImageSlider"
            url = uri("https://github.com/denzcoskun/ImageSlideshow")
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "ImageSlider"
            url = uri("https://github.com/denzcoskun/ImageSlideshow")
            maven {
                url = uri("https://jitpack.io")
    }
        }


rootProject.name = "LeatherBoxx"
include(":app")
    }
}
