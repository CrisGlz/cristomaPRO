/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica20;

/**
 *
 * @author dam
 */
public class Fraccion implements IOrdenable<Fraccion>{
    
    int numerador;
    int denominador;
    
    public Fraccion(int n, int d){
        
        numerador = n;
        denominador = d;
        
    }
    
    public double doDouble(){
        
        return numerador/(double)denominador;
    }

    @Override
    public boolean esMayorQue(Fraccion object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esMenorQue(Fraccion object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esIgualQue(Fraccion object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
