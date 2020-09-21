package listaPoo.kotlin.balaio

class BalaioLivro(private var grupos: Array<Grupo>, private var Regras: String) {
    fun getGrupos() {
        val template = "Nome: %s \nLink: %s \nQuantidade de Livros: %s\n"
        for (grupo in grupos) {
            val formatado = String.format(template, grupo.nomeGrupo, grupo.link, grupo.livros.size)
            println(formatado)
        }
    }

    fun printLivros(idGrupo: Int) {
        val livros = grupos[idGrupo].livros
        val template = "Nome: %s \nPreço: R$%s \nVendedor: %s \nVendido: %s\n"
        for (livro in livros) {
            val formatado = String.format(template, livro.nome, livro.preco, livro.vendedor,
                    livro.vendido)
            println(formatado)
        }
    }

    fun setGrupos(grupos: Array<Grupo>) {
        this.grupos = grupos
    }

    fun getRegras() : String {
        return this.Regras
    }
}