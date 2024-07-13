package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage6Binding

class PageActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityPage6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonImage1.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.wifi)
        }

        binding.buttonImage2.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.image)
        }

        binding.buttonStartt.setOnClickListener{
            val address = Uri.parse("android.resource://"+packageName+"/"+R.raw.piper)
            binding.videoView.setVideoURI(address)
            binding.videoView.start()
        }

        binding.buttonStopp.setOnClickListener {
            binding.videoView.stopPlayback()
        }

        binding.buttonGoTo7.setOnClickListener{
            val intent = Intent(this@PageActivity6,PageActivity7::class.java)
            startActivity(intent)
        }
    }
}