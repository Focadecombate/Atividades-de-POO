package listaPoo.Java.listaProva;

/*  OBSERVAÇÕES
        Use apenas os conceitos ministrados até o momento.
        Será analisado o uso correto do paradigma e do estilo de programação JAVA.
        ENUNCIADO
        Uma empresa de desenvolvimento de software deseja automatizar o acompanhamento e a
        cobrança dos seus projetos. Os projetos de desenvolvimento possuem um nome, um nome do
        cliente, um conjunto de tarefas e valor de hora de trabalho. Quando número máximo de tarefas
        não for informado, assumir 100.
        Questão I: Considere o cenário abaixo e forneça a definição em Java para as classes de
        negócio do problema, apenas as classes, atributos e construtores: (4.0)
*/

/*
* Os projetos de desenvolvimento possuem um nome, um nome do
*  cliente, um conjunto de tarefas e valor de hora de trabalho.
* */

/*
* 1.Método(s) para adicionar uma tarefa a um projeto. As entradas fornecidas são os dados
        da tarefa e deve retornar true ao adicionar (1,0).
        2.Método(s) para modificar o status de uma tarefa finalizada, neste momento é indicado o
        número de horas trabalhadas e a descrição da tarefa. Esse(s) método(s) deve(m)
        retornar true ao modificar.(1,0).
        3.Método(s) para verificar se um projeto está finalizado. Um projeto está finalizado quando
        todas as suas tarefas possuem o status “finalizada”. Os retornos possíveis são os valores
        false ou true(1,0).
        4.Método(s) para mostrar o valor do projeto ao cliente. É passado inicialmente o nome do
        projeto. Posteriormente, é verificado se o status deste é finalizado. Caso não seja, deve
        ser retornada a mensagem para o usuário “Projeto não finalizado”. Caso o projeto esteja
        finalizado deverá ser exibida a mensagem “ Projeto X, Cliente Y, Valor R$ 99999,99).
        O valor corresponde ao total de horas trabalhadas multiplicada pelo valor de hora de
        trabalho do projeto. O retorno deve ser uma string com o mesmo conteúdo da
        mensagem exibida. (1,0)
* */

public class Projeto {
    String nome;
    String nomeCliente;
    Tarefa[] tarefa;
    int numeroTarefas = 0;
    int horaTrabalho;

    public Projeto(String nome, String nomeCliente, int horaTrabalho,String descricao,
                   int quantidadeTarefa) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.tarefa = new Tarefa[quantidadeTarefa];
        this.tarefa[this.numeroTarefas]= new Tarefa(descricao);
        this.numeroTarefas++;
        this.horaTrabalho = horaTrabalho;
    }

    public Projeto(String nome, String nomeCliente, int horaTrabalho,String descricao) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.tarefa = new Tarefa[100];
        this.tarefa[this.numeroTarefas]= new Tarefa(descricao);
        this.numeroTarefas++;
        this.horaTrabalho = horaTrabalho;
    }

    public Projeto(String nome, String nomeCliente, int horaTrabalho) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.tarefa = new Tarefa[100];
        this.horaTrabalho = horaTrabalho;
    }

    public Projeto(String nome, String nomeCliente, int horaTrabalho,
                   int quantidadeTarefa) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.tarefa = new Tarefa[quantidadeTarefa];
        this.horaTrabalho = horaTrabalho;
    }


    public boolean addTarefa(String descricao){
        if (this.numeroTarefas++ > this.tarefa.length){
            return false;
        }
        this.tarefa[this.numeroTarefas++] = new Tarefa(descricao);
        return true;
    }

    public boolean addTarefa(String descricao,int horasGastas){
        if (this.numeroTarefas++ > this.tarefa.length){
            return false;
        }
        this.tarefa[this.numeroTarefas++] = new Tarefa(descricao,horasGastas);
        return true;
    }

    public boolean addTarefa(String descricao,int horasGastas,String nomeExecutor){
        if (this.numeroTarefas++ > this.tarefa.length){
            return false;
        }
        this.tarefa[this.numeroTarefas++] = new Tarefa(descricao,horasGastas,nomeExecutor);
        return true;
    }

    public boolean modificarTarefa(int horasGastas, String descricao){
        for (int i = 0; i<this.numeroTarefas;i++ ){
         if (this.tarefa[i].descricao.equals(descricao)){
             this.tarefa[i].horasGastas = horasGastas;
             return true;
         }
        }
        return false;
    }

    public boolean checarFinalizado(){
        for (int index = 0; index < this.numeroTarefas; index++){
            if (!this.tarefa[index].status.equals("finalizado")){
                return false;
            }
        }
        return true;
    }

    public void valorProjeto(String nomeProjeto){
        if (!nomeProjeto.equals(this.nome)){
            System.out.println( "Projeto errado!");
        }

        if (!this.checarFinalizado()){
            System.out.println( "Projeto não finalizado!");
        }
        int tempoTotal = 0;
        for (int index = 0; index<this.numeroTarefas;index++){
            tempoTotal += this.tarefa[index].horasGastas;
        }
        int valorTotal = tempoTotal * this.horaTrabalho;
        System.out.println("Projeto "+this.nome+" Cliente "+this.nomeCliente+" Valor R$ "+valorTotal );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Tarefa[] getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa[] tarefa) {
        this.tarefa = tarefa;
    }

    public int getHoraTrabalho() {
        return horaTrabalho;
    }

    public void setHoraTrabalho(int horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }
}
