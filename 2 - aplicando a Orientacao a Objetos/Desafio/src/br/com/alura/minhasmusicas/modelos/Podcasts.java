package br.com.alura.minhasmusicas.modelos;

public class Podcasts extends Titulos{
    private int numeroEpsisodio;

    public int getNumeroEpsisodio() {
        return numeroEpsisodio;
    }

    public void setNumeroEpsisodio(int numeroEpsisodio) {
        this.numeroEpsisodio = numeroEpsisodio;
    }

    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println(getNumeroEpsisodio());
    }
}
