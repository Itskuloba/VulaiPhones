package com.example.vulaiphones


import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.animation.OvershootInterpolator
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.vulaiphones.navigation.AppNavHost
import com.example.vulaiphones.ui.theme.Screens.login.LoginScreen1
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
                com.example.vulaiphones.Navigation()
                VulaiPhonesTheme {
                    LoginScreen1(rememberNavController())
                    AppNavHost()
                }
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "GFG",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = Color.White
                                )
                            })
                    })
                {

//                    com.example.vulaiphones.ui.theme.Screens.firebasUI(LocalContext.current)
                }

            }
        }
    }
}
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "splash_screen") {
        composable("splash_screen") {
            SplashScreen(navController = navController)
        }
//        val db = Firebase.firestore

        // Main Screen
        composable("main_screen") {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Main Screen", color = Color.Black, fontSize = 24.sp)
                Text(text = "Main Screen", color = Color.Black, fontSize = 24.sp)
            }
        }
    }
}
@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }

    // Animation
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            // tween Animation
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                }))
        // Customize the delay time
        delay(3000L)
        navController.navigate("main_screen")
    }

    // Image
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()) {
        // Change the logo
        Image(painter = painterResource(id = R.drawable.phonescreen),
            contentDescription = "Logo",
            modifier = Modifier.scale(scale.value))
    }
}
@Composable
fun FirebasUI(context: Context) {

    // on below line creating
    // variable for message.
    val message = remember {
        mutableStateOf("")
    }
    // on below line creating variable for firebase
    // database and database reference.
    val firebaseDatabase = FirebaseDatabase.getInstance();
    val databaseReference = firebaseDatabase.getReference("Data");

    databaseReference.addValueEventListener(object : ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) {
            val value = snapshot.getValue(String::class.java)
            message.value = value!!
        }

        override fun onCancelled(error: DatabaseError) {
            Toast.makeText(context, "Fail to get data.", Toast.LENGTH_SHORT).show()
        }
    })

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
//            painter = rememberAsyncImagePainter(message.value),
            painter = rememberImagePainter(data = message.value),


            contentDescription = "gfg image",

            modifier = Modifier
                .wrapContentSize()
                .wrapContentHeight()
                .wrapContentWidth()
        )
    }
}



