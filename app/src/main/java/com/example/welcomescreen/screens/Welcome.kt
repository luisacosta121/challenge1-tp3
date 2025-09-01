package com.example.welcomescreen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.welcomescreen.R

@Composable
fun Welcome(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        WelcomeImage()

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Discover Your\n" + "Dream Job here",
            color = Color(0xFF1F41BB),
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            lineHeight = 40.sp,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Explore all the existing job roles based on your interest and study major",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { },
                modifier = Modifier
                    .width(150.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1F41BB),
                    contentColor = Color.White
                )
            ) {
                Text("Login", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.width(16.dp))

            TextButton(
                onClick = { },
                modifier = Modifier
                    .width(150.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text("Register", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
            }
        }
    }
}

@Composable
fun WelcomeImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.imagen2)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .padding(top = 40.dp)
            .height(250.dp)
            .width(250.dp)
    )
}
