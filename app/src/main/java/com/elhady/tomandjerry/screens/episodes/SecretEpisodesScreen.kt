package com.elhady.tomandjerry.screens.episodes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.tomandjerry.screens.episodes.components.HeaderContent
import com.elhady.tomandjerry.screens.episodes.components.MostWatchedSection
import com.elhady.tomandjerry.screens.episodes.components.PopularCharactersSection
import com.elhady.tomandjerry.screens.episodes.components.ScreenHeader


@Composable
fun SecretEpisodesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF88B4D4), Color(0xFFFFFFFF))
                )
            )
    ) {
        ScreenHeader()
        HeaderContent()
        MostWatchedSection()
        PopularCharactersSection()

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun SecretEpisodesScreenPreview() {
    SecretEpisodesScreen()
}