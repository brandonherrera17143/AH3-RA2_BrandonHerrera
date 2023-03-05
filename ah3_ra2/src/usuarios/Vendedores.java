package usuarios;

import java.awt.List;
import java.util.LinkedList;
import ventanas.CrearVendedor;
import ventanas.Login;

public class Vendedores {
    
    public static LinkedList<Vendedor> listaVendedores;

    public static void main(String[] args) {

      listaVendedores = new LinkedList<>();  
      Login login = new Login();
      login.setVisible(true);
      
      
//      CrearVendedor ventana = new CrearVendedor();
//      ventana.setVisible(true);
    }
}
