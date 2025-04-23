package org.example;

public class ParqueAtracciones extends CentroOcio{
    private int edadMin;

    public ParqueAtracciones(int id, String nombre, double precio, String provincia, Fecha fecha, int edadMin) {
        super(id, nombre, precio, provincia, fecha);
        this.edadMin = edadMin;
    }

    @Override
    public double calcularPrecioR(int edad, boolean esFestivo) {
        return 0;
    }
}
