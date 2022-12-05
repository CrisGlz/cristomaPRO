/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio11;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Cliente {
    
    static int contador;
    private int idCliente;
    private String nombre;
    private String apellido;
    private int habitacion;
    private double debe;
    private int cantidadnoches;
    private double precioNoche;
    private String factura;
    
    public Cliente(String n, String a, int h, int id, double p, int cn){
        contador++;
        idCliente = contador;
        nombre = n;
        apellido = a;
        habitacion = h;
        precioNoche = p;
        cantidadnoches = cn;
        debe = precioNoche * cantidadnoches;
        factura = nombre + " "+ apellido + " en habitacion: " + habitacion + 
                " debe por el alquiler: " + debe;
    }

    public void gastar(double gasto, String productoConsumido){
    
        setDebe(getDebe() + gasto);  
        setFactura(getFactura() + " ha consumido: " + productoConsumido + " con un precio de: "+ gasto);
        
    }
    
    public void pagar(double pagar){
        setDebe(getDebe() - pagar);
        setFactura(getFactura() + " ha pagado: " + pagar + " quedando una deuda de: " + getDebe());
        
        
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the habitacion
     */
    public int getHabitacion() {
        return habitacion;
    }

    /**
     * @param habitacion the habitacion to set
     */
    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    /**
     * @return the debe
     */
    public double getDebe() {
        return debe;
    }

    /**
     * @param debe the debe to set
     */
    public void setDebe(double debe) {
        this.debe = debe;
    }

    /**
     * @return the cantidadnoches
     */
    public int getCantidadnoches() {
        return cantidadnoches;
    }

    /**
     * @param cantidadnoches the cantidadnoches to set
     */
    public void setCantidadnoches(int cantidadnoches) {
        this.cantidadnoches = cantidadnoches;
    }

    /**
     * @return the precioNoche
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * @param precioNoche the precioNoche to set
     */
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    /**
     * @return the factura
     */
    public String getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(String factura) {
        this.factura = factura;
    }
    
    
}

   