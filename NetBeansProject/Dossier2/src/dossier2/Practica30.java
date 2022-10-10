/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        double doubleAleatorio = Math.random() * 10;
        int aleatorio = (int) doubleAleatorio;
        System.out.println(aleatorio);
        String textoUsuario;
        do {
            System.out.println(doubleAleatorio);
            System.out.println("Pulsa C para continuar");
            textoUsuario = sc.nextLine();

        }while (textoUsuario == "c" || textoUsuario == "C");
    }
}

