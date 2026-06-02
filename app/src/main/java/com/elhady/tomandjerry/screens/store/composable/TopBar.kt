package com.elhady.tomandjerry.screens.store.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp, bottom = 4.dp) ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val ibmPlexSansArabic = FontFamily(
            Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
            Font(R.font.ibm_plex_sans_arabic_medium, FontWeight.Medium)
        )
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(size = 12.dp))
                .border(
                    width = .5.dp,
                    color = Color(color = 0xFF1F1F1E).copy(alpha = .15f),
                    shape = RoundedCornerShape(12.dp)
                )
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "Hi, Jerry 👋",
                modifier = Modifier
                    .height(21.dp),
                color = Color(0xFF1F1F1E),
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                letterSpacing = 0.sp
            )
            Text(
                text = "Which Tom do you want to buy?",
                modifier = Modifier
                    .width(170.dp)
                    .height(18.dp),
                color = Color(0xFFA5A6A4),
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                letterSpacing = 0.sp)
        }
        Spacer(modifier = Modifier.weight(1f))

        BadgedBox(
            badge = {
                Box(
                    modifier = Modifier
                        .size(14.dp)
                        .offset(x = (-9).dp, y = 6.dp)
                        .background(color = Color(0xFF03578A), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "3",
                        color = Color.White,
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.Medium,
                        fontSize = 10.sp,
                        lineHeight = 10.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .border(
                        border = BorderStroke(width = 1.dp, color = Color(0x261F1F1E)),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(2.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = "Notifications",
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFF1F1F1E)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
        TopBar()
}