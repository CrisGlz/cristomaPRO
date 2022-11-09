/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicasextras;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class EmulacionParseDouble {
    
          
public static double nuestroParsedouble(String strNumero) throws NumberFormatException{
       
        double parseDouble = 0;
        int posicionSigno = -1;
        int signo = 1;
        if( strNumero.charAt(0)=='-')
            posicionSigno = 0;
        signo = -1;
        
        for (int i = posicionSigno + 1; i < strNumero.length(); i++) {
           char charAt = strNumero.charAt(i);
            //System.out.println(charAt);
            double digito = charAt - '0';
            if (digito > 9 ||digito < 0) {
               // throw new NumberFormatException("El caracter: " + charAt + " no es un digito");
                System.out.println(digito);
            }
           // System.out.println(digito);
           parseDouble /=10; 
           parseDouble += digito; 
           //234
        }
        return parseDouble;
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero en string y lo convertire en int");
        String numStr = sc.nextLine();
        System.out.println("Tu numero es: " + nuestroParsedouble(numStr));
}
}