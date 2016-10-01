/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
    
    public static boolean minuscula(char e){
        if (e>64 && e<91) {          
            return false;
        }
        return true;
    }
    
    

}
