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
public class exerc09 {
    public static void main (String[]args){
        
        Scanner sc = new Scanner (System.in);
        boolean flag = true; 
        
            do {
            String nomeDapessoa = null;
            int maiorIdade = 0;
            System.out.println("Quantas pessoas serão?");
            int tam = sc.nextInt();
            System.out.println();
            
            int vetIdade [] = new int [tam];
            String vetNome [] = new String [vetIdade.length];
            
            for (int i = 0; i < vetNome.length; i++){
                System.out.println("Insira os dados da pessoa número  ["+(i+1)+"]:");
                System.out.println("Informe o nome da pessoa:");
                vetNome[i]= sc.next();
                System.out.println("Informe a idade dessa pessoa.");
                vetIdade[i]= sc.nextInt ();
            }
            
            System.out.println();
            for (int i = 0; i < vetNome.length; i++){
                     
                if (vetIdade[i] > maiorIdade){
                    maiorIdade = vetIdade[i];
                    nomeDapessoa = vetNome[i];
                }
             
            }   
                
                System.out.println("A pessoa de maior idade tem:"+ nomeDapessoa);    
                System.out.println(); 
                System.out.println("Deseja executar o programa novamente? (S)im/ (N)ão");
                char resp = sc.next().charAt(0);
                
                if (resp == 's'){
                flag = true;
                
                }else if (resp == 'n') {
                flag = false;
                
                }
            
            } while(flag == true);
       
    }

}
