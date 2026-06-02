package com.elhady.tomandjerry.screens.account.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.screens.store.composable.ibmPlexSansArabic
import com.elhady.tomandjerry.ui.theme.TextColor
import com.elhady.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun StatCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    @DrawableRes icon: Int,
    backgroundColor: Color
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = backgroundColor)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "Stat Icon",
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                color = TextColor.copy(alpha = 0.37f),
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = description,
                color = TextColor.copy(alpha = 0.6f),
                fontSize = 16.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StatCardPreview() {
    TomAndJerryTheme {
        StatCard(
            title = "2M 12K",
            description = "No. of quarrels",
            icon = R.drawable.quarrels,
            backgroundColor = Color(0xFFD0E5F0)
        )
    }
}