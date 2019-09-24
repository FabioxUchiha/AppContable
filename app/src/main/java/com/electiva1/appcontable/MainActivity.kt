package com.electiva1.appcontable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list)

        val custom_list_data = ArrayList<CList>()

        val custom_list = CListAdapter(this, custom_list_data)

        custom_list_data.add(CList(R.drawable.calculadora,"calculadora","Calculadora"))
        custom_list_data.add(CList(R.drawable.nomina,"Nomina","Nomina"))


        listView.adapter = custom_list

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->

            Toast.makeText(this@MainActivity," elemento clikeado:- $id", Toast.LENGTH_SHORT).show()

        }

    }
}
