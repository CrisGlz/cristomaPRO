/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica24 {
    
    static int suma(int n){
        
          int resultado;
          if( n <= 0){
            resultado = 0;
             
        }else{
            resultado = suma(n/10) + n%10;
            System.out.println("El resultado es : "+resultado);
         
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        suma(12345);
    }
}
