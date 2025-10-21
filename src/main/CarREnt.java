package main;

import clases.*;

/**
 *
 * @author alanayca
 */
public class CarREnt {

    public static void main(String[] args) {
        // Instanciando al objeto cliente1
        Cliente cliente1 = new Cliente("20098781-0", "Alan Ayca");
        System.out.println(cliente1.toString());
       
        // Instanciando cliente 2
        Vehiculo vehiculo1 = new Vehiculo("ABK-12", "Toyota", "Yaris", 2025);
        System.out.println(vehiculo1.toString());
        
        // Deshabilitando cliente
        cliente1.deshabilitarCliente();
        // Mostrando vigencia del cliente
        System.out.println(cliente1.getVigencia());
        
        // Asignando vehiculo a mantención
        vehiculo1.asignarMantencion();
        System.out.println(vehiculo1.getCondicionVehiculo());
        
        
        Cliente cliente2 = new Cliente("20098781-0", "Alan Ayca");
        Vehiculo vehiculo2 = new Vehiculo("ABK-12", "Toyota", "Yaris", 2025);
        Arriendo arriendo2 = new Arriendo(10, vehiculo2, cliente2);
        Arriendo arriendo3 = new Arriendo(20, vehiculo2, cliente2);
        Arriendo arriendo4 = new Arriendo(30, vehiculo2, cliente2);
        
        
        System.out.println(arriendo2.toString());
        System.out.println(arriendo3.toString());
        System.out.println(arriendo4.toString());

        
        
        
    }
    
}
