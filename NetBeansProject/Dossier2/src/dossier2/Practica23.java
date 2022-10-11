/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica23 {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Ingrese el primer numero(a)");
        int numero1 = cin.nextInt();
        System.out.println("Ingrese el segundo numero(b)");
        int numero2 = cin.nextInt();
        System.out.println("Ingrese el tercer numero(c)");
        int numero3 = cin.nextInt();
        
        double discriminante= numero2*numero2-4*numero1*numero3;
        
        if (discriminante <0){
            System.out.println("No tiene solucion");
        }else if(discriminante == 0){
            System.out.println(-numero2 / (2 * numero1));
        }else{
            System.out.println("Primera solucion");
            System.out.println((-numero2 + Math.sqrt(discriminante))/(2*numero1));
            System.out.println("Segunda solucion");
        }   System.out.println((-numero2 - Math.sqrt(discriminante))/(2*numero1));
    }
    
    
    
}
