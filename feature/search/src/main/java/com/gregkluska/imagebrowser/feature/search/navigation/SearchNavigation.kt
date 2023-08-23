package com.gregkluska.imagebrowser.feature.search.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.gregkluska.imagebrowser.feature.search.SearchScreen
import com.gregkluska.imagebrowser.feature.search.SearchViewModel

const val searchRoute = "search"

fun NavController.navigateToSearch() {
    this.navigate(searchRoute)
}

fun NavGraphBuilder.searchScreen(
    onImageClick: (String) -> Unit,
) {
    composable(route = searchRoute) {
        val viewModel: SearchViewModel = hiltViewModel()
        val state = viewModel.state.value
        SearchScreen(
            images = state.images,
            onImageClick = onImageClick,
        )
    }
}