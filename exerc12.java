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
public class exerc12 {
    
    public static void main (String[]args){
        
     Scanner sc = new Scanner (System.in);   
     boolean flag = true; 
     
     do {
         
        
        
        
        
        
        
        
       System.out.println("Deseja roda o programa novamente? (S)im/(N)ão.");
          char  resp = sc.next().charAt(0);
            
            if (resp == 's'){
                flag = true;
                
            }else if (resp == 'n') {
                flag = false;
                
            }
            
        } while (flag == true); 
        
    }
    
}
