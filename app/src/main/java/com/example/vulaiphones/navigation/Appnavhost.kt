package com.example.vulaiphones.navigation

//import com.example.vulaiphones.ui.theme.Screens.products.ProductScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.ui.theme.Screens.checkout.CheckoutScreen
import com.example.vulaiphones.ui.theme.Screens.home.HomeScreen
import com.example.vulaiphones.ui.theme.Screens.login.LoginScreen
import com.example.vulaiphones.ui.theme.Screens.products.ProductScreen
import com.example.vulaiphones.ui.theme.Screens.register.RegisterScreen
import com.example.vulaiphones.ui.theme.Screens.splashscreen.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_SPLASHSCREEN) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_SPLASHSCREEN) {
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_PRODUCT){
            ProductScreen(navController)
        }
//        composable(ROUTE_PRODUCTLISTING){
//            ECommerceScreen(navController)
//        }
        composable(ROUTE_CHECKOUT){
            CheckoutScreen(navController)
        }





    }

}


