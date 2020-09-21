package listaPoo.kotlin.animais

class Animais (private val tipo:String , private val nome:String,private val idade:Int) {
	fun calcConsumo() : Int {
		if (tipo.toLowerCase()==="mamifero") return 2000;
		else if(tipo.toLowerCase()==="ave") return 100;
		return 20;
	}
}