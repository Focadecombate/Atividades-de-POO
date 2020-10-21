package listaPoo.Java.balaio;

public class Assinante {
    private final String cpf;
    private final String nome;
    private final String endereco;
    private final String telefone;

    public Assinante(String cpf, String nome, String endereco, String telefone) {

        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        if (telefone.length() == 9) {
            this.telefone = "71" + telefone;
        } else {
            this.telefone = telefone;
        }

    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
