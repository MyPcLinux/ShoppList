package com.example.shopplist_by_neco.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_list_item")
data class ShoppingListItem(

    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo (name = "item_info") //ДОполнительная инфармация о покупке
    val itemInfo: String?,
    @ColumnInfo(name = "itemChecked")
    val itemChecked: Int = 0, //Пока не куплен 0 куплен 1

    @ColumnInfo(name = "listId")
    val listId: Int, //Индефикатор в списке

@ColumnInfo(name = "itemType")
val itemType: String = "item"//Добавляем библиотеку подсказок
)
