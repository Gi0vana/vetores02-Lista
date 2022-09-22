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
public class exerc10 {
    public static void main (String []args){
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true;
        
        do {
            
            System.out.println("Quantos alunos serão digitados?");
            int qtd = sc.nextInt();
            
            String vetAluno [] = new String [qtd];
            double vetNota1 [] = new double [vetAluno.length];
            double vetNota2 [] = new double [vetAluno.length];
            double media [] = new double [vetAluno.length];
            
                   
            for (int i = 0; i < vetAluno.length; i++){
                System.out.print("Nome do aluno: ");
                vetAluno[i] = sc.next();   
                System.out.println("Nota 1 do aluno: ");
                vetNota1[i] = sc.nextDouble();
                System.out.println("Nota 2 do aluno: ");
                vetNota2[i] = sc.nextDouble();
                
            }
            
            for (int i = 0; i < vetAluno.length; i++){
                media [i] = (vetNota1[i] + vetNota2[i])/2;
                
            }
            System.out.println("APROVADOS");
            for (int i = 0; i < vetAluno.length; i++){
                if (media[i] > 6){
                    System.out.println(vetAluno[i]);
                    
                }
                
            }
          
            System.out.println("Deseja roda o programa novamente? (S)im/(N)ão.");
            char resp = sc.next().charAt(0);
            
            if (resp == 's'){
                flag = true;
                
            }else if (resp == 'n') {
                flag = false;
                
            }
            
        } while (flag == true);
        
    }
    
}
