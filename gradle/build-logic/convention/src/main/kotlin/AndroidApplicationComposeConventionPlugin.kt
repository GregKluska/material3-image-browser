import com.android.build.api.dsl.ApplicationExtension
import com.gregkluska.gradle.configureAndroidCompose
import com.gregkluska.gradle.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply(libs.plugins.androidApplication.get().pluginId)
        }

        extensions.configure<ApplicationExtension> {
            configureAndroidCompose(this)
        }
    }

}