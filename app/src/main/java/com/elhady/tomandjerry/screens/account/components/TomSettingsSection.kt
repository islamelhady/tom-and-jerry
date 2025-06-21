package com.elhady.tomandjerry.screens.account.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.composable.ibmPlexSansArabic
import com.elhady.tomandjerry.data.SettingItem

@Composable
fun TomSettingsSection() {
    val settingsItems = listOf(
        SettingItem(Icons.Default.Info, "Change sleeping place"),
        SettingItem(Icons.Default.Face, "Meow settings"), // Assuming a generic icon
        SettingItem(Icons.Default.Lock, "Password to open the fridge")
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Tom settings",
            color = Color(0xDE1F1F1E),
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 20.sp
        )
        Spacer(modifier = Modifier.height(12.dp))

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            settingsItems.forEach { item ->
                SettingsItemRow(item = item)
            }
        }
    }
}