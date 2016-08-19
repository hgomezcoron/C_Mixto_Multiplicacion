/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

/**
 *
 * @author Hans Gomez
 */
public class C_Mixto {
//    int a=1;
//    int c=7;
//    int xn=7;
//    int mod= 13;

    public void Mixto(int a, int c, int X0, int mod) {
        if (X0 > 0 && a > 0 && c > 0 && mod > 0) {
            if (mod > a) {
                if (mod > c) {
                    if (mod > X0) {
                        if (a != X0) {
                            for (int i = 1; i <= mod; i++) {
                                X0 = (X0 * a + c) % mod;
                                double convertir = (double) X0 / 100;
                                System.out.println(convertir);
                            }
                        } else {
                            System.out.println("la semilla es igual a A");
                        }
                    }else {
                            System.out.println("El modulo debe ser mayor que la semilla");
                        }
                }else {
                            System.out.println("El modulo debe ser mayor que la contante aditiva");
                        }
            }else {
                            System.out.println("El modulo debe ser mayor que la constante multiplicativa");
                        }
        }else {
                            System.out.println("Los valores tienen que ser mayores que 0 Enteros");
                        }
    }
}
