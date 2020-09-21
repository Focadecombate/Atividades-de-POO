package listaPoo.kotlin.animais

object Main {
	@JvmStatic
	fun main(args : Array<String>) {
		val onca = Animais("mamifero","Onça Pintada",2);
		println(onca.calcConsumo());
	}
}