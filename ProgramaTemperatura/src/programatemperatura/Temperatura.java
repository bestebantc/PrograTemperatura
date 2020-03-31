/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatemperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Temperatura {
    float temperatura;
    int per;
    Temperatura (){
    }
     float ingresoTemp(){
            float grados = Float.valueOf(JOptionPane.showInputDialog("Ingrese la temperatura: "));
            return grados;
        }
}
