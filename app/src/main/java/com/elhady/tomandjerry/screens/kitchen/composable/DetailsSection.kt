package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.data.DetailItem

@Composable
fun DetailsSection() {
    val details = listOf(
        DetailItem(icon = R.drawable.ic_cart, "1000 V", "Temperature"),
        DetailItem(icon = R.drawable.ic_cart, "3 sparks", "Time"),
        DetailItem(icon = R.drawable.ic_cart, "1M 12K", "No. of deaths")
    )
    Column {
        Text(text = "Details", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            details.forEach { item ->
                DetailCard(item = item, modifier = Modifier.weight(1f))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsSectionPreview(){
    DetailsSection()
}