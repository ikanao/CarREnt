package clases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.HashSet;

/**
 *
 * @author alanayca
 */
public class Arriendo {
    
    // Atributos
    private static int contador = 1;
    private int numeroArriendo;
    private int diasArriendo;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Devolucion devolucion;
    
    // Constructor
    public Arriendo (int diasArriendo, Vehiculo vehiculo, Cliente cliente){
        
        this.numeroArriendo = contador++;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.diasArriendo = diasArriendo;
        
        vehiculo.setCondicionVehiculo("A");
        
        
        Date fecha = new Date();
        Calendar calendario = Calendar.getInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        calendario.setTime(fecha);
        calendario.add(Calendar.DAY_OF_MONTH, diasArriendo);
        
        String fechaDevolucion = sdf.format(calendario.getTime());

        
        Devolucion devolucion = new Devolucion(fechaDevolucion);
        this.devolucion = devolucion;
        
    }
    
    // Metodos mutadores
    public void setNumeroArriendo(int numeroArriendo){
        this.numeroArriendo = numeroArriendo;
    }
    
    public void setDiasArriendo(int diasArriendo){
        this.diasArriendo = diasArriendo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setDevolucion(Devolucion devolucion){
        this.devolucion = devolucion;
    }
    
    // Metodos accesores
    public int getNumeroArriendo(){
        return this.numeroArriendo;
    }
    
    public int getDiasArriendo(){
        return this.diasArriendo;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public Devolucion getDevolucion(){
        return this.devolucion;
    }
    
    // Metodos custom
    private void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    private void contador(){
        
    }

    @Override
    public String toString() {
        return "Arriendo Nº" + numeroArriendo + ", Días de arriendo: " + diasArriendo 
                + "\n     " + cliente 
                + "\n     " +  vehiculo 
                + "\n     " +  devolucion + "\n";
    }
    
    
}

