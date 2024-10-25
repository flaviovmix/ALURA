package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avatar",2003,"Paulo Andrade");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("O Poderoso Chefão",1985,"Andrade Luna");
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville",2012,"Paulo Silveira");
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000,5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println( i+1 + "º da lista: " + lista.get(i).getNome());
        }

        System.out.println("-----------");

        for(Titulo item: lista) {
            System.out.println(item);
        }
        System.out.println("-----------");

        for(Titulo item: lista) {
            System.out.print(item.getNome());
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println(" - Classificação: " + filme.getClassificacao());
            }
        }
        System.out.println("-----------");

//        for(Titulo item: lista) {
//            System.out.print(item.getNome());
//            if (item instanceof Filme filme && filme.getClassificacao > 2) {
//                System.out.println("Classificação" + filme.getClassificacao());
//            }
//        }
//        System.out.println("-----------");

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Facqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("-----------");
        for(Titulo item: lista) {
            System.out.print("[ " + item.getNome() + " ]");
        }
        System.out.println("");
        System.out.println("-----------");
        Collections.sort(lista);
        for(Titulo item: lista) {
            System.out.print("[ " + item.getNome() + " ]");
        }

        System.out.println("");
        System.out.println("-----------");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        for(Titulo item: lista) {
            System.out.print("[ " + item.getNome() + " ]");
        }

    }
}
