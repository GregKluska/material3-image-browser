package com.gregkluska.imagebrowser.common.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ImageContainer(
    modifier: Modifier = Modifier,
    url: String,
    alt: String,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {

    Box(modifier = modifier) {
        ImageCard(
            onClick = onClick,
        ) {
            Surface(
                shape = CardDefaults.shape
            ) {
                AsyncImage(
                    modifier = Modifier.fillMaxWidth(),
                    model = url,
                    placeholder = painterResource(id = R.drawable.placeholder),
                    contentDescription = alt,
                    contentScale = ContentScale.FillWidth
                )
            }
            Column(
                modifier = Modifier.padding(16.dp),
                content = content
            )
        }
    }
}

/**
 * Card with optional onClick element
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageCard(
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    if (onClick == null) {
        Card(
            border = BorderStroke(width = 1.dp, Color.Gray),
            content = content
        )
    } else {
        Card(
            onClick = onClick,
            border = BorderStroke(width = 1.dp, Color.Gray),
            content = content
        )
    }
}

// TODO: Fix me
//@Preview
//@Composable
//private fun PostPreview() {
//    Box(modifier = Modifier.fillMaxSize()) {
//        ImageContainer(
//            ,
//            content = {
//                Text("Hello World! ")
//            }
//        )
//    }
//}