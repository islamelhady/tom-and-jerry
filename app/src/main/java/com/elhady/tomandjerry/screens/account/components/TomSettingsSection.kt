package com.elhady.tomandjerry.screens.account.components

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
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.screens.store.composable.ibmPlexSansArabic

@Composable
fun TomSettingsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
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
            SettingsItem(
                icon = R.drawable.settings_change_sleeping,
                text = "Change sleeping place"
            )
            SettingsItem(
                icon = R.drawable.settings_meo,
                text = "Meow settings"
            )
            SettingsItem(
                icon = R.drawable.settings_password,
                text = "Password to open the fridge"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TomSettingsSectionPreview(){
    TomSettingsSection()
}