package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuper os componentes EditText
        //Criar uma variavel e associar (=) o componente de UI<EditText>
        //Recuperar o botao da tela

        //Colocar acao no botao setOnClickListener
        //Recuperar o texto digitado no edt peso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso : Float = edtPeso.text.toString().toFloat()
            val altura : Float = edtAltura.text.toString().toFloat()

            val altura02 = altura * altura
            val resultado = peso / altura02
            println("Roque acao do botao" + resultado)
        }

    }
}