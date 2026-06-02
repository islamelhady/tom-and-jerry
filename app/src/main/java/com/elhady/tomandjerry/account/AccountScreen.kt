package com.elhady.tomandjerry.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.composable.ibmPlexSansArabic
import com.elhady.tomandjerry.ui.theme.Pink80
import com.elhady.tomandjerry.ui.theme.TextColor
import com.elhady.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun AccountScreen() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.bg_account),
            contentDescription = "Account Background",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painter = painterResource(id = R.drawable.tom_profile),
                contentDescription = "Tom Avatar",
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Tom",
                color = Color.White,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium, // 500
                fontSize = 18.sp,
            )
            Text(
                text = "specializes in failure!",
                color = Color.White.copy(alpha = 0.8f),
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal, // 400
                fontSize = 12.sp,
            )
            Text(
                text = "Edit foolishness",
                color = Color.White,
                fontSize = 10.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(top = 4.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color.White.copy(alpha = 0.12f))
                    .padding(horizontal = 16.dp, vertical = 6.dp)
            )
            Column(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(Color(0xFFEEF4F6))
                    .padding(horizontal = 16.dp, vertical = 16.dp)

            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    StatCard(
                        modifier = Modifier.weight(1f),
                        title = "No. of quarrels",
                        description = "2M 12K",
                        icon = R.drawable.quarrels,
                        backgroundColor = Color(0xFFD0E5F0)
                    )
                    StatCard(
                        modifier = Modifier.weight(1f),
                        title = "Chase time",
                        description = "+500 h",
                        icon = R.drawable.chase_time,
                        backgroundColor = Color(0xFFDEEECD)
                    )
                }
                Row(
                    modifier = Modifier.padding(top = 8.dp, bottom = 24.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    StatCard(
                        modifier = Modifier.weight(1f),
                        title = "Hunting times",
                        description = "2M 12K",
                        icon = R.drawable.hunting_times,
                        backgroundColor = Color(0xFFF2D9E7)
                    )
                    StatCard(
                        modifier = Modifier.weight(1f),
                        title = "Heartbroken",
                        description = "3M 7K",
                        icon = R.drawable.heart_broken,
                        backgroundColor = Color(0xFFFAEDCF)
                    )
                }
                Text(
                    modifier = Modifier.padding(bottom = 8.dp),
                    text = "Tom settings",
                    color = TextColor,
                    fontSize = 20.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Bold,
                )

                SettingsItem(
                    modifier = Modifier.padding(bottom = 12.dp),
                    icon = R.drawable.settings_change_sleeping,
                    text = "Change sleeping place"
                )
                SettingsItem(
                    modifier = Modifier.padding(bottom = 12.dp),
                    icon = R.drawable.settings_meo,
                    text = "Meow settings"
                )
                SettingsItem(
                    modifier = Modifier.padding(bottom = 12.dp),
                    icon = R.drawable.settings_password,
                    text = "Password to open the fridge"
                )
                Spacer(
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color(0xFF1A1F14).copy(alpha = 0.08f))
                )
                Text(
                    text = "His favorite foods",
                    color = TextColor,
                    fontSize = 20.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp),

                    )
                SettingsItem(
                    modifier = Modifier.padding(bottom = 12.dp),
                    icon = R.drawable.stolean_meal,
                    text = "Mouses"
                )
                SettingsItem(
                    modifier = Modifier.padding(bottom = 12.dp),
                    icon = R.drawable.stolean_meal,
                    text = "Last stolen meal"
                )
                SettingsItem(
                    modifier = Modifier.padding(bottom = 12.dp),
                    icon = R.drawable.sleep_mode,
                    text = "Change sleep mood"
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AccountScreenPreview() {
    TomAndJerryTheme {
        AccountScreen()
    }
}