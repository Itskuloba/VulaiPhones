package com.example.vulaiphones.ui.theme.Screens.products

//import androidx.compose.foundation.text.KeyboardType
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.R
import com.example.vulaiphones.navigation.ROUTE_LOGIN
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductScreen(navController:NavHostController) {
    var quantity by remember { mutableStateOf(1) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Product Page")
                },
                navigationIcon = {
                    IconButton(
                        onClick = { /* Handle navigation icon click */ }
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.testpic1),
                            contentDescription = null
                        )
                    }
                },
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.testpic1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Product Name",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $19.99",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_LOGIN)

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Add to Cart")
                }
            }

            item {
                Text(
                    text = "Product Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "This is a sample product description. Replace this with the actual product description.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun Produvtpreview() {
    VulaiPhonesTheme {
        ProductScreen(rememberNavController())
    }

}

