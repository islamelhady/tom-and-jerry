package com.elhady.tomandjerry.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class StatInfo(
    val icon: ImageVector,
    val value: String,
    val label: String,
    val backgroundColor: Color,
    val iconBackgroundColor: Color
)
