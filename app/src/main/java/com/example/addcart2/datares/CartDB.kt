package com.example.addcart2.datares

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ResMenuEntity::class],version = 1)
abstract class CartDB:RoomDatabase() {

    abstract fun resMenuDao():ResMenuDao

}