/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier6.Ejemplos;

/**
 *
 * @author dam
 */

    class alumno{
        public alumno(int edad){System.out.println("Has puesto una edad");}
        public alumno(){
            System.out.println("Este constructor no tiene parametros");
        }
        protected String nombre;
        protected String cial;
    }
    
    class AlumnoIESPuerto extends alumno{
        String curso;
        public AlumnoIESPuerto(){
            super(23);
            this.nombre = "PEPE";
        }
    }
    

public class Ejemplo2 {

    public static void main(String[] args) {
        AlumnoIESPuerto alumnoIESPuerto = new AlumnoIESPuerto();
    }
}
