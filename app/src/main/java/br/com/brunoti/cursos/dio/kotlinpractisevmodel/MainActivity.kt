package br.com.brunoti.cursos.dio.kotlinpractisevmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var txtContador: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button
    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logar(valor = "onCreate")

        initDados()
        initContador()
        initClick()
    }

    private fun finalizarApp() {
        finish()
    }

    override fun onStart() {
        logar(valor = "onStart")
        super.onStart()
    }

    override fun onResume() {
        logar(valor = "onResume")
        super.onResume()
    }

    override fun onPause() {
        logar(valor = "onPause")
        super.onPause()
    }

    override fun onStop() {
        logar(valor = "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        logar(valor = "onDestroy")
        super.onDestroy()
    }

    private fun logar(tag: String = "Ciclo de Vida", valor: String) {
        Log.d(tag, valor)
    }

    private fun initClick() {
        btnDados.setOnClickListener{
            contador++
            validaContador()
            initContador()
        }

        btnMostrar.setOnClickListener{
            //Toast.makeText(this, "Valor Contador: ${contador.toString()}", Toast.LENGTH_SHORT).show()
            finalizarApp()
        }
    }

    private fun validaContador() {
        if (contador > 5) {
            contador = 0
        }
    }

    private fun initContador() {
        txtContador.setText(contador.toString())
    }

    private fun initDados() {
        txtContador = findViewById(R.id.txtContador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)
    }

}