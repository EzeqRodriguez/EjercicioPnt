package org.example;

public class Cosmetica extends Productos {

    private int contenido;


    public Cosmetica(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// " +
                "Contenido: " + contenido + "ml /// " +
                "Precio: $" + getPrecio();
    }
}