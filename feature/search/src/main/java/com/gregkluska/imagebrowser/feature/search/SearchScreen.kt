package com.gregkluska.imagebrowser.feature.search

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gregkluska.imagebrowser.common.ui.theme.ImageBrowserTheme

@Composable
fun SearchScreen() {
    Text(text = "Hello World ;)")
}

@Preview
@Composable
private fun SearchScreenPreview() {
    ImageBrowserTheme {
        SearchScreen()
    }
}