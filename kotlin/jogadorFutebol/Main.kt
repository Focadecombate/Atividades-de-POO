package listaPoo.kotlin.jogadorFutebol

object Main {
    @JvmStatic
    fun main(args : Array<String>) {
        val ronaldinho = JogadorFutebol("Ronaldinho", "Atacante", 1980, "Brasileiro", 1.81, 80.0)
        ronaldinho.calcTempoRestante(2020)
        ronaldinho.dadosJogador()
        println(ronaldinho.idadeJogador(2020))
    }
}