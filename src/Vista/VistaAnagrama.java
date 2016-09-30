/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author DEIRY
 */
public class VistaAnagrama extends javax.swing.JPanel {

    /**
     * Creates new form VistaAnagrama
     */
    public VistaAnagrama() {
        initComponents();
    }

    /**
     * Metodo que recupera un objeto tipo JTextField con name cuadroAnagrama
     *
     * @return un objeto tipo JTextField
     */
    public JTextField retornaCuadroAnagrama() {
        return cuadroAnagrama;
    }

    /**
     * Metodo que recupera un objeto tipo JButton con name botonAnagrama
     *
     * @return un objeto tipo JButton
     */

    public JButton retornaBotonAngrama() {
        return botonAnagrama;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        cuadroAnagrama = new javax.swing.JTextField();
        botonAnagrama = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Ingrese palabra a evaluar");

        cuadroAnagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroAnagramaActionPerformed(evt);
            }
        });
        cuadroAnagrama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadroAnagramaKeyTyped(evt);
            }
        });

        botonAnagrama.setText("Cargar");
        botonAnagrama.setEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/anagramaEx.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cuadroAnagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAnagrama))
                    .addComponent(jLabel10))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroAnagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnagrama))
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cuadroAnagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroAnagramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroAnagramaActionPerformed

    private void cuadroAnagramaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroAnagramaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_cuadroAnagramaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnagrama;
    private javax.swing.JTextField cuadroAnagrama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}
