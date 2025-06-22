package com.elhady.tomandjerry.screens.episodes.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.data.CharacterInfo

@Composable
fun PopularCharactersSection() {
    val characters = listOf(
        CharacterInfo("Tom", "Failed stalker", R.drawable.tom, Color(0xFFFCF2C5)),
        CharacterInfo("Jerry", "A scammer mouse", R.drawable.jerry, Color(0xFFFCC5E4)),
        CharacterInfo("Butch", "An opportunist cat", R.drawable.little_mouse, Color(0xFFC5E7FC))
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
    ) {
        Text(
            text = "Popular character",
            color = Color(0xDE1F1F1E),
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.25.sp,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(characters) { character ->
                CharacterCard(character = character)
            }
        }
    }
}