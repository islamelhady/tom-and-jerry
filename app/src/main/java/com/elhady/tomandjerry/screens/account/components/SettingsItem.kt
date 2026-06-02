package com.elhady.tomandjerry.screens.account.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.screens.store.composable.ibmPlexSansArabic
import com.elhady.tomandjerry.ui.theme.TextColor

@Composable
fun SettingsItem(
    modifier: Modifier = Modifier,
    text: String,
    @DrawableRes icon: Int
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Image(
            painter = painterResource(id = icon),
            contentDescription = "Settings Icon",
        )

        Text(
            text = text,
            color =  TextColor.copy(alpha = 0.87f),
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsItemRowPreview() {
    SettingsItem(
        icon = R.drawable.settings_meo,
        text = "Change sleeping place"
    )
}