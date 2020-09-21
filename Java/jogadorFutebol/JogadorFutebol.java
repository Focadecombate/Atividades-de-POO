package listaPoo.Java.jogadorFutebol;

// 1)
// Criar uma classe para representar um Jogador de Futebol, com os atributos nome,
// posição, ano de nascimento, nacionalidade, altura e peso.
// A classe deve atender aos seguintes comportamentos:
//         a) Retornar todos os dados do jogador em uma string;
//         b) Calcular a idade do jogador;
//         c) Mostrar quanto tempo falta para o jogador se aposentar.
//         Para isso, considere que os jogadores da posição de defesa se aposentam em média aos
//         40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.

public class JogadorFutebol {

    private final String nome;
    private final String posicao;
    private final int anoNascimento;
    private final String nacionalidade;
    private final double altura;
    private final double peso;

    public JogadorFutebol(
            String nome,
            String posicao,
            int anoNascimento,
            String nacionalidade,
            double altura,
            double peso
                         ) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public void dadosJogador() {
        System.out.println(this.nome + "\n" + this.posicao + "\n" + this.nacionalidade + "\n" + this.altura + "\n" + this.peso + "\n" + this.anoNascimento);
    }

    public int idadeJogador(int anoAtual) {
        return anoAtual - this.anoNascimento;
    }

    private int tempoRestante(int anoAtual) {
        if (posicao.toLowerCase().equals("defesa")) {
            return 40 - idadeJogador(anoAtual);
        } else if (posicao.toLowerCase().equals("meio-campo")) {
            return 38 - idadeJogador(anoAtual);
        }
        return 35 - idadeJogador(anoAtual);
    }

    public void calcTempoRestante(int anoAtual) {
        int tempo;
        tempo = tempoRestante(anoAtual);
        if (tempo < 0) {
            System.out.println("Aposentado");
            return;
        }
        System.out.println(tempo + " Anos para se aposentar");
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
}
