package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonGetData.setOnClickListener{
            binding.textView.text = binding.editTextText.text.toString()
        }

        binding.buttonGoTo2.setOnClickListener{
            val intent = Intent(this@MainActivity,Page2Activity::class.java)
            startActivity(intent)
        }
    }
}