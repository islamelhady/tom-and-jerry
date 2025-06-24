package com.elhady.tomandjerry.screens.episodes.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.data.EpisodeInfo

@Composable
fun MostWatchedSection() {
    val episodes = listOf(
        EpisodeInfo(stringResource(R.string.number_404_the_cursed_cheese), R.drawable.episode_card),
        EpisodeInfo(stringResource(R.string.chase_on_the_moon), R.drawable.episode_card2)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
    ) {
        SectionHeaderRow(
            title = "Most watched",
            onViewAllClick = {}
        )
        Spacer(modifier = Modifier.height(12.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(episodes) { episode ->
                EpisodeCard(episode = episode)
            }
        }
    }
}