package com.example.shopplist_by_neco.activities

import android.app.ActionBar
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.shopplist_by_neco.R
import com.example.shopplist_by_neco.databinding.ActivityMainBinding
import com.example.shopplist_by_neco.fragments.FragmentManager
import com.example.shopplist_by_neco.fragments.NoteFragment


class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bar: ActionBar? = actionBar
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#229C27")))

        setBottomNavListener()

    }
    private fun setBottomNavListener(){
        binding.bNavigationMenuMain.setOnItemSelectedListener {
            when(it.itemId){

                R.id.settings ->{
                    Log.d("MyLog", "$it")
                }
                R.id.notes ->{
                   FragmentManager.setFragment(
                       NoteFragment.newInstance(), this)
                }
                R.id.shop_list ->{
                    Log.d("MyLog", "$it")
                }
                R.id.new_item ->{
                    Log.d("MyLog", "$it")
                }
            }
            true
        }
    }

}


