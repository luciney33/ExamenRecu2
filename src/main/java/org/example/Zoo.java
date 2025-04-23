package org.example;

public class Zoo extends CentroOcio{
    private boolean haydelfinaro;
    private boolean haypinguinos;

    public Zoo(int id, String nombre, double precio, String provincia, Fecha fecha, boolean haydelfinaro, boolean haypinguinos) {
        super(id, nombre, precio, provincia, fecha);
        this.haydelfinaro = haydelfinaro;
        this.haypinguinos = haypinguinos;
    }

    @Override
    public double calcularPrecioR(int edad, boolean esFestivo) {
        return 0;
    }

}
