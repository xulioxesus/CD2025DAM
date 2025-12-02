package com.exemplo.kotlindemo

class Game() {
    private var nome: String = ""
    private var prezo : Double = 0.0

    fun getNome(): String{
        return nome;
    }

    fun getPrezo(): Double{
        return prezo;
    }

    constructor(n: String, p: Double): this(){
        nome = n
        prezo = p
    }
}