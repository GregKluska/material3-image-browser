package com.gregkluska.imagebrowser.feature.detail.navigation

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.gregkluska.imagebrowser.feature.detail.DetailEffect
import com.gregkluska.imagebrowser.feature.detail.DetailScreen
import com.gregkluska.imagebrowser.feature.detail.DetailViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

const val detailRoute = "detail"

internal const val argImageId = "imageId"

fun NavController.navigateToDetail(imageId: String) {
    this.navigate("$detailRoute/$imageId")
}

fun NavGraphBuilder.detailScreen(
    navigateToSearch: (String) -> Unit
) {
    composable(route = "$detailRoute/{$argImageId}") {
        val viewModel: DetailViewModel = hiltViewModel()
        val state = viewModel.state.value
        val effect = viewModel.effect
        LaunchedEffect(Unit) {
            effect.onEach {
                Log.d("DetailScreen", "found Effect: $effect")
                when (it) {
                    is DetailEffect.NavigateToUsersImages -> {
                        navigateToSearch(it.username)
                    }
                }
            }.launchIn(this)
        }

        DetailScreen(
            image = state.image,
            onEvent = viewModel::handle
        )
    }
}