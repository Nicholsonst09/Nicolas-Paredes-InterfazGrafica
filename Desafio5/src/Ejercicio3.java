/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3 extends javax.swing.JFrame {

    public Ejercicio3() {
        initComponents();
        configurarLista();
    }

    private void configurarLista() {
        // Crear el modelo de datos para la lista
        DefaultListModel<String> modelo = new DefaultListModel<>();

        // Agregar los lenguajes
        modelo.addElement("Java");
        modelo.addElement("Python");
        modelo.addElement("C++");
        modelo.addElement("JavaScript");
        modelo.addElement("Rust");
        modelo.addElement("Golang");
        modelo.addElement("Solidity");
        modelo.addElement("PHP");
        modelo.addElement("MQL5");

        // Asignar el modelo a la lista
        lstLenguajes.setModel(modelo);

        // Configurar selección simple (solo un elemento a la vez)
        lstLenguajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        // Agregar listener para detectar doble clic
        lstLenguajes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Detecta doble clic
                    int index = lstLenguajes.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        String lenguajeSeleccionado = lstLenguajes.getModel().getElementAt(index);
                        mostrarInfo(lenguajeSeleccionado);
                    }
                }
            }
        });
    }
    
    private void mostrarInfo(String lenguaje) {
        String info = "";
        
        switch(lenguaje) {
            case "Java":
                info = "Orientado a objetos, utilizado principalmente en aplicaciones\n" +
                       "empresariales, desarrollo de aplicaciones móviles Android y\n" +
                       "sistemas distribuidos. Conocido por su portabilidad gracias\n" +
                       "a la máquina virtual Java (JVM).";
                break;
                
            case "Python":
                info = "Interpretado, de alto nivel y fácil de aprender.\n" +
                       "Ampliamente utilizado en ciencia de datos, desarrollo web,\n" +
                       "automatización, inteligencia artificial y desarrollo de\n" +
                       "software en general.";
                break;
                
            case "C++":
                info = "De bajo nivel orientado a objetos que extiende a C.\n" +
                       "Muy utilizado en desarrollo de sistemas, videojuegos y\n" +
                       "aplicaciones que requieren un alto rendimiento y control\n" +
                       "sobre los recursos del sistema.";
                break;
                
            case "JavaScript":
                info = "Usado principalmente para desarrollo web del lado del cliente.\n" +
                       "Permite crear sitios web interactivos y dinámicos.\n" +
                       "También se usa en el back-end con Node.js.";
                break;
                
            case "Rust":
                info = "Moderno centrado en la seguridad, la concurrencia y el rendimiento.\n" +
                       "Utilizado principalmente en aplicaciones de sistemas y software\n" +
                       "de bajo nivel, destacándose por evitar errores de memoria.";
                break;
                
            case "Golang":
                info = "Creado por Google. Diseñado para programación de sistemas,\n" +
                       "desarrollo web y otras aplicaciones. Con su fuerte soporte\n" +
                       "para la concurrencia y la facilidad de uso, es una herramienta\n" +
                       "valiosa en el kit de herramientas de programación.";
                break;
                
            case "Solidity":
                info = "Utilizado para escribir contratos inteligentes en la blockchain\n" +
                       "de Ethereum. Permite crear aplicaciones descentralizadas (dApps)\n" +
                       "y gestionar activos digitales de forma segura.";
                break;
                
            case "PHP":
                info = "De uso general utilizado principalmente para el desarrollo web\n" +
                       "del lado del servidor. Es uno de los lenguajes más populares\n" +
                       "para crear sitios web dinámicos y aplicaciones web.";
                break;
                
            case "MQL5":
                info = "MetaQuotes Language 5, orientado a objetos de alto nivel.\n" +
                       "Destinado para diseñar estrategias automáticas de trading,\n" +
                       "indicadores técnicos personalizados con el fin de analizar\n" +
                       "diferentes mercados financieros.";
                break;
                
            default:
                info = "No hay información disponible para este lenguaje.";
                break;
        }
        
        // Mostrar el mensaje con la información
        JOptionPane.showMessageDialog(this, 
                                     info, 
                                     "Información sobre " + lenguaje, 
                                     JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstLenguajes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstLenguajes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstLenguajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, 170));

        jLabel1.setText("Lenguajes de Programación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 240, -1));

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
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstLenguajes;
    // End of variables declaration//GEN-END:variables
}
