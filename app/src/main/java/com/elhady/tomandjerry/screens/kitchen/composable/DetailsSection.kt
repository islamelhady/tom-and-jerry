package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.screens.store.composable.ibmPlexSansArabic

@Composable
fun DetailsSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Details",
            fontSize = 20.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF1F1F1E)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            DetailCard(
                modifier = Modifier.weight(1f),
                title = "1000 V",
                description = "Temperature",
                icon = R.drawable.temperature
            )
            DetailCard(
                modifier = Modifier.weight(1f),
                title = "3 sparks",
                description = "Timer",
                icon = R.drawable.timer
            )
            DetailCard(
                modifier = modifier.weight(1f),
                title = "1M 12K",
                description = "No. of deaths",
                icon = R.drawable.evil
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsSectionPreview() {
    DetailsSection()
}