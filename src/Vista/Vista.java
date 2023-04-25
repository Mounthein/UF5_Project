/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorMainVista;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
/**
 *
 * @author marc
 */
public class Vista extends javax.swing.JFrame {
    
    private ControladorMainVista ctrl;
    /**
     * Creates new form Vista
     */
    public Vista(ControladorMainVista ctrl) {
        this.ctrl = ctrl;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filtreComboBox = new javax.swing.JComboBox<>();
        filtreAplicarButton = new javax.swing.JButton();
        addCpuButton = new javax.swing.JButton();
        modifyCpuButton = new javax.swing.JButton();
        deleteCpuButton = new javax.swing.JButton();
        filtreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        filtreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreComboBoxActionPerformed(evt);
            }
        });

        filtreAplicarButton.setText("Aplicar");
        filtreAplicarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreAplicarButtonActionPerformed(evt);
            }
        });

        addCpuButton.setText("Afegir Cpu");
        addCpuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCpuButtonActionPerformed(evt);
            }
        });

        modifyCpuButton.setText("Modificar Cpu");

        deleteCpuButton.setText("Eliminar Cpu");

        filtreLabel.setText("Filtre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1506, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifyCpuButton)
                            .addComponent(addCpuButton)
                            .addComponent(deleteCpuButton))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filtreLabel)
                            .addComponent(filtreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filtreAplicarButton)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addCpuButton, deleteCpuButton, modifyCpuButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filtreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtreAplicarButton)
                        .addGap(51, 51, 51)
                        .addComponent(addCpuButton)
                        .addGap(18, 18, 18)
                        .addComponent(modifyCpuButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCpuButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtreAplicarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreAplicarButtonActionPerformed
        // TODO add your handling code here:
        ctrl.applyFiltre();
    }//GEN-LAST:event_filtreAplicarButtonActionPerformed

    private void addCpuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCpuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCpuButtonActionPerformed

    private void filtreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_filtreComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista(null).setVisible(true);
            }
        });
    }

    public JButton getAddCpuButton() {
        return addCpuButton;
    }

    public void setAddCpuButton(JButton addCpuButton) {
        this.addCpuButton = addCpuButton;
    }

    public JButton getDeleteCpuButton() {
        return deleteCpuButton;
    }

    public void setDeleteCpuButton(JButton deleteCpuButton) {
        this.deleteCpuButton = deleteCpuButton;
    }

    public JButton getFiltreAplicarButton() {
        return filtreAplicarButton;
    }

    public void setFiltreAplicarButton(JButton filtreAplicarButton) {
        this.filtreAplicarButton = filtreAplicarButton;
    }

    public JComboBox<String> getFiltreComboBox() {
        return filtreComboBox;
    }

    public void setFiltreComboBox(JComboBox<String> filtreComboBox) {
        this.filtreComboBox = filtreComboBox;
    }

    public JLabel getFiltreLabel() {
        return filtreLabel;
    }

    public void setFiltreLabel(JLabel filtreLabel) {
        this.filtreLabel = filtreLabel;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JButton getModifyCpuButton() {
        return modifyCpuButton;
    }

    public void setModifyCpuButton(JButton modifyCpuButton) {
        this.modifyCpuButton = modifyCpuButton;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCpuButton;
    private javax.swing.JButton deleteCpuButton;
    private javax.swing.JButton filtreAplicarButton;
    private javax.swing.JComboBox<String> filtreComboBox;
    private javax.swing.JLabel filtreLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modifyCpuButton;
    // End of variables declaration//GEN-END:variables
}
