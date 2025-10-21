/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Conversor;
import vista.Front;
import javax.swing.JOptionPane;

public class ConversorControlador {
    private Front vista;
    private Conversor modelo;

    public ConversorControlador(Front vista) {
        this.vista = vista;
        this.modelo = new Conversor();
    }
    
    public void convertirTemperatura(){
        try{
            String temperaturaInicial = vista.getTxtTemperaturaInicial().getText().trim();
            
            if (temperaturaInicial.isEmpty()) {
                JOptionPane.showMessageDialog(vista, 
                    "Por favor, ingrese una temperatura.", 
                    "Campo vacío", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double temperatura = Double.parseDouble(temperaturaInicial);
            
            String tipoConversion = vista.getCmbTipoConversion().getSelectedItem().toString();
            
            double resultado = 0;
            
            if (tipoConversion.equals("Celsius a Fahrenheit")) {
                resultado = modelo.celsiusAFahrenheit(temperatura);
                vista.getTxtTemperaturaConvertida().setText(String.format("%.2f °F", resultado));
            } 
            else if (tipoConversion.equals("Fahrenheit a Celsius")) {
                resultado = modelo.fahrenheitACelsius(temperatura);
                vista.getTxtTemperaturaConvertida().setText(String.format("%.2f °C", resultado));
            }
            
            

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista,
                    "Error: Debe ingresar un número válido.\n"
                    + "Use punto (.) para decimales.",
                    "Formato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
            vista.getTxtTemperaturaInicial().setText("");
            vista.getTxtTemperaturaInicial().requestFocus();
        }
    }  
        
    public void limpiarCampos(){
        vista.getTxtTemperaturaInicial().setText("");
        vista.getTxtTemperaturaConvertida().setText("");
        vista.getTxtTemperaturaInicial().requestFocus();
    }   
}
