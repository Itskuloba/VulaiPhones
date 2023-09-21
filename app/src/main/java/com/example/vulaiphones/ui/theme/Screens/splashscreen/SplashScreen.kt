package com.example.vulaiphones.ui.theme.Screens.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vulaiphones.R
import com.example.vulaiphones.navigation.ROUTE_PRODUCT

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.phonescreen), // Replace with your image resource ID
            contentDescription = null, // Provide a description if needed
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), // Adjust padding as needed
            contentScale = ContentScale.Crop
        )
    }

    // Navigate to the next screen after a delay (e.g., 2 seconds)
    LaunchedEffect(key1 = true) {
        kotlinx.coroutines.delay(2000) // 2000 milliseconds = 2 seconds
        navController.navigate(ROUTE_PRODUCT) // Replace "main_screen" with your destination route
    }
}
