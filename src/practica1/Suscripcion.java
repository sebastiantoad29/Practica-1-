package myp.practica1;

/**
 * Clase abstarcta del Servicio que necesita el cliente.
 */
public abstract class Servicio {

    private String tipoDeMembresia;
    private int costo;
    private ArrayList<Cliente> clientes;
    private String recomendacionDelDia;


    /**
     * Constructor de Servicio.
     */
    public Servicio(String tipoDeMembresia, int costo){
      this.tipoDeMembresia = tipoDeMembresia;
      this.costo = costo;
    }


    /**
     * Regresa el costo del servicio.
     */
    public int getCosto(){
      return costo;
    }

    /**
     * Deine el costo del servicio.
     */
     public void setCosto(int costo){
       this.costo = costo;
     }
    /**
     * Regresa el tipo Tipo de Membresia del servicio.
     */
    public String getTipoDeMembresia(){
      return tipoDeMembresia;
    }

    /**
     * Define el Tipo de Membresia del servicio.
     */
    public void setTipoDeMembresia(String tipoDeMembresia) {
        this.tipoDeMembresia = tipoDeMembresia;
    }

    /**
     *  Agrega un cliente en la lista de clientes del servicio, de igual forma
     *  agrega un servicio a la lista de servicios del cliente.
     */
    public void agregaCliente(Cliente cliente){
      clientes.add(cliente);
      cliente.getServicios().add(this);
      System.out.println("Hola " + cliente.getNombre() +
                         ", te damos la bienvenida a " + getTipoDeMembresia());
    }

    /**
     *  Elimina un cliente de la lista de clientes del servicio, de igual forma
     *  elimina un servicio de la lista de servicios del cliente.
     */
    public void eliminaCliente(Cliente cliente) throws NoSuchElementException {
       if(!(clientes.contains(cliente)))
           throw new NoSuchElementException();
       clientes.remove(cliente);
       cliente.getServicios().remove(this);
       System.out.println(cliente.getNombre() +   ", lamentamos" +
                          " que hayas abandonado tu suscripcion a "    +
                          getTipoDeMembresia());
    }
    
    /**
     * Recomienda un producto del servicio al cliente, agregando dicho producto
     * a su lista de recomendaciones.
     */
    public void recomiendaA(Cliente cliente) {
        cliente.getRecomendaciones().add(recomendacionDelDia);
        System.out.println("Hola " + cliente.getNombre() + "! de parte                                     de " toString() " y con base a tus gustos                                       queremos recomendarte " + recomendacionDelDia)	
    }    

    public abstract String toString();
}
