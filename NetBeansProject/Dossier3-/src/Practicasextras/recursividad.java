/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class recursividad {
    
    static int contadorRecursion = 0;
    public static int factorial(int n){
        contadorRecursion++;
        int resultado;
        System.out.println("Estamos en la llamada "+contadorRecursion);
        if( n <= 1){
            resultado = 1;
        }else{
            resultado = factorial(n-1) * n;
            System.out.println("El resultado es ahora: "+resultado);
         
        }
        
        
        return resultado;
    }
    public static void main(String[] args) {
        factorial(4);
        
    }
    
}
