package com.gregkluska.imagebrowser.feature.detail

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gregkluska.imagebrowser.common.ui.ImageContainer
import com.gregkluska.imagebrowser.core.model.Image

@Composable
fun DetailScreen(
    image: Image?
) {
    ImageContainer(
        url = image?.url ?: "",
        alt = image?.description ?: ""
    ) {
        Text("Hello world@@!")
    }
}