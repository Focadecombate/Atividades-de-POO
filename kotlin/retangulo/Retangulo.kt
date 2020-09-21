package listaPoo.kotlin.retangulo

import java.lang.Exception

/*
Criar o modelo e implementar em Java uma classe Retângulo. A classe possui os
atributos comprimento e largura. Esta classe deve possuir métodos que calculam o
perímetro e a área do retângulo. A criação da classe deve garantir que comprimento e
largura assumam valores maiores do que 0.
*/

class Retangulo(comprimento : Int, largura : Int) {
	private var comprimento:Int = 0;
	private var largura:Int = 0

	init {
		if (comprimento>0 && largura>0){
			this.comprimento = comprimento;
			this.largura = largura
		}
		else{
			throw Exception("O Comprimento e A Largura precisam ser maiores do que 0!")
		}
	}

	fun perimetro():Int{
		return this.comprimento*2 + this.largura*2;
	}

	fun area():Int{
		return this.comprimento*this.largura;
	}
}