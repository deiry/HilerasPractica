
package Controlador;
import Modelo.Hilera;
import Vista.VistaInicio;
import Vista.VistaInsertar;
public class Main {
    /**
     * Metodo que inicializa la aplicación
     * @param args array String
     */
    public static void main(String[] args) {
        
        Hilera model=new Hilera();
        VistaInicio view = new VistaInicio();
        
        controlador controller=new  controlador(view, model);
        controller.cargarAtributos();
        controller.mostrar();
       
 
     
      
        
    }
    
    
}
