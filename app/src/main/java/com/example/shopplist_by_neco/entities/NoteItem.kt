package com.example.shopplist_by_neco.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Таблица для хранения заметок из блокнота

@Entity(tableName = "note_list")
data class NoteItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "title")// Заголовок
    val title: String,

    @ColumnInfo(name = "content")
    val content: String,

    @ColumnInfo(name = "time")
    val time: String, // Время добавления

    @ColumnInfo(name = "categoty")
    val category: String
)
