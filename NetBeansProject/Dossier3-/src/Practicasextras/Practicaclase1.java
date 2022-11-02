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
public class Practicaclase1 {
    
    public static double calcularMedia(int array[]){
        
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            
        }
        return suma / array.length;
    }
    
    public static double varianza(int array[]){
        
        double media = calcularMedia(array);  
        
      
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += (array[i] - media) * (array[i] - media);
            
            
        }
        double resultado = suma/array.length;
        return resultado;
        
        
    }
    
    
    public static void main(String[] args) {
       
        
        // toma de datos:
        System.out.println("¿Cuantos numeros?");
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();sc.nextLine();
        int array[] = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dame el numero: "+ (i+1));
            int dato = sc.nextInt();
            array[i] = dato;
            
        }
      
 
        //calcular media
      double media = calcularMedia(array);  
        
      
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += (array[i] - media) * (array[i] - media);
            
            
        }
        double resultado = suma/array.length;
        
    }
          
    
    
}
