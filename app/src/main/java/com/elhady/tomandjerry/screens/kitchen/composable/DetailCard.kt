package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.composable.ibmPlexSansArabic

@Composable
fun DetailCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    @DrawableRes icon: Int
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(color = 0xFFD0E5F0))
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = Color(color = 0xFF03578A),
            )
            Text(
                text = title,
                color = Color(0xFF888888).copy(alpha = 0.60f),
                fontSize = 14.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
            )
            Text(
                text = description,
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF1F1F1E).copy(alpha = 0.37f),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailCardPreview() {
    DetailCard(
        title = "1000 V",
        description = "Temperature",
        icon = R.drawable.temperature
    )
}