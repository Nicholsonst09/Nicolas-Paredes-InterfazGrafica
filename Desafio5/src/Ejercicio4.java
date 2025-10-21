/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

public class Ejercicio4 extends javax.swing.JFrame {

 
    public Ejercicio4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese su edad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 160, 30));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadKeyPressed(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 90, 40));

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        getContentPane().add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 70, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        try {
            // Intentar convertir el texto a número
            int edad = Integer.parseInt(txtEdad.getText().trim());

            // Validar si es menor de 18
            if (edad < 18) {
                JOptionPane.showMessageDialog(this,
                        "Eres menor de edad. Acceso denegado.\n"
                        + "Debes tener al menos 18 años para continuar.",
                        "Acceso Denegado",
                        JOptionPane.ERROR_MESSAGE);
            } // Validar si es un número negativo o cero
            else if (edad <= 0) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, ingrese una edad válida (mayor a 0).",
                        "Edad inválida",
                        JOptionPane.WARNING_MESSAGE);
            } // Validar si es un número muy alto (poco realista)
            else if (edad > 120) {
                JOptionPane.showMessageDialog(this,
                        "La edad ingresada parece poco realista.\n"
                        + "Verifique el valor.",
                        "Edad inválida",
                        JOptionPane.WARNING_MESSAGE);
            } // Si cumple todas las validaciones
            else {
                JOptionPane.showMessageDialog(this,
                        "¡Bienvenido!\n"
                        + "Tienes " + edad + " años.\n"
                        + "Acceso permitido.",
                        "Acceso Permitido",
                        JOptionPane.INFORMATION_MESSAGE);
            }        
        } catch (NumberFormatException e) {
            // Capturar excepción cuando no es un número
            JOptionPane.showMessageDialog(this,
                    "Error: Debe ingresar un número válido.\n"
                    + "Por favor, ingrese solo números (sin letras ni caracteres especiales).",
                    "Formato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        txtEdad.setText("");
        txtEdad.requestFocus();        
    }//GEN-LAST:event_btnValidarActionPerformed

    private void txtEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnValidar.doClick(); // Simula el clic en el botón
        }
    }//GEN-LAST:event_txtEdadKeyPressed

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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtEdad;
    // End of variables declaration//GEN-END:variables
}
