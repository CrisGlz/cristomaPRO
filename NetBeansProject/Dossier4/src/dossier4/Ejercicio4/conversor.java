/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio4;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class conversor {
    
    double tipoDeCambio;

     public conversor(double num){
        tipoDeCambio = num;
         
          
     }
     
     public double euroToDolar(double euros){
         return euros/tipoDeCambio;
         
     }
     
         public double dolartoEuro(double dolar){
         return dolar/tipoDeCambio;
         
     }
}