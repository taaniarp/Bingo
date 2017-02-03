package com.company;

public class Jugador{

    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
