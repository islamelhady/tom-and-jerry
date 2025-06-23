package com.elhady.tomandjerry.screens.kitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.elhady.tomandjerry.screens.kitchen.composable.AddToCartBottomBar
import com.elhady.tomandjerry.screens.kitchen.composable.ProductDetailsContent
import com.elhady.tomandjerry.screens.kitchen.composable.TopImageHeader

@Composable
fun TomKitchenScreen(){
    Scaffold(
        bottomBar = { AddToCartBottomBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color(color = 0xFF6794B3))
        ) {
            TopImageHeader()
            ProductDetailsContent()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}
