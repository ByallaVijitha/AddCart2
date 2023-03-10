package com.example.addcart2.datares

data class RestaurantDataClass(val id:Int, val name:String,
                               val rating:Float,val price:Int,val image:String,var fav:Boolean)