package clases;

/**
 *
 * @author alanayca
 */
public class Cliente {
    // Atributos
    private String cedula;
    private String nombre;
    private Boolean vigencia;
    
    // Constructor
    public Cliente(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigencia = true;
    }
    
    // Metodos Mutadores
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setVigencia(Boolean vigencia){
        this.vigencia = vigencia;
    }
    
    // Metodos Accesores

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getVigencia() {
        return vigencia;
    }
    
    // Metodos personalizados
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void deshabilitarCliente(Boolean vigencia){
        setVigencia(false);
    }
    
    // ToString
    @Override
    public String toString(){
        return "Vehiculo{" + "cedula = " + cedula + ", nombre = " + nombre + ", vigencia = " + vigencia;
    }
    
    
}
