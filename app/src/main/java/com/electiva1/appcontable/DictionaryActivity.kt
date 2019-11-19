package com.electiva1.appcontable

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class DictionaryActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary)

        val search = findViewById<SearchView>(R.id.searchView) as SearchView

        val list = findViewById<ListView>(R.id.listView) as ListView

        val palabras = arrayOf("Activo", "Pasivo", "Fondos propios", "Patrimonio neto", "Financiación ajena",
            "Ingreso", "Gasto", "Balance de situación", "Cuenta de pérdidas y ganancias", "Estado de flujos de efectivo",
        "Memoria", "Cuentas anuales", "Consolidación contable", "Fondo de maniobra", "Provisión", "Reservas", "Libro diario")

        val palabrasAdapter  : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,palabras)

        list.adapter = palabrasAdapter

        search.setOnQueryTextListener(object  : SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                palabrasAdapter.filter.filter(newText)
                return false
            }
        })
    }
}