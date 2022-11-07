/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Ejemploexepcion2 {
    
    
    class NoEsPotenciaDosException extends Exception{
        public NoEsPotenciaDosException(String s){
            super(s);
        }
    }
    
      
      public static int obtenerExponente2(int num) throws NoEsPotenciaDosException{
          
          int expontente = 1;
          int potencia2 = 1;
          while (potencia2 < num){
              potencia2 *= 2;
              expontente++;
          }
          if (potencia2 != num)
              throw new NoEsPotenciaDosException("no es potencia");
      }
      
      
  }
  
  
      public static void main(String[] args) {
      
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Dame un numero potencia 2");
          int numero = sc.nextInt();          
          try{
            obtenerExponente2(81);
          } catch (NoEsPotenciaDosException ex) {
              ex.printStackTrace();
          
      }
      
      
  }  
    
}
