package listaPoo.kotlin.printer

object Main {
    @JvmStatic
    fun main(args : Array<String>) {
        val epson = Printer("Epson", "Inkjet", "Ink", 200, 2)
        epson.calcTempo(2)
        val template = """
            Fabricante: ${epson.maker}
            Modelo: ${epson.model} 
            Tecnologia: ${epson.technology}
            Capacidade Atual: ${epson.capacity}
            Velocidade de Impressão:${epson.printVelocity}
            """.trimIndent()

        println(template)
        epson.print("String")
    }
}