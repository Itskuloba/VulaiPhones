package com.example.vulaiphones.models


class Product {
    var name:String=""
    var quantity:String=""
    var price:String=""
    var id:String=""
    var description:String=""

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
     val Name: String
    // Add other order details as needed
)


//fun Order(
//    product: Product,
//    quantity: Int,
//    Name: String,
//    Email: String
//): Order {
//    val totalPrice = product.price.toDouble() * quantity.toDouble()
//    return Order(
//        productId = product.id,
//        productName = product.name,
//        quantity = quantity,
//        totalPrice = totalPrice,
//        Name = Name,
//        Email = Email
//        // Add other order details as needed
//    )
//}
