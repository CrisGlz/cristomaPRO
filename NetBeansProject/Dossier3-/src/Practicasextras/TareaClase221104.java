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
public class TareaClase221104 {
    

public static void main(String[] args) {
        int sizeAlumnos = 1;
        int tamañoNotas = 3;
        int MayorNota = tamañoNotas*10;
        
        int media = 0;
        double nota = 0.0;
        String letraFinal;
       
        Scanner sc = new Scanner(System.in);
        int arrayAlumnos[] = new int[sizeAlumnos];
        String arrayNotas[] = new String[tamañoNotas];
        
        for (int i = 0; i < arrayAlumnos.length; i++) {
            
            for (int j = 0; j < arrayNotas.length; j++) {
                System.out.println("Ingrese la nota " + (j+1) + "º" + " del alumno " + (i+1));
                arrayNotas[j] = sc.nextLine();
                
                if(arrayNotas[j].equals("A")){
                    nota = 9.5;
                }
                if(arrayNotas[j].equals("A+")){
                    nota = 10;
                }
                if(arrayNotas[j].equals("A-")){
                    nota = 9;
                }
                 if(arrayNotas[j].equals("B")){
                    nota = 8;
                }
                  if(arrayNotas[j].equals("B-")){
                    nota = 7.5;
                }
                   if(arrayNotas[j].equals("B+")){
                    nota = 8.5;
                }
                 if(arrayNotas[j].equals("C")){
                    nota = 6.5;
                }
                 if(arrayNotas[j].equals("C-")){
                    nota = 6;
                }
                 if(arrayNotas[j].equals("C+")){
                    nota = 7;
                }
                 if(arrayNotas[j].equals("D")){
                    nota = 5.5;
                }
                 if(arrayNotas[j].equals("D-")){
                    nota = 5;
                }
                 if(arrayNotas[j].equals("D+")){
                    nota = 6;
                }
                
                 media+=nota;
                        
            }
            int notaFinal=(MayorNota-media)/tamañoNotas;
            
            System.out.println("La media alumno " + (i+1) + " es: " + (MayorNota-media)/tamañoNotas);
            
            if(notaFinal>=9 || notaFinal<=10){
                letraFinal = "A";
            }else 
                if(notaFinal>=7.5 || notaFinal<=8.5){
                letraFinal = "B";
            }else 
                if(notaFinal>=6 || notaFinal<=7){
                letraFinal = "C";
                }else 
                if(notaFinal>=5 || notaFinal<=5.5){
                letraFinal = "D";
            }
            
   
            
            
        }
        
        
        
    }
    
    
}