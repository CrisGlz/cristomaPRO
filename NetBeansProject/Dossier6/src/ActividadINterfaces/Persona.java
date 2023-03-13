/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadINterfaces;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author dam
 */
import java.util.*;

public class Persona {
    
    private double saldoCalorico;
    private Map<Date, IComible> ingestaCalorica = new HashMap<>();
    private Map<Date, IActividad> actividadesFisicas = new HashMap<>();
    
    public void comer(Date fecha, IComible comida) {
        ingestaCalorica.put(fecha, comida);
        saldoCalorico += comida.getCalorias();
    }
    
    public void hacerEjercicio(Date fecha, IActividad actividad) {
        actividadesFisicas.put(fecha, actividad);
        saldoCalorico -= actividad.getSaldoCalorico();
    }
    
    public double getSaldoCalorico(Date fecha) {
        double saldo = saldoCalorico;
            
        return saldo;
    }
    
 
    
    
}


