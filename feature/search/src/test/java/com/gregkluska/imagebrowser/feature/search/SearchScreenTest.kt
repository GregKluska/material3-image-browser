package com.gregkluska.imagebrowser.feature.search

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.compose.material3.Text
import app.cash.paparazzi.Paparazzi
import coil.Coil
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import coil.test.FakeImageLoaderEngine
import com.gregkluska.imagebrowser.common.ui.ImageContainer
import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.core.model.User
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class SearchScreenTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @OptIn(ExperimentalCoilApi::class)
    @Before
    fun setup() {
        val engine = FakeImageLoaderEngine.Builder()
            .intercept("https://www.example.com/image.jpg", ColorDrawable(Color.BLACK))
            .build()
        val imageLoader = ImageLoader.Builder(paparazzi.context)
            .components { add(engine) }
            .build()
        Coil.setImageLoader(imageLoader)
    }

    @Test
    fun `Screenshot test - Search Screen with a single element`() {
        paparazzi.snapshot {
            ImageContainer(url = testData[0].url, alt = "") {
                Text(text = "a")
                Text(text = "a")
                Text(text = "a")
            }
        }
    }

    companion object {

        private val testData: List<Image> = listOf(
            Image(
                id = "x",
                url = "https://www.example.com/image.jpg",
                tags = listOf("a"),
                author = User(id = "a", username = "a", name = "a"),
                description = "a"
            )
        )

    }

}