/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Mauro Lima
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vet);
        
        int pos = Arrays.binarySearch(vet, 6);
        
        for (int valor: vet) {
            System.out.print(valor + " ");
        }
        
        System.out.println();
        System.out.println("Encontrei o valor na posição " + pos);
    }
    
}
