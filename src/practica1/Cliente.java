package myp.practica1;

import java.util.*;

public class Cliente {

    private int saldo;
    private String nombre;
    private List<Suscripcion> suscripciones = new ArrayList<Suscripcion>();

    /**
     * Define el estado inicial del cliente.
       Nombre del Cliente
       Saldo del Cliente.
     */
    public Cliente(int saldo, String nombre) {
        this.saldo = saldo;
	      this.nombre = nombre;
    }

    /**
     * Regresa el saldo del cliente
     */
    public int getSaldo(){
      return saldo;
    }

    /**
     * Define el saldo del cliente
     */
    public void setSaldo(int saldo){
      this.saldo = saldo;
    }

    /**
     * Regresa el nombre del cliente
     */
    public String getNombre(){
      return nombre;
    }

    /**
     * Define el nombre del cliente
     */
    public void setNombre(String nombre){
      this.nombre= nombre;
    }

    /**
     * Regresa una lista de las suscripciones del cliente
     */
    public List<Suscripcion> getSuscripciones() {
        return this.suscripciones;
    }
    
}
