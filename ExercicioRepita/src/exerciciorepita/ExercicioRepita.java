/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauro Lima
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int total = 0;
        int pares = 0;
        int impares = 0;
        int a_cem = 0;
        int soma = 0;
        String msg = "Informe um número:\n(valor 0 interrompe)";
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            
            if (n == 0) break;
            
            soma += n;
            total++;
            
            if (n > 100) a_cem++;
            
            if (n%2 == 0) {
                pares++;
            } else {
                impares++;
            }
            
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "Resultado final" +
                "\n----------------------------" +
                "\nTotal de Valores: " + total + 
                "\nTotal de Pares: " + pares +
                "\nTotal de Ímpares: " + impares +
                "\nAcima de 100: " + a_cem +
                "\nMédia dos Valores: " + soma/total);
    }
    
}
