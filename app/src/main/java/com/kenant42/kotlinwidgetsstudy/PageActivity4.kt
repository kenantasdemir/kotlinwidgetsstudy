package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage4Binding

class PageActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityPage4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ratingBar.numStars = 8
        Log.e("number of stars ", binding.ratingBar.numStars.toString())
        binding.ratingBar.stepSize = 0.3f


        binding.buttonStart.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }

        binding.buttonStop.setOnClickListener {
            binding.progressBar.visibility = View.INVISIBLE
        }

        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                binding.textViewResult.text = progress.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        binding.buttonShow.setOnClickListener {
            val progress = binding.seekBar.progress
            val rating = binding.ratingBar.progress

            Log.e("PROGRESS ", progress.toString())
            Log.e("RATING ", rating.toString())
        }

        binding.buttonGoTo5.setOnClickListener {
            val intent = Intent(this@PageActivity4, PageActivity5::class.java)
            startActivity(intent)
        }


    }
}