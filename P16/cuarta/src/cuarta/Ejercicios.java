/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuarta;

import java.util.Scanner;



/**
 *
 * @author leobusta
 */
public class Ejercicios {
    
    public static long factorial( int n){
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
            //System.out.println("factorial de "+i+" es "+fact);
        }
        return fact;
    }
    
    public static double pow( double n, int exp){
        double pot = 1;
        for(int i = 1; i <= exp; i++){
            pot *= n;
            System.out.println(n+" elevado a "+i+" es "+pot);        
        }
        return pot;
    }
    
    public static double exp(int x, int n) {
        double  suma = 0; 
        for (int i=0; i <= n; i++){
            suma += (double)pow(x, i) / factorial(i);
        }
        
        return suma;
    }
    
      public static double sin(int x, int n) {
        double  suma = 0; 
        for (int i=0; i <= n; i++){
            //suma += (double)(pow(-1,i)*pow(x, 2*i+1)) / factorial(2*i+1);
            suma += (double)(pow(-1,i)*pow(x, 2*i+1)) / factorial(2*i+1);

            //System.out.println(suma);
        }
        return suma;
    }
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el número: ");
//        int n = sc.nextInt();
//
//        System.out.println("Ingrese el exponente: ");
//        int exp = sc.nextInt();
//        
          double fact = factorial(19);
          System.out.println("factorial de  es "+fact);
//
//        int potencia = pow(n, exp);
//        System.out.println(n+" elevado a "+exp+" es "+potencia);
          System.out.println("resultado:"+ sin(5,9));
    }   
}
