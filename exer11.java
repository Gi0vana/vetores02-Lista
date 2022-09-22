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
public class exer11 {
    public static void main (String []args){
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true;
        char resp;
        
        do {
            System.out.println("Insira a quantidade de pessoas.");
            int qtd = sc.nextInt();
            
            double vetAltura[] = new double [qtd];
            String vetGenero [] = new String [vetAltura.length];
            double menorAltura = 0;
            double maiorAltura = 0;
            double mediaAlturaMulheres = 0;
            int qtdHomens = 0;
            
            for (int i = 0; i < vetAltura.length; i++){ 
                
                System.out.println("Genero da pessoa "+(i+1)+": (OBS: (M)asculino e (F)eminino.");
                vetGenero[i] = sc.next();
                System.out.println("Genero da pessoa "+(i+1)+": (OBS: (M)asculino e (F)eminino.");
                vetAltura[i]= sc.nextDouble();
                
            }
            
            for (int i = 0; i < vetAltura.length; i++){
                
                if (vetAltura[i] > maiorAltura ){
                    maiorAltura = vetAltura[i];
                }  
            }
            
            for (int i = 0; i < vetAltura.length; i++){
                
                if ( vetAltura[i] < maiorAltura){
                    menorAltura = vetAltura[i];
                }
            }
             System.out.println("Deseja roda o programa novamente? (S)im/(N)ão.");
             resp = sc.next().charAt(0);
            
            if (resp == 's'){
                flag = true;
                
            }else if (resp == 'n') {
                flag = false;
                
            }
            
        } while (flag == true);
          
                
    }
    
}
