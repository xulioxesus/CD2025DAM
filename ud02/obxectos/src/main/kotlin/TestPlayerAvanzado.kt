package com.exemplo.kotlindemo

fun main() {
    var xogador = PlayerAvanzado()
    var outro = PlayerAvanzado("Julio", "skdjfhksf", "julio@gamer.tv")

    var gta = Game("GTA",60.0)
    var gta2 = Game("GTA2",70.0)

    gta.setName("GTA PRO") //cambia o nome
    gta.setName("A") // non cambia o nome

    gta.setPrize(80)
    gta.setPrize(-10)



    outro.comprarXogo(gta)
    outro.comprarXogo(gta2)

    println(outro.valorXogos())
    outro.imprimirXogos()

    outro.venderXogo(gta)

    println(outro.valorXogos())
    outro.imprimirXogos()
}