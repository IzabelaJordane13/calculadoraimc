package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.text.method.TextKeyListener
import android.view.TextureView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

const val KEY_RESULT_IMC= "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text = result.toString()

        val (classificacao, color) = when {
            result <= 18.5 -> "MAGREZA" to R.color.color_red
            result in 18.5..24.9 -> "NORMAL" to R.color.color_green
            result in 25.0..29.9 -> "SOBREPESO" to R.color.color_yellow
            result in 30.0..39.9 -> "OBESIDADE" to R.color.color_red
            else -> "OBESIDADE GRAVE" to R.color.color_red

        }

        tvClassificacao.text = classificacao
        tvClassificacao.setTextColor(ContextCompat.getColor(this, color))
        }
}


