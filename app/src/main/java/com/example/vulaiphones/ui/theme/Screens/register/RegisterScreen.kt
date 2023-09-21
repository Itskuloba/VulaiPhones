package com.example.vulaiphones.ui.theme.Screens.register

//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.text.KeyboardActions
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.focus.FocusDirection.Companion.Next
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.LocalFocusManager
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.vulaiphones.data.AuthViewModel
//import com.example.vulaiphones.navigation.ROUTE_LOGIN
//import com.example.vulaiphones.ui.theme.VulaiPhonesTheme
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun RegisterScreen(navController: NavHostController) {
//    var username by remember { mutableStateOf("") }
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
//    var context= LocalContext.current
//
//
//    val focusManager = LocalFocusManager.current
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//            .background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = "VulaiPhones",
//            style = MaterialTheme.typography.headlineMedium,
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Spacer(modifier = Modifier.height(24.dp))
//
//        OutlinedTextField(
//            value = username,
//            onValueChange = { newValue -> username = newValue },
//            label = { Text("Username") },
//            singleLine = true,
//            keyboardOptions = KeyboardOptions.Default.copy(
//                imeAction = ImeAction.Next
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(Next) }
//            ),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(0.dp, 4.dp)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = { newValue -> email = newValue },
//            label = { Text("Email") },
//            singleLine = true,
//            keyboardOptions = KeyboardOptions.Default.copy(
//                imeAction = ImeAction.Next,
//                keyboardType = KeyboardType.Email
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(Next) }
//            ),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(0.dp, 4.dp)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
////        OutlinedTextField(
////            value = confirmpass,
////            onValueChange = { newValue -> password = newValue.toString() },
////            label = { Text("Password") },
////            singleLine = true,
////            visualTransformation = PasswordVisualTransformation(),
////            keyboardOptions = KeyboardOptions.Default.copy(
////                imeAction = ImeAction.Done,
////                keyboardType = KeyboardType.Password
////            ),
////            keyboardActions = KeyboardActions(
////                onDone = { focusManager.clearFocus() }
////            ),
////            modifier = Modifier
////                .fillMaxWidth()
////                .padding(0.dp, 4.dp)
////        )
////        Spacer(modifier = Modifier.height(24.dp))
//
//        OutlinedTextField(
//            value = password,
//            onValueChange = { newValue -> password = newValue },
//            label = { Text("Password") },
//            singleLine = true,
//            visualTransformation = PasswordVisualTransformation(),
//            keyboardOptions = KeyboardOptions.Default.copy(
//                imeAction = ImeAction.Done,
//                keyboardType = KeyboardType.Password
//            ),
//            keyboardActions = KeyboardActions(
//                onDone = { focusManager.clearFocus() }
//            ),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(0.dp, 4.dp)
//        )
//        Spacer(modifier = Modifier.height(24.dp))
//
//        Button(
//            onClick = {
//                val myregister=AuthViewModel(navController,context)
//                val pass = null
//                pass?.let { myregister.signup(email.trim(), it.trim(),confirmpass.text.trim()) }
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(48.dp)
//        ) {
//            Text(text = "Register")
//        }
//        Spacer(modifier = Modifier.height(5.dp))
//
//        Button(
//            onClick = {
//                navController.navigate(ROUTE_LOGIN)
//
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(48.dp)
//        ) {
//            Text(text = "Have an account?Log in here")
//        }
//    }
//}
//@Preview
//@Composable
//fun RegisterPagePreview() {
//    VulaiPhonesTheme {
//        RegisterScreen(rememberNavController())
//    }
//}
