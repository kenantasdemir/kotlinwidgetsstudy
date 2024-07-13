package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage4Binding
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage5Binding

class PageActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityPage5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLoad.setOnClickListener{
            binding.webView.settings.javaScriptEnabled = true
            binding.webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr")
        }

        binding.buttonGoTo6.setOnClickListener{
            val intent = Intent(this@PageActivity5,PageActivity6::class.java)
            startActivity(intent)
        }
    }
}