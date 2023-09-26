package com.example.vulaiphones.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.vulaiphones.models.Order
import com.example.vulaiphones.models.Product
import com.example.vulaiphones.models.User
import com.example.vulaiphones.navigation.ROUTE_HOME
import com.example.vulaiphones.navigation.ROUTE_LOGIN
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
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
            } else {
                Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }
    }


    fun checkout(product: Product, name:String,cardNumber: Number,expirationDate:Number,cvv:Number) {
        progress.show()

        val name = name
        val cardNumber = cardNumber
        val expirationDate = expirationDate
        val cvv = cvv

        if (name.isBlank() || cardNumber==null || expirationDate==null || cvv==null) {
            progress.dismiss()
            Toast.makeText(context, "Please fill in all payment details", Toast.LENGTH_LONG).show()
            return
        } else {
            // Perform payment processing logic here
            // For example, you can use Firebase to store the order information


            // Assuming you have a Firebase reference (e.g., "orderRef") to store order data

            val orderData = Order(product)
            val orderRef = FirebaseDatabase.getInstance().getReference("orders")
            orderRef.setValue(orderData).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(context, "Order placed successfully", Toast.LENGTH_LONG).show()
                    // Handle navigation or other actions after successful order placement
                } else {
                    Toast.makeText(context, "${task.exception?.message}", Toast.LENGTH_LONG).show()
                    // Handle errors during order placement
                }
                progress.dismiss()
            }
        }
    }

    private fun Order(product: Product): Any? {
        TODO("Not yet implemented")
    }


    fun saveOrder(order: Order) {
        val database = FirebaseDatabase.getInstance()
        val ordersRef: DatabaseReference = database.getReference("orders")

        // Generate a unique key for the order
        val orderKey = ordersRef.push().key ?: ""

        // Set the order data in the database
        ordersRef.child(orderKey).setValue(order)
            .addOnSuccessListener {
                // Order saved successfully
                println("Order saved successfully")
            }
            .addOnFailureListener {
                // Error occurred while saving the order
                println("Error saving order: ${it.message}")
            }
    }



}
