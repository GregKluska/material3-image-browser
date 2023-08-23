@file:OptIn(ExperimentalPermissionsApi::class)

package com.gregkluska.imagebrowser.feature.search

import android.Manifest
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState
import com.gregkluska.imagebrowser.common.ui.ImageContainer
import com.gregkluska.imagebrowser.common.ui.theme.ImageBrowserTheme
import com.gregkluska.imagebrowser.core.model.Image

@Composable
fun SearchScreen(
    lazyListState: LazyListState = rememberLazyListState(),
    images: List<Image>,
) {
    val internetPermissionState = rememberPermissionState(Manifest.permission.INTERNET)

    if (internetPermissionState.status.isGranted) {
        LazyColumn(
            modifier = Modifier.padding(horizontal = 16.dp),
            state = rememberLazyListState(),
            content = {
                this.items(
                    count = images.size,
                    itemContent = { idx ->
                        val image = images[idx]
                        ImageContainer(
                            modifier = Modifier.padding(vertical = 8.dp),
                            url = image.url,
                            alt = image.description
                        ) {
                            Text("Hello World")
                        }
                    }
                )
            }
        )
    } else {
        Column {
            Text(text = "No internet permission :(")
            Button(onClick = { internetPermissionState.launchPermissionRequest() }) {
                Text("Request permission")
            }
        }
    }
}

@Preview
@Composable
private fun SearchScreenPreview() {
    val previewList = listOf(
        Image(
            id = "1",
            url = "https://images.unsplash.com/photo-1692318431228-8928bacd2d19?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=987&q=80",
            author = "Greg",
            description = "Lorem Ipsum"
        ),
        Image(
            id = "2",
            url = "https://images.unsplash.com/photo-1692610492938-37a4eed63ac0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1364&q=80",
            author = "Greg A",
            description = "Lorem Ipsum"
        ),
        Image(
            id = "3",
            url = "https://images.unsplash.com/photo-1692206130097-f66afa1cbc96?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=987&q=80",
            author = "Greg K",
            description = "Lorem Ipsum"
        ),
    )
    ImageBrowserTheme {
        SearchScreen(
            images = previewList
        )
    }
}