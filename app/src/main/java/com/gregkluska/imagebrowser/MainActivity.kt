package com.gregkluska.imagebrowser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.gregkluska.imagebrowser.common.ui.theme.ImageBrowserTheme
import com.gregkluska.imagebrowser.feature.detail.navigation.detailScreen
import com.gregkluska.imagebrowser.feature.detail.navigation.navigateToDetail
import com.gregkluska.imagebrowser.feature.search.navigation.navigateToSearch
import com.gregkluska.imagebrowser.feature.search.navigation.searchRoute
import com.gregkluska.imagebrowser.feature.search.navigation.searchScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            ImageBrowserTheme {
                NavHost(navController = navController, startDestination = searchRoute) {
                    searchScreen(
                        onImageClick = navController::navigateToDetail
                    )
                    detailScreen(
                        navigateToSearch = navController::navigateToSearch
                    )
                }
            }
        }
    }
}
