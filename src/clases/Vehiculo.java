package clases;

/**
 *
 * @author alanayca
 */
public class Vehiculo {
    // Atributos
    private String patente;
    private String marca;
    private String modelo;
    private int aFabricacion;
    private String condicionVehiculo;
    
    // Constructor
    public Vehiculo(String patente, String marca, String modelo, int aFabricacion){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.aFabricacion = aFabricacion;
        this.condicionVehiculo = "D";
    }
    
    // Metodos mutadores
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAFabricacion (int aFrabricacion){
        this.aFabricacion = aFrabricacion;
    }    
    
    public void setCondicionVehiculo(String condicionVehiculo){
        this.condicionVehiculo = condicionVehiculo;
    }
    
    // Metodos Accesadores
    public String getPatente(){
        return this.patente;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getAFabricacion(){
        return this.aFabricacion;
    }
    
    public String getCondicionVehiculo(){
        return this.condicionVehiculo;
    }
    
    // Metodos Personalizados
    public void asignarMantencion(){
        setCondicionVehiculo("M");
        mostrarMensaje("El vehículo fue asignado a mantención");
    }
    
    private void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente = " + patente + ", marca = " + marca + ", modelo = " + modelo + ", aFabricacion = " + aFabricacion + ", condicionVehiculo = " + condicionVehiculo + '}';
    }
    
}
