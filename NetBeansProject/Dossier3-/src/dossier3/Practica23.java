/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica23 {
    
    static int inversion(int n){
        
          int resultado;
          if( n <= 10){
            resultado = n;
             
        }else{
            int potencia = 1;
            while (potencia < n){
                potencia *=10;
            }
            if (potencia > n){
                potencia /= 10;
            }
            resultado = n % 10 * potencia + inversion(n/10);
                    
            System.out.println("El resultado es : "+resultado);
         
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        inversion(12345);
    }
}

