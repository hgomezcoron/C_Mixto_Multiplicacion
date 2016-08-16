/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

/**
 *
 * @author Adseglocdom
 */
public class C_Multiplicativo {
    int a=5;
    int xn=4;
    int mod= 8;
    
    public void Multiplicativo(){
        if(a!=xn){
    for(int i =1;i<=mod;i++){
        xn = (xn*a)% mod;
        System.out.println(xn);
    }
    }else{
        System.out.println("la semilla es igual a A");
    }
}
}
