package com.lc.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lc.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    private val list = listOf(
        "Elephant",
        "Tiger",
        "Lion",
        "Dolphin",
        "Bat",
        "Whale",
        "Kangaroo",
        "Panda",
        "Giraffe",
        "Gorilla"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(1f/555)
                        .background(color = Color(0xFFFFA500))

                ) {

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(1f/3)
                        .background(color = Color.White)

                ) {

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(1f/3)
                        .background(color = Color.Green)

                ) {

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnComposeTheme {
        Greeting("Android")
    }
}