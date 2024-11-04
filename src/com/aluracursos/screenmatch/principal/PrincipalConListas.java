package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Película;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Título;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Película miPelicula = new Película("Terrifier", 2016);
        miPelicula.evalua(7);
        Película otraPelicula = new Película("Dune", 2021);
        otraPelicula.evalua(9);
        var peliculaDeRocio = new Película("Footloose", 1984);
        peliculaDeRocio.evalua(10);
        Serie juegotronos = new Serie("Juego de tronos", 2011);

        Película p1 = peliculaDeRocio;



        List<Título> Lista = new LinkedList<>();
        Lista.add(miPelicula);
        Lista.add(otraPelicula);
        Lista.add(peliculaDeRocio);
        Lista.add(juegotronos);

        for (Título item : Lista) {
            System.out.println(item.getNombre());
            if (item instanceof Película película && película.getClasificacion() > 2) {
                System.out.println(película.getClasificacion());}
        }

        ArrayList<String> listadeArtistas = new ArrayList<>();
        listadeArtistas.add("David Howard");
        listadeArtistas.add("Timothée Chalamet");
        listadeArtistas.add("Kevin Bacon");

        Collections.sort(listadeArtistas);
        System.out.println("Lista de artistas ordenada:" + listadeArtistas);

        Collections.sort(Lista);
        System.out.println("Lista de títulos ordenados: " + Lista);

        Lista.sort(Comparator.comparing(Título::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " +Lista);
    }

}