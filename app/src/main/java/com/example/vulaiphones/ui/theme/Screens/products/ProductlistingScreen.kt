package com.example.vulaiphones.ui.theme.Screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.R
import com.example.vulaiphones.models.Product
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme

@Composable
fun ProductGrid(products: List<Product>,navController: NavHostController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.White),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(products.size) { index ->
            val product = products[index]
            ProductCard(product,navController)
        }
    }
}
//@Composable
//fun ProductGrid(products: List<Product>, navController: NavHostController) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
//        modifier = Modifier.fillMaxHeight().background(Color.White),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        items(products.size) { index ->
//            val product = products[index]
//            ProductCard(product, navController)
//        }
//    }
//}

@Composable
fun ProductCard(product: Product, navController: NavHostController) {
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.phonescreen),
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = product.name)
            Text(text = product.price)
            Text(text = product.description)

            ClickableTextButton(
                text = "Add to Cart", // You can customize the button text
                onClick = {
                    // Navigate to the checkout page when the button is clicked
                    navController.navigate("checkout") // Replace "checkout" with the actual destination
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
        }

    }
}

@Composable
fun ClickableTextButton(text: String, onClick: () -> Unit, modifier: Modifier) {
    TODO("navigate to checkout page")
}

@Composable
fun ECommerceScreen(navController: NavHostController) {
    val products = remember {
        listOf(
            Product("One", "Product 1", "$10.99", R.drawable.testpic1),
            Product("Two", "Product 2", "$19.99", R.drawable.testpic1),
            Product("Two", "Product 2", "$19.99", R.drawable.testpic1),
            Product("Two", "Product 2", "$19.99", R.drawable.testpic1),



            // Add more products here
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Add a search bar or filter options here if needed
        BasicTextField(
            value = "",
            onValueChange = { /* Handle search input */ },
//            placeholder = { Text(text = "Search for products") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProductGrid(products = products,navController)
    }
}


@Preview
@Composable
fun Productview() {
    VulaiPhonesTheme {
        ECommerceScreen(rememberNavController())

    }

}


