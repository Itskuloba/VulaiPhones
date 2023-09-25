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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.navigation.ROUTE_PRODUCT
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckoutScreen(navController: NavHostController) {
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

//        BasicTextField(
//            value = name,
//            onValueChange = {
//                var it = ""
//                name = it
//            },
//
//
////            label={ Text(text = "Name")},
//
////            placeholder = { Text("Name") },
//
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 8.dp)
//        )
        TextField(
            value = name,
            onValueChange ={
                var it=""
                name=it
            },
            placeholder = { Text(text = ("Name"))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
            )

//        BasicTextField(
//            value = email,
//            onValueChange = {
//                var it = ""
//                email = it
//            },
////            placeholder = { Text("Email") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 16.dp)
//        )
        TextField(
            value = email,
            onValueChange ={
                var it=""
                name=it
            },
            placeholder = { Text(text = ("Email"))},
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
            onValueChange = {
                var it = ""
                cardNumber = it },
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
                onValueChange = {
                    var it = ""
                    expirationDate = it
                },
                placeholder = { Text("MM/YY") },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            )

            TextField(
                value = cvv,
                onValueChange = {
                    var it = ""
                    cvv = it
                },
                placeholder = { Text("CVV") },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Order Confirmation Button
        Button(
            onClick = {

                // Handle order confirmation logic here
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Confirm Order")
        }

        Button(
            onClick = {
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
