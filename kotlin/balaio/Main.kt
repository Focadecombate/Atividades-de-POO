package listaPoo.kotlin.balaio

object Main {
    @JvmStatic
    fun main(args : Array<String>) {
        val a = Livro("Um livro", "Eu", 100)
        val b = Livro("Outro livro", "Eu", 90)
        val c = Livro("Um livro", "Eu", 100)
        val d = Livro("Outro livro", "Eu", 90)
        val sarteLivro = arrayOf(b, a)
        val salesianoLivro = arrayOf(c, d)
        val sarte = Grupo("Grupo do Sartre", "www.livros.com", sarteLivro)
        val salesiano = Grupo("Grupo do Salesiano", "www.livros2.com", salesianoLivro)
        val grupos = arrayOf(sarte, salesiano)
        val balaio = BalaioLivro(grupos, "Segue as Regras")
        balaio.getGrupos()
        balaio.printLivros(0)
    }
}