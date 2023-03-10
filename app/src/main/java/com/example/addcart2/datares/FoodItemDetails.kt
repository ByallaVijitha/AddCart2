package com.example.addcart2.datares

import androidx.room.PrimaryKey
//import com.google.gson.annotations.SerializedName

//data class FoodItemDetails(
//    @SerializedName("food_item_id")
//    val id:String,
//    @SerializedName("name")
//    val name:String,
//    @SerializedName("cost")
//    val cost:String
//)

data class FoodItemDetails(
    @PrimaryKey(autoGenerate = true)
    val id:String,
//    @SerializedName("name")
    val name:String,
//    @SerializedName("cost")
    val cost:String

)