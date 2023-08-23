package com.gregkluska.imagebrowser.common.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ImageContainer(
    modifier: Modifier,
    url: String,
    date: String,
    author: String,
    description: String?,
    tags: List<String>
) {
    val content = AnnotatedString.Builder().apply {
        withStyle(
            style = SpanStyle(fontWeight = FontWeight.Bold)
        ) {
            append(author)
        }
        if (description != null) {
            append(" $description")
        }
    }

    ImageContainer(
        modifier = modifier,
        url = url,
        alt = description ?: "",
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {

        }
        LazyRow(
            state = rememberLazyListState(),
            content = {
                this.items(tags.size) {
                    ElevatedAssistChip(
                        modifier = Modifier.padding(end = 8.dp),
                        onClick = {},
                        label = { Text(text = tags[it]) })
                }
            }
        )
        ClickableText(
            text = content.toAnnotatedString(),
            onClick = { offset ->
                if (offset < author.length) {
                    println("BOOM")
                }
            }
        )
    }
}

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