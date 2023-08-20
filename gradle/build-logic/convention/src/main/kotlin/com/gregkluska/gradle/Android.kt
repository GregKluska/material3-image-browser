package com.gregkluska.gradle

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureAndroidCommon(
    commonExtension: CommonExtension<*, *, *, *, *>
) {
    commonExtension.apply {
        compileSdk = Versions.compileSdk

        defaultConfig {
            minSdk = Versions.minSdk
        }

        compileOptions {
            sourceCompatibility = Versions.javaVersion
            targetCompatibility = Versions.javaVersion
        }

        configureKotlin()
    }
}