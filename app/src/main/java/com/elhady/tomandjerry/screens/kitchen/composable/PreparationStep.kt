package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.screens.store.composable.ibmPlexSansArabic

@Composable
fun PreparationStep(
    modifier: Modifier = Modifier,
    stepNumber: String,
    details: String,
) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .padding(start = 15.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(start = 26.dp)
                .padding(vertical = 7.dp),
            text = details,
            color = Color(0xFF1F1F1E),
            fontSize = 16.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Normal
        )
        Box(
            modifier = Modifier
                .size(37.dp)
                .clip(CircleShape)
                .border(
                    width = 1.dp,
                    color = Color(0xFFD0E5F0),
                    shape = CircleShape
                )
                .background(Color.White)
                .align(Alignment.CenterStart),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stepNumber,
                color = Color(0xFF03578A),
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreparationStepPreview() {
    PreparationStep(
        stepNumber = "6",
        details = "Wait for the spark to ignite"
    )
}