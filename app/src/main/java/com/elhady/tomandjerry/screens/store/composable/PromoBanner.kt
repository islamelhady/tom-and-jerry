package com.elhady.tomandjerry.screens.store.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R

@Composable
fun PromoBanner() {
    Box(
        modifier = Modifier
            .width(328.dp)
            .height(92.dp)
    ) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF03446A), Color(0xFF0685D0))
                    )
                )
        )

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    color = Color.White,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    lineHeight = 16.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Adopt Tom! (Free Fail-Free \nGuarantee)",
                    color = Color(0xCCFFFFFF),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 12.sp
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.circles),
            contentDescription = "Promo Tom",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .clip(RoundedCornerShape(bottomEnd = 16.dp))
                .height(108.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.tom_promo),
            contentDescription = "Promo Tom",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .clip(RoundedCornerShape(bottomEnd = 16.dp))
                .height(108.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PromoBannerPreview() {
    PromoBanner()
}