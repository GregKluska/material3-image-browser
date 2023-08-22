package com.gregkluska.imagebrowser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gregkluska.imagebrowser.common.ui.theme.ImageBrowserTheme
import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.feature.search.SearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
    }
}
