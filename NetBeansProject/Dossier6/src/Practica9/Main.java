/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica9;

/**
 *
 * @author dam
 */

 class Libro {
    private String[] autor;
    private String titulo;
    private String resumen;
    private int paginas;
    
    public Libro(String[] autor, String titulo, String resumen, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;
    }
    
    public String[] getAutor() {
        return autor;
    }
    
    public void setAutor(String[] autor) {
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getResumen() {
        return resumen;
    }
    
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public boolean libroGrande() {
        return paginas > 500;
    }
    
    @Override
    public String toString() {
        return "Libro [autor=" + Arrays.toString(autor) + ", titulo=" + titulo + ", resumen=" + resumen + ", paginas="
                + paginas + "]";
    }
}

 class VolumenLibro extends Libro {
    private String propietario;
    private EstadoConservacion estadoConservacion;
    private int id;
    private boolean variosTomos;

    public VolumenLibro(String[] autor, String titulo, String resumen, int paginas, String propietario,
            EstadoConservacion estadoConservacion, int id, boolean variosTomos) {
        super(autor, titulo, resumen, paginas);
        this.propietario = propietario;
        this.estadoConservacion = estadoConservacion;
        this.id = id;
        this.variosTomos = variosTomos;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public EstadoConservacion getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(EstadoConservacion estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVariosTomos() {
        return variosTomos;
    }

    public void setVariosTomos(boolean variosTomos) {
        this.variosTomos = variosTomos;
    }

    @Override
    public String toString() {
        return "VolumenLibro [autor=" + Arrays.toString(getAutor()) + ", titulo=" + getTitulo() + ", resumen="
                + getResumen() + ", paginas=" + getPaginas() + ", propietario=" + propietario + ", estadoConservacion="
                + estadoCons



public class Main {
    
}
 