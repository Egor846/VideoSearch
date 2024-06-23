package com.example.videosearch

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       initMenuButtons()


    }


    private fun initMenuButtons() {
        val settingsButton = findViewById<View>(R.id.settings)
        settingsButton.setOnClickListener (){
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }

        val favoritesButton = findViewById<View>(R.id.favorites)
        favoritesButton.setOnClickListener (){
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }

        val podborkiButton = findViewById<View>(R.id.podborki)
        podborkiButton.setOnClickListener (){
            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
        }

        val watchLaterButton = findViewById<View>(R.id.watch_later)
        watchLaterButton.setOnClickListener (){
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }





    }
}