package listaPoo.kotlin.retangulo

object Main {
	@JvmStatic
	fun main(args : Array<String>) {
		val a = Retangulo(10,20)
		println("Área: ${a.area()} \nPerimetro: ${a.perimetro()}")
	}
}