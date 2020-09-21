package listaPoo.Java.jogadorFutebol;

public class Main {
    public static void main(String[] args) {
        JogadorFutebol Ronaldinho = new JogadorFutebol("Ronaldinho","Atacante",1980,"Brasileiro",1.81,80);
        Ronaldinho.calcTempoRestante(2020);
        Ronaldinho.dadosJogador();
        System.out.println(Ronaldinho.idadeJogador(2020));
    }
}
