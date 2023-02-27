/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier6.Ejemplos;

/**
 *
 * @author dam
 */
public class Ejemplo1 {

    class Persona {

        String nombre;
        String apellidos;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
        
        public void imprimirDatos(){
            return 
        }
        
    }

    class Profesor extends Persona{
        
        int salario;
        String especialidad;

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public Profesor(int salario, String especialidad) {
            super.imprimirDatos();
            this.salario = salario;
            this.especialidad = especialidad;
        }
        

        
    }
    
    public class Main{
        public void main(String[] args) {
            
            Profesor profesor1 = new Profesor(200, "Matematicas");
            
            
        }
    }
}
