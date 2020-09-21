package listaPoo.kotlin.automovel

/*
Criar uma classe em Java que represente um automóvel. É importante guardar o tipo
de combustível que ele utiliza (podendo ser gasolina, álcool, ou flex), o fabricante, o ano
e o modelo. Será necessário calcular a quantidade de combustível necessária para
percorrer determinado percurso sabendo-se que: automóvel a álcool faz 15 km/l e
automóvel a gasolina faz 12 km/l. Para aqueles com tipo de combustível flex considerar
metade do caminho como gasolina e a outra metade como álcool.
*/


class Automovel(private var tipoCombustivel : String, var fabricante : String, var ano : Int, var modelo : String) {
    fun percurso(distancia : Int) : Double {
        if (this.tipoCombustivel == "alcool") return (distancia / 15.0);
        else if (this.tipoCombustivel == "gasolina") return (distancia / 12.0);
        return (distancia / 13.5);
    }
}