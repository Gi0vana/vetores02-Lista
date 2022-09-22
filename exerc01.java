/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class exerc01 {
    public static void main (String[]args){
        
        Scanner sc = new Scanner (System.in);
        
        boolean flag = true;
        
        
        do {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Qual será o tamanho do vetor?");
        int tamanho = sc.nextInt();

        int vetA[] = new int[tamanho];

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Insira o valor do vetor na posição[" + i + "]:");
            vetA[i] = sc.nextInt();

        }

        System.out.println("NÚMEROS NEGATIVOS");
        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] < 0) {
                System.out.println(vetA[i]);
            }
    }
    
}
