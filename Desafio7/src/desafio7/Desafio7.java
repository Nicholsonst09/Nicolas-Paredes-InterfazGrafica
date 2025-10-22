/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio7;

import vista.Front;
import controladores.ConversorControlador;


public class Desafio7 {    
    public static void main(String[] args) {
        Front vista = new Front();
        new ConversorControlador(vista);
        vista.setVisible(true);
    }    
}
