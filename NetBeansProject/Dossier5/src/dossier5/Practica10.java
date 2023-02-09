/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

/**
 *
 * @author Cris
 */
public class Practica10 {
    
    
    

    class Camion<T> {

        private String matricula;
        private double tara;
        private T carga;

        public Camion(String matricula, double tara, T carga) {
            this.matricula = matricula;
            this.tara = tara;
            this.carga = carga;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public double getTara() {
            return tara;
        }

        public void setTara(double tara) {
            this.tara = tara;
        }

        public T getCarga() {
            return carga;
        }

        public void setCarga(T carga) {
            this.carga = carga;
        }
    }

    class Perro {

        private String nombre;

        public Perro(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    class Gato {

        private String nombre;

        public Gato(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    
    
}
