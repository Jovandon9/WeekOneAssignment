package com.example.weekoneassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weekoneassignment.ui.theme.WeekOneAssignmentTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeekOneAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Jovan Fernandez. The current date and time is: ${Date()}")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = " ")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeekOneAssignmentTheme {
        //Greeting("Fernandez\n")
    }
}