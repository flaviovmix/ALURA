package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //filme criado com o construtor vazio
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());
        System.out.println("---");

        //filme criado com o construtor completo
        Filme outroFilme = new Filme("Avatar",2003,"Paulo Andrade");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        Serie lost = new Serie("Lost",2000,5);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Serie dragomBall = new Serie("Dragom Ball",1987,12);
        dragomBall.exibeFichaTecnica();
        dragomBall.setTemporadas(10);
        dragomBall.setEpisodiosPorTemporada(10);
        dragomBall.setMinutosPorEpisodio(50);


        Serie Suits = new Serie();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme();
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista é " + listaDeFilmes.size());

        System.out.println("---");

        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println( i+1 + "º filme: " + listaDeFilmes.get(i).getNome());
        }

        System.out.println("---");

        ArrayList<Serie> listaDeSerie = new ArrayList<>();
        listaDeSerie.add(lost);
        listaDeSerie.add(dragomBall);

        for (int i = 0; i < listaDeSerie.size(); i++) {
            System.out.println( i+1 + "º série: " + listaDeSerie.get(i).getNome());
        }
        System.out.println("---");

        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println(listaDeSerie.get(0).toString());
        System.out.println("---");
    }
}
