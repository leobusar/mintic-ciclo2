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
          System.out.println(condicional(false, false));
         
    }
    
}
