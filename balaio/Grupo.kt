package listaPoo.balaio

class Grupo(var nomeGrupo : String, var link : String, var livros : Array<Livro>) {

    fun venda(idLivro : Int) {
        livros[idLivro].setVendido()
    }

}