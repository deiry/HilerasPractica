
package Controlador;

import Modelo.Hilera;
import Vista.FormularioPrincipal;




public class Main {
    /**
     * Metodo que inicializa la aplicación
     * @param args array String
     */
    
    
    public static void main(String[] args) {
        
        
     
        FormularioPrincipal view=new FormularioPrincipal();
        Hilera model=new Hilera();
        
        
        controlador controller=new  controlador(view, model);
        controller.cargarAtributos();
        controller.mostrar();
       
        
        
    }
    
    
}
