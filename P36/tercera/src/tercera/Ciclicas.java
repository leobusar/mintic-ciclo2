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
public class Ciclicas {

    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        
        return Xo;
    }
    
    public static void  menu(){
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while(opc != 4) {
            System.out.println("1. Crear usuario");
            System.out.println("2. Editar usuario");
            System.out.println("3. Buscar usuario");
            System.out.println("4. Salir");
            opc = sc.nextInt();
            
        }
    }
    
    public static int suma(int n) {
//        int s = 0;
//        for (int i = 1; i <= n; i++) {
//            s = s + i;
//        }
//        return s;
        int s = 0;
        int i = 1;
        while (i <= n) {
            s = s + i;
            i++;
        }
        return s;

    }
    
    public static void forEach(){
        String[] frutas = new String[]{"Tomate de árbol", "Maracuyá", "Guayaba", "Lulo", "Granadilla"};
        
        for(String f:frutas) { // para cada elemento f en la lista
            if (f.equals("Lulo"))
                break;
            System.out.println(f);
        }
        for(int i=0; i < frutas.length; i++)
            System.out.println(i+" "+frutas[i]);
        
//        int[] edades = new int[]{12,13,13,14,15,20,40};
//        
//        for(int edad:edades) { // para cada elemento f en la lista
//            System.out.println(edad);
//        }        

    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese el valor de n: ");
//        int n = sc.nextInt();
//        System.out.println("Suma: "+suma(n));

//        for (int i = 0, j = 10; i <= j; i++, j--) {
//            System.out.println(i + ", " + j);
//        }
        
//        for (int i = 0; i <= 30; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }
//        
        forEach();

        //System.out.println(minMaquina());
//        int i = 0;
//        while (i <= 6) {
//            System.out.print(i+" ");
//            i = i + 1;
//        }
//        System.out.println("\n");
//        int i = 2; // inicializa a i en 2
//        int j = 25; // inicializa a j en 25
//        while (i < j) { // mientras i sea menor a j
//// imprime los valores de i y j
//            System.out.println(i + ", " + j);
//            i = i * 2; // i se mult´ıplica por 2 en cada paso
//            j = j + 10; // se incrementa de 10 en 10
//        }
//// se ejecuta al terminar el ciclo
//        System.out.println("the end.");
//        System.out.println(i + ", " + j);// valores finales de i y j        
    }
}
