package com.example.tugas3ppb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugas3ppb.ui.theme.Tugas3PPBTheme
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas3PPBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText("Happy Birthday Fico!", "From Fico Too!")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String,modifier: Modifier = Modifier) {
    Column {
        Text(text = message, fontSize = 100.sp, lineHeight = 116.sp)
        Text(text = from, fontSize = 36.sp, lineHeight = 100.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas3PPBTheme {
        GreetingText("Happy Birthday Fico!", "From Fico")
    }
}