package com.kenant42.kotlinwidgetsstudy

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Time
import com.kenant42.kotlinwidgetsstudy.databinding.ActivityPage7Binding

class PageActivity7 : AppCompatActivity() {
    private lateinit var binding: ActivityPage7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPage7Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.editTextTime.setOnClickListener {
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR)
            val minute = calendar.get(Calendar.MINUTE)

            val timePicker = TimePickerDialog(
                this@PageActivity7,
                TimePickerDialog.OnTimeSetListener { timePicker, s, dk ->
                    binding.editTextTime.setText("$s $dk ")
                },
                hour,
                minute,
                true
            )

            timePicker.setTitle("Choose hour ")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"OK",timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel",timePicker)
            timePicker.show()
        }

        binding.editTextDate.setOnClickListener {
            val calendar = Calendar.getInstance()
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            val month = calendar.get(Calendar.MONTH)
            val year = calendar.get(Calendar.YEAR)

            val datePicker = DatePickerDialog(this@PageActivity7,
                DatePickerDialog.OnDateSetListener { datePicker, y, a, g ->
                    binding.editTextDate.setText("$g/${a + 1}/$y")
                },year,month,day)


            datePicker.setTitle("Choose date ")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"OK",datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel ",datePicker)
            datePicker.show()

            /*
                   android:focusableInTouchMode="false"
    <!-- ilk tıklandığında bazen klavye açılır. klavye açılmasını engellemek için bu kodlama yapıldı -->

             */

        }


        binding.buttonGoTo8.setOnClickListener{
            val intent = Intent(this@PageActivity7,PageActivity8::class.java)
            startActivity(intent)
        }
    }
}