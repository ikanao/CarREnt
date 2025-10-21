package clases;

import java.util.Calendar;

/**
 *
 * @author alanayca
 */
public class Devolucion {
    // Atributos
    private static int contador;
    private int numeroDevolucion;
    private String fechaDevolucion;
    
    // Constructor
    public Devolucion(String fechaDevolucion){
        this.numeroDevolucion = contador++;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    // Metodos accesadores y mutadores
    public int getNumeroDevolucion() {
        return numeroDevolucion;
    }

    public void setNumeroDevolucion(int numeroDevolucion) {
        this.numeroDevolucion = numeroDevolucion;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    // Metodos Custom
    private void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Devolucion{" + "numeroDevolucion=" + numeroDevolucion + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
}
