/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**
 *
 * @author giovanagomesdasilva
 */
public class exerc07 {

    /**
     * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true;
        double soma = 0;
        double media = 0;
        
        do {
            
            System.out.println("Insira o tamanho do vetor.");
            int tam = sc.nextInt();
            
            double vetA [] = new double [tam];
            
            System.out.println();
            for (int i = 0; i < vetA.length; i++){
                System.out.println("Insira o valor do vetor na posição["+i+"]");
                vetA[i]= sc.nextDouble();
            }
            for (int i = 0; i < vetA.length; i++){
               soma += vetA[i];
            }
               media = soma/vetA.length;
               System.out.println("MÉDIA DOS NÚMEROS = %.2f%n"+(media));
               System.out.println();
               System.out.println("NÚMEROS ABAIXO DA MÉDIA:");
            for (int i = 0; i < vetA.length; i++){
               if (vetA[i]<media){
                   System.out.println(vetA[i]);
               }
            }
            
        }while (flag==true);
        
    }
    
}
