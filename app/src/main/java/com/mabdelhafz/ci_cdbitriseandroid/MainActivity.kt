package com.mabdelhafz.ci_cdbitriseandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mabdelhafz.ci_cdbitriseandroid.presentation.CalculatorScreen
import com.mabdelhafz.ci_cdbitriseandroid.ui.theme.MaterialCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Constants.BASE_URL
        setContent {
            MaterialCalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}