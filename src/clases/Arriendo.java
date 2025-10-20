package clases;

/**
 *
 * @author alanayca
 */
public class Arriendo {
    
    // Atributos
    private int numeroArriendo;
    private int diasArriendo;
    private Vehiculo[] listaVehiculos;
    private Cliente[] listaClientes;
    
    // Metodos mutadores
    public void setNumeroArriendo(int numeroArriendo){
        this.numeroArriendo = numeroArriendo;
    }
    
    public void setDiasArriendo(int diasArriendo){
        this.diasArriendo = diasArriendo;
    }
    
    public void setListaVehiculos(Vehiculo[] listaVehiculos){
        this.listaVehiculos = listaVehiculos;
    }
    
    public void setListaClientes(Cliente[] listaClientes){
        this.listaClientes = listaClientes;
    }
    
    // Metodos accesores
    public int getNumeroArriendo(){
        return this.numeroArriendo;
    }
    
    public int getDiasArriendo(){
        return this.diasArriendo;
    }
    
    public Vehiculo[] getListaVehiculos(){
        return this.listaVehiculos;
    }
    
    public Cliente[] getListaClientes(){
        return this.listaClientes;
    }
    
    // Metodos custom
    
    private void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    
    
}

