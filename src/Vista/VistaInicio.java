/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DEIRY
 */
public class VistaInicio extends javax.swing.JFrame {

    private JTabbedPane panel;
    private VistaInsertar vistaInsert;
    private VistaEliminar vistaEliminar;
    private VistaInvertir vistaInvertir;
    private VistaModificar vistaModificar;
    private VistaOrdenar vistaOrdenar;
    private VistaSubhilera vistaSub;
    private VistaPalindromo vistaPalindromo;
    private VistaAnagrama vistaAnagrama;
    private MouseAdapter evtNext, evtBefore;
    private int contTab;

    /**
     * Creates new form VistaInicio
     */
    public VistaInicio() {
        this.setBackground(Color.white);
        this.setForeground(Color.red);
        initComponents();
        contTab = 0;
        panel = new JTabbedPane();
        vistaInsert = new VistaInsertar();
        vistaEliminar = new VistaEliminar();
        vistaModificar = new VistaModificar();
        vistaInvertir = new VistaInvertir();
        vistaOrdenar = new VistaOrdenar();
        vistaSub = new VistaSubhilera();
        vistaPalindromo = new VistaPalindromo();
        vistaAnagrama = new VistaAnagrama();
        addTab();
        panel.setBackground(Color.white);

        evtNext = new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                contTab = panel.getSelectedIndex();
                if (contTab++ == 8) {
                    panel.setSelectedIndex(0);
                } else {
                    panel.setSelectedIndex(contTab++);
                }
            }
        };

        evtBefore = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                contTab = panel.getSelectedIndex() - 1;
                panel.setSelectedIndex(contTab);
            }
        };
        iniciarEventos();
        this.panelMundo.add(panel);
    }
    /**
     * Metodo que añade las pestañas al Objeto JTabbed Panel 
     */
    public void addTab() {
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/insert.png")), vistaInsert, "Insertar Hilera");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/modify.png")), vistaModificar, "Modificar Hilera");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/delete.png")), vistaEliminar, "Eliminar Hilera");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/ordenar2.png")), vistaOrdenar, "Ordenar Hilera");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/anagrama2.png")), vistaAnagrama, "Verificar si Hilera es anagrama");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/palindro2.png")), vistaPalindromo, "Verificar Hilera si es palindromo");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/reverse2.png")), vistaInvertir, "Invertir Hilera");
        panel.addTab("", new ImageIcon(getClass().getResource("/Vista/Recursos/subHilera2.png")), vistaSub, "Extraer SubHilera");
        panel.setSelectedIndex(contTab);
    }
    /**
     * Inicializa los eventos para avanzar a la siguiente pestaña
     */
    public void iniciarEventos() {

        vistaInsert.getNext().addMouseListener(evtNext);
        vistaEliminar.getNext().addMouseListener(evtNext);
        vistaModificar.getNext().addMouseListener(evtNext);
        vistaInvertir.getNext().addMouseListener(evtNext);
        vistaOrdenar.getNext().addMouseListener(evtNext);
        vistaPalindromo.getNext().addMouseListener(evtNext);
        vistaAnagrama.getNext().addMouseListener(evtNext);
        vistaEliminar.getBefore().addMouseListener(evtBefore);
        vistaModificar.getBefore().addMouseListener(evtBefore);
        vistaInvertir.getBefore().addMouseListener(evtBefore);
        vistaOrdenar.getBefore().addMouseListener(evtBefore);
        vistaSub.getBefore().addMouseListener(evtBefore);
        vistaPalindromo.getBefore().addMouseListener(evtBefore);
        vistaAnagrama.getBefore().addMouseListener(evtBefore);
    }

    /**
     * La situiente funcion limpia un panel JPanel para posteriormente dibujar
     * el panel que se necesita
     *
     * @param jp panel que se va limpiar
     */
    public void cleanPanel(JPanel jp) {
        jp.removeAll();
        jp.repaint();
        jp.revalidate();
    }

    /**
     * La siguiente funcion agregar el panel que se va usar jp en el panel
     * JPanelWork
     *
     * @param jp es el panel que se va agregar en el panel JpOri
     */
    public void setPanel(JPanel jp, JPanel jpOri) {
        jpOri.add(jp);
        jpOri.repaint();
        jpOri.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaVisualizacion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        panelMundo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AreaVisualizacion.setColumns(20);
        AreaVisualizacion.setRows(5);
        jScrollPane1.setViewportView(AreaVisualizacion);

        jLabel2.setText("Secuencia de la hilera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelMundo.setBackground(new java.awt.Color(255, 255, 255));
        panelMundo.setPreferredSize(new java.awt.Dimension(600, 350));
        panelMundo.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(panelMundo, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelMundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaVisualizacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMundo;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que recupera un objeto tipo JTextField con name CuadroString
     *
     * @return retorna un objeto JTextField
     */
    public JTextField retornaCuadroString() {
        System.out.println("vista cuadro" + vistaInsert.retornaCuadroString());
        return vistaInsert.retornaCuadroString();
    }

    /**
     * Metdo que recupera un objeto tipo JButton con name cargaString
     *
     * @return retorna un objeto tipo JButton
     */
    public JButton retornaBotonCargaString() {
        return vistaInsert.retornaBotonCargaString();
    }

    /**
     * Metodo que recupera un objeto tipo JTextArea con name AreaVisualizacion
     *
     * @return retorna un objeto tipo JTextArea
     */
    public JTextArea retornaAreaVisualizacion() {
        return AreaVisualizacion;
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name valInicial
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaValInicialBorrado() {
        return vistaEliminar.retornaValInicialBorrado();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name numerElementos
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaNumeroElementosBorrado() {
        return vistaEliminar.retornaNumeroElementosBorrado();
    }

    /**
     * Metodo que recupera un objeto tipo JComboBox con name RespuestaBorrado
     *
     * @return un objeto tipo JComboBox
     */
    public JComboBox retornaComboBorrado() {
        return vistaEliminar.retornaComboBorrado();

    }

    /**
     * Metodo que recupera un objeto tipo JButton con name borradoEditado
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonBorrado() {
        return vistaEliminar.retornaBotonBorrado();
    }

    /**
     * Metodo que recupera un objeto tipo JLabel con name Respuesta
     *
     * @return un objeto tipo JLabel
     */
    public JLabel retornaRespuesta() {
        return vistaEliminar.retornaRespuesta();
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name VerificaPalindromo
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonPalindromo() {
        return vistaPalindromo.retornaBotonPalindromo();
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name BotonOrdenar
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonOrdenar() {
        return vistaOrdenar.retornaBotonOrdenar();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name cuadroAnagrama
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaCuadroAnagrama() {
        return vistaAnagrama.retornaCuadroAnagrama();
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name botonAnagrama
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonAngrama() {
        return vistaAnagrama.retornaBotonAngrama();
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name botonInvertir
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonInvertir() {
        return vistaInvertir.retornaBotonInvertir();
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name botonModificar
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonModificar() {
        return vistaModificar.retornaBotonModificar();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name cuadroModificar
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaCuadroModificar() {
        return vistaModificar.retornaCuadroModificar();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name cuadroPosModicar
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaPosModificar() {
        return vistaModificar.retornaPosModificar();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name
     * cuadroCantModificar
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaCantModificar() {
        return vistaModificar.retornaCantModificar();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name
     * posicionInicialSubString
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaPosicionInicialSubString() {
        return vistaSub.retornaPosicionInicialSubString();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name
     * numPosicionSubString
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaNumPosicionesSubString() {
        return vistaSub.retornaNumPosicionesSubString();
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name ejecutaSubString
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotoEjecutarSubString() {
        return vistaSub.retornaBotoEjecutarSubString();
    }

    /**
     * Metodo que retorna el cuadro de texto para agregar una hilera a la lista
     * orignal
     *
     * @return Cuadro de texto con el string a agregar
     */
    public JTextField retornaCuadroAgregar() {
        return vistaInsert.retornaCuadroAgregar();
    }

    /**
     * Metodo que retorna el boton para para agregar una hilera a la lista
     * orignal
     *
     * @return Boton con el string a agregar
     */
    public JButton retornaBotonAgregar() {
        return vistaInsert.retornaBotonAgregar();
    }
}
