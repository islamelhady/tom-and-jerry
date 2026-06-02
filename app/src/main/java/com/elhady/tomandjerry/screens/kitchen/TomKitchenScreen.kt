package com.elhady.tomandjerry.screens.kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.tomandjerry.R
import com.elhady.tomandjerry.screens.kitchen.composable.AddToCartBottomBar
import com.elhady.tomandjerry.screens.kitchen.composable.InfoChip
import com.elhady.tomandjerry.screens.kitchen.composable.ProductDetailsContent

@Composable
fun TomKitchenScreen(
    onAddToCartClick: () -> Unit = {}
) {
    Scaffold(
        bottomBar = {
            AddToCartBottomBar(onAddToCartClick = onAddToCartClick)
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x80035484))
                .padding(paddingValues),

            ) {
            Image(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(
                        width = 184.75.dp,
                        height = 414.21.dp
                    ),
                painter = painterResource(id = R.drawable.ellipse_3),
                contentDescription = "Ellipse",
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                TopBannerTags()
                ProductDetailsContent()
            }
            Image(
                modifier = Modifier
                    .size(187.dp, 168.dp)
                    .align(Alignment.TopEnd),
                painter = painterResource(id = R.drawable.dish),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        }
    }
}

@Composable
private fun TopBannerTags() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 40.dp)
    ) {
        InfoChip(
            iconRes = R.drawable.ic_ruler,
            text = "High tension",
            modifier = Modifier.padding(bottom = 8.dp)
        )
        InfoChip(iconRes = R.drawable.ic_chef, text = "Shocking foods")
    }
}


@Preview(showBackground = false)
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}