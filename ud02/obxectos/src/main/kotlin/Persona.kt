package com.exemplo.kotlindemo

class Persona(){
    var nombre: String = "Anónimo"
    var edad: Int = 0
    var apellidos: String = "Delospalotes"
    var estaVivo : Boolean = true
    var sueldo: Double = 3456.67

    constructor(n: String, e: Int): this(){
        this.edad = e
        this.nombre = n
    }

    constructor(n: String): this(){
        this.nombre = n
    }

    constructor(e: Int): this(){
        this.edad = e
    }

    fun hablar(){
        println("Hola")
    }

    fun hablar(texto: String){
        println(texto)
    }

    fun hablar(texto: String, rep: Int){
        for (n in 0 until rep)
            println(texto)
    }

    fun morir(){
        this.estaVivo = false
    }

    fun renacer(){
        this.edad = 0
        this.estaVivo = true
    }

    fun irARegistroCivil(novoNome: String){
        this.nombre = novoNome
    }

    fun obtenerInfo(cabecera: String): String{
        return cabecera + " " + "soy " + this.nombre
    }
}