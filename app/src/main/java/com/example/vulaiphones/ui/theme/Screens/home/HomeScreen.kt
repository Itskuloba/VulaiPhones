package com.example.vulaiphones.ui.theme.Screens.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme

@Composable
fun HomeScreen(navController:NavHostController) {

}
@Preview
@Composable
fun RegisterPagePreview() {
    VulaiPhonesTheme {
        HomeScreen(rememberNavController())
    }
}