package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os prefiridos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avalizado no momento");
        } else {
            System.out.println("Colqoue na sua lista para assitir depois");
        }
    }

}