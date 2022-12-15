/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio18;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class DNI {
    
    int dniNum;
    static final String letrasPosibles="TRWAGMYFPDXBNJZSQVHLCKE";
    
    public boolean validarDNI(String strDNI){
        
        String posibleNumero = strDNI.substring(0, strDNI.length()-1);
        int numero = Integer.parseInt(posibleNumero);
        char letra = strDNI.charAt(strDNI.length()-1);
        return letra == calcularLetra(numero);
        
        
    }
    
    public static char calcularLetra(int numero){
      
        
    int posicion = numero%23; 
            return letrasPosibles.charAt(posicion);
            
        }
        
    }
    

