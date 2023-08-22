package com.gregkluska.imagebrowser.feature.search.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.gregkluska.imagebrowser.feature.search.SearchScreen
import com.gregkluska.imagebrowser.feature.search.SearchViewModel

const val searchRoute = "search"

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    this.navigate(searchRoute, navOptions)
}

fun NavGraphBuilder.searchScreen() {
    composable(route = searchRoute) {
        val viewModel: SearchViewModel = hiltViewModel()
        val state = viewModel.state.value
        SearchScreen(
            images = state.images
        )
    }
}