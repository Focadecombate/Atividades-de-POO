package listaPoo.Java.balaio;

public class Livro {

    public int isbn;
    public String titulo;
    public String materia;
    public String edicao;
    public int ano = 2019;
    public String anoPublicacao;

    public Livro(
            String titulo,
            int isbn,
            String materia,
            String edicao,
            int ano,
            String anoPublicacao
                ) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.materia = materia;
        this.edicao = edicao;
        this.ano = ano;
        this.anoPublicacao = anoPublicacao;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getMateria() {
        return materia;
    }

    public String getEdicao() {
        return edicao;
    }

    public int getAno() {
        return ano;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

}
