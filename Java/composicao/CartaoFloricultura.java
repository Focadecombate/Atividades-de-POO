package listaPoo.Java.composicao;

/*Uma floricultura deseja incrementar o seu negócio e está oferecendo um serviço
        de cartão de mensagem declamadas. Um cartão de mensagem possui um
        destinatário, o nome do emissário, um texto da mensagem a ser declamada,
        horário de entrega (ex:1820, dezoito horas e vinte minutos) o custo da mensagem.
        Um destinatário possui um nome e um endereço.
        Quando um cliente ele compra flores é oferecido a ele o cartão. Neste momento
        ele fornece o nome do destinatário, o endereço deste e o horário. Caso não seja
        fornecido o horário é colocado 0000 para depois ser atualizado.
        Faça um programa em java para criar esta pequena aplicação que cria o cartão de
        mensagem e mostra todos os dados do cartão*/

public class CartaoFloricultura {
    Destinatario destinatario;
    Emissario emissario;
    String textoMensagem;
    String horaEntrega;
    Number custoEntrega;

    public CartaoFloricultura(String nomeDestinatario, String nomeEmissario, String textoMensagem, String horaEntrega
            , String endereco) {
        this.destinatario = new Destinatario(nomeDestinatario,endereco);
        this.emissario = new Emissario(nomeEmissario);
        this.textoMensagem = textoMensagem;
        this.horaEntrega = horaEntrega;
    }

    public CartaoFloricultura(String nomeEmissario, String nomeDestinatario, String textoMensagem, String endereco) {
        this.emissario = new Emissario(nomeEmissario);
        this.destinatario = new Destinatario(nomeDestinatario,endereco);
        this.textoMensagem = textoMensagem;
        this.horaEntrega = "0000";
    }

    public void setCustoEntrega(Number custoEntrega) {
        this.custoEntrega = custoEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public void printCartao(){
        System.out.println(this.emissario.getNomeEmissario() + "\n" + this.destinatario.getDestinatario() + "\n" + this.destinatario.getEndereco() + "\n" + this.horaEntrega + "\n" + this.textoMensagem + "\n" + this.custoEntrega);
    }
}
