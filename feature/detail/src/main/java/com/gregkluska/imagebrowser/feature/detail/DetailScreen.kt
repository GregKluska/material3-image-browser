package com.gregkluska.imagebrowser.feature.detail

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.gregkluska.imagebrowser.common.ui.ImageContainer
import com.gregkluska.imagebrowser.core.model.Image

@Composable
fun DetailScreen(
    image: Image?,
    onEvent: (DetailEvent) -> Unit,
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
    ) {
        ImageContainer(
            modifier = Modifier.padding(16.dp),
            url = image?.url ?: "",
            alt = image?.description ?: "",
        ) {
            Text("Author: ${image?.author?.name ?: "Loading"}")
        }
    }

}