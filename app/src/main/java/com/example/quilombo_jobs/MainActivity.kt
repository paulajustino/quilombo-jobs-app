package com.example.quilombo_jobs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quilombo_jobs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}