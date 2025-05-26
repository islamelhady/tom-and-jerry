package com.elhady.tomandjerry.screens.account.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.composable.ibmPlexSansArabic

@Composable
fun FavoriteFoodsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "His favorite foods",
            color = Color(0xDE1F1F1E),
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 20.sp
        )
        Spacer(modifier = Modifier.height(12.dp))

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            SettingsItem(
                icon = R.drawable.stolean_meal,
                text = "Mouses"
            )
            SettingsItem(
                icon = R.drawable.stolean_meal,
                text = "Last stolen meal"
            )
            SettingsItem(
                icon = R.drawable.sleep_mode,
                text = "Change sleep mood"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteFoodsSectionPreview() {
    FavoriteFoodsSection()
}