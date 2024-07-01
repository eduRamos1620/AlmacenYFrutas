package com.ramos.almacenyverduleria;

public class NoPercibe extends  Producto{
    private int contenido;
    private int calorias;

    public NoPercibe(String nombre, double precio, int contenido, int calorias){
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
