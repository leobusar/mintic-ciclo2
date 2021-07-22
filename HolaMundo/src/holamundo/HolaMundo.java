/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;

class HolaMundo {
    
    public static double cuadrado(double num){
        double result = Math.pow(num, 2); 
        
        return result;
    }
    
    public static double areaRectangulo(double l, double a) {
        return  l*a;
    }
    
    public static double valorAbsoluto(double num){
       /* double vlrAbs;
        if (num >=0){
            vlrAbs = num;
        }else{
            vlrAbs = -num;
        }
        
        return vlrAbs;

        if (num >= 0)
            return num;
        return -num;
        */
       
       double prueba =  (num>0)? num : -num;
       
       return prueba;
    }

    public static void imprimirNumero(double x) {
        if (x > 0.0) {
            System.out.print("+");
        }
        System.out.println(x);
    }
    
    
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static boolean condicional( boolean p, boolean q){
       /* if (p == true && q == false)
            return false; 
        else
            return true;
*/  
       return  !(p == true && q == false) ;
    }
    
    public static double pagofinal(int n, double precio){
        if (n <= 5){
            return n * precio; 
        } else if (n<=10) {
            return n * precio * 0.95;
        } else if(n<=20){
            return n *precio * 0.9;
        }else{
            return n *precio * 0.8;
        }
    }
    
    public static boolean esVocalMinuscula(char vocal){
        boolean value;
        switch (vocal) {
            case 'a':
                value = true;
                break;
            case 'e':
                value = true;
                break;
            case 'i':
                value = true;
                break;
            case 'o':
                value = true;
                break;
            case 'u':
                value = true;
                break;
            default: 
                value = false;
                break;
                
        }
        return value; 
    }
    
    public static void main(String[] args) {
//        Scanner sc; 
//        sc = new Scanner(System.in);
//
//        System.out.print("Ingrese num1: ");
//        double num =  sc.nextDouble();
//        
//        imprimirNumero(num);

        //System.out.println("Condicional " + condicional(false, false));
        
        
        
        //System.out.println(pagofinal(12,100));
        System.out.println(esVocalMinuscula('e'));
 
    }
}