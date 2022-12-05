/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Main {
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta("Juan","1893", 4);
         
        System.out.println("--MENU--");
        System.out.println("1) Ingresar dinero");
        System.out.println("2) Retirar dinero");
        System.out.println("3) Ver saldo");
        
        int opc = sc.nextInt();
        
        
        switch(opc){
            
            case 1:
                System.out.println("¿Que cantidad?");
                double ingresar = sc.nextDouble();
                cuenta.ingresar(ingresar);
                break;
                
             case 2:
                System.out.println("¿Cuanto quieres retirar?");
                double retirar = sc.nextDouble();
                cuenta.retirar(retirar);
                break;   
                
             case 3:
                System.out.println("Tu saldo es");
                double saldo = sc.nextDouble();
                cuenta.cuenta(saldo);
                break;        
        }
          
        
                
        }
         
               
    }
    
}
