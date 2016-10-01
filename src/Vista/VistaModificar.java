/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Validaciones;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author DEIRY
 */
public class VistaModificar extends javax.swing.JPanel {

    /**
     * Creates new form VistaModificar
     */
    public VistaModificar() {
        initComponents();
    }
    
    /**
     * Metodo que recupera un objeto tipo JButton con name botonModificar
     *
     * @return un objeto tipo JButton
     */
    public JButton retornaBotonModificar() {
        return botonModificar;
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name cuadroModificar
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaCuadroModificar() {
        return cuadroModificar;
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name cuadroPosModicar
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaPosModificar() {
        return cuadroPosModicar;
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name
     * cuadroCantModificar
     *
     * @return un objeto tipo JTextField
     */

    public JTextField retornaCantModificar() {
        return cuadroCantModificar;
    }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cuadroModificar = new javax.swing.JTextField();
        cuadroPosModicar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cuadroCantModificar = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        before = new javax.swing.JLabel();
        next = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Hilera"));

        jLabel11.setText("Posición inicial");

        jLabel12.setText("Hilera a reemplazar");

        cuadroModificar.setEnabled(false);
        cuadroModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadroModificarKeyTyped(evt);
            }
        });

        cuadroPosModicar.setEnabled(false);
        cuadroPosModicar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadroPosModicarKeyTyped(evt);
            }
        });

        jLabel13.setText("Cantidad de caracteres");

        cuadroCantModificar.setEnabled(false);
        cuadroCantModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadroCantModificarKeyTyped(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(131, 196, 76));
        botonModificar.setText("Modificar");
        botonModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonModificar.setEnabled(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuadroModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cuadroCantModificar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cuadroPosModicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cuadroModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroPosModicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cuadroCantModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        before.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/before.png"))); // NOI18N

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/next.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(before)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(before, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cuadroPosModicarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroPosModicarKeyTyped
        // TODO add your handling code here:
        if (!Validaciones.numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_cuadroPosModicarKeyTyped

    private void cuadroCantModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroCantModificarKeyTyped
        // TODO add your handling code here:
        if (!Validaciones.numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_cuadroCantModificarKeyTyped

    private void cuadroModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroModificarKeyTyped
        // TODO add your handling code here:
        
        if(!Validaciones.letras(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_cuadroModificarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel before;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cuadroCantModificar;
    private javax.swing.JTextField cuadroModificar;
    private javax.swing.JTextField cuadroPosModicar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JLabel next;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getBefore() {
        return before;
    }

    public javax.swing.JLabel getNext() {
        return next;
    }
}
