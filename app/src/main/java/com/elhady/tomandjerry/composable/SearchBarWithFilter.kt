package com.elhady.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R

val ibmPlexSansArabic = FontFamily(
    Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
    Font(R.font.ibm_plex_sans_arabic_medium, FontWeight.Medium),
    Font(R.font.ibm_plex_sans_arabic_semi_bold, FontWeight.SemiBold),
)

@Composable
fun SearchBarWithFilter() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .width(272.dp)
                .height(48.dp)
                .weight(1f),
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            placeholder = {
                Text(
                    text = "Search about tom ...",
                    color = Color(0xFF969799),
                    modifier = Modifier
                        .height(21.dp),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    letterSpacing = 0.sp
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(24.dp)
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.White,
                focusedBorderColor = Color(0x14A5A6A4),
                unfocusedBorderColor = Color(0x14A5A6A4)
            ),
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 14.sp
            )
        )
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(
                    color = Color(0xFF03578A),
                    shape = RoundedCornerShape(12.dp)
                )
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_filter),
                contentDescription = "Filter Button",
                modifier = Modifier.padding(8.dp),
                tint = Color.White
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SearchBarWithFilterPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        SearchBarWithFilter()
    }
}