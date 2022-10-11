/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica21 {
    
public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = cin.nextInt();
        if(numero %3==0 && numero % 5 == 0){
            System.out.println("Multiplo de tres y de cinco");
    }else{
        if(numero % 3 ==0){
            System.out.println("Es multiplo de tres pero no de cinco");
        }else{
            if(numero %5 ==0){
                System.out.println("Es multiplo de cinco pero no de tres");
            }else{
                System.out.println("No es multiplo ni de 3 ni de 5");
            }
        }
        }
}
}