package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.screens.store.composable.ibmPlexSansArabic


@Composable
fun PreparationMethodSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Preparation method",
            color = Color(0xFF1F1F1E),
            fontSize = 18.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Medium,
        )
        PreparationStep(
            stepNumber = "1",
            details = "Put the pasta in a toaster.",
        )
        PreparationStep(
            stepNumber = "2",
            details = "Pour battery juice over it.",
        )
        PreparationStep(
            stepNumber = "3",
            details = "Wait for the spark to ignite.",
        )
        PreparationStep(
            stepNumber = "4",
            details = "Serve with an insulating glove.",
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreparationMethodSectionPreview() {
    PreparationMethodSection()
}