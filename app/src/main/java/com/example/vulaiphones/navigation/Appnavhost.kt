package com.example.vulaiphones.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.ui.theme.Screens.home.HomeScreen
import com.example.vulaiphones.ui.theme.Screens.login.LoginScreen1
import com.example.vulaiphones.ui.theme.Screens.products.ProductScreen
import com.example.vulaiphones.ui.theme.Screens.register.RegisterScreen2
import com.example.vulaiphones.ui.theme.Screens.splashscreen.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_PRODUCT) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_SPLASHSCREEN) {
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen1(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen2(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_PRODUCT){
            ProductScreen(navController)
        }




    }

}


