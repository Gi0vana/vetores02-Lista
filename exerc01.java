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
        
        System.out.println("Quantos números irá digitar?");
        int tamanho = sc.nextInt();
        
        int vetA []= new int [tamanho];
            
        for (int i = 0; i < vetA.length; i++){
        System.out.println("Indique o valor do vetor A na posição["+i+"]:");
        vetA[i]= sc.nextInt();
        }
            System.out.println("Números digitados:");
        for (int i = 0; i < vetA.length; i++){
            System.out.println("Numéro:"+vetA[i]);
        }
            System.out.println();
            System.out.println("Números impares:");
        for (int i = 0; i < vetA.length; i++){
            
            if ((vetA[i]%2)!=0){
                System.out.println("Ímpar :"+vetA[i]);
            }}
        
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
