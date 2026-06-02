package com.elhady.tomandjerry.screens.episodes.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.data.EpisodeInfo

@Composable
fun EpisodeCard(episode: EpisodeInfo) {
    Card(
        modifier = Modifier
            .width(212.dp)
            .height(311.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color(0x261F1F1E))
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = episode.imageRes),
                contentDescription = episode.title,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.8f))
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
                    .size(48.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0x3DFFFFFF))
                    .border(
                        width = 1.dp,
                        color = Color(0x80FFFFFF),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_cheese),
                    contentDescription = "Play",
                    tint = Color(0xFFFFAA00)
                )
            }

            Text(
                text = episode.title,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.25.sp,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 8.dp, end = 8.dp, bottom = 12.dp)
                    .width(196.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EpisodeCardPreview() {
    EpisodeCard(EpisodeInfo(
        title = "Deleted episodes of Tom and Jerry!",
        imageRes = R.drawable.episode_card
    ))
}