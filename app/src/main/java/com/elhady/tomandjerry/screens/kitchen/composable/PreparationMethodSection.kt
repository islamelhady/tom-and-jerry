package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PreparationMethodSection() {
    val steps = listOf(
        "Put the pasta in a toaster.",
        "Pour battery juice over it.",
        "Wait for the spark to ignite.",
        "Serve with an insulating glove."
    )
    Column {
        Text(text = "Preparation method", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        steps.forEachIndexed { index, step ->
            PreparationStep(number = index + 1, text = step)
            if (index < steps.lastIndex) {
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreparationMethodSectionPreview() {
    PreparationMethodSection()
}