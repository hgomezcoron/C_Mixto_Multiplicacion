/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.util.Scanner;

/**
 *
 * @author Adseglocdom
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        C_Mixto obj= new C_Mixto();
        C_Multiplicativo obj1= new C_Multiplicativo();
        System.out.println("elija una opcion");
        int a = leer.nextInt();
        System.out.println("su respuesta");
        //String menu= "1. m 2.mul";
        switch(a){
            
            case 1: {
               obj.Mixto();
                break;
            }
            
            case 2: {
               obj1.Multiplicativo();
               break;
            }
        }
    }
    
}
