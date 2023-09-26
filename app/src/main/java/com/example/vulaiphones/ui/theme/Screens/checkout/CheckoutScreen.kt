package com.example.vulaiphones.ui.theme.Screens.checkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.data.AuthViewModel
import com.example.vulaiphones.models.Product
import com.example.vulaiphones.navigation.ROUTE_PRODUCT
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckoutScreen(
    navController: NavHostController,
) {
    val viewModel: ViewModel = viewModel() // Initialize your ViewModel instance outside of the composable function
    val context = LocalContext.current // Use LocalContext to get the current context

    // Create a sample Product instance
    val product = Product(/* Initialize your product data here */)
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var cardNumber by remember { mutableStateOf("") }
    var expirationDate by remember { mutableStateOf("") }
    var cvv by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        Text(
            text = "Checkout",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // User Information Section
        Text(
            text = "User Information",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )


        TextField(
            value = name,
            onValueChange = { it -> name = it }, // Update name variable
            placeholder = { Text("Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )




        TextField(
            value = email,
            onValueChange = { it -> email = it }, // Update email variable
            placeholder = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // Payment Details Section
        Text(
            text = "Payment Details",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )


        TextField(
            value = cardNumber,
            onValueChange = { it -> cardNumber = it }, // Update email variable
            placeholder = { Text("Card Number") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextField(
                value = expirationDate,
                onValueChange = { it -> expirationDate = it }, // Update email variable
                placeholder = { Text("MM/YY") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )

            TextField(
                value = cvv,
                onValueChange = { it -> cvv = it }, // Update email variable
                placeholder = { Text("CVV") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Order Confirmation Button

        Button(
            onClick = {
                val myCheckout = AuthViewModel(navController, context)


                // Handle order confirmation logic here
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Check out")
        }

        Button(
            onClick = {

                val mysaveOrder= AuthViewModel(navController, context)
                val order = null
                order?.let { mysaveOrder.saveOrder(it) }


                // Handle order confirmation logic here
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Save Order")
        }

        Button(
            onClick = {
//                navController.navigate(ROUTE_PRODUCT)
                      navController.navigate(ROUTE_PRODUCT)

                // Handle order confirmation logic here
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Home Page")
        }
    }
}

@Preview
@Composable
fun CheckoutScreenPreview() {
    VulaiPhonesTheme {
        CheckoutScreen(rememberNavController())
    }
}
