package com.example.vulaiphones.ui.theme.Screens.login
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
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
//import com.example.vulaiphones.navigation.ROUTE_HOME
//import com.example.vulaiphones.navigation.ROUTE_REGISTER
//import com.example.vulaiphones.ui.theme.VulaiPhonesTheme
//
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LoginScreen(navController: NavHostController) {
//    var email by remember { mutableStateOf("") }
//    var pass by remember { mutableStateOf(TextFieldValue("")) }
//    var context= LocalContext.current
//
////    val keyboardController = rememberKeyboardController()
//
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//            .background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        // App logo or title
//        Text(
//            text = "VulaiPhones",
//            style = MaterialTheme.typography.headlineMedium,
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value =email ,
//            onValueChange ={email=it},
//            label={ Text(text = "Enter Email")},
//
//            keyboardOptions = KeyboardOptions.Default.copy(
//                imeAction = ImeAction.Next ),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value =pass ,
//            onValueChange ={pass=it},
//            label={ Text(text = "Enter password")},
//            singleLine = true,
//            visualTransformation = PasswordVisualTransformation(),
//
//            keyboardOptions = KeyboardOptions.Default.copy(
//                imeAction = ImeAction.Next,
//                keyboardType = KeyboardType.Password),
//
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//
//
//
//
//
//
//        Button(
//            onClick = {
//                val mylogin= AuthViewModel(navController, context)
//                mylogin.login(email.trim(), pass.text.trim())
//                navController.navigate(ROUTE_HOME)
//            },
//            modifier = Modifier.fillMaxWidth(),
//            colors = ButtonDefaults.buttonColors()
////            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary),
//        ) {
//            Text(text = "Log In", color = Color.White)
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_REGISTER)
//        }, modifier = Modifier.fillMaxWidth()) {
//            Text(text = "Don't have an account? Click to register")
//
//        }
//    }
//}
//
//@Preview
//@Composable
//fun LoginPagePreview() {
//    VulaiPhonesTheme {
//        LoginScreen(rememberNavController())
//    }
//}
