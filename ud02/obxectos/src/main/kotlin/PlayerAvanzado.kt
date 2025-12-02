package com.exemplo.kotlindemo

class PlayerAvanzado() {
    var username: String = ""
    var password: String = ""
    var email: String = ""
    var games: MutableSet<Game> = mutableSetOf()

    constructor(u: String, p: String, e: String): this(){
        this.username = u;
        this.email = e;
        this.password = p;
    }

    fun comprarXogo(xogo: Game) {
        games.add(xogo)
    }

    fun venderXogo(xogo: Game){
        games.remove(xogo)
    }

    fun imprimirXogos() {
        for (xogo in games){
            println(xogo.getNome())
        }
    }

    fun valorXogos(): Double{
        var total: Double = 0.0
        for (game in games){
            total += game.getPrezo()
        }

        return total
    }
}