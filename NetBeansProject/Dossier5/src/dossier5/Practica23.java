/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Cris
 */
public class Practica23 {

    ArrayList<String> al = new ArrayList<>();
    String s0 = "yea";
    String s1 = "yea1";
    String s2 = "yea2";
    String s3 = "yea3";
    String s4 = "yea4";

    al.add (s0);

    al.add (s1);

    al.add (s2);

    al.add (s3);

    al.add (s4);

    Iterator<String> it = al.iterator();

    while (it.hasNext () {
    String elemento = it.next();
        if (elemento.equals(s2)) {
            it.remove();
        }
    }

    for (String elemento : al) {
    System.out.println(elemento);
    }

}
