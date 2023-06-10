package com.example.shopplist_by_neco.activities

import android.app.Application
import com.example.shopplist_by_neco.db.MainDataBase

class MainApp: Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}