
package Controlador;

import Modelo.Hilera;
import Vista.FormularioPrincipal;
import Vista.VistaInicio;
import Vista.VistaInsertar;
import Vista.VistaPrincipal;




public class Main {
    /**
     * Metodo que inicializa la aplicación
     * @param args array String
     */
    
    
    public static void main(String[] args) {
        
        
   
      //  FormularioPrincipal view=new FormularioPrincipal();
        Hilera model=new Hilera();
        VistaInicio view = new VistaInicio();
        
        controlador controller=new  controlador(view, model);
        controller.cargarAtributos();
        controller.mostrar();
       
 
     
      
        
    }
    
    
}
