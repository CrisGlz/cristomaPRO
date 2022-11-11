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
public class Practica29 {
    
public static int Max(int[] array, int i, int j) {
    int med, max_left, max_right;
    if (i == j)
        return array[i];
    else
        med = (i + j) / 2;
    max_left = Max(array, i, med);
    max_right = Max(array, med + 1, j);
    if (max_left > max_right)
        return max_left;
    else
        return max_right;
}

}

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros quiere ingresar? en el Array");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Que numeros quieres :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }
    
    
}
