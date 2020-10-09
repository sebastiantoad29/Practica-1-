package myp.practica1;

public class Hammazon extends Suscripcion{

  public void cobroHammazon(Object o, Cliente cliente, String tipoDeMembresia){
    if(!(o instanceof Hammazon))
      return;
    if(cliente.getSaldo() < MEMBRESIA_N_HAMMAZON){
      System.out.println("No cuentas con el saldo suficiente
                          para ser usuario de Hammazon Prime, tu suscripción será suspendida.");
      eliminarSuscriptor(cliente);

    }else if(tipoDeMembresia.equals("premium")){
      if(cliente.getSaldo() < MEMBRESIA_P_TWITSH){
        System.out.println("No cuentas con el saldo suficiente
                            para ser usuario premium de Twitsh, puedes suscribirte
                            a nuestra membresía normal por un costo de 6 diarios.");
        eliminarSuscriptor(cliente);
      }else{
        cliente.setSaldo(cliente.getSaldo() - MEMBRESIA_P_TWITSH);
        System.out.println("Hola " + cliente.getNombre() + ", hemos cobrado tu suscripcion de Twitsh.");
      }

    }else(tipoDeMembresia.equals("normal")){
      cliente.getSaldo() = cliente.getSaldo() - MEMBRESIA_N_TWITSH;
      System.out.println("Hola " + cliente.getNombre() + ", hemos cobrado tu suscripcion de Twitsh.");
    }

}
