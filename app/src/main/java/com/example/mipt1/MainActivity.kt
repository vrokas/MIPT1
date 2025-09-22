package com.example.mipt1

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mipt1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener {
            binding.myText.text = "Swx"
        }

        binding.colorButton.setOnClickListener {
            binding.myText.setTextColor(Color.RED)
        }

        binding.backgroundButton.setOnClickListener {
            binding.myText.setBackgroundColor(Color.YELLOW)
        }
        // Comment for revert

    }
}
