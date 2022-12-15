/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.cuentaBancaria;

import java.util.Date;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class CuentaBancaria {
    
    public boolean retirar(double cuantia){
        
        boolean okOperacion = false;
        if(cuantia < saldo){
            saldo -= cuantia;
            okOperacion = true;
            
        }else{
            okOperacion = false;
        }
        return okOperacion;
    }
    
        public void ingresar(double cuantia, String mensaje){
        
           Date dateahora = new Date();
           movimientos[contador] = new Movimiento(mensaje, cuantia, dateahora);
           contador++;
        
    }
    
    
    private String[] titular;
    private String numero;
    private double saldo;
    Movimiento movimientos[];
    int contador=0;
    
    public CuentaBancaria(String []t, String n, double s){
        
        movimientos = new Movimiento[23123];
        titular = t;
        numero = n;
        saldo = s;

        contador++;
        
        
    }

    /**
     * @return the titular
     */
    public String[] getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String[] titular) {
        this.titular = titular;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
