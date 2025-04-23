package org.example;

public class ParqueAtracciones extends CentroOcio{
    private int edadMin;

    public ParqueAtracciones(int id, String nombre, double precio, String provincia, Fecha fecha, int edadMin) {
        super(id, nombre, precio, provincia, fecha);
        this.edadMin = edadMin;
    }

    @Override
    public double calcularPrecioR(int edad, boolean esFestivo) {
        double precioR = getPrecio();
        boolean esGratis = false;
        if (edad >= 65){
            esGratis = true;
            precioR = 0;
        }else if (esFestivo){
            precioR = getPrecio() * 1.40;
        }else {
            System.out.println("El precio de la entrada se queda igual");
        }
        return precioR;
    }
}
