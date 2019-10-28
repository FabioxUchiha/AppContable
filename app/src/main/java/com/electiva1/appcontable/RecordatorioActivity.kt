package com.electiva1.appcontable

import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class RecordatorioActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recordatorio)

        val date = findViewById<DatePicker>(R.id.datePick) as DatePicker

        val calender : Calendar = Calendar.getInstance()

        date.init(calender.get(Calendar.YEAR), calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH), {view,year, monthOfYear, dayOfMonth ->
            Toast.makeText(applicationContext,"#"+date.dayOfMonth +"-"+date.month+"-"+date.year+" #",Toast.LENGTH_SHORT).show()
        })
    }
}