import com.android.build.api.dsl.ApplicationExtension
import com.gregkluska.gradle.Versions
import com.gregkluska.gradle.configureAndroidCommon
import com.gregkluska.gradle.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply(libs.plugins.androidApplication.get().pluginId)
            apply(libs.plugins.kotlinAndroid.get().pluginId)
        }

        extensions.configure<ApplicationExtension> {
            configureAndroidCommon(this)

            defaultConfig {
                targetSdk = Versions.targetSdk
            }
        }
    }

}