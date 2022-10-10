/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica28 {

    public static void main(String[] args) {

        int numeroIntroducido;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un num");
        numeroIntroducido = sc.nextInt();
        int suma = 0;
        int sumaPositivo = 0;
        int sumaNegativo = 0;
        while (numeroIntroducido != 0) {

            suma += numeroIntroducido;
            System.out.println("Introduce un num");
            numeroIntroducido = sc.nextInt();
            int numNegativo = numeroIntroducido < 0 ? numeroIntroducido : 0;
            int numPositivo = numeroIntroducido < 0 ? numeroIntroducido : 0;

            sumaPositivo += numPositivo;
            sumaNegativo += numNegativo;
            
        }
    }
}
