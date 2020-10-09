package myp.practica1;

/**
 * Clase abstarcta de la suscripción que necesita el cliente.
 */
public abstract class Suscripcion {

    private String tipoDeMembresia;
    private int costo;
    private ArrayList<Cliente> usuarios;


    /**
     * Constructor de Suscripcion
     */
    public Suscripcion(String tipoDeMembresia, int costo){
      this.tipoDeMembresia = tipoDeMembresia;
      this.costo = costo;
    }


    /**
     * Regresa el costo de la suscripcion
     */
    public int getCosto(){
      return costo;
    }

    /**
     * Deine el costo de la suscripcion
     */
     public void setCosto(int costo){
       this.costo = costo;
     }
    /**
     * Regresa el tipo Tipo de Membresia de la suscripcion
     */
    public String gettipoDeMembresia(){
      return tipoDeMembresia;
    }

    /**
     * Define el Tipo de Membresia de la suscripcion
     */
    public void settipoDeMembresia(String estado) {
        this.tipoDeMembresia = tipoDeMembresia;
    }

    /**
     *  Agrega un cliente en la lista de usuarios de la suscripcion, de igual forma
     *  agrega una suscripcion a la lista de suscripciones del cliente.
     */
    public void agregaSuscriptor(Cliente cliente){
      usuarios.add(cliente);
      cliente.getSuscripciones().add(this);
      System.out.println("Hola " + cliente.getNombre() +
                         "te damos la bienvenida a " + getSuscripcion());
    }

    /**
     *  Elimina un cliente en la lista de usuarios de la suscripcion, de igual forma
     *  elimina una suscripcion a la lista de suscripciones del cliente.
     */
     public void eliminarSuscriptor(Cliente cliente){
       if(!(usuarios.contains(cliente)))
        return;
       usuarios.remove(cliente);
       cliente.getSuscripciones().remove(this);
       System.out.println(cliente.getNombre() +   ", lamentamos" +
                          " que hayas abandonado tu suscripcion a "    +
                          getSuscripcion());
     }

    public abstract String toString();
}
