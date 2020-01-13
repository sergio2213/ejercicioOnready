package com.sergio.appServicioConcesionaria;

import java.text.DecimalFormat;
import java.util.*;

public class ServicioImp implements Servicio
{
    private List<Vehiculo> listaVehiculos;


    public ServicioImp()
    {
        this.listaVehiculos = new ArrayList<>();
    }

    @Override
    public void mostrarVehiculos()
    {
        DecimalFormat formato = new DecimalFormat("###,###.00");
        this.listaVehiculos.stream().forEach(x ->
        {
            if(x instanceof Auto)
            {
                System.out.println("Marca: " + x.getMarca() +
                        " // Modelo: " + x.getModelo() +
                        " // Puertas: " + ((Auto) x).getCantPuertas() +
                        " // Precio: $" + formato.format(x.getPrecio()));
            }
            if(x instanceof Moto)
            {
                System.out.println("Marca: " + x.getMarca() +
                        " // Modelo: " + x.getModelo() +
                        " // Cilindrada: " + ((Moto) x).getCilindrada() +
                        "c // Precio: $" + formato.format(x.getPrecio()));
            }
        });
    }

    @Override
    public void mostrarMasCaro()
    {
        Vehiculo vehiculoMasCaro = this.listaVehiculos.get(0);
        for(int i = 1; i < listaVehiculos.size(); i++)
        {
            if(this.listaVehiculos.get(i).getPrecio() > vehiculoMasCaro.getPrecio())
            {
                vehiculoMasCaro = this.listaVehiculos.get(i);
            }
        }
        System.out.println("Vehiculo más caro: " + vehiculoMasCaro.getMarca() +
                " " +
                vehiculoMasCaro.getModelo());
    }

    @Override
    public void mostrarMasBarato()
    {
        Vehiculo vehiculoMasBarato = this.listaVehiculos.get(0);
        for(int i = 1; i < this.listaVehiculos.size(); i++)
        {
            if(this.listaVehiculos.get(i).getPrecio() < vehiculoMasBarato.getPrecio())
            {
                vehiculoMasBarato = this.listaVehiculos.get(i);
            }
        }
        System.out.println("Vehiculo más barato: " + vehiculoMasBarato.getMarca() +
                " " +
                vehiculoMasBarato.getModelo());
    }

    @Override
    public void mostrarVehiculoQueContieneLaLetra(char letra)
    {
        DecimalFormat formato = new DecimalFormat("###,###.00");
        this.listaVehiculos.stream().forEach(x ->
        {
            if(x.getModelo().contains(Character.toString(letra)))
            {
                System.out.println("Vehículo que contiene en el modelo la letra '" +
                        letra + "': " +
                        x.getMarca() + " " +
                        x.getModelo() + " $" +
                        formato.format(x.getPrecio()));
            }
        });
    }

    @Override
    public void mostrarOrdenadoPrecioDesc()
    {
        List<Vehiculo> listaAux = this.listaVehiculos;
        listaAux.sort((x, y) -> (int) (y.getPrecio() - x.getPrecio()));
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        listaAux.forEach(x -> System.out.println(x.getMarca() + " " + x.getModelo()));
    }

    @Override
    public void cargarLista()
    {
        Vehiculo v1 = new Auto("Peogeot", "206", 200000, 4);
        Vehiculo v2 = new Moto("Honda", "Titan", 60000, 125);
        Vehiculo v3 = new Auto("Peugeot", "208", 250000, 5);
        Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50, 160);

        this.listaVehiculos.add(v1);
        this.listaVehiculos.add(v2);
        this.listaVehiculos.add(v3);
        this.listaVehiculos.add(v4);
    }
}