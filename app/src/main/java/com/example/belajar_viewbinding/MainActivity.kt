package com.example.belajar_viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.belajar_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Variabel binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mengakses elemen UI melalui variabel binding
        binding.textView.text = getString(R.string.Text1)
        binding.button.setOnClickListener {
            // Handle button click
        }
    }
}