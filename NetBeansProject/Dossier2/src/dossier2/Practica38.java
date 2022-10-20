/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica38 {
    
public static void main(String[] args) {
       
        int dias=24*3600,hora=3600,minuto=60,segundos=1;
      
        double horas = 125.25;
        double tiempo=horas*hora;
        minuto=(int)(tiempo/60);
        segundos=(int)(tiempo%60);
        hora=minuto/60;
        minuto=minuto%60;
        dias=hora/24;
        hora=hora%24;
        System.out.println("dias " + dias+ " horas " + hora +" minutos "+minuto+" segundos "+segundos);
    }
    
    
}
