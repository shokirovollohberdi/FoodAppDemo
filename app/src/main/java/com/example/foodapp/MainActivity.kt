package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnMenu.setOnClickListener {
            startActivity(Intent(this,ListFoodActivity::class.java))
        }

        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this,AddFoofActivity::class.java))
        }

    }
}