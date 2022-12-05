/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio8;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Coche {
    
    private String nombre;
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private int poscicion;
    
    
    public String arrancar(){
        String respuesta = "";
        if(encendido = true){
            respuesta = "quieeeto! Mi rey que lo rompeh";
        }else{
        encendido = true;
        respuesta = "ok coche arrancado";
    }
        return respuesta;
    }
    
        public String apagar(){
        String respuesta = "";
        if(encendido = false){
            respuesta = "El coche YA esta apagado mi rey";
        }else{
        encendido = false;
        respuesta = "Ok has apagado el coche";
    }
        return respuesta;
    }
    
    
    
   public Coche(String n){
       
       nombre = n;
    
}
    
   public Coche(String n, int pos){
       
       nombre = n;
       poscicion = pos;
   }

    public Coche() {
        
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
     * @return the encendido
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * @param encendido the encendido to set
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * @return the frenoDeManoPuesto
     */
    public boolean isFrenoDeManoPuesto() {
        return frenoDeManoPuesto;
    }

    /**
     * @param frenoDeManoPuesto the frenoDeManoPuesto to set
     */
    public void setFrenoDeManoPuesto(boolean frenoDeManoPuesto) {
        this.frenoDeManoPuesto = frenoDeManoPuesto;
    }

    /**
     * @return the poscicion
     */
    public int getPoscicion() {
        return poscicion;
    }

    /**
     * @param poscicion the poscicion to set
     */
    public void setPoscicion(int poscicion) {
        this.poscicion = poscicion;
    }
   
   
   
}
