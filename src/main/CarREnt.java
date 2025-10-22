package main;

import clases.*;

/**
 *
 * @author alanayca
 */
public class CarREnt {

    public static void main(String[] args) {
        // Instanciando clientes
        Cliente cliente1 = new Cliente("12984892-1", "Elvis Tek");
        Cliente cliente2 = new Cliente("23482923-4", "Armando Casas");
        
        // Instanciando vehiculos
        Vehiculo vehiculo1 = new Vehiculo("KL1OEU", "Porshe", "911", 2025);
        Vehiculo vehiculo2 = new Vehiculo("204EJ5", "BMW", "M5", 2005);
        
        //Bienvenida
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("BIENVENIDO AL SISTEMA DE ARRIENDO DE CarREnt");
        System.out.println("");
        System.out.println("--------------------------------------------");
       
        
        // Mostrando al cliente º2
        System.out.println("/*** Cliente nº1 ***/");
        System.out.println(cliente1.toString());
        System.out.println("");
        
        // Mostrando al cliente º2
        System.out.println("/*** Cliente nº2 ***/");
        System.out.println(cliente2.toString());
      
        
        // Mostrando al vehículo º1
        System.out.println("--------------------------------------------");
        System.out.println("/*** Vehiculo nº1 ***/");
        System.out.println(vehiculo1.toString());
        System.out.println("");

        // Mostrando al vehículo º2
        System.out.println("/*** Vehiculo nº2 ***/");
        System.out.println(vehiculo2.toString());
        System.out.println("--------------------------------------------");

        // Quitando vigencia al Cliente º1
        System.out.println("Quitando vigencia al Cliente º1");
        cliente1.deshabilitarCliente();
        System.out.println("La vigencia actual del cliente Nº1 es: " + cliente1.getVigencia());
        System.out.println("");
        
        // Asignando vehiculo º1 a mantención
        System.out.println("--------------------------------------------");
        System.out.println("Asignando a mantención...");
        vehiculo1.asignarMantencion();
        System.out.println(vehiculo1.toString());
        System.out.println("--------------------------------------------");
        
        
  
        Arriendo arriendo2 = new Arriendo(10, vehiculo2, cliente2);
        System.out.println(arriendo2.toString());


        
        
        
    }
    
}
