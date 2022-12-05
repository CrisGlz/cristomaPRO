/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencristoprimeraevaluacion;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Ejercicio2 {
   
    static int numeroSuma(String num){
        
        int resultado = 0;
        for (int i = 3; i < num.length(); i++) {
            int sumamayor = i;
            
            
                }
        return resultado;
    }
    
    
    
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cifras");
        String num = sc.next();
        
        System.out.println(numeroSuma(num));
        
    }
}
