/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *Esta es clases para controlar los datos ingresados en la vista
 * @author DEIRY 
 * @author Carlos
 */
public class Validaciones {
/**
 * Metodo para validar si el parametro ingresado es un numero o no
 * @param e Caracter ingresado por el usuario
 * @return Respuesta true si es un numero o de lo contrario false
 */
    public static boolean numeros(char e) {
        if (!Character.isDigit(e)) {
            return false;
        }
        return true;
    }
/**
 * Metodo para validar si el parametro ingresado es una letra o no
 * @param e Caracter ingresado por el usuario
 * @return Respuesta true si es una letra o de lo contrario false
 */
    public static boolean letras(char e) {
        if (!Character.isLetter(e)) {
            return false;
        }
        return true;
    }
    /**
     * Metodo para validar si el parametro ingresado es una minuscula o no
     * @param e Caracter ingresado por el usuario
     * @return Respuesta true si es una minuscula o de lo contrario false
     */
    public static boolean minuscula(char e) {
        if (e > 64 && e < 91) {
            return false;
        }
        return true;
    }
/**
 * Metodo que permite visualizar un JOption, con el texto y titulo que fueron ingresados, durante un determinado se  muestra para despues cerrarse
 * @param option Objeto JOptionPane que va a ser la ventana que se va visualizar
 * @param dialogo JDialog es donde se le va a asignar el mensaje ingresado
 * @param padre En que componente se va a mostrar la ventana
 * @param texto Mensaje que se visualiza en la ventana
 * @param titulo Titulo del aviso
 * @param timeOut Tiempo de visualizacion
 * @param type Tipo de aviso, ya sea de informacion, error o precaucion.
 */
    public static void visualizarDialog(final JOptionPane option,Component padre, String texto, String titulo, final long timeOut, Icon icono) {
        option.setMessage(texto);
    
        option.setIcon(icono);

        Thread hilo = new Thread() {
             public void run() {
                try {
                    Thread.sleep(timeOut);
                    if (option.isVisible()) {
                        option.setVisible(false);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        hilo.start();
        option.setVisible(true);
    }

}
