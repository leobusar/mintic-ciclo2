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
    
    public static int factorial( int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
            //System.out.println("factorial de "+i+" es "+fact);
        }
        return fact;
    }
    
    public static int pow( int n, int exp){
        int pot = 1;
        for(int i = 1; i <= exp; i++){
            pot *= n;
            //System.out.println(n+" elevado a "+i+" es "+pot);        
        }
        return pot;
    }
    
    public static double exp(x, n) {
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int n = sc.nextInt();

        System.out.println("Ingrese el exponente: ");
        int exp = sc.nextInt();
        
        int fact = factorial(n);
        System.out.println("factorial de "+n+" es "+fact);

        int potencia = pow(n, exp);
        System.out.println(n+" elevado a "+exp+" es "+potencia);        
    }   
}
