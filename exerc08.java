/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**
 *
 * @giovanagomesdasilva
 */
public class exerc08 {

    /**
     * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
    aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
    digitado, mostrar a mensagem "NENHUM NUMERO PAR"
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true;
        
        double soma = 0;
        double media = 0;
        int paresqtd = 0;
        
        do {
            
                System.out.println("Insira o tamanho do vetor.");
            int tam = sc.nextInt();
            
            double vetA [] = new double [tam];
            
                System.out.println();
            for (int i = 0; i < vetA.length; i++){
                System.out.println("Insira o valor do vetor na posição["+i+"]");
                vetA[i]= sc.nextDouble();
            }
                System.out.println("NÚMEROS PARES");
            for (int i = 0; i < vetA.length; i++){
               if ((vetA[i]%2)==0){
                   paresqtd++;
                   soma += vetA[i];
                System.out.println(vetA[i]);
               }
               }
                media = soma / vetA.length;
                
                if (paresqtd == 0){
                System.out.println("NENHUM NÚMERO PAR!");
                } else if (paresqtd == 1);
                System.out.println("MÉDIA DOS NÚMEROS PARES:"+media);
              
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
