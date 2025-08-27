package com.example.welcomescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.welcomescreen.ui.theme.WelcomeScreenTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WelcomeScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    containerColor = Color.White) { innerPadding ->
                    GreetingImage(

                    )
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.imagen1)
    Column(
        modifier = Modifier.fillMaxWidth(), // Para que la columna ocupe todo el ancho
        horizontalAlignment = Alignment.CenterHorizontally // Centra su contenido horizontalmente
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(top = 100.dp)
                .height(350.dp)
                .width(350.dp),

            )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Discover Your Dream Job here",
            modifier = modifier.padding(top = 400.dp),
            color = Color(0xFF1F41BB),
            fontSize = 45.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            lineHeight = 75.sp,
        )
        Text(
            text = "Explore all the existing job roles based on your interest and study major",
                modifier = modifier,
                textAlign = TextAlign.Center
        )

        Row (
            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
            modifier = Modifier.padding(top = 0.dp)
                .fillMaxWidth(),
        ){
            Button(
                onClick = { },
                modifier = Modifier
                    .width(150.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1F41BB),
                    contentColor = androidx.compose.ui.graphics.Color.White
                )
            ) {
                Text("Login",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                )
            }

            TextButton(onClick = { },
                modifier = Modifier
                    .width(150.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.White,  // Fondo
                    contentColor = androidx.compose.ui.graphics.Color.Black    // Texto
                )

            ) {
                Text("Register",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    )
            }
        }
    }

}


