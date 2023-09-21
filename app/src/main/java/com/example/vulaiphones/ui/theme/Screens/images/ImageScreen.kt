package com.example.vulaiphones.ui.theme.Screens.images
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewmodel.compose.viewModel
//import coil.compose.rememberImagePainter
//import com.example.vulaiphones.models.ImageViewModel
//
//@Composable
//fun ImageList() {
//    val viewModel: ViewModel = viewModel()
//
////    val imageUrls by viewModel.imageUrls.collectAsState(initial = emptyList())
//
//    LazyColumn {
////        items(imageUrls) { imageUrl ->
//            Image(
//                painter = rememberImagePainter(data = imageUrl),
//                contentDescription = null, // Provide a description if needed
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp)
//            )
//        }
//    }
//}
