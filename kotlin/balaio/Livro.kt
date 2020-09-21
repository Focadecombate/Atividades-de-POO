package listaPoo.kotlin.balaio

class Livro(var nome : String, var vendedor : String, var preco : Int) {
    var vendido = false
        private set

    fun setVendido() {
        vendido = true
    }

}