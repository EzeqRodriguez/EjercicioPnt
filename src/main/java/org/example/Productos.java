package org.example;

public class Productos implements Comparable<Productos>{
    private String nombre;
    private int precio;


    public Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Productos producto) {
        return Integer.compare(this.precio, producto.precio);
    }
}