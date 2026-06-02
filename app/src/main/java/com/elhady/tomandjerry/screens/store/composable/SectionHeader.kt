package com.elhady.tomandjerry.screens.store.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R

@Composable
fun SectionHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Cheap tom section",
            color = Color(0xFF1F1F1E),
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 12.sp,
            textAlign = TextAlign.Center
        )
        TextButton(onClick = {}) {
            Text(
                text = "View all",
                color = Color(0xFF03578A),
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                textAlign = TextAlign.Center
            )
            Icon(
                painter = painterResource(R.drawable.ic_arrow),
                contentDescription = "View All",
                tint = Color(0xFF03578A)
            )
        }
    }
}