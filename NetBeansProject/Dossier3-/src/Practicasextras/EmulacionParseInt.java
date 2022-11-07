/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class EmulacionParseInt {
    
    public static int outParseInt(String strNumero){
        

        int parseInt = 0;
        
        for (int i = 0; i < strNumero.length(); i++) {
            char charAt = strNumero.charAt(i);
            int digito = charAt - '0';
            if(digito >9 || digito < 0){
                throw new NumberFormatException(charAt);
            }
            parseInt *= 10;
            parseInt += digito;
            
        }
        return parseInt;
    
            
        }
            
        
        
}
    
    
    
    public static void main(String[] args) {
    
        
   String numString;
   int     
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un numero y te lo devuevlo multiplicado");
    numString = sc.nextLine();
    numInt = outParseInt(numero);
    
    }

    
    
}
