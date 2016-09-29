package Modelo;

import javax.swing.JOptionPane;

public class Hilera extends Dlist {

    /**
     * Método para convertir un String a hilera e insertarlo
     *
     * @param cadena Parametro que será convertido a una lista doblemente ligada
     */
    public final void insertHilera(String cadena) {
        cadena = cadena + '#';
        int cont = 0;
        char caracter = cadena.charAt(cont);
        while (caracter != '#') {
            if (validarCaracter(caracter)) {
                this.insert(caracter, this.getLastNode());
            }
            cont++;
            caracter = cadena.charAt(cont);
        }
    }

    /**
     * Validar si el caracter es una letra y no un caracter especial
     *
     * @param x Caracter para validar si es una letra o no
     * @return Retorna un boolean con el valor de si es o no una letra
     */
    public boolean validarCaracter(char x) {
        return (((x > 64) && (x < 92)) || ((x > 96) && (x < 123)) || ((x > 47) && (x < 58)));
    }

   
 /**
  * metodo que cuenta el numero de nodos que conformar la lista hilera
  * @return retorna un entero con el numero de nodos pertenecientes a la lista
  */
    public int HileraLength() {
        Dnode p;
        int contador = 0;

        p = getFirstNode();
        while (!(isTheEnd(p))) {
            contador++;
            p = p.getLd();
        }
        return contador;

    }

    
    /**
     * metodo que borra de la lista un determinado numero de nodos con base a la posicion inicial y numero de caractares y apartir de este posicion inical x
     * @param x Posicion inicial apartir de donde se van a borrar los nodos de la lista
     * @param y Numero de nodos que se cuenta apartir de la posicion inicial x
     * @return  Retorna un entero en cual indica 1 si el primer parametro es invalido,2 si el segundo parametro es invalido,3 si se ejecuto correctamente
     */
    
    public int borrarString(int x, int y)// x posiciones inicial
    {
        int numNodos = this.HileraLength();
        if (x < 1 || x > numNodos) {
            System.out.println("Parametro Invalido :" + x);
            return 1;
        }
        if (y < 0 || y > numNodos-x+1) {
            System.out.println("Parametro Invalido: " + y);
            return 2;
        }

        Dnode p, q;

        p = getFirstNode();
        q = p.getLi();
        int k = 1;

        while (k < x) {
            k++;
            q = p;
            p = p.getLd();

        }
        System.out.println(p.getDato());

        k = 1;

        while (k <= y) {

            k++;
            disconnect(p);
            setLongitud(getLongitud() - 1);
            //p = q.getLd();
            p = p.getLd();

        }
        return 3;
    }

    
    /**
     * Metodo que vacia la hilera
     */
    public void borrarCompleto() {
        setFirstNode(null);
        setLastNode(null);
        setLongitud(0);

    }
    
    /**
     * Metod que invierte el orden de la hilera
     */

    public void invertirHilera() {

        Dnode p, q;
        p = this.getLastNode();
        Hilera x = new Hilera();
        while (p != null) {
            x.insert(p.getDato(), x.getLastNode());
            p = p.getLi();
        }
        p = this.getFirstNode();
        q = x.getFirstNode();
        while (!(isTheEnd(p))) {
            p.setDato(q.getDato());
            p = p.getLd();
            q = q.getLd();
        }
    }

    /**
     * Método para hacer una copia de la hilera que lo insertó
     *
     * @return La copia de la hilera que lo invocó
     */
    public Hilera copy() {
        Dnode p = getFirstNode();
        Hilera copia = new Hilera();

        while (!isTheEnd(p)) {
            copia.insertLast(new Dnode(p.getDato()));
            p = p.getLd();
        }
        return copia;
    }

    /**
     * Método paraque recorre la hilera por liga derecha y por liga izquiera
     * para determinar si la hilera que lo invocó es un palindromo.
     *
     * @return Retorna true si es un palindromo o retorna false si no es un
     * palindromo
     */
    public boolean esPalindromo() {
        Dnode p = getFirstNode();
        Dnode q = getLastNode();

        while (!isTheEnd(q) && (!isTheEnd(p))) {
            if (p.getDato() != q.getDato()) {
                return false;
            }
            p = p.getLd();
            q = q.getLi();
        }
        return true;
    }

    /**
     * Determina si es una anagrama la hilera por parametro y el la hilera que
     * invocó el método
     *
     * @param nueva Hilera para comparar con el this
     * @return Retorna true si es un anagrama de lo contrario false
     */
    public boolean esAnagrama(Hilera nueva) {

        if (nueva.getLongitud() == this.getLongitud()) {
            Hilera nuevaCopy = nueva.copy();
            Hilera thisCopy = this.copy();
            nuevaCopy.ordenarLIsta();
            thisCopy.ordenarLIsta();
            Dnode p = nuevaCopy.getFirstNode();
            Dnode q = thisCopy.getFirstNode();
            while (!isTheEnd(p)) {
                if ((p.getDato() != q.getDato())) {
                    return false;
                }

                p = p.getLd();
                q = q.getLd();
            }
        }

        return true;

    }

    public void modificarHilera(int i, int j, Hilera t) {
        Dnode p, q;
        int k = 1;
        Hilera tCopy = t.copy();
        p = findNode(i);
        System.out.println("dato de p " + p.getDato());
        q = p.getLi();

        while (k <= j) {
            p = p.getLd();
            k++;
        }
        if (q == null) {
            this.setFirstNode(tCopy.getFirstNode());
        } else {
            q.setLd(tCopy.getFirstNode());
            tCopy.getFirstNode().setLi(q);
        }
        p.setLi(tCopy.getLastNode());
        tCopy.getLastNode().setLd(p);
    }

    
    /**
     * Metodo que reemplaza una Hilera dentro de otra apartir de la posicion i hasta j caracteres
     * @param i Parametro que indica la posicion incial a partir del cual se empiza hacer la modificacion
     * @param j Parametro que indica el numero de caracters apartir de la posicion incial para modificar
     * @param t Parametro que indica la hiler aque se va a insertar dentro de la lista
     */
    public void modificarHilera2(int i, int j, Hilera t) {
        Dnode p, tp, aux;
        int k = 1;

        p = findNode(i);
        
        
          if (i < 1 || i >this.getLongitud()) {
            //System.out.println("Parametro Invalido :" + i);
              JOptionPane.showMessageDialog(null,"Parametro Invalido :" + i);
            return ;
        }
        if (j < 0 || j > this.getLongitud()-i+1) {
            System.out.println("Parametro Invalido: " + j);
            JOptionPane.showMessageDialog(null,"Parametro Invalido :" + j);
            return;
        }
   
    
        tp = t.getFirstNode();
         aux = p.getLi();
       
       while (k <=j) {
           
      
           if(p ==getFirstNode())
           {
               setFirstNode(p.getLd());
               getFirstNode().setLi(null);
           }
           
           else{
                    this.disconnect(p);
           }
            p= p.getLd();
           k++;
       }
         
        
   
     while (!isTheEnd(tp)) {
         Dnode x = new Dnode(tp.getDato());
          connect(x, aux);
        tp = tp.getLd();
        aux = x;

       }

    }
    
    /**
     * El metodo subString permite obtener de la lista una subhilera desde una posicion inicial hasta numero determinando de caracteres
     * @param i posicion inicial de la hilera
     * @param j numero de caracteres a tomar de la hilera
     * @return  retorna una hilera auxilar al this
     */

    public Hilera subString(int i, int j) {

        Dnode p, aux, q;
        int n = this.HileraLength();
        int k = 1;

        if (i < 1 || i > n) {
            //Primer Parametro invalido;
            return null;
        }

        if (j < 0 || i + j > n) {
            //Segundo pametro invalido;
            return null;
        }

        Hilera x = new Hilera();
        p = this.findNode(i);
        aux = p;
        System.out.println("\n" + aux.getDato());

        while (k <= j) {
            q = new Dnode(aux.getDato());
            x.connect(q, x.getLastNode());
            aux = aux.getLd();
            k++;
        }

        return x;
    }

}
