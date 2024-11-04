package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Película;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Título;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

//  public void incluido (Filme f) {
//      this.tiempoTotal += f.getDuracionEnMinutos();
//  }
//
//  public void incluido (Serie s) {
//      this.tiempoTotal += s.getDuracionEnMinutos();
//  }


    public void incluye(Título titulo){
        System.out.println("Agregando duración en minutos de " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}