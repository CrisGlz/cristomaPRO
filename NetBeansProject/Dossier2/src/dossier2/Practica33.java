/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica33 {
    public static void main(String[] args) {
        
        String clave="rojo";

        String pass="";

        int intentos = 0;

        while (clave.equals(pass)==false && intentos < 3) {

            pass=JOptionPane.showInputDialog("Introduce la contraseña");

            intentos++;

            if (clave.equals(pass)==false) {

                System.out.println("Contraseña incorrecta. Intente nuevamente");

            } else {

                System.out.println("Acceso Correcto");

            }

 

            if (intentos == 3) {

                System.out.println("Por favor intente mas tarde");

            }

        }

 

    }
}
