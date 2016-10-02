/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author DEIRY
 */
public class Validaciones {

    public static boolean numeros(char e) {
        if (!Character.isDigit(e)) {
            return false;
        }
        return true;
    }

    public static boolean letras(char e) {
        if (!Character.isLetter(e)) {
            return false;
        }
        return true;
    }

    public static boolean minuscula(char e) {
        if (e > 64 && e < 91) {
            return false;
        }
        return true;
    }

    public void visualizarDialog(JOptionPane option, JDialog dialogo, Component padre, String texto, String titulo, final long timeOut, int type) {
        option.setMessage(texto);
        option.setMessageType(type);
        if (dialogo == null) {
            dialogo = option.createDialog(padre, titulo);
        } else {
            dialogo.setTitle(titulo);
        }

        Thread hilo = new Thread() {
            /* public void run() {
                try {
                    Thread.sleep(timeOut);
                    if (dialogo.isVisible()) {
                        dialogo.setVisible(false);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/
        };

        hilo.start();
        dialogo.setVisible(true);
    }

}
