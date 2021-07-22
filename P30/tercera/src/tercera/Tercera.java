/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Tercera {

    public static double vlrAbs(double num){
//        if (num >= 0)
//            return num; 
//        else 
//            return -num;
        double result = (num>=0)? num : -num;
        return result;
    }   
    
    public static double max(double num1, double num2){
        if (num1 >= num2)
            return num1; 
        else 
            return num2;
    }
    
    public static void imprimirNum(double num){
        if ( num > 0)
            System.out.print("+");
        System.out.println(num);
    }
    
    public static boolean condicional(boolean p, boolean q){
        if (p == true && q == false)
            return false;
        else 
            return true;
    }
    
    public static double pagoFinal (double precio, int cantidad){
        if (cantidad <= 5)
            return precio * cantidad; 
        else if (cantidad <= 10)
            return precio * cantidad * 0.95;
        else if (cantidad <= 20)
            return precio * cantidad * 0.9;
        else
            return precio * cantidad * 0.8;
    }
    
    public static boolean esVocalMinuscula(char ch){
        boolean result;
        switch(ch){
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                result = true;
                break;
            default: 
                result = false;
                break;
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un número: ");
//        double numero1 = sc.nextDouble();
//        System.out.println("Ingrese un número2: ");
//        double numero2 = sc.nextDouble();        
//        System.out.println("El valor absoluto es: "+ vlrAbs(numero1));
//        System.out.println("El valor máximo es: "+ max(numero1, numero2));
//        System.out.print("El número con signo es: ");
//        imprimirNum(numero1);
          System.out.println(esVocalMinuscula('e'));
         
    }
    
}
