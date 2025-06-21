package com.elhady.tomandjerry.screens.account.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elhady.tomandjerry.data.StatInfo

@Composable
fun StatsSection() {
    val stats = listOf(
        StatInfo(
            Icons.Default.Lock, "2M 12K", "No. of quarrels", Color(0xFFE7F6FD), Color(
            0xFFFFFFFF
        )
        ),
        StatInfo(Icons.Default.Share, "+500 h", "Chase time", Color(0xFFEFF9E8), Color(0xFFFFFFFF)),
        StatInfo(
            Icons.Default.KeyboardArrowDown, "2M 12K", "Hunting times", Color(0xFFFDE7E7), Color(
            0xFFFFFFFF
        )
        ),
        StatInfo(
            Icons.Default.FavoriteBorder, "3M 7K", "Heartbroken", Color(0xFFFEF6E4), Color(
            0xFFFFFFFF
        )
        )
    )

    Card(
        modifier = Modifier
            .offset(y = (-24).dp)
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                StatCard(stat = stats[0], modifier = Modifier.weight(1f))
                StatCard(stat = stats[1], modifier = Modifier.weight(1f))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                StatCard(stat = stats[2], modifier = Modifier.weight(1f))
                StatCard(stat = stats[3], modifier = Modifier.weight(1f))
            }
        }
    }
}