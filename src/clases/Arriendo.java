package clases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author alanayca
 */
public class Arriendo {
    
    // Atributos
    private int numeroArriendo;
    private int diasArriendo;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Devolucion devolucion;
    
    // Constructor
    private static int contador = 1;
    public Arriendo (int diasArriendo, Vehiculo vehiculo, Cliente cliente){
        
        this.numeroArriendo = contador++;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.diasArriendo = diasArriendo;
        
        //Asignando condición del vehículo como "Arrendado"
        vehiculo.setCondicionVehiculo("A");
        
        // Instanciando fecha
        Date fecha = new Date();
        
        // Instanciando calendario
        Calendar calendario = Calendar.getInstance();
        
        // Instanciando y definiendo formato de hora
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // Asignando fecha actual
        calendario.setTime(fecha);
        
        // Sumando numero días a la fecha actual
        calendario.add(Calendar.DAY_OF_MONTH, diasArriendo);
        
        // Guardando fecha de devolución
        String fechaDevolucion = sdf.format(calendario.getTime());

        // Instanciando devolucion
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
    
    // Funciones restantes
    // Falta: evaluarArriendo()
    // Falta: ingresarArriendo()
    // Falta: calcularMonto()
    // Falta: generarTicket()
    // Falta: generarDevolucion()
    

    @Override
    public String toString() {
        return "Arriendo Nº" + numeroArriendo + ", Días de arriendo: " + diasArriendo 
                + "\n     " + cliente 
                + "\n     " +  vehiculo 
                + "\n     " +  devolucion + "\n";
    }
    
    
}

