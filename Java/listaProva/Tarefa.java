package listaPoo.Java.listaProva;

/*Cada tarefa pertence apenas a um projeto e é caracterizada
        pela sua descrição, numero de horas gastas, desenvolvedor que a executou e o status (iniciada,
        delegada, finalizada). Uma tarefa deve ser iniciada sempre com uma descrição e o status
        “iniciada”. O nome do executante é opcional neste momento. Se o nome do executante é
        disponibilizado, a tarefa já é instanciada com o status delegada. Um projeto pode ser
        inicializado com uma ou nenhuma tarefa.*/

public class Tarefa {
    String descricao;
    int horasGastas;
    String status;
    String nomeExecutante;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = "iniciada";
    }

    public Tarefa(String descricao, int horasGastas, String nomeExecutante) {
        this.descricao = descricao;
        this.horasGastas = horasGastas;
        this.nomeExecutante = nomeExecutante;
        this.status = "delegada";
    }

    public Tarefa(String descricao, int horasGastas) {
        this.descricao = descricao;
        this.horasGastas = horasGastas;
        this.status = "iniciada";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(int horasGastas) {
        this.horasGastas = horasGastas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
