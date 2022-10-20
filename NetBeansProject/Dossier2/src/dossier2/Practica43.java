/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica43 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numSecreto = 1+rnd.nextInt(99);
        boolean acierto = false;
        
        while(acierto ==false){
            
            System.out.println("Dime un numero");
            int num = sc.nextInt();
            
            if(num > numSecreto ){
                System.out.println("EL numero secreto es menor");
                
            }else if (num<numSecreto){
                System.out.println("El numero secreto es mayor");
            }else if (num == numSecreto){
                System.out.println("ACertaste");
                acierto = true;
            }
        }
        
    }
    
}
