/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
class Telegrama {
    private String texto;
    private String remitente;
    private String receptor;
    private double precioPalabra;

    public Telegrama(String texto, String remitente, String receptor, double precioPalabra) {
        this.texto = texto;
        this.remitente = remitente;
        this.receptor = receptor;
        this.precioPalabra = precioPalabra;
    }

    public double coste() {
        return texto.length() * precioPalabra;
    }

   
