package com.example.vulaiphones.ui.theme.Screens.products

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.R
import com.example.vulaiphones.navigation.ROUTE_CHECKOUT
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
//                navigationIcon = {
//                    IconButton(
//                        onClick = { /* Handle navigation icon click */ }
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.i15),
//                            contentDescription = null
//                        )
//
//                    }
//                },
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
                    painter = painterResource(id = R.drawable.i153),
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
                    text = "Iphone 15",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $999",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.Bold,
                            )
                    }
                }
            }

//

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.1-inch durable color-infused glass and aluminum design footnote ◊ with Ceramic Shield front." +
                            "Dynamic Island bubbles up alerts and Live Activities — so you don’t miss them while you’re doing something else." +
                            "48MP Main camera with 2x Telephoto captures breathtaking detail up close or far away." +
                            "A16 Bionic powers computational photography and smooth gaming performance with great efficiency for all-day battery life." +
                            "Connect and charge with USB-C.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i15plus),
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
                    text = "Iphone 15 plus",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1099",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "6.7-inch durable color-infused glass and aluminum design footnote ◊ with Ceramic Shield front." +
                            "Dynamic Island bubbles up alerts and Live Activities — so you don’t miss them while you’re doing something else." +
                            "48MP Main camera with 2x Telephoto captures breathtaking detail up close or far away." +
                            "A16 Bionic powers computational photography and smooth gaming performance with great efficiency for all-day battery life." +
                            "Connect and charge with USB-C.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i15pr),
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
                    text = "Iphone 15 pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1199",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.1-inch Super Retina XDR display footnote ¹ featuring ProMotion, Always-On, and Dynamic Island" +
                            "Strong and light titanium design with Action button — a fast track to your favorite feature" +
                            "48MP Main camera for super-high-resolution photos and 3x Telephoto camera" +
                            "A17 Pro chip delivers a massive leap in graphics performance, transforming mobile gaming" +
                            "USB-C connector with USB 3 for up to 20x faster transfer speeds footnote ² and new pro workflows",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i15pmx),
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
                    text = "Iphone 15 pro max",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1299",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.7-inch Super Retina XDR display footnote ¹ featuring ProMotion, Always-On, and Dynamic Island." +
                            "Strong and light titanium design with Action button — a fast track to your favorite feature." +
                            "48MP Main camera for super-high-resolution photos and 5x Telephoto camera, the longest optical zoom in iPhone ever." +
                            "A17 Pro chip delivers a massive leap in graphics performance, transforming mobile gaming." +
                            "USB-C connector with USB 3 for up to 20x faster transfer speeds footnote ² and new pro workflows.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i14),
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
                    text = "Iphone 14",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $799",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.1-inch durable design footnote ¹ with Ceramic Shield and water and dust resistance." +
                            "All-day battery life with up to 20 hours of video playback²." +
                            "Vital safety features like Roadside Assistance via satellite,³ Emergency SOS via satellite,³ and Crash Detection⁴." +
                            "A Pro-level Main camera and advanced image processing for sensational shots in all kinds of light." +
                            "A15 Bionic, the same superspeedy chip that’s in iPhone 13 Pro.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i14plus),
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
                    text = "Iphone 14 plus",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $899",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.7-inch durable design footnote ¹ with Ceramic Shield and water and dust resistance." +
                            "All-day battery life with up to 26 hours of video playback²." +
                            "Vital safety features like Roadside Assistance via satellite,³ Emergency SOS via satellite,³ and Crash Detection⁴." +
                            "A Pro-level Main camera and advanced image processing for sensational shots in all kinds of light." +
                            "A15 Bionic, the same superspeedy chip that’s in iPhone 13 Pro.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i14pro),
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
                    text = "Iphone 14 pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $999",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp))
                    }
                }
            }



            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.1‑inch (diagonal) all‑screen OLED display." +
                            "Ceramic Shield front." +
                            "Textured matte glass back and\n" +
                            "stainless steel design." +
                            "ProMotion technology with adaptive refresh rates up to 120Hz." +
                            "Fingerprint-resistant oleophobic coating." +
                            "Support for display of multiple languages and characters simultaneously.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.testpic9),
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
                    text = "Iphone 14 pro max",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1099",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                   "Ceramic Shield front" +
                           "Textured matte glass back and\n" +
                           "stainless steel design" +
                           "Super Retina XDR display" +
                           "6.7‑inch (diagonal) all‑screen OLED display" +
                           "2796‑by‑1290-pixel resolution at 460 ppi",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13mini),
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
                    text = "Iphone 13 mini",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $699",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

//

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Ceramic Shield front\n" +
                            "Glass back and aluminum design" +
                            "Super Retina XDR display" +
                            "6.1‑inch (diagonal) all‑screen OLED display" +
                            "2532‑by‑1170-pixel resolution at 460 ppi" +
                            "A15 Bionic chip" +
                            "Dual 12MP camera system: Main and Ultra Wide cameras" +
                            "Cinematic mode (1080p at 30 fps)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13),
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
                    text = "Iphone 13",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $799",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }


            item {
                Text(
                    text = "Description ",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "6.1-inch Super Retina XDR display footnote ¹." +
                            "Dual-camera system for incredible low-light photos and videos." +
                            "A15 Bionic with 4-core GPU for lightning-fast performance." +
                            "Ceramic Shield, and water and dust resistance footnote ²." +
                            "5G for superfast downloads and high-quality streaming footnote ³.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13pro),
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
                    text = "Iphone 13 pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $899",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }



            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Ceramic Shield front" +
                            "Textured matte glass back and\n" +
                            "stainless steel design" +
                            "Super Retina XDR display with ProMotion." +
                            "6.1‑inch (diagonal) all‑screen OLED display " +
                            "2532‑by‑1170-pixel resolution at 460 ppi" +
                            "A15 Bionic chip." +
                            "Pro 12MP camera system: Telephoto, Wide, and Ultra Wide cameras.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13pmx),
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
                    text = "Iphone 13 pro max",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $999",
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
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }


            item {
                Text(
                    text = "Description ",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Ceramic Shield front." +
                            "Textured matte glass back and\n" +
                            "stainless steel design." +
                            "Super Retina XDR display with ProMotion." +
                            "6.7‑inch (diagonal) all‑screen OLED display\n" +
                            "2778‑by‑1284-pixel resolution at 458 ppi" +
                            "ProMotion technology with adaptive refresh rates up to 120Hz." +
                            "A15 Bionic chip." +
                            "Pro 12MP camera system: Telephoto, Wide, and Ultra Wide cameras." +
                            "Enabled by TrueDepth camera for facial recognition\n",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
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

