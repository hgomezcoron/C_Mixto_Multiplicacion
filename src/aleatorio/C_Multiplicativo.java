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
public class C_Multiplicativo {
    //int a=5;
    //int xn=4;
    //int mod= 8;

    public void Multiplicativo(int a, int X0, int mod) {
        if (X0 > 0 && a > 0 && mod > 0) {
            double convertir;
            if (a != X0) {
                for (int i = 1; i <= mod; i++) {
                    X0 = (X0 * a) % mod;
                    convertir = (double) X0 / 100;
                    System.out.println(convertir);
                    double ri=convertir/(mod-1);
                    System.out.println("resultado ri =\n" + ri);
                }
            } else {
                System.out.println("La semilla es igual a A");
            }
        } else {
            System.out.println("Los valores tienen que ser mayores que 0 Enteros");
        }
    }
}
