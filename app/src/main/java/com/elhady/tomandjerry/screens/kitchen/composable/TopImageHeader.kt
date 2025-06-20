package com.elhady.tomandjerry.screens.kitchen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.tomandjerry.R

@Composable
fun TopImageHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color(color = 0x80035484))
    ) {
        Image(
            painter = painterResource(id = R.drawable.ellipse_3),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .size(width = 184.75.dp, height = 414.21.dp),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 32.dp)
        ) {
            InfoChip(icon = R.drawable.ic_ruler, text = "High tension")
            Spacer(modifier = Modifier.height(8.dp))
            InfoChip(icon = R.drawable.ic_chef, text = "Shocking foods")
        }
        Image(
            painter = painterResource(id = R.drawable.pasta),
            contentDescription = "Electric Tom Pasta",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 150.19.dp, y = 20.dp)
                .size(width = 187.61.dp, height = 168.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopImageHeaderPreview() {
    TopImageHeader()
}