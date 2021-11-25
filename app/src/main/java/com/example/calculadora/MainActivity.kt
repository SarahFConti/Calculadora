package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding


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
        binding.calcularButton.setOnClickListener { calculate()
        val toast = Toast.makeText(this, "Sucesso!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }


    fun calculate() {
        // Essa função calcula


        //Buscar valores dos campos
        val EditTextN1 = binding.campo1
        val EditTextN2 = binding.campo2

        // converter para inteiro
        val n1 = EditTextN1.text.toString().toInt()
        val n2 =EditTextN2.text.toString().toInt()

        val selectedId =
            binding.radioGroup.checkedRadioButtonId //variável que recebe o que tiver selecionado
        val tipconta = when (selectedId) {  //variável que recebe o tipo da conta

        }

    }


}




//    fun sendsomar(view: View) {
//        // Buscar os valores
//        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
//        val editTextN2 = findViewById<EditText>(R.id.editTextN2)
//
//        val n1 = editTextN1.text.toString()
//        val n2 = editTextN2.text.toString().toInt() //primeiro converto para string e depois valor / opç 1 de converter
//
//        //SOMAR
//        val calculo = Calculadora().somar(n1.toInt(), n2).toString() //opç 2 de converter
//
//
//        //EXIBIR
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(EXTRA_MESSAGE, calculo)
//
//
//        }
//        startActivity(intent)
//    }
//
//
//    fun sendsubtrair(view: View) {
//
//        // Buscar os valores
//        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
//        val editTextN2 = findViewById<EditText>(R.id.editTextN2)
//
//        val n1 = editTextN1.text.toString()
//        val n2 = editTextN2.text.toString().toInt()
//
//        //Sub
//        val calculo = Calculadora().subtrair(n1.toInt(), n2).toString()
//
//
//        //EXIBIR
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(EXTRA_MESSAGE, calculo)
//
//
//        }
//        startActivity(intent)
//    }
//
//
//    fun sendmultplicacao(view: View) {
//
//        // Buscar os valores
//        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
//        val editTextN2 = findViewById<EditText>(R.id.editTextN2)
//
//        val n1 = editTextN1.text.toString()
//        val n2 = editTextN2.text.toString().toInt()
//
//        //mult
//        val calculo = Calculadora().multplicacao(n1.toInt(), n2).toString()
//
//
//        //EXIBIR
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(EXTRA_MESSAGE, calculo)
//
//
//        }
//        startActivity(intent)
//    }
//
//
//    fun senddivisao(view: View) {
//
//        // Buscar os valores
//        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
//        val editTextN2 = findViewById<EditText>(R.id.editTextN2)
//
//        val n1 = editTextN1.text.toString()
//        val n2 = editTextN2.text.toString().toInt()
//
//        //
//        val calculo = Calculadora().divisao(n1.toInt(), n2).toString()
//
//
//        //EXIBIR
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(EXTRA_MESSAGE, calculo)
//
//
//        }
//        startActivity(intent)
//
//    }



//}