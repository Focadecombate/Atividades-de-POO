package listaPoo.kotlin.aluno

object Main {
	@JvmStatic
	fun main(args : Array<String>) {
		val gustavo = Aluno("Gustavo",2019,"Sistema de Informação",8);
		println(gustavo.calcTempo(2020))
	}
}