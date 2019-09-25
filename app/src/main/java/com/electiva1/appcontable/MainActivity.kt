package com.electiva1.appcontable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import android.widget.ListView as ListView1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView1>(R.id.list)

        val custom_list_data = ArrayList<CList>()

        val custom_list = CListAdapter(this, custom_list_data)

        custom_list_data.add(CList(R.drawable.recordatorio,"Recordatorio","Recordatorio"))
        custom_list_data.add(CList(R.drawable.diccionario,"Diccionario","Diccionario"))
        custom_list_data.add(CList(R.drawable.calculadora,"calculadora","Calculadora"))
        custom_list_data.add(CList(R.drawable.calculofinanciero,"Cálculos financieros","Cálculos financieros"))
        custom_list_data.add(CList(R.drawable.cuentasreales,"Cuentas reales","Cuentas reales"))
        custom_list_data.add(CList(R.drawable.nomina,"Cuentas nominales","Cuentas nominales"))

        listView.adapter = custom_list

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->

            Toast.makeText(this@MainActivity," elemento clikeado:- $id", Toast.LENGTH_SHORT).show()
            if (position==2){
                val myIntent = Intent(this, CalculatorActivity::class.java)
                startActivity(myIntent)
            }

        }

    }
}
