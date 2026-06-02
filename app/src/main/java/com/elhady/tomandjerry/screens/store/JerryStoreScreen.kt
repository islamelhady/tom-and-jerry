package com.elhady.tomandjerry.screens.store

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.tomandjerry.screens.store.composable.PromoBanner
import com.elhady.tomandjerry.screens.store.composable.SearchBarWithFilter
import com.elhady.tomandjerry.screens.store.composable.SectionHeader
import com.elhady.tomandjerry.screens.store.composable.TomGrid
import com.elhady.tomandjerry.screens.store.composable.TopBar
import com.elhady.tomandjerry.data.tomList

@Composable
fun JerryStoreScreen() {
    Scaffold(
        containerColor = Color(0xFFEEF4F6)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            // -- Top Bar --
            TopBar()
            Spacer(modifier = Modifier.height(20.dp))

            // -- Search Bar --
            SearchBarWithFilter()
            Spacer(modifier = Modifier.height(20.dp))

            // -- Promo Banner --
            PromoBanner()
            Spacer(modifier = Modifier.height(24.dp))

            // -- Section Header --
            SectionHeader()
            Spacer(modifier = Modifier.height(16.dp))

            // -- Items Grid --
            TomGrid(toms = tomList)
        }
    }
}

@Preview(showBackground = true, widthDp = 380 )
@Composable
fun JerryStoreScreenPreview() {
    JerryStoreScreen()
}