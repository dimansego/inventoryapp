package com.example.stockapp
import android.app.Application
import com.example.stockapp.data.ItemRoomDatabase
class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
