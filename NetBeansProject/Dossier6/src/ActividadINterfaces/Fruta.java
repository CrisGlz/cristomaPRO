/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadINterfaces;

/**
 *
 * @author dam
 */
public class Fruta {
    
    public class fruta implements IComible {
    private double gramos;
    
    
    public double getCalorias() {
        return gramos*0.15;
    }
}
}
