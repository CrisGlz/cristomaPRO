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
public class Practica13 {
    public static void main(String[] args) {
       // StringBuilder es una clase en Java que se utiliza para construir cadenas de texto de manera eficiente. A diferencia de la clase String, que es inmutable, StringBuilder tiene métodos que permiten modificar su contenido.

//El método delete() se utiliza para eliminar caracteres de la cadena. Ejemplo:

StringBuilder sb1 = new StringBuilder("Hola mundo");
sb1.delete(1, 3);
System.out.println(sb1); // Imprime "ola mundo"
//El método append() se utiliza para agregar caracteres al final de la cadena. Ejemplo:

StringBuilder sb2 = new StringBuilder("Hola mundo");
sb2.append("!");
System.out.println(sb2); // Imprime "Hola mundo!"
//El método insert() se utiliza para insertar caracteres en una posición específica de la cadena. Ejemplo:

StringBuilder sb3 = new StringBuilder("Hola mundo");
sb3.insert(5, " bella ");
System.out.println(sb3); // Imprime "Hola bella mundo"
//El método replace() se utiliza para reemplazar una subcadena de caracteres con otra. Ejemplo:

StringBuilder sb4 = new StringBuilder("Hola mundo");
sb4.replace(4, 8, "planeta");
System.out.println(sb4); // Imprime "Hola planeta"
//Es útil el uso de estos métodos en situaciones donde se necesita construir o modificar una cadena de texto de manera eficiente, 
//ya que StringBuilder es más rápido que utilizar varios objetos String debido a que no crea un nuevo objeto en cada operación. 
//Por ejemplo, si se necesita concatenar muchas cadenas de texto, es mejor utilizar StringBuilder para evitar la creación de muchos objetos String innecesarios.
    }
    
}
