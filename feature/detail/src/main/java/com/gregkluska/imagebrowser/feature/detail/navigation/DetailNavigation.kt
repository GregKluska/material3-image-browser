package com.gregkluska.imagebrowser.feature.detail.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.gregkluska.imagebrowser.feature.detail.DetailScreen
import com.gregkluska.imagebrowser.feature.detail.DetailViewModel

const val searchRoute = "detail"

internal const val argImageId = "imageId"

fun NavController.navigateToDetail(imageId: String) {
    this.navigate("$searchRoute/$imageId")
}

fun NavGraphBuilder.detailScreen() {
    composable(route = "$searchRoute/{$argImageId}") {
        val viewModel: DetailViewModel = hiltViewModel()
        val state = viewModel.state.value
        DetailScreen(
            image = state.image
        )
    }
}