package com.example.vulaiphones.models

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme

data class UserProfile(
    val name: String,
    val email: String,
    val bio: String
)
class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userProfile = UserProfile(
            name = "John Doe",
            email = "johndoe@example.com",
            bio = "I love programming and creating cool apps!"
        )

        setContent {
            VulaiPhonesTheme {
//                ProfilePage(userProfile = userProfile)
            }
        }
    }
}