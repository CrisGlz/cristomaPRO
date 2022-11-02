/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

import java.util.Random;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaextra2 {

    public static void main(String[] args) {


        Random rnd= new Random();
        String nombres[] = { "Inés", "Ana", "Jaime", "Miguel","Alfredo"};
        
        int i= 0;
        
        while(i < 2000){
            
        int x = 0 + rnd.nextInt(nombres.length);
        int y = 0 + rnd.nextInt(nombres.length);
        System.out.println(nombres[x] + " y " + nombres[y]);
        i++;
        }
            
        }

    }


