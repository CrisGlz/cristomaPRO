/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica30 {
    
    public static double seriePar(double n){
        
        double resultado;
        if(n == 2)
            resultado = 0.5;
        else if(n%2 !=0){
            resultado = serieImpar(n);
            
            
        }else{ // este caso n es par
            resultado = serieImpar(n-1) - 1/n;
        }
        return resultado;
    }
    
 public static double serieImpar(double n){
       
        double resultado;
        if( n== 1){
            resultado = 1;
        }else if(n%2 ==0){
            resultado = seriePar(n);
            
            
        }else{ 
            resultado = seriePar(n-1) + 1/n;
        }
        return resultado;
    }
    
 
    public static void main(String[] arImpargs) {
        
        double n = 3;
        
        System.out.println(seriePar(4));
        
    }
    
}
