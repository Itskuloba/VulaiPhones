package com.example.vulaiphones.ui.theme.Screens.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme


data class ShoppingCartItem(val id: Int, val name: String, var quantity: Int, val price: Double)

@Composable
fun ShoppingApp(navController: NavHostController) {
    var searchText by remember { mutableStateOf("") }
    var cartItems by remember { mutableStateOf(listOf<ShoppingCartItem>()) }



//    val filteredItems = remember { mutableStateListOf<ShoppingCartItem>() }

    val filteredItems = remember {
        val items = mutableStateListOf<ShoppingCartItem>()
        items.addAll(cartItems)
        items
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        BasicTextField(
            value = searchText,
//            onValueChange = {
////                searchText = it
//            }
            onValueChange = {
                searchText = it
                // Filter items based on search text
                val query = it.trim().toLowerCase()
                filteredItems.clear()
                if (query.isEmpty()) {
                    filteredItems.addAll(cartItems)
                } else {
                    filteredItems.addAll(cartItems.filter { item -> item.name.toLowerCase().contains(query) })
                }
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    // Filter items based on search text
                    val query = searchText.trim().toLowerCase()
                    filteredItems.clear()
                    if (query.isEmpty()) {
                        filteredItems.addAll(cartItems)
                    } else {
                        filteredItems.addAll(cartItems.filter { it.name.toLowerCase().contains(query) })
                    }
                }
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            singleLine = true,
//            placeholder = { Text("Search items") }
        )

        fun removeItemFromCart(itemToRemove: ShoppingCartItem) {
            // Create a new list without the item to remove
            val updatedCartItems = cartItems.toMutableList()
            updatedCartItems.remove(itemToRemove)

            // Update cartItems with the new list
            cartItems = updatedCartItems
        }

        LazyColumn {
            items(filteredItems) { item ->
                CartItemRow(
                    item = item,
                    onQuantityChange = { newQuantity ->
                        item.quantity = newQuantity
                    },
                    onRemoveItemClick = {
                        removeItemFromCart(item)
                    }
                )
            }
        }



//        LazyColumn {
//            items(filteredItems) { item ->
//                CartItemRow(
//                    item = item,
//                    onQuantityChange = { newQuantity ->
//                        item.quantity = newQuantity
//
//                    },
//                    onRemoveItemClick = {
////                        cartItems.remove(item)
//                        // Create a new list without the item to remove
//                        val updatedCartItems = cartItems.toMutableList()
//                        updatedCartItems.removeAt(item)
//
//                        // Update cartItems with the new list
//                        cartItems = updatedCartItems
//
//                    }
//                )
//            }
//        }

    }
}

@Composable
fun CartItemRow(
    item: ShoppingCartItem,
    onQuantityChange: (Int) -> Unit,
    onRemoveItemClick: () -> Unit
) {
    var quantity by remember { mutableStateOf(item.quantity) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.White)
            .clickable { /* Item Clicked */ }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(
                text = item.name,
                style = TextStyle(fontSize = 18.sp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "$${item.price} each",
                style = TextStyle(fontSize = 14.sp, color = Color.Gray)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Quantity:",
                    style = TextStyle(fontSize = 16.sp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                QuantitySelector(
                    quantity = quantity,
                    onQuantityChange = {
                        quantity = it
                        onQuantityChange(it)
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Total: $${item.price * quantity}",
                    style = TextStyle(fontSize = 16.sp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Remove item from cart",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { onRemoveItemClick() }
                )
            }
        }
    }
}

@Composable
fun QuantitySelector(quantity: Int, onQuantityChange: (Int) -> Unit) {
    var text by remember { mutableStateOf(quantity.toString()) }

    Row(
        modifier = Modifier
            .height(32.dp)
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = MaterialTheme.shapes.small
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = {
                val newQuantity = maxOf(1, quantity - 1)
                text = newQuantity.toString()
                onQuantityChange(newQuantity)
            }
        ) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Decrease quantity",
                modifier = Modifier.size(16.dp)
            )
        }
        BasicTextField(
            value = text,
            onValueChange = {
                text = it
                val newQuantity = it.toIntOrNull() ?: quantity
                onQuantityChange(newQuantity)
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            textStyle = TextStyle(fontSize = 14.sp),
            modifier = Modifier
                .width(32.dp)
                .height(32.dp)
                .padding(4.dp),
            singleLine = true
        )
        IconButton(
            onClick = {
                val newQuantity = quantity + 1
                text = newQuantity.toString()
                onQuantityChange(newQuantity)
            }
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Increase quantity",
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun ShoppingAppPreview() {
    VulaiPhonesTheme {
        ShoppingApp(rememberNavController())
    }
}

