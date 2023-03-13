/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dossier6.Ejemplos;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public interface FuncionalInterface2 {

    @FunctionalInterface
    interface AcumularEnteros {

        Integer acumular(Integer a, Integer b);

        default Integer sumar(ArrayList<Integer> array) {
            Integer resultado = 0;
            for (Integer integer : array) {
                resultado += integer;
            }
            return resultado;
        }
    }

    public class LambdaVsAnonima {

        public static void main(String[] args) {
            AcumularEnteros objetoAnonimo = new AcumularEnteros() {
                
                @Override
                public Integer acumular(Integer a, Integer b) {
                    Integer resultado = 0;
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    arr.add(a);
                    arr.add(b);
                    resultado = this.sumar(arr); //esta línea no posible con lambda
                    return resultado;
                }
                public Integer sumar(ArrayList<Integer> array){
                    return 4;
                }
            };
            System.out.println(
                    objetoAnonimo.acumular(4, 5)
            );
        }
    }
}
