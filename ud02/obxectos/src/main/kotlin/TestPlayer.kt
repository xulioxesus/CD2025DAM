package com.exemplo.kotlindemo

fun main() {
    var xogador = Player()
    var outro = Player("Julio", "skdjfhksf", "julio@gamer.tv")

    outro.comprarXogo("GTA")
    outro.comprarXogo("GTA2")
    outro.comprarXogo("GTA2")
    outro.comprarXogo("GTA3")
    outro.comprarXogo("GTA4")

    outro.venderXogo("GTA")

    outro.imprimirXogos()
}