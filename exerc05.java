/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**
 *Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
 * @author Geral
 */
public class exerc05 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true; 
        int maior =0;
        int posicao =0;
        
        do {
            System.out.println("Quantos números serão testados?");
            int tam = sc.nextInt();
            
            int vetA[] = new int [tam];
            
            for (int i = 0; i < vetA.length; i++){
                System.out.println("Insira o valor do vetor na posição["+i+"]");
                vetA[i]= sc.nextInt();
            }
            
            System.out.println();
             for (int i = 0; i < vetA.length; i++){
                 if (vetA[i]>maior){
                     maior = vetA[i];
                     posicao++;
                 }
             }
            System.out.println("MAIOR VALOR:"+ maior);
            System.out.println("POSIÇÃO DO MAIOR VALOR:"+posicao);
            
            System.out.println();
            System.out.println("Deseja executar o programa novamente? (S)im/ (N)ão");
            char resp = sc.next().charAt(0);
            
            if (resp == 's'){
                flag = true;
                
            }else if (resp == 'n') {
                flag = false;
            }
            
        }while (flag == true);
        
    }
    
}
