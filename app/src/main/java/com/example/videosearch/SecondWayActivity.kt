package com.example.videosearch

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondWayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_way)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initMenuButtons()



        val theThirdAnimationButton: Button = findViewById(R.id.theThirdAnimationButton)
        theThirdAnimationButton.setOnClickListener{
            val intent = Intent(this,ThirdWayActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Третий способ", Toast.LENGTH_SHORT).show()
        }

    }

    private fun initMenuButtons() {
        val settingsButton = findViewById<View>(R.id.settings)
        settingsButton.setOnClickListener() {
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }

        val favoritesButton = findViewById<View>(R.id.favorites)
        favoritesButton.setOnClickListener() {
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }

        val podborkiButton = findViewById<View>(R.id.podborki)
        podborkiButton.setOnClickListener() {
            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
        }

        val watchLaterButton = findViewById<View>(R.id.watch_later)
        watchLaterButton.setOnClickListener() {
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }


    }
}