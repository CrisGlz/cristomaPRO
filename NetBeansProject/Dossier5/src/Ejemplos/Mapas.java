/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.until.Iterator;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author dam
 */
public class Mapas {

    public static void main(String[] args) {

        HashMap<String, Double> t = new HashMap<String, Double>();
        t.put("Ana", 9.2);
        t.put("Luis", 8.5);
        t.put("Marta", 6.0);
        t.put("Marco", 5.5);
        t.put("Lidia", 8.0);
        
        Set<String> claves = t.keySet();
        for (String clave : claves) {
            double valor = t.get(clave);
            System.out.println("clave/valor: "+ clave+"/"+valor);
        }
 
       
        /*
        Iterator it = t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = (Map.Entry<String, Double>) it.next();
            System.out.println("Clave=" + entry.getKey() + ", Valor=" + entry.getValue());
// it.remove();
*/
        }

    }


