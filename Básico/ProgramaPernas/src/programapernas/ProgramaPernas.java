/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Mauro Lima
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o número de pernas: ");
        int pernas = tec.nextInt();
        String tipo;
        
        System.out.print("Isso é um(a) ");
        switch (pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        
        System.out.println(tipo);
    }
    
}
