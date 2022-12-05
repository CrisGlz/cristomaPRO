/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.MainFraccion;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {

        this.numerador = numerador / mcd(numerador, denominador);
        this.denominador = denominador / mcd(numerador, denominador);

    }

    public Fraccion() {
        this(0, 1);

    }

    public double toDouble() {
        return numerador / (double) denominador;

    }

    public static Fraccion Sumar(Fraccion fr1, Fraccion fr2) {

        Fraccion resultado = null;

        int n1 = fr1.numerador;
        int n2 = fr2.numerador;
        int d1 = fr1.denominador;
        int d2 = fr2.denominador;

        resultado = new Fraccion(n1 + d2 + n2 * d1, d1 * d2);

        return resultado;
    }

    public static Fraccion Resta(Fraccion fr1, Fraccion fr2) {

        Fraccion opuestaFr2 = new Fraccion(-fr2.numerador, fr2.denominador);

        return Fraccion.Sumar(fr1, opuestaFr2);
    }

    public static Fraccion Restar(Fraccion fr1, Fraccion fr2) {

        Fraccion resultado = null;

        int n1 = fr1.numerador;
        int n2 = fr2.numerador;
        int d1 = fr1.denominador;
        int d2 = fr2.denominador;

        resultado = new Fraccion(n1 + d2 - n2 * d1, d1 * d2);

        return resultado;
    }

    public static Fraccion Multiplicar(Fraccion fr1, Fraccion fr2) {

        Fraccion resultado = null;

        int n1 = fr1.numerador;
        int n2 = fr2.numerador;
        int d1 = fr1.denominador;
        int d2 = fr2.denominador;

        resultado = new Fraccion(n1 * n2, d1 * d2);

        return resultado;
    }
    
    public static Fraccion Dividir(Fraccion fr1, Fraccion fr2){
        
        
        return Multiplicar(fr1, fr2.inverso());
        
    }

    private int mcd(int dividendo, int divisor) {

        int resto = dividendo % divisor;
        while (resto != 0) {

            dividendo = divisor;
            divisor = resto;
            resto = dividendo % divisor;
        }
        return divisor;
    }

    public Fraccion opuesto() {

        Fraccion resultado = null;

        resultado = new Fraccion(-1 * this.numerador, this.denominador);

        return resultado;

    }

    public Fraccion inverso() {

     return new Fraccion(denominador,numerador);

    }
    
    public boolean MayorQue(Fraccion fr2){
        
       double fr2double = fr2.toDouble();
       double fr1double = toDouble();
       
       return fr2double > fr1double;
       
       
    }
    
    public boolean menorQUe(Fraccion fr2){
        
       return fr2.MayorQue(this);
       
       
    }
    
    
    public String toString() {
        return "" + numerador + "/" + denominador;
    }

}
