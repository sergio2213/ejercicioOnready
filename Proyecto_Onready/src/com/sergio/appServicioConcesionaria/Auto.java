package com.sergio.appServicioConcesionaria;

public class Auto extends Vehiculo
{
    private int cantPuertas;

    public Auto(String marca, String modelo, double precio, int cantPuertas)
    {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas()
    {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas)
    {
        this.cantPuertas = cantPuertas;
    }
}