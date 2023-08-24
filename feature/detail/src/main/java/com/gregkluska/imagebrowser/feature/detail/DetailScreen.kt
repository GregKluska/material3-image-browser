package com.gregkluska.imagebrowser.feature.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            description = image?.description,
            author = image?.author?.name ?: "",
            tags = image?.tags ?: listOf(),
            onUserClick = { onEvent(DetailEvent.OnUserClick) }
        )
    }

}