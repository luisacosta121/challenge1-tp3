package com.example.welcomescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.welcomescreen.screens.Login
import com.example.welcomescreen.screens.Register
import com.example.welcomescreen.screens.Welcome
import com.example.welcomescreen.ui.theme.WelcomeScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = androidx.navigation.compose.rememberNavController()

            WelcomeScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    containerColor = Color.White) { innerPadding ->
                    NavHost(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding),
                        startDestination = "welcome"
                    ) {
                        composable(route = "welcome"){
                            Welcome(
                                modifier = Modifier.padding(innerPadding),
                                navController
                            )
                        }
                        composable(route = "login"){
                            Login(modifier = Modifier.padding(innerPadding),
                                navController)
                        }
                        composable(route = "register"){
                            Register(modifier = Modifier.padding(innerPadding),
                                navController   )
                        }
                    }




                }
            }
        }
    }
}



