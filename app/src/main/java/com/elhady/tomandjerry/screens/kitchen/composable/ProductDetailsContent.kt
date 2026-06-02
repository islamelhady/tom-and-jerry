package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProductDetailsContent() {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(Color(0xFFEEF4F6))
            .padding(16.dp)
    )
    {
        ElectricTomPasta()
        Spacer(modifier = Modifier.height(24.dp))
        DetailsSection()
        Spacer(modifier = Modifier.height(24.dp))
        PreparationMethodSection()
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailsContentPreview() {
    ProductDetailsContent()
}