package com.electiva1.appcontable

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NominaActivity : AppCompatActivity(){
    lateinit var salario : EditText
    lateinit var hed : EditText
    lateinit var resultado : TextView
    lateinit var btnCalc : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomina)

        salario = findViewById(R.id.salario)
        hed = findViewById(R.id.hed)
        resultado = findViewById(R.id.resultado)
        btnCalc = findViewById(R.id.calcular)

        btnCalc.setOnClickListener {
            calcularNomina()
        }

    }

    private fun calcularNomina(){
        if (TextUtils.isEmpty(salario.text.toString()))
        {
            salario.error="No puede estar vacio"
            return
        }

        val doubleSL = salario.text.toString().toDouble()
        val hediur = hed.text.toString().toDouble()

        val calc = (doubleSL / 240)*1.25*hediur
        resultado.text = calc.toString()
    }
}

