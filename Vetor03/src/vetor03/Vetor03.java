/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Mauro Lima
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float v[] = {3.5f, 2.75f, 9, -4.5f};
        Arrays.sort(v);
        for (float valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
