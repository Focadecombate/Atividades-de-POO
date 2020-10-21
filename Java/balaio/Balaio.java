package listaPoo.Java.balaio;

import java.text.Format;

public class Balaio {
    private Livro[] Livros;
    private Assinante[] Assinantes;

    public Balaio(Livro[] livros, Assinante[] assinantes) {
        Livros = livros;
        Assinantes = assinantes;
    }

    public Livro[] getLivros() {
        return Livros;
    }

    private void getLivro(int isbn, String titulo) {
        Livro Resultado = null;
        for (Livro livro:Livros) {
            if (isbn > 0){
                if (livro.isbn == isbn) Resultado=livro;
            }
            if (titulo.length()>0){
                if (livro.titulo.equals(titulo)) Resultado=livro;
            }
        }
       
        if (Resultado != null){
        PrintLivro (Resultado);
        }
    }

    public void PrintAssinante(Assinante assinante){
        String template = "Nome: %s \nTelefone: R$%s \nEndereço: %s \nCPF: %s\n";
        String Formatted = String.format(template,assinante.getNome(),assinante.getTelefone(),assinante.getEndereco(),
                assinante.getCpf());
        System.out.println(Formatted);
    }

    private void getAssinante(String telefone, String nome ) {
        Assinante Resultado = null;
        for (Assinante assinante:Assinantes) {
            if (telefone.length() == 11){
                if (assinante.getTelefone().equals(telefone)) Resultado=assinante;
            }else if (telefone.length() == 9){
                if (assinante.getTelefone().equals("71"+telefone)) Resultado=assinante;
            }
            if (nome.length()>0){
                if (assinante.getNome().equals(nome)) Resultado=assinante;
            }
        }

        if (Resultado != null){
            PrintAssinante (Resultado);
        }
    }

    public void PrintLivro(Livro livro){
        String template = "Titulo: %s \nIsbn: R$%s \nMatéria: %s \nEdição: %s\nAno: %s\nAno de Publicação: %s\n";
        String Formatted = String.format(template,livro.titulo,livro.isbn,livro.materia,livro.edicao,livro.ano,
                livro.anoPublicacao);
        System.out.println(Formatted);
    }


    public void setLivros(Livro[] livros) {
        Livros = livros;
    }

    public Assinante[] getAssinantes() {
        return Assinantes;
    }

    public void setAssinantes(Assinante[] assinantes) {
        Assinantes = assinantes;
    }
}
