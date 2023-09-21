package com.example.vulaiphones.models
//
//import androidx.lifecycle.ViewModel
//import com.google.firebase.ktx.Firebase
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//
//class ImageViewModel : ViewModel() {
////    private val storage = Firebase.storage
//    private val imageUrlsFlow = MutableStateFlow<List<String>>(emptyList())
//
//    val imageUrls: StateFlow<List<String>> = imageUrlsFlow
//
//    init {
//        fetchImageUrls()
//    }
//
//    private fun fetchImageUrls() {
//        val storageRef = storage.reference.child("images") // Replace with your Firebase Storage path
//        val images = mutableListOf<String>()
//
//        storageRef.listAll()
//            .addOnSuccessListener { result ->
//                result.items.forEach { item ->
//                    item.downloadUrl.addOnSuccessListener { uri ->
//                        images.add(uri.toString())
//                        imageUrlsFlow.value = images
//                    }
//                }
//            }
//    }
//}
