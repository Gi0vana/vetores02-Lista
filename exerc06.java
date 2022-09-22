/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    o vetor C gerado. 
 *
 * @author Geral
 */
public class exerc06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true; 
        
        do {
            
            System.out.println("Qual será o tamanho do vetor A e B?");
            int tam = sc.nextInt();
            
            int vetA [] = new int [tam];
            int vetB [] = new int [vetA.length];
            int vetC [] = new int [vetA.length];
            
            for (int i = 0; i < vetA.length; i++){
                System.out.println("Insira o valor do vetor A na posição["+i+"]");
                vetA[i]= sc.nextInt();
            }
                System.out.println();
                System.out.println();
            for (int i = 0; i < vetA.length; i++){
                System.out.println("Insira o valor do vetor B na posição["+i+"]");
                vetB[i]= sc.nextInt();
            }
                System.out.println();
            for (int i = 0; i < vetA.length; i++){
                vetC[i]= vetA[i]+vetB[i];
                System.out.println("O vetor C na posição["+i+"] é:"+vetC[i]);
            }
            
                System.out.println();
                System.out.println("Deseja executar o programa novamente? (S)im/ (N)ão");
            char resp = sc.next().charAt(0);
            
            if (resp == 's'){
                flag = true;
                
            }else if (resp == 'n') {
                flag = false;
            }
            
            
        } while (flag == true);
    }
    
}
