package com.elhady.tomandjerry.screens.episodes.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R

@Composable
fun HeaderContent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(178.dp)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .width(216.dp)
                .height(112.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Deleted episodes of Tom and Jerry!",
                color = Color(0xDE1F1F1E),
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.25.sp
            )
            Text(
                text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                color = Color(0x991F1F1E),
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.25.sp
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.tom_and_jerry),
            contentDescription = "Tom and Jerry",
            modifier = Modifier
                .width(112.dp)
                .height(178.dp),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter
        )
    }
}