package com.kenant42.kotlinwidgetsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityMainBinding
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage2Binding

class Page2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPage2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnCheckedChangeListener{ compoundButton, i->
            if(i){
                Log.e("SWITCH STATE IS ","ON")
            }else{
                Log.e("SWITCH STATE IS ","OFF")
            }
        }

        binding.toggleButton.setOnCheckedChangeListener{compoundButton, i->
            if(i){
                Log.e("TOGGLE BUTTON IS ","ON")
            }else{
                Log.e("TOGGLE BUTTON IS ","OFF")
            }

            val switchState = binding.switch1.isChecked
            val toggleButtonState = binding.toggleButton.isChecked
            binding.switch1.setText("aç")

            Log.e("SWITCH STATE ","$switchState")
            Log.e("TOGGLE BUTTON STATE ","$toggleButtonState")
        }

        binding.buttonGoTo3.setOnClickListener{
            val intent = Intent(this@Page2Activity,PageActivity3::class.java)
            startActivity(intent)
        }
    }
}