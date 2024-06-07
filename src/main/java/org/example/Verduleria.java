package org.example;

public class Verduleria extends Productos {

    private String unidad;

    public Verduleria(String nombre, int precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// " +
                "Precio: $" + getPrecio() + " /// " +
                "Unidad de venta: " + unidad;
    }
}