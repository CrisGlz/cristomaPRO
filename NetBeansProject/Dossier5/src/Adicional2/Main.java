/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicional2;

/**
 *
 * @author dam
 */
public class Main {
 
    public class MiArray<T> {
  private T[] array;
  private int size;
  private static final int DEFAULT_SIZE=10;
  
  private int head;

  public MiArray(int size) {
    array = (T[]) new Object[this.size];
    
  }
  public MiArray(){
  this(DEFAULT_SIZE);
  }
  
  public void add(T dato) {
    if (head == array.length) {
      array = resize(array);
    }
    array[head] = dato;
    head++;
  }

  public T get(int posicion) throws IndexOutOfBoundsException{
    if (posicion < 0 || posicion >= size)  {
      throw new IndexOutOfBoundsException("Posicion más grande que el array");
    }
    return array[posicion];
  }

  public int size() {
    return head;
  }

  public T[] resize(T[] array) {
      int newSize= array.length + array.length/2;
    T[] nuevoArray = (T[]) new Object[newSize ];
    for (int i = 0; i < array.length; i++) {
      nuevoArray[i] = array[i];
    }
    return nuevoArray;
  }
}
    
    
}
