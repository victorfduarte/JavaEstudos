/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores01;

/**
 *
 * @author Mauro Lima
 */
public class Vetores01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 5, 8, 4, 7, 2};
        
        System.out.println("Total de índices: " + n.length);
        for (int c=0; c <= 5; c++) {
            System.out.println("Na posição " + c + " temos " + n[c]);
        }
    }
    
}
