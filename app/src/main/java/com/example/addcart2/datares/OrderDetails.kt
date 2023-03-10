package com.example.addcart2.datares

//import com.google.gson.annotations.SerializedName

data class OrderDetails(
    val id:String,
    val resName:String,
    val total_cost:String,
    val orderDate:String,
    val items:List<FoodItemDetails>
)