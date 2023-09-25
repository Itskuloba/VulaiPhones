package com.example.vulaiphones.ui.theme.Screens.profile
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.unit.dp
//import com.example.VulaiPhones.R // Replace with your app's R file
//import com.example.vulaiphones.R
//
//class ProfileActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ProfileScreen()
//        }
//    }
//}
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun ProfileScreen() {
//    var name by remember { mutableStateOf(TextFieldValue("John Doe")) }
//    var description by remember { mutableStateOf(TextFieldValue("Android Developer")) }
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Profile") },
//                actions = {
//                    IconButton(
//                        onClick = { /* Handle edit button click */ }
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.ic_edit),
//                            contentDescription = "Edit"
//                        )
//                    }
//                }
//            )
//        }
//    ) {
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            item {
//                Image(
//                    painter = painterResource(id = R.drawable.profile_picture),
//                    contentDescription = "Profile Picture",
//                    modifier = Modifier
//                        .size(150.dp)
//                        .clip(shape = CircleShape),
//                    contentScale = ContentScale.Crop
//                )
//            }
//            item {
//                Spacer(modifier = Modifier.height(16.dp))
//            }
//            item {
//                Text(
//                    text = "Name",
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = Color.Gray
//                )
//                BasicTextField(
//                    value = name,
//                    onValueChange = { newName ->
//                        name = newName
//                    },
//                    singleLine = true,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.White)
//                        .padding(8.dp)
//                )
//            }
//            item {
//                Spacer(modifier = Modifier.height(16.dp))
//            }
//            item {
//                Text(
//                    text = "Description",
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = Color.Gray
//                )
//                BasicTextField(
//                    value = description,
//                    onValueChange = { newDescription ->
//                        description = newDescription
//                    },
//                    singleLine = true,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.White)
//                        .padding(8.dp)
//                )
//            }
//        }
//    }
//}
