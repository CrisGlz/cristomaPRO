/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio7;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Profesor {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean soltero;
    private boolean especialista;

    
    public Profesor(String n, String p, int e, boolean sol, boolean esp){
     
        nombre = n;
        apellidos = p;
        edad = e;
        soltero = sol;
        especialista = esp;
        
    }
    
    public Profesor(){
     
        //n = nombre;
        //p = apellidos;
        //e = edad;
        //sol = soltero;
        //esp = especialista;
        
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the soltero
     */
    public boolean isSoltero() {
        return soltero;
    }

    /**
     * @param soltero the soltero to set
     */
    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    /**
     * @return the especialista
     */
    public boolean isEspecialista() {
        return especialista;
    }

    /**
     * @param especialista the especialista to set
     */
    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
    
     public String toString(){
        return "nombre: " + nombre + " apellido: " + apellidos + " edad: " + edad + " Estado: "+ soltero+ "Es especialista: "+especialista;
    }
    
    
    
}
