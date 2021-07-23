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
public class Cuarta {
    
    public static void factorial(int n){
        long fact = 1;
        for(int i=1; i <= n; i++) {
            fact *= i;
            System.out.println("El factorial de "+i+" es "+fact);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int num = sc.nextInt();
        factorial(num);
    }
    
}
