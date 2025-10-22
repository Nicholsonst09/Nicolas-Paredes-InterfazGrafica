/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controladores.ConversorControlador;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Front extends javax.swing.JFrame {

    private ConversorControlador controlador;
    
    public Front() {
        initComponents();
        inicializar();
    }

    private void inicializar(){
        controlador = new ConversorControlador(this);
    }

    public JComboBox<String> getCmbTipoConversion() {
        return cmbTipoConversion;
    }

    public JTextField getTxtTemperaturaInicial() {
        return txtTemperaturaInicial;
    }

    public JTextField getTxtTemperaturaConvertida() {
        return txtTemperaturaConvertida;
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTemperaturaInicial = new javax.swing.JTextField();
        txtTemperaturaConvertida = new javax.swing.JTextField();
        cmbTipoConversion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtTemperaturaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, -1));

        txtTemperaturaConvertida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaConvertidaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTemperaturaConvertida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 90, -1));

        cmbTipoConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius a Fahrenheit", "Fahrenheit a Celsius" }));
        getContentPane().add(cmbTipoConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 170, -1));

        jLabel1.setText("Resultado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 120, -1));

        jLabel2.setText("Temperatura inicial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperaturaConvertidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaConvertidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaConvertidaActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        controlador.convertirTemperatura();
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbTipoConversion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTemperaturaConvertida;
    private javax.swing.JTextField txtTemperaturaInicial;
    // End of variables declaration//GEN-END:variables
}
