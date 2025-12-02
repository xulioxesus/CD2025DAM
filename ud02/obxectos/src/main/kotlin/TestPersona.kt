package com.exemplo.kotlindemo

fun main() {
    var p = Persona("Julio", 90)
    var jose = Persona()
    var laura = Persona("Laura")
    var anonimo = Persona(18)

    p.hablar("oli",10)
    p.morir()
    p.renacer()
    p.irARegistroCivil("Manuel")
}