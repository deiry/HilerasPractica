package Controlador;

import Modelo.Hilera;
import Vista.FormularioPrincipal;
import Vista.VistaInicio;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {

    //  private FormularioPrincipal view;
    private Hilera model;
    private VistaInicio view;
    private static JOptionPane option;
    private static JDialog dialogo;

    /**
     * Constructor de la controlador
     *
     * @param vista Primer Parametro: objeto tipo FormularioPrincipal que
     * incializa la interfaz
     * @param model Segundo Parametro: objeto tipo Hilera que controla las
     * operacion dentro de la lista
     */
    public controlador(VistaInicio vista, Hilera model) {
        this.view = vista;
        this.model = model;
        this.option = new JOptionPane("", JOptionPane.INFORMATION_MESSAGE);
        this.dialogo = null;
    }

    /**
     * Metodo que carga los atributos,y eventos a cada unos de los objetos que
     * hacen parte de la clase FormularioPrincipal
     */
    public void cargarAtributos() {
        this.view.retornaBotonCargaString().setActionCommand("GuardaCadena");
        this.view.retornaBotonCargaString().addActionListener(this);
        this.view.retornaBotonAgregar().setActionCommand("AgregarHilera");
        this.view.retornaBotonAgregar().addActionListener(this);
        this.view.retornaComboBorrado().setActionCommand("PreguntaBorrado");
        this.view.retornaComboBorrado().addActionListener(this);
        this.view.retornaBotonBorrado().setActionCommand("BorrarCharHilera");
        this.view.retornaBotonBorrado().addActionListener(this);
        this.view.retornaBotonPalindromo().setActionCommand("ValidePalindromo");
        this.view.retornaBotonPalindromo().addActionListener(this);
        this.view.retornaBotonOrdenar().setActionCommand("OrdenarLIsta");
        this.view.retornaBotonOrdenar().addActionListener(this);
        this.view.retornaBotonAngrama().setActionCommand("ValidarAnagrama");
        this.view.retornaBotonAngrama().addActionListener(this);
        this.view.retornaBotonInvertir().setActionCommand("InvertirHilera");
        this.view.retornaBotonInvertir().addActionListener(this);
        this.view.retornaBotonModificar().setActionCommand("ModificarHilera");
        this.view.retornaBotonModificar().addActionListener(this);
        this.view.retornaBotoEjecutarSubString().setActionCommand("EjecutarSubString");
        this.view.retornaBotoEjecutarSubString().addActionListener(this);

        /**
         * Metodo que valida si la lista se encuentra vacia retorna True si la
         * lista se encuentra vacia,de lo contrario retorna false
         *
         */
        boolean respuesta = model.isEmpty();

        if (respuesta == true) {
            this.view.retornaAreaVisualizacion().setText("Lista actualmente vacia\nDirijase Opcion Insertar!!!");

        } else {
            this.view.retornaAreaVisualizacion().setText("Lista no vacia!!!");
        }
    }

    /**
     * metodo que hace visible el JFrame perteneciente a la clase
     * FormularioPrincipal
     */
    public void mostrar() {
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }

    /**
     * Metodo que captura evento tipo ActionListener,ejecuta con base al objeto
     * que invoca el metodo
     *
     * @param e objeto que recibe el evento de la interfaz FormularioPrincipal
     */
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();
        if (comando.equals("GuardaCadena")) //Guarda String como lista doble
        {
            String dato;
            String cadenaNueva = this.view.retornaCuadroString().getText();

            if (cadenaNueva.isEmpty()) {
                visualizarDialog(view, "Campo vacio", "Error", 1500, JOptionPane.ERROR_MESSAGE);
                return;
            }
            visualizarDialog(view, "Guardando String", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
            model.insertHilera(cadenaNueva);
            dato = model.imprimirLd();
            //this.view.retornaAreaVisualizacion().setText("");

            this.view.retornaAreaVisualizacion().setText(dato);
            this.view.retornaCuadroString().setEnabled(false);
            this.view.retornaBotonCargaString().setEnabled(false);
            this.view.retornaComboBorrado().setEnabled(true);
            this.view.retornaBotonPalindromo().setEnabled(true);
            this.view.retornaCuadroModificar().setEnabled(true);
            this.view.retornaPosModificar().setEnabled(true);
            this.view.retornaCantModificar().setEnabled(true);
            this.view.retornaBotonModificar().setEnabled(true);
            this.view.retornaBotonInvertir().setEnabled(true);
            this.view.retornaBotonOrdenar().setEnabled(true);
            this.view.retornaNumPosicionesSubString().setEnabled(true);
            this.view.retornaPosicionInicialSubString().setEnabled(true);
            this.view.retornaBotoEjecutarSubString().setEnabled(true);
            this.view.retornaBotonAngrama().setEnabled(true);
            this.view.retornaBotonAgregar().setEnabled(true);
            this.view.retornaCuadroAgregar().setEnabled(true);
            this.view.retornaCuadroAnagrama().setEnabled(true);

        }

        if (comando.equals("AgregarHilera")) {
            String cadenaNueva = this.view.retornaCuadroAgregar().getText();
            if (cadenaNueva.isEmpty()) {
                visualizarDialog(view, "Campo vacio", "Error", 100, JOptionPane.ERROR_MESSAGE);
                return;
            }
            model.insertHilera(cadenaNueva);
            this.view.retornaAreaVisualizacion().append(model.imprimirLd());
        }

        if (comando.equals("PreguntaBorrado"))///Borra Strin...o parte de el
        {

            if (this.view.retornaComboBorrado().getSelectedIndex() == 1) {
                this.view.retornaValInicialBorrado().setEnabled(false);
                this.view.retornaNumeroElementosBorrado().setEnabled(false);
                this.view.retornaBotonBorrado().setEnabled(false);

                //JOptionPane.showConfirmDialog(null, "Esta Seguro de eliminar Hilera?", "Warning", dialogButton);
                int response = JOptionPane.showConfirmDialog(null, "Esta Seguro de eliminar Hilera?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    visualizarDialog(view, "Eliminando hilera", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
                    model.borrarCompleto();
                    this.view.retornaAreaVisualizacion().setText("Lista actualmente vacia\nDirijase Opcion Insertar!!!");
                    this.view.retornaComboBorrado().setEnabled(false);
                    this.view.retornaCuadroString().setEnabled(true);
                    this.view.retornaBotonCargaString().setEnabled(true);
                    this.view.retornaCuadroModificar().setEnabled(false);
                    this.view.retornaBotonModificar().setEnabled(false);
                    this.view.retornaPosModificar().setEnabled(false);
                    this.view.retornaCantModificar().setEnabled(false);
                    this.view.retornaBotonInvertir().setEnabled(false);
                    this.view.retornaBotonOrdenar().setEnabled(false);
                    this.view.retornaNumPosicionesSubString().setEnabled(false);
                    this.view.retornaPosicionInicialSubString().setEnabled(false);
                    this.view.retornaBotoEjecutarSubString().setEnabled(false);
                    this.view.retornaBotonPalindromo().setEnabled(false);
                    this.view.retornaBotonAngrama().setEnabled(false);
                    this.view.retornaBotonAgregar().setEnabled(false);
                    this.view.retornaCuadroAgregar().setEnabled(false);
                    this.view.retornaCuadroString().setText("");
                    this.view.retornaCuadroAnagrama().setEnabled(false);
                    this.view.retornaCuadroAnagrama().setText("");
                    this.view.retornaCuadroAgregar().setText("");

                } else if (response == JOptionPane.NO_OPTION) {
                    visualizarDialog(view, "Conservando hilera intacta", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                this.view.retornaValInicialBorrado().setEnabled(true);
                this.view.retornaNumeroElementosBorrado().setEnabled(true);
                this.view.retornaBotonBorrado().setEnabled(true);
            }
        }

        if (comando.equals("BorrarCharHilera")) {
            if (this.view.retornaValInicialBorrado().getText().equals("") || this.view.retornaNumeroElementosBorrado().getText().equals("")) {
                visualizarDialog(view, "Campos incompletos", "Eror", 1500, JOptionPane.ERROR_MESSAGE);
            } else {
                int x = Integer.parseInt(this.view.retornaValInicialBorrado().getText());
                int y = Integer.parseInt(this.view.retornaNumeroElementosBorrado().getText());
                int respuesta = model.borrarString(x, y);
                String dato;

                dato = model.imprimirLd();

                if (respuesta == 1) {
                    visualizarDialog(view, "Fallo primer parametro", "Aviso", 1500, JOptionPane.INFORMATION_MESSAGE);

                } else if (respuesta == 2) {
                    visualizarDialog(view, "Falló segundo parametro", "Aviso", 1500, JOptionPane.INFORMATION_MESSAGE);
                } else if (respuesta == 3) {
                    visualizarDialog(view, "Borrado exitoso", "Aviso", 1500, JOptionPane.INFORMATION_MESSAGE);

                    this.view.retornaAreaVisualizacion().append("Original: " + dato);
                }
            }

        }

        if (comando.equals("ValidePalindromo")) {
            boolean respuesta;
            respuesta = this.model.esPalindromo();
            if (respuesta == true) {
                visualizarDialog(view, "Su hilera es palindromo", "Aviso", 1500, JOptionPane.INFORMATION_MESSAGE);
                this.view.retornaAreaVisualizacion().append("Su Hilera es Palindromo");

            } else {
                visualizarDialog(view, "Su hilera no es palindromo", "Aviso", 1500, JOptionPane.INFORMATION_MESSAGE);
                this.view.retornaAreaVisualizacion().append("Su Hilera no es Palindromo");
            }
        }

        if (comando.equals("OrdenarLIsta")) {
            visualizarDialog(view, "Ordenando Lista", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
            model.ordenarLIsta();
            this.view.retornaAreaVisualizacion().append("Ordenada:" + model.imprimirLd());

        }

        if (comando.equals("ValidarAnagrama")) {
            visualizarDialog(view, "Validando si es anagrama", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
            Hilera comprobar = new Hilera();
            comprobar.insertHilera(this.view.retornaCuadroAnagrama().getText());
            this.view.retornaAreaVisualizacion().append("Es anagrama?: " + model.esAnagrama(comprobar));;

        }

        if (comando.equals("InvertirHilera")) {

            visualizarDialog(view, "Invirtiendo Hilera", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
            this.view.retornaAreaVisualizacion().append("Orignal: " + model.imprimirLd());
            model.invertirHilera();
            this.view.retornaAreaVisualizacion().append("Invertida: " + model.imprimirLd());

        }

        if (comando.equals("ModificarHilera")) {
            visualizarDialog(view, "Modificando Hilera", "Aviso", 1000, JOptionPane.INFORMATION_MESSAGE);
            String cad = this.view.retornaCuadroModificar().getText();
            Hilera t = new Hilera();
            t.insertHilera(cad);
            int i = Integer.parseInt(this.view.retornaPosModificar().getText());
            int j = Integer.parseInt(this.view.retornaCantModificar().getText());
            this.view.retornaAreaVisualizacion().append("Orignal: " + model.imprimirLd());
            model.modificarHilera2(i, j, t);
            this.view.retornaAreaVisualizacion().append("Modificada:" + model.imprimirLd());

        }

        if (comando.equals("EjecutarSubString")) {

            int i = Integer.parseInt(this.view.retornaPosicionInicialSubString().getText());
            int j = Integer.parseInt(this.view.retornaNumPosicionesSubString().getText());
            Hilera aux;
            aux = model.subString(i, j);
            if (aux == null) {
                visualizarDialog(view, "Fallaron parametros", "Aviso", 1500, JOptionPane.WARNING_MESSAGE);

            } else {
                this.view.retornaAreaVisualizacion().append("Original" + model.imprimirLd());
                this.view.retornaAreaVisualizacion().append("SubString " + aux.imprimirLd());
            }

        }

    }

    public void visualizarDialog(Component padre, String texto, String titulo, final long timeOut, int type) {
        option.setMessage(texto);
        option.setMessageType(type);
        if (dialogo == null) {
            dialogo = option.createDialog(padre, titulo);
        } else {
            dialogo.setTitle(titulo);
        }

        Thread hilo = new Thread() {
            public void run() {
                try {
                    Thread.sleep(timeOut);
                    if (dialogo.isVisible()) {
                        dialogo.setVisible(false);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        hilo.start();
        dialogo.setVisible(true);
    }

}
