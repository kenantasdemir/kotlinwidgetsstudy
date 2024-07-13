package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage2Binding
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage3Binding

class PageActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityPage3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonGoTo4.setOnClickListener{
            val intent = Intent(this@PageActivity3,PageActivity4::class.java)
            startActivity(intent)
        }

    }
}