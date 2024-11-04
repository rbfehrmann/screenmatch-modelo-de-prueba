package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Película;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Película miPelicula = new Película("Terrifier", 2016);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println("***********************************************************************");

        Serie juegotronos = new Serie("Juego de tronos", 2011);
        juegotronos.muestraFichaTecnica();
        juegotronos.setTemporadas(8);
        juegotronos.setMinutosPorEpisodio(50);
        juegotronos.setEpisodiosPorTemporada(10);
        System.out.println("Duración de la serie: " + juegotronos.getDuracionEnMinutos());

        Película otraPelicula = new Película("Dune", 2021);
        otraPelicula.setDuracionEnMinutos(155);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(juegotronos);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus favoritos durante vacaciones "
                + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Pilot");
        episodio.setSerie(juegotronos);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeRocio = new Película("Footloose", 1984);
        peliculaDeRocio.setDuracionEnMinutos(107);

        ArrayList<Película> listaDePelículas = new ArrayList<>();
        listaDePelículas.add(peliculaDeRocio);
        listaDePelículas.add(miPelicula);
        listaDePelículas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePelículas.size());
        System.out.println("La primera película es: " + listaDePelículas.get(0).getNombre());

        System.out.println(listaDePelículas);

        System.out.println("toString de la película: " + listaDePelículas.get(0).toString());












    }

    }

