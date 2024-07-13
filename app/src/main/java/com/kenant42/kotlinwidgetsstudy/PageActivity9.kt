package com.kenant42.kotlinwidgetsstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage9Binding

class PageActivity9 : AppCompatActivity() {
    private lateinit var binding:ActivityPage9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage9Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}