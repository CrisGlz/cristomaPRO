/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica40 {
    
    public static void main(String[] args) {
       
        int cifras=0, num. aux=1;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un numero y te dire cuantas cifras tiene");
        num = sc.nextInt();
        aux = num;
        for (int 1=1 Math.abs(aux) > 0; cifras++, aux /=10);
        
        System.out.println("EL numero "+num+" tiene "+(cifras)+" cifras.";
        
    }
    
}
