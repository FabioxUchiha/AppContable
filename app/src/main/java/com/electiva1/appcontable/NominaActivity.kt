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
    lateinit var hen : EditText
    lateinit var hedf : EditText
    lateinit var henf : EditText
    lateinit var resultado : TextView
    lateinit var btnCalc : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomina)

        salario = findViewById(R.id.salario)
        hed = findViewById(R.id.hed)
        hen = findViewById(R.id.hen)
        hedf = findViewById(R.id.hedf)
        henf = findViewById(R.id.henf)
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
        if (TextUtils.isEmpty(hed.text.toString()))
        {
            hed.error="No puede estar vacio"
            return
        }
        if (TextUtils.isEmpty(hen.text.toString()))
        {
            hen.error="No puede estar vacio"
            return
        }
        if (TextUtils.isEmpty(hedf.text.toString()))
        {
            hedf.error="No puede estar vacio"
            return
        }
        if (TextUtils.isEmpty(henf.text.toString()))
        {
            henf.error="No puede estar vacio"
            return
        }

        val doubleSL = salario.text.toString().toDouble()
        val hediur = hed.text.toString().toDouble()
        val henoc = hen.text.toString().toDouble()
        val hedfest = hedf.text.toString().toDouble()
        val henfest = henf.text.toString().toDouble()
        val valh = (doubleSL / 240)
        val calc = valh*1.25*hediur + valh*1.75*henoc + valh*2*hedfest + valh*2.5*henfest
        resultado.text = "resultaddo: "+calc.toInt().toString()+" pesos"
    }
}

