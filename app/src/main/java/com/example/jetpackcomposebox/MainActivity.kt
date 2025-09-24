package com.example.jetpackcomposebox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebox.ui.theme.JetpackComposeBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeBoxTheme {
                SimpleBox()
            }
        }
    }
}

@Composable
fun SimpleBox() {
    Box(
        modifier = Modifier
            .size(120.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_photo),
            contentDescription = "Photo",
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "New",
            modifier = Modifier
                .background(Color.Red, shape = CircleShape)
                .padding(4.dp),
            color = Color.White
        )
    }
}