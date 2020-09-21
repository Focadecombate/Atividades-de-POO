package listaPoo.kotlin.automovel

import kotlin.math.floor

object Main {
    @JvmStatic
    fun main(args : Array<String>) {
        val gol = Automovel ("alcool","Volkswagen",2019,"Gol");
        println("Vai gastar ${floor(gol.percurso(200))}");
    }
}