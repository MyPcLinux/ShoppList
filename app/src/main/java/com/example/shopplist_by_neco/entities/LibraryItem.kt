package com.example.shopplist_by_neco.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Накапливает историю ввода и выводит подсказки
@Entity(tableName = "library")
data class LibraryItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "name")
    val title: String
)
