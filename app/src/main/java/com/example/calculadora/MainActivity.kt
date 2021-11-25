package com.example.calculadora

import android.content.Intent
import android.icu.text.DecimalFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding
import java.text.NumberFormat


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.CalcularButton.setOnClickListener { calculate()
        val toast = Toast.makeText(this, "Sucesso!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }


    fun calculate() {
        // Essa função calcula


        //Buscar valores dos campos
        val EditTextN1 = binding.Campo1
        val EditTextN2 = binding.Campo2

        // converter para inteiro
        val n1 = EditTextN1.text.toString().toInt()
        val n2 =EditTextN2.text.toString().toInt()

        val selectedId =
            binding.RadioGroup.checkedRadioButtonId //variável que recebe o que tiver selecionado
        val tipconta = when (selectedId) {  //variável que recebe o tipo da conta
            R.id.Soma_button -> Calculadora().somar(n1, n2)
            R.id.Dividir_button -> Calculadora().divisao(n1, n2)
            R.id.Multiplica_button ->Calculadora().multplicacao(n1, n2)
            else -> Calculadora().divisao(n1, n2)
        }
        // variavel que recebe o resultado na textview resultado
        val tipresult =  DecimalFormat().format(tipconta)
        binding.Resultado.text = tipresult
    }


}




