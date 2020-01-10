package com.sergio.appServicioConcesionaria;

/**
 * 
 * @author Sergio
 *
 */


public class Main
{
    public static void main(String[] args)
    {
        Servicio servicio = new ServicioImp();
        servicio.cargarLista();
        servicio.mostrarVehiculos();
        System.out.println("==============================");
        servicio.mostrarMasCaro();
        servicio.mostrarMasBarato();
        servicio.mostrarVehiculoQueContieneLaLetra('Y');
        System.out.println("==============================");
        servicio.mostrarOrdenadoPrecioDesc();


    }
}