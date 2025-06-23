package com.elhady.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.elhady.tomandjerry.screens.kitchen.TomKitchenScreene
import com.elhady.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomAndJerryTheme {
                TomKitchenScreene()
            }
        }
    }
}