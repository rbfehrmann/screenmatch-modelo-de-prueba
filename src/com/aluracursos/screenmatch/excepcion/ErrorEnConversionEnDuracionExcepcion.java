package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionEnDuracionExcepcion extends RuntimeException {

    private String mensaje;


    public ErrorEnConversionEnDuracionExcepcion(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
