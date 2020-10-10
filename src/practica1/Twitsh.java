package myp.practica1;

public class Twitsh extends Suscripcion{

  static final int MEMBRESIA_N_TWITSH = 6;
  static final int MEMBRESIA_P_TWITSH = 10;

  public void cobroTwitsh(Object o, Cliente cliente, String tipoDeMembresia){

    if(!(o instanceof Twitsh))
      return;
    if(cliente.getSaldo() < MEMBRESIA_N_TWITSH){
      System.out.println("Estimado " + cliente.getNombre() + ", sentimos decirte que no puedes ser usuario" +
                         " de Twitsh, por falta de fondos.");
      eliminarSuscriptor(cliente);

    }else if(tipoDeMembresia.equals("Normal")){
      cliente.setSaldo(cliente.getSaldo() - MEMBRESIA_N_TWITSH);
      System.out.println("Buen dia " + cliente.getNombre() +
                         ", disfruta un dia mas de tu suscripcion a Twitsh.");

    }else if(cliente.getSaldo() > MEMBRESIA_P_TWITSH && tipoDeMembresia.equals("Premium")){
      cliente.setSaldo(cliente.getSaldo() - MEMBRESIA_P_TWITSH);
      System.out.println("Buen dia " + cliente.getNombre() +
                         ", disfruta un dia mas de tu suscripcion a Twitsh.");

    }else{
      System.out.println("Lamentamos que dejes el servicio de Twitsh," + cliente.getNombre());
      eliminarSuscriptor(cliente);
    }
  }
}
