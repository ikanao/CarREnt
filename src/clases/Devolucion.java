package clases;

/**
 *
 * @author alanayca
 */
public class Devolucion {
    // Atributos
    private int numeroDevolucion;
    private String fechaDevolucion;
    
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
}
