/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Main {
    
    public static double vlrAbsoluto(double numero){
        double valor;
        if (numero >= 0){
            valor =  numero;
        }else{
            valor =  -numero;
        }
        return valor;
//        double valor = (numero >=0)? numero : -numero;

//        return valor;
    }
    public static double max(double num1, double num2){
        double valor;
        if (num1 >= num2){
            valor =  num1; 
        }else{
            valor =  num2;
        }
        
        return valor;
    }
    
    public static void imprimirNumSigno( double num){
        int a;
        if (num > 0){
            a = 0;
            System.out.print("+");
        }
        System.out.println(num);
    }
    
    public static boolean condicional(boolean p, boolean q) {
        if (p == true && q == false) {
            return false;
        } else {
            return true;
        }
        
    }
    
    public static double pagoFinal(double precio, int cantidad) {
        if (cantidad < 5){
            return precio * cantidad;
        } else if (cantidad < 10 ){
            return precio * cantidad *0.95;
        } else if (cantidad < 20 ){
            return precio * cantidad *0.9;
        } else{
            return precio * cantidad * 0.8;
        }
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese un número: "); 
//        double num1 = sc.nextDouble();
//        System.out.print("Ingrese un número: ");
//        double num2 = sc.nextDouble();
//        System.out.println("El valor absoluto es: "+ vlrAbsoluto(num1));
//        System.out.println("El valor máximo es: "+ max(num1,num2));
//        imprimirNumSigno(num1);
        
//        System.out.println("condicional "+condicional(true, true));
        
        System.out.print("Ingrese el precio: "); 
        double precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        System.out.println("El precio total es: "+ pagoFinal(precio, cantidad) );       
        
    }
    
}
