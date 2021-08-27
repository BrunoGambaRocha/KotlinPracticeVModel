package br.com.brunoti.cursos.dio.kotlinpractisevmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var mContador = MutableLiveData<String>().apply { value = contador.toString() }
    private var contador: Int = 0;

    private fun setmContador() {
        mContador.value = contador.toString()
    }

    private fun validaContador() {
        contador++
        if (contador > 5) {
            contador = 0
        }
        setmContador()
    }

    fun contador() {
        validaContador()
    }

}