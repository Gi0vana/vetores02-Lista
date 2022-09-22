/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**
 *
 * @author Geral
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 

 */
public class exerc03 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true; 
        int qtdM = 0;
        int porcentM = 0;
        double somaAlt = 0;
        double mediaAlt = 0;
        
        do {
            System.out.println("Quantas pessoas serão?");
            int tam = sc.nextInt();
            System.out.println();
            
            String vetNome [] = new String [tam];
            int vetIdade [] = new int [vetNome.length];
            double vetAlt [] = new double [vetNome.length];
            
            for (int i = 0; i < vetNome.length; i++){
                System.out.println("Insira os dados da pessoa número  ["+(i+1)+"]:");
                System.out.println("Informe o nome da pessoa:");
                vetNome[i]= sc.next();
                System.out.println("Informe a idade dessa pessoa.");
                vetIdade[i]= sc.nextInt ();
                System.out.println("Informe a altura dessa pessoa.");
                vetAlt[i]= sc.nextDouble();
            }
            
            for (int i = 0; i < vetNome.length; i++){
                System.out.println();
                System.out.println("Pessoa número  ["+(i+1)+"]:");
                System.out.println("Nome:"+vetNome[i]);
                System.out.println("Idade:"+vetIdade[i]);
                System.out.println("Altura:"+vetAlt[i]);
                somaAlt += vetAlt[i];
            }
                mediaAlt = somaAlt/vetNome.length;
                System.out.println();
                System.out.println("MÉDIA DA ALTURAS:"+mediaAlt);
                System.out.println();
                System.out.println("PESSOAS COM MENOS DE 16 ANOS:");
            for (int i = 0; i < vetNome.length; i++){
                if (vetIdade[i]< 16){
                    System.out.println("Nome:"+vetNome[i]);
                    qtdM ++;
                }
            }
                porcentM = (qtdM*100)/vetNome.length;
            
                System.out.println("A porcentagem de pessoas com menos de 16 anos é:"+porcentM+"%");
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
