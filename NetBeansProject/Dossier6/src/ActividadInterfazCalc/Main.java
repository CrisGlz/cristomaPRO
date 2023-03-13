/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadInterfazCalc;

/**
 *
 * @author dam
 */
public class Main {

    public static void main(String[] args) {

        Romano romano1 = new Romano(32);
        System.out.println("El número romano correspondiente es: " + romano1.intToRomano(32));

        for (int i = 1; i < 2000; i++) {
            System.out.println(new Romano(i) + ",");
            if (i % 4 == 0) {
                System.out.println(" ");
            }

        }

        String romano = "MXMMCL";
        if (romano.matches("^[MDCLXVI]+$")) {
            if (!romano.matches(".*MMMM.*")) {
                if (!romano.matches(".*D.*D")) {
                    if (!romano.matches(".*CCCC.*")) {
                        if (!romano.matches(".*L.*L")) {
                            if (!romano.matches(".*XXXX.*")) {
                                if (!romano.matches(".*V.*V")) {
                                    if (!romano.matches(".*IIII.*")) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
