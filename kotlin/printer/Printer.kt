package listaPoo.kotlin.printer

// Descrição:
//
// Criar uma classe em Java que representa uma impressora. Deve-se guardar para esta,
// o fabricante, modelo, capacidade de impressão (em número de páginas), tecnologia
// (jato tinta ou laser, ou matricial) e velocidade (páginas por segundo).
// A classe deve atender aos seguintes itens:
//      a) Método para informar o tempo necessário para imprimir um texto a partir do número de páginas;
//      b) Método para receber um texto e imprimir (para este método considere a impressão na
//         tela do texto recebido como se fosse na impressora);
//      c) Método para informar a quantidade de páginas que ainda podem ser impressas com a
//         carga atual.

class Printer(val maker : String, val model : String, val technology : String, var capacity : Int, val printVelocity : Int) {
    fun calcTempo(numPages : Int) {
        val tempo = numPages / printVelocity
        println("$tempo Pagina(s) por Segundo")
    }

    fun print(Content : String) {
        capacity -= Content.length
        println(Content)
    }
}