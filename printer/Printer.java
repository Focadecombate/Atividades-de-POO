package listaPoo.printer;

// Descrição:
//
// Criar uma classe em Java que representa uma impressora. Deve-se guardar para esta,
// o fabricante, modelo, capacidade de impressão (em número de páginas), tecnologia
// (jato tinta ou laser, ou matricial) e velocidade (páginas por segundo).
// A classe deve atender aos seguintes itens:
//      a) Método para informar o tempo necessário para imprimir um texto a partir do número de páginas;
//      b) Método para receber um texto e imprimir (para este método considere a impressão na
//         tela do texto recebido como se fosse na impressora);
//      c) Método para informar a quantidade de páginas que ainda podem ser impressas com a
//         carga atual.

import org.jetbrains.annotations.NotNull;

public class Printer {
    private final String maker;
    private final String model;
    private final String technology;
    private int printingCapacity;
    private final int printVelocity;

    public Printer(String maker, String model, String technology, int printingCapacity, int printingVelocity) {
        this.maker = maker;
        this.model = model;
        this.technology = technology;
        this.printingCapacity = printingCapacity;
        this.printVelocity = printingVelocity;
    }

    public void CalcTempo(int numPages) {
        System.out.println(numPages / this.printVelocity + " Pagina(s) por Segundo");
    }

    public void Print(@NotNull String Content) {
        this.printingCapacity = this.printingCapacity - Content.length();
        System.out.println(Content);
    }

    public int getCapacity() {
        return this.printingCapacity;
    }

    public String getTechnology() {
        return this.technology;
    }

    public String getMaker() {
        return this.maker;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrintVelocity() {
        return printVelocity;
    }
}
