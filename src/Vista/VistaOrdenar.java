/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;

/**
 *
 * @author DEIRY
 */
public class VistaOrdenar extends javax.swing.JPanel {

    /**
     * Creates new form VistaOrdenar
     */
    public VistaOrdenar() {
        initComponents();
    }
    
    /**
 * Metodo que recupera un objeto tipo JButton con name BotonOrdenar 
 * @return un objeto tipo JButton
 */

public JButton retornaBotonOrdenar()
{
    return BotonOrdenar;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonOrdenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BotonOrdenar.setText("Ordenar");
        BotonOrdenar.setEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/ordenarEx.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotonOrdenar)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(BotonOrdenar)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonOrdenar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}