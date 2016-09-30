package Controlador;

import Modelo.Hilera;
import Vista.FormularioPrincipal;
import Vista.VistaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {

    //  private FormularioPrincipal view;
    private Hilera model;
    private VistaInicio view;

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
            this.view.retornaAreaVisualizacion().setText("lista actualmente vacia,\n Dirijase Opcion Insertar!!!");

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
                JOptionPane.showMessageDialog(null, "Campo vacio");
                return;
            }
            JOptionPane.showMessageDialog(null, "Gurdando String");
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

        }

        if (comando.equals("AgregarHilera")) {
           String cadenaNueva = this.view.retornaCuadroAgregar().getText();
            if (cadenaNueva.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo vacio");
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
                    JOptionPane.showMessageDialog(null, "Eliminando Hilera");
                    model.borrarCompleto();
                    this.view.retornaAreaVisualizacion().setText(this.view.retornaAreaVisualizacion().getText() + "\n" + "lista actualmente vacia,\n Dirijase Opcion Insertar!!!");
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

                } else if (response == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Conservando Hilera Intacta!!!");
                }

            } else {
                this.view.retornaValInicialBorrado().setEnabled(true);
                this.view.retornaNumeroElementosBorrado().setEnabled(true);
                this.view.retornaBotonBorrado().setEnabled(true);
            }
        }

        if (comando.equals("BorrarCharHilera")) {
            if (this.view.retornaValInicialBorrado().getText().equals("") || this.view.retornaNumeroElementosBorrado().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos Incompletos!!");
            } else {
                int x = Integer.parseInt(this.view.retornaValInicialBorrado().getText());
                int y = Integer.parseInt(this.view.retornaNumeroElementosBorrado().getText());
                int respuesta = model.borrarString(x, y);
                String dato;

                dato = model.imprimirLd();

                if (respuesta == 1) {

                    this.view.retornaRespuesta().setText("Fallo Primer Parametro!!");
                } else if (respuesta == 2) {

                    this.view.retornaRespuesta().setText("Fallo Segundo Parametro!!");
                } else if (respuesta == 3) {

                    this.view.retornaRespuesta().setText("Borrado Exitoso :)");
                    this.view.retornaAreaVisualizacion().setText(this.view.retornaAreaVisualizacion().getText() + "\n" + dato);
                }
            }

        }

        if (comando.equals("ValidePalindromo")) {
            boolean respuesta;
            JOptionPane.showMessageDialog(null, "Esta opcion comprueba si la Hilera que ingreso se lee de igual forma \n en ambos sentidos Ej: reconocer ");
            respuesta = this.model.esPalindromo();
            if (respuesta == true) {

                this.view.retornaRespuestaCom().setText("Felicitaciones Su Hilera es Palindromo");

            } else {
                this.view.retornaRespuestaCom().setText("Lo sentimos  Su Hilera no es Palindromo");

            }
        }

        if (comando.equals("OrdenarLIsta")) {
            JOptionPane.showMessageDialog(null, "Ordena lista");
            model.ordenarLIsta();
            this.view.retornaAreaVisualizacion().append("\n" + model.imprimirLd());

        }

        if (comando.equals("ValidarAnagrama")) {
            JOptionPane.showMessageDialog(null, "Validando si es anagrama");
            Hilera comprobar = new Hilera();
            comprobar.insertHilera(this.view.retornaCuadroAnagrama().getText());
            this.view.retornaAreaVisualizacion().append("\n" + "Es anagrama " + model.esAnagrama(comprobar));;

        }

        if (comando.equals("InvertirHilera")) {

            JOptionPane.showMessageDialog(null, "Invirtiendo Hileras");
            model.invertirHilera();
            System.out.println("");
            this.view.retornaAreaVisualizacion().append("\n" + model.imprimirLd());;

        }

        if (comando.equals("ModificarHilera")) {
            String cad = this.view.retornaCuadroModificar().getText();
            Hilera t = new Hilera();
            t.insertHilera(cad);

            int i = Integer.parseInt(this.view.retornaPosModificar().getText());
            int j = Integer.parseInt(this.view.retornaCantModificar().getText());
            model.modificarHilera2(i, j, t);
            this.view.retornaAreaVisualizacion().append("\n" + model.imprimirLd());

        }

        if (comando.equals("EjecutarSubString")) {
            JOptionPane.showMessageDialog(null, "Ejecutando substring");
            int i = Integer.parseInt(this.view.retornaPosicionInicialSubString().getText());
            int j = Integer.parseInt(this.view.retornaNumPosicionesSubString().getText());
            Hilera aux;
            aux = model.subString(i, j);
            if (aux == null) {
                JOptionPane.showMessageDialog(null, "Fallaron Parametros");
            } else {
                this.view.retornaAreaVisualizacion().append("\n" + "String Original" + model.imprimirLd());
                this.view.retornaAreaVisualizacion().append("\n" + "SubString " + aux.imprimirLd());

            }

        }

    }

}
