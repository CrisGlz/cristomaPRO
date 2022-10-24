/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica3 {

    static int aleatorio(int num1, int num2) {

        int limsup = 0;
        int liminf = 0;
        int resultado = 0;
        
        if (num1 > num2){
            limsup = num1;
            liminf = num2;
        }else{
            liminf = num1;
            limsup= num2;
        }
        resultado = (int)(liminf + Math.random()*(limsup -liminf+1));
        return resultado;
    }
        
    public static void main(String[] args) {
        int num;
        do {
            num = aleatorio(25, 45);
            System.out.println(num);
        } while (num != 35);
    }

}
