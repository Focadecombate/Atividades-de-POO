/* 3) Defina uma classe Professor com os dados: nome do professor, nome do departamento, data de
admissão, número de registro. Inclua na classe um construtor para setar os dados e um método para
exibir o conteúdo. Suponha que, caso o usuário não informe a data de admissão do professor, a
mesma será “01/01/2009”.
4) Ainda utilizando a classe Professor, da questão acima, sabendo-se que os departamentos
existentes são:
a. "Departamento de Ciência da Computação"
b. "Departamento de Matemática"
c. "Departamento de Física"
d. "Departamento de Música"
Crie o método setDepartamento que poderá receber como parâmetro uma string ou um inteiro. Caso
seja uma string, esta função atribuirá esta string ao nome do departamento, caso seja um inteiro,
esta função atribuirá o departamento correspondente a este inteiro. Por exemplo, caso o passe como
parâmetro da função o inteiro 3 então a função deverá atribuir “Departamento de Física” ao nome
do departamento.
Observação: Para manipular a informação departamento utilize ENUM do JAVA */

package listaPoo.Java.professor;

public class Professor {

    private final String nomeProf;
    private final String dataDeAdmissao;
    private final String numeroDeRegistro;
    private String nomeDepartamento;

    public Professor(String nomeProf, String nomeDepartamento, String dataDeAdmissao, String numeroDeRegistro) {
        this.nomeProf = nomeProf;
        this.nomeDepartamento = nomeDepartamento;
        this.dataDeAdmissao = dataDeAdmissao;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public Professor(String nomeProf, String nomeDepartamento, String numeroDeRegistro) {
        this.nomeProf = nomeProf;
        this.nomeDepartamento = nomeDepartamento;
        this.dataDeAdmissao = "01/01/2009";
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(int opcao) {
        if (opcao == 1) {
            this.nomeDepartamento = CursosEnum.DCC.toString();
            return;
        } else if (opcao == 2) {
            this.nomeDepartamento = CursosEnum.DMAT.toString();
            return;
        }
        if (opcao == 3) {
            this.nomeDepartamento = CursosEnum.DFIS.toString();
            return;
        }
        this.nomeDepartamento = CursosEnum.DMUS.toString();
    }

    public void setNomeDepartamento(String Sigla) {
        if (Sigla.toUpperCase().equals(CursosEnum.DCC.name())) {
            this.nomeDepartamento = CursosEnum.DCC.toString();
            return;
        } else if (Sigla.toUpperCase().equals(CursosEnum.DMAT.name())){
            this.nomeDepartamento = CursosEnum.DMAT.toString();
            return;
        }
        else if (Sigla.toUpperCase().equals(CursosEnum.DFIS.name())) {
            this.nomeDepartamento = CursosEnum.DFIS.toString();
            return;
        }
        else if (Sigla.toUpperCase().equals(CursosEnum.DMUS.name())) {
            this.nomeDepartamento = CursosEnum.DMUS.toString();
            return;
        }
        this.nomeDepartamento = Sigla.substring(0,3);
    }

    public void printDados() {
        System.out.println(this.nomeProf + "\n" + this.nomeDepartamento + "\n" + this.dataDeAdmissao + "\n" + this.numeroDeRegistro + "\n");
    }
}
