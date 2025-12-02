package com.exemplo.kotlindemo

class Player() {
    var username: String = ""
    var password: String = ""
    var email: String = ""
    var games: MutableSet<String> = mutableSetOf()

    constructor(u: String, p: String, e: String): this(){
        this.username = u;
        this.email = e;
        this.password = p;
    }

    fun comprarXogo(xogo: String) {
        games.add(xogo)
    }

    fun venderXogo(xogo: String){
        games.remove(xogo)
    }

    fun imprimirXogos() {
        for (x in games){
            println(x)
        }
    }
}