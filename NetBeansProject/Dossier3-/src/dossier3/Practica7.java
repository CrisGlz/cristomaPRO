/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;


/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica7 {

    /*Invierno (ene, feb,mar)
    Primavera (abril, mayo, jun)
    Verano (julio, agosto, sep)
    Otoño (oct, nov, dic)
    */
    
    public enum estaciones {INVIERNO, PRIMAVERA, VERANO, OTOÑO};
    
    
    public static void main(String[] args) {
       
  
          
          Scanner sc = new Scanner (System.in);
          System.out.println("¿En qu estacion estas?");
          String mes = sc.nextLine();
          switch (mes.toLowerCase()){
              case "enero":
              case "febrero":
              case "marzo":
                  System.out.println(estaciones.INVIERNO);
                  
          }
          
          
    }
  
}
  
     
        