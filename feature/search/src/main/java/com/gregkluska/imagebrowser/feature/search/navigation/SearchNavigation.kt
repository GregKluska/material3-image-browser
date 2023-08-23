package com.gregkluska.imagebrowser.feature.search.navigation

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.gregkluska.imagebrowser.feature.search.SearchEffect
import com.gregkluska.imagebrowser.feature.search.SearchScreen
import com.gregkluska.imagebrowser.feature.search.SearchViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

const val searchRoute = "search"

internal const val argUsername = "username"

fun NavController.navigateToSearch(username: String? = null) {
    this.navigate(searchRoute + username?.let { "?$argUsername=$it" })
}

fun NavGraphBuilder.searchScreen(
    onImageClick: (String) -> Unit,
) {
    composable(
        route = "$searchRoute?$argUsername={$argUsername}",
        arguments = listOf(navArgument(argUsername) { nullable = true })
    ) {
        val viewModel: SearchViewModel = hiltViewModel()
        val state = viewModel.state.value
        val effect = viewModel.effect
        LaunchedEffect(Unit) {
            effect.onEach {
                Log.d("SearchScreen", "found Effect: $effect")
                when (it) {
                    is SearchEffect.NavigateToImage -> onImageClick(it.imageId)
                }
            }.launchIn(this)
        }

        SearchScreen(
            images = state.images,
            onEvent = viewModel::handle,
        )
    }
}