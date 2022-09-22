/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**
 *Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 * @author Geral
 */
public class exerc02 {
    public static void main (String []ars){
        
        Scanner sc = new Scanner (System.in);
        
        boolean flag = true;
        
        do {
            
            System.out.println("Qual será o tamanho do vetor?");
            int tamanho = sc.nextInt();
            
            int vetA []= new int [tamanho];
            int media = 0;
            int soma = 0;
            
            for (int i = 0; i < vetA.length; i++){
                System.out.println("Insira o valor do vetor na posição["+i+"]");
                vetA[i]= sc.nextInt();
            }
                System.out.println();
                System.out.println("Números inseridos:");
             for (int i = 0; i < vetA.length; i++){
                System.out.println("O número na posição["+i+"] é"+vetA[i]);
                soma += vetA[i];
            }
                media = soma/vetA.length;
                
                System.out.println();
                System.out.println("MÉDIA = "+media);
                System.out.println();
                System.out.println("SOMA = "+soma);
                
                System.out.println("Deseja executar o programa novamente? (S)im/ (N)ão");
                char resp = sc.next().charAt(0);
                System.out.println();
                if (resp == 's'){
                    flag = true;
                
                }else if (resp == 'n') {
                    flag = false;
                    }
            }while (flag == true);
        
    }
    
}
