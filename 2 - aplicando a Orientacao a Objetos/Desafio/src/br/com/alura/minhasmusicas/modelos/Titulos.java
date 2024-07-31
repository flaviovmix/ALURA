package br.com.alura.minhasmusicas.modelos;

public class Titulos {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    private int totalReproducao;
    private int totalCurtidas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("--------------------------------");
        System.out.println("FIXA TÉCNICA");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Total de reprodução: " + totalReproducao);
        System.out.println("--------------------------------");
    }

    public void play() {
        System.out.println(nome + " está tocando");
        totalReproducao++;
    }

    public void pause() {
        System.out.println(nome + " está pausada");
    }

    public void stop() {
        System.out.println(nome + " está parada");
    }

}