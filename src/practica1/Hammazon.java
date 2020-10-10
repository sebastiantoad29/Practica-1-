package myp.practica1;

public class Hammazon extends Suscripcion{

  static final int MEMBRESIA_N_HAMMAZON = 7;
  static final int MEMBRESIA_P_HAMMAZON = 13;

  public void cobroHammazon(Object o, Cliente cliente, String tipoDeMembresia){

    if(!(o instanceof Hammazon))
      return;
    if(cliente.getSaldo() < MEMBRESIA_N_HAMMAZON){
      System.out.println("Lo sentimos " + cliente.getNombre() + ", no cuentas con el saldo suficiente para ser usuario" +
                         " de Hammazon Prime.");
      eliminarSuscriptor(cliente);

    }else if(tipoDeMembresia.equals("Normal")){
      cliente.setSaldo(cliente.getSaldo() - MEMBRESIA_N_HAMMAZON);
      System.out.println("Hola " + cliente.getNombre() +
                         ", hemos cobrado tu suscripcion de Hammazon Prime.");

    }else if(cliente.getSaldo() < MEMBRESIA_P_HAMMAZON && tipoDeMembresia.equals("Premium")){
      cliente.setSaldo(cliente.getSaldo() - MEMBRESIA_P_HAMMAZON);
      System.out.println("Hola " + cliente.getNombre() +
                         ", hemos cobrado tu suscripcion de Hammazon Prime.");

    }else{
      System.out.println("Tu saldo es insuficiente para la suscripcion de Hammazon Prime.");
      eliminarSuscriptor(cliente);
    }
  }
}
