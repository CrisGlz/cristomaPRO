/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Practica8;

/**
 *
 * @author dam
 */
class Coche {

    String marca;
    String modelo;
    int potencia;
    int puertas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    String matricula;
}

class CocheSEAT extends Coche {

    String modelo;
    int potencia;
    int puertas;

    public CocheSEAT(String modelo, int potencia, int puertas, String matricula) {
        this.modelo = "se-"+modelo;
        this.potencia = potencia;
        this.puertas = puertas;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "CocheSEAT{" + "modelo=" + modelo + ", potencia=" + potencia + ", puertas=" + puertas +", matricula"+" "+ matricula;
    }
}

public class Main {

    public static void main(String[] args) {
        CocheSEAT cocheSeat = new CocheSEAT("Ibiza", 1000, 4, "4560BKM");
        System.out.println(cocheSeat);
    }

}
