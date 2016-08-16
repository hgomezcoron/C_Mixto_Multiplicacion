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
public class C_Mixto {
    int a=1;
    int c=7;
    int xn=7;
    int mod= 13;
    
    public void Mixto(){
        if(a!=xn){
    for(int i =1;i<=mod;i++){
        xn = (xn*a+c)% mod;
        System.out.println(xn);
    }
    }else{
        System.out.println("la semilla es igual a A");
    }
}
}

