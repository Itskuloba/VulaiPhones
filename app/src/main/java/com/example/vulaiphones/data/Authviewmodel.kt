package com.example.vulaiphones.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.models.User
import com.example.vulaiphones.navigation.ROUTE_HOME
import com.example.vulaiphones.navigation.ROUTE_LOGIN
import com.example.vulaiphones.ui.theme.Screens.splashscreen.SplashScreen
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class AuthViewModel (var navController:NavHostController,var context:Context) {
    var mAuth: FirebaseAuth
    val progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait")

    }

    fun signup(email: String, pass: String, confpass: String) {
        progress.show()
        if (email.isBlank() || pass.isBlank() || confpass.isBlank()) {
            progress.dismiss()
            Toast.makeText(context, "Please email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
            return
        } else if (pass != confpass) {
            Toast.makeText(context, "Password do not match", Toast.LENGTH_LONG).show()
            return
        } else {
            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    val userdata = User(email, pass, mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {


                        if (it.isSuccessful) {
                            Toast.makeText(context, "Registered successfully", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_HOME)
                        } else {
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_LOGIN)
                        }
                    }
                } else {
                    navController.navigate(ROUTE_LOGIN)
                }
            }
        }
    }

    fun login(email: String, pass: String) {
        progress.show()
        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Successfully logged in", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_HOME)
//                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIFFERENT PAGE
            } else {
                Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }
    }

    @OptIn(ExperimentalComposeUiApi::class)
    @Composable
    fun AppNavigation() {
        val navController = rememberNavController()

        // Set up your navigation graph
        NavHost(navController = navController, startDestination = "splash_screen") {
            composable("splash_screen") {
                SplashScreen(navController)
            }
            composable("main_screen") {
                // Your main content composable
            }
        }
    }
}
