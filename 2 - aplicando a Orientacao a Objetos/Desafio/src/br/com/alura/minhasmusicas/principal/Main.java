package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musicas numb = new Musicas();
        numb.setNome("Numb");
        numb.setAnoDeLancamento(2000);
        numb.setDuracaoEmMinutos(320);
        numb.exibeFichaTecnica();
        numb.play();

        Podcasts Nerdcast = new Podcasts();
        Nerdcast.setNome("Nerdcast");
        Nerdcast.setAnoDeLancamento(1988);
        Nerdcast.setDuracaoEmMinutos(9000);
        Nerdcast.setNumeroEpsisodio(845);
        Nerdcast.exibeFichaTecnica();

        numb.stop();
        Nerdcast.play();

    }
}
