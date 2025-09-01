package com.example.welcomescreen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
fun Register(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier, // Hace que la columna ocupe toda la pantalla
        verticalArrangement = Arrangement.Center, // Centra verticalmente
        horizontalAlignment = Alignment.CenterHorizontally // Centra horizontalmente
    ) {
        Text(
            text = "Create Account",
            modifier = Modifier.padding(bottom = 1.dp),
            color = Color(0xFF1F41BB),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,

            )
        Text(
            text = "Create an account so you can explore all the\n" +
                    "existing jobs",
            modifier = modifier,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Email") },
            modifier = Modifier.width(370.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF1F4FF),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Password") },
            modifier = Modifier
                .padding(top = 20.dp)
                .width(370.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF1F4FF),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )

        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Confirm Password") },
            modifier = Modifier
                .padding(top = 20.dp)
                .width(370.dp),
            shape = RoundedCornerShape(10.dp),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF1F4FF),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )

        )
        Button(onClick = { },
            modifier = Modifier
                .width(370.dp)
                .height(60.dp)
                .padding(top = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1F41BB),
                contentColor = androidx.compose.ui.graphics.Color.White
            )) {
            Text("Sign up",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
            )
        }
        Text(
            text = "Already have an account",
            modifier = modifier.padding(top = 20.dp)
        )
        Text(
            text = "Or continue with",
            modifier = modifier,
            color = Color(0xFF1F41BB),
        )
        RegisterImage()
    }


}

@Composable
fun RegisterImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.imagen3)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally // Centra su contenido horizontalmente
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.height(250.dp).width(250.dp)

        )
    }
}
