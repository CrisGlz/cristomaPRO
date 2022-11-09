/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicasextras;

/**
 *
 * @author Cris
 */
public class EmulacionParseDouble {
    
    public static void main(String[] args) {
        
    
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
        
    }
    
    
}
