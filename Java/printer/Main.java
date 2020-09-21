package listaPoo.Java.printer;

public class Main {

    public static void main(String[] args) {
        Printer Epson = new Printer("Epson","Inkjet","Ink",200,2);
        Epson.CalcTempo(2);
        String Template = "Fabricante: %s \nModelo: %s \nTecnologia: %s \nCapacidade Atual:%s \nVelocidade de " +
                "Impressão:%s\n";
        String Formatted = String.format(Template, Epson.getMaker(), Epson.getModel(), Epson.getTechnology(),
                Epson.getCapacity(), Epson.getPrintVelocity());
        System.out.println(Formatted);
        Epson.Print("String");
    }
}