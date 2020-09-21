package listaPoo.kotlin.aluno

/*5. Criar o modelo e implementar em Java uma classe Aluno. A classe possui os atributos
nome, ano de ingresso, curso e quantidade de disciplinas aprovadas. Esta classe deve
possuir os seguintes métodos:
a) Método para calcular o número de créditos do aluno, sabendo-se que cada disciplina
aprovada representa 4 créditos;
b) Método para calcular o tempo (em anos) de permanência do aluno na faculdade.
*/

class Aluno (private val nome:String,private val anoIngresso:Int,private val cursos:String,private val quantidadeAprovacao:Int){
	fun calcCreditos():Int{
		return (this.quantidadeAprovacao * 4);
	}
	fun calcTempo(anoAtual:Int):Int{
		return anoAtual - anoIngresso;
	}
}