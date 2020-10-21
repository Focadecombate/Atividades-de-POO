package listaPoo.Java.professor;

/*a. "Departamento de Ciência da Computação"
        b. "Departamento de Matemática"
        c. "Departamento de Física"
        d. "Departamento de Música"*/

public enum CursosEnum {
    DCC("Ciência da Computação",1),
    DMAT("Matemática",2),
    DFIS("Física",3),
    DMUS("Música",4);

    private final String nome;
    private final int valor;

    CursosEnum(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
