package com.example.vulaiphones.models


class Product {


    var name:String=""
    var quantity:String=""
    var price:String=""
    var id:String=""
    var description:String=""
    val imageResourceId: Int = 0 // Add this property to store the image resource ID


    constructor(name: String, quantity:String, price:String, id: Int){
        this.name=name
        this.quantity=quantity
        this.price=price
        this.id= id.toString()
    }
    constructor()
}


 data class Order(
     val productId: Product,
     val productName: String,
     val quantity: Int,
     val totalPrice: Double,
     val customerName: String,
     val Email: String,
     val Name: String,
     val imageResourceId: Int=0 // Add this property to store the image resource ID

     // Add other order details as needed
)
