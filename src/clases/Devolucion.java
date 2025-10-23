package clases;

/**
 *
 * @author alanayca
 */
public class Devolucion {
    // Atributos
    private int numeroDevolucion;
    private String fechaDevolucion;
    
    // Constructor
    private static int contador;
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
        return "Devolucion Nº" + numeroDevolucion 
                + "\n        fechaDevolucion    :   " + fechaDevolucion;
    }
    
}
