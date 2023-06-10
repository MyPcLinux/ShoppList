package com.example.shopplist_by_neco.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shopplist_by_neco.entities.LibraryItem
import com.example.shopplist_by_neco.entities.NoteItem
import com.example.shopplist_by_neco.entities.ShoppingListItem

@Database(entities = [LibraryItem::class,
                      NoteItem::class,
                      ShoppingListItem::class], version = 1)

abstract class MainDataBase: RoomDatabase() {
    abstract fun getDao(): Dao


    companion object{
        @Volatile// Используется для операций многопоточности.
        private var INSTANCE: MainDataBase? = null

        fun getDataBase(context: Context): MainDataBase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                MainDataBase::class.java,
                "shopping_list.db"
                ).build()//build() - создать бд
                instance
            }
        }
    }
}