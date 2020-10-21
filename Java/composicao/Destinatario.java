package listaPoo.Java.composicao;

public class Destinatario {
    String destinatario;
    String endereco;

    public Destinatario(String destinatario, String endereco) {
        this.destinatario = destinatario;
        this.endereco = endereco;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
