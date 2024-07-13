package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage8Binding

class PageActivity8 : AppCompatActivity() {
    private lateinit var binding: ActivityPage8Binding

    private val countries = ArrayList<String>()
    private lateinit var dataAdapter: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        countries.add("Türkiye")
        countries.add("İtalya")
        countries.add("Japonya")
        countries.add("Güney Kore")
        countries.add("Bulgaristan")
        countries.add("Macaristan")
        countries.add("Romanya")

        dataAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, countries)
        binding.spinner.adapter = dataAdapter


        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    applicationContext,
                    "Selected country is ${countries[position]}",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        binding.buttonShowSpinner.setOnClickListener{
            Toast.makeText(applicationContext,"Selected country ${countries[binding.spinner.selectedItemPosition]}",Toast.LENGTH_LONG).show()
        }

        binding.buttonGoTo9.setOnClickListener{
            val intent = Intent(this@PageActivity8,PageActivity9::class.java)
            startActivity(intent)
        }
    }
}