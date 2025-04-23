package org.example;

public abstract class CentroOcio {
    private int id;
    private String nombre;
    private double precio;
    private String provincia;
    private Fecha fecha;

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CentroOcio(int id, String nombre, double precio, String provincia, Fecha fecha) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.provincia = provincia;
        this.fecha = fecha;
    }

    public abstract double calcularPrecioR(int edad, boolean esFestivo);

}
