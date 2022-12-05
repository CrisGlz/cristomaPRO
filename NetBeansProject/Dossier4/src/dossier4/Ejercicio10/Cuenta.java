/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio10;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Cuenta {

    private String numero;
    private String titular;
    private double saldo;

    public Cuenta(String t, String n, double s) throws Exception {

        if (s < 0) {

         throw new Exception("No es posible crear con dinero en negativo");
        } else {
            titular = t;
            numero = n;
            saldo = s;
        }

    }

    double ingresar(double dinero) {

        saldo += dinero;

        return getSaldo();
    }

    boolean retirar(double dinero) {

        boolean resultado = false;
        if (saldo - dinero < 0) {
            resultado = false;
        } else {
            saldo -= dinero;
            resultado = true;
        }

        return resultado;
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
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
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
