/*Uma empresa qualquer deseja gerenciar seus funcionários, com base nessas informações crie
        uma classe Funcionário com os seguintes atributos:
        ● nome
        ● endereço
        ● telefone
        ● salário
        ● data de admissão (MM/ANO, ex 03/2020, pode ser String).
        ● data de demissão (MM/ANO, ex 03/2020, pode ser String)
        Funcionários podem ser admitidos e instânciados na aplicação da empresa. Quando um
        funcionário é admitido é possível informar todos os dados exceto a data de demissão.
        Existem três situações que devem ser tratadas:
        I. Se não for informado o salário considerar o salário mínimo nacional;
        II. Se não for informada a data de admissão considerar o dia de hoje (Na string coloque
        “dia de hoje”);
        III. Podem não ser informadas a data de admissão e o salário.
        A classe funcionário também deve ter os seguintes métodos:
        ● void demitirFuncionario(string dataDemissao) - Nesse método poderá ser informada
        a data da demissão e se não foi informada, considerar o dia de hoje.
        ● void promoverFuncionario(int percentualPromocao) - O método para promover o
        funcionário recebe um percentual de promoção do tipo inteiro esse percentual deve ser
        acrescido ao salário atual do funcionário. Caso este percentual não seja informado
        considere 3%.*/


package listaPoo.Java.funcionario;

public class Funcionario {
    private String nome;
    private String endereco;
    private String telefone;
    private double salario;
    private String dataDeAdmissao;
    private String dataDeDemissao;

    public Funcionario(
            String nome, String endereco, String telefone, int salario, String dataDeAdmissao
                      ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public Funcionario(
            String nome, String endereco, String telefone, String dataDeAdmissao
                      ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = 1045;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public Funcionario(
            String nome, String endereco, String telefone, int salario
                      ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.dataDeAdmissao = "dia de hoje";
    }

    public Funcionario(
            String nome, String endereco, String telefone
                      ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = 1045;
        this.dataDeAdmissao = "dia de hoje";
    }

    public void demitirFuncionario(String dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public void demitirFuncionario() {
        this.dataDeDemissao = "dia de hoje";
    }

    public void promoverFuncionario(double percentualPromocao) {
        this.salario = this.salario * percentualPromocao;
    }

    public void promoverFuncionario() {
        this.salario = this.salario * 0.03;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getDataDeDemissao() {
        return dataDeDemissao;
    }
}
