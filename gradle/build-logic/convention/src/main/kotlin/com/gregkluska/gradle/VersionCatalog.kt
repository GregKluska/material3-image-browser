package com.gregkluska.gradle

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.the

internal val Project.libs get() = the<LibrariesForLibs>()