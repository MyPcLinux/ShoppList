package com.example.shopplist_by_neco.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "shopping_list_names") // Название таблицы
data class ShoppingListNames(

    @PrimaryKey(autoGenerate = true)
    val id: Int?,// Добавляет индификатор

    @ColumnInfo(name = "name")
    val name: String, // Добавляет название таблицы

    @ColumnInfo(name = "time")
    val time: String, // Время добавления

    @ColumnInfo(name = "allItemCounter")
    val allItemCount: Int, // Колличество элементов

    @ColumnInfo(name = "checkedItemsCounter")
    val checkItemsCounter: Int, // Отмеченые продукты

    @ColumnInfo(name = "itemsIds")
    val itemsIds: String // Все индефикаторы из списка

): Serializable//Передаем все в виде класса, а не списка для
               // того чтобы передать на другой активити
