package listaPoo.jogadorFutebol

// 1)
// Criar uma classe para representar um Jogador de Futebol, com os atributos nome,
// posição, ano de nascimento, nacionalidade, altura e peso.
// A classe deve atender aos seguintes comportamentos:
//         a) Retornar todos os dados do jogador em uma string;
//         b) Calcular a idade do jogador;
//         c) Mostrar quanto tempo falta para o jogador se aposentar.
//         Para isso, considere que os jogadores da posição de defesa se aposentam em média aos
//         40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
class JogadorFutebol(
        private val nome : String,
        private val posicao : String,
        private val anoNascimento : Int,
        private val nacionalidade : String,
        private val altura : Double,
        private val peso : Double
) {
    fun dadosJogador() {
        println("""
    $nome
    $posicao
    $nacionalidade
    $altura
    $peso
    $anoNascimento
    """.trimIndent())
    }

    fun idadeJogador(anoAtual : Int) : Int {
        return anoAtual - anoNascimento
    }

    private fun tempoRestante(anoAtual : Int) : Int {
        if (posicao.toLowerCase() == "defesa") {
            return 40 - idadeJogador(anoAtual)
        } else if (posicao.toLowerCase() == "meio-campo") {
            return 38 - idadeJogador(anoAtual)
        }
        return 35 - idadeJogador(anoAtual)
    }

    fun calcTempoRestante(anoAtual : Int) {
        val tempo : Int = tempoRestante(anoAtual)
        if (tempo < 0) {
            println("Aposentado")
            return
        }
        println("$tempo Anos para se aposentar")
    }
}