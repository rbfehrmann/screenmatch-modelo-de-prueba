package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Película extends Título implements Clasificacion {
    private String director;


    public Película(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);}

    @Override
    public String toString() {
        return "Película: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";

    }
}
