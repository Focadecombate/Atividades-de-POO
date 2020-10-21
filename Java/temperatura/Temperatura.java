package listaPoo.Java.temperatura;

/*Construa uma classe em Java capaz de armazenar e gerenciar em um vetor os registros de temperatura de uma determinada localidade.
 Crie dois construtores:
 primeiro, um construtor para receber um vetor já criado com os valores das temperaturas já inseridos;
 segundo, um construtor para receber o tamanho de um vetor a ser criado.
 A classe deverá possuir métodos para:
    a. adicionar nova temperatura, caso haja espaço no vetor;
    b. remover temperatura, caso a temperatura a ser removida esteja no vetor;
    c. obter a temperatura máxima;
    d. obter a temperatura mínima;
    e. obter a amplitude térmica;
    f. obter a média das temperaturas;
    g. ordenar o vetor crescentemente;
    Obs.: Considere que seja possível ter mais de uma temperatura igual no vetor.
    No momento de remoção, escolha retirar a primeira ocorrência da temperatura a ser deletada, caso tenha mais de uma.
    */

import java.util.Arrays;

public class Temperatura {
    int[] temperaturas;

    public Temperatura(int[] temperaturas) {
        this.temperaturas = temperaturas;
    }

    public Temperatura(int tamanho) {
        this.temperaturas = new int[tamanho];
    }

    public void addTemperatura(int temperatura){
        int[] auxiliar = new int[this.temperaturas.length+1];
        System.arraycopy(this.temperaturas, 0, auxiliar, 0, this.temperaturas.length);
        auxiliar[this.temperaturas.length+1] = temperatura;
        this.temperaturas = auxiliar;
    }

    public void removeTemperatura(){
        int[] auxiliar = new int[this.temperaturas.length-1];
        for (int i = 0; i < auxiliar.length; i++) {
            auxiliar[i] = this.temperaturas[i];
        }
        this.temperaturas = auxiliar;
    }

    public void removeTemperatura(int removida){
        int[] auxiliar = new int[this.temperaturas.length];
        for (int i = 0; i < this.temperaturas.length; i++) {
            if (this.temperaturas[i] != removida){
                auxiliar[i] = this.temperaturas[i];
            }
        }
        this.temperaturas = auxiliar;
    }

    public int maxTemperatura() throws Exception {
        if (temperaturas.length <1){
            throw new Exception("Não tem temperaturas cadastradas");
        }
        int Auxiliar = temperaturas[0];
        for (int i = 1; i < temperaturas.length;i++){
            if (temperaturas[i]>temperaturas[i--]){
                Auxiliar = temperaturas[i];
            }
        }
        return Auxiliar;
    }

    public int minTemperatura() throws Exception {
        if (temperaturas.length <1){
            throw new Exception("Não tem temperaturas cadastradas");
        }
        int Auxiliar = temperaturas[0];
        for (int i = 1; i < temperaturas.length;i++){
            if (temperaturas[i]<temperaturas[i--]){
                Auxiliar = temperaturas[i];
            }
        }
        return Auxiliar;
    }

    public int mediaTemperatura() throws Exception {
        if (temperaturas.length <1){
            throw new Exception("Não tem temperaturas cadastradas");
        }
        int Auxiliar = temperaturas[0];
        for (int i = 1; i < temperaturas.length;i++){
            Auxiliar += temperaturas[i];
        }
        return Auxiliar/temperaturas.length;
    }

    public int amplitude() throws Exception {
        if (temperaturas.length <1){
            throw new Exception("Não tem temperaturas cadastradas");
        }
        int Menor = this.minTemperatura();
        int Maior = this.maxTemperatura();
        return Maior - Menor;
    }

    public void ordenarVetor() throws Exception {
        Arrays.sort(this.temperaturas);
    }
}
