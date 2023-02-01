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
 * @author Cristo Manuel Glez Delgado
 */
public class Practica22 {

    private static Object miArray;
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();
String s0 = "yea";
String s1 = "yea1";
String s2= "yea2";
String s3= "yea3";
String s4="yea4";
al.add(s0);
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);

for(Iterator<String> it = al.iterator(); it.hasNext();){
    String actual = it.next();
    it.remove();
    System.out.println(actual);
            }

}
}
