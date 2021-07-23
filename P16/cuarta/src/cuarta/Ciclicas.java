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
public class Ciclicas {

    public static int suma(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
            System.out.println(i+" "+s);
        }
        return s;
    }

    public static int[] lee_arreglo_enteros(Scanner sc, int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Componente " + i + "-ésima?");
            x[i] = sc.nextInt();
        }
        return x;
    }

    public static void escribe_arreglo_enteros(int[] x) {
        int n = x.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int suma =0; 
//        for (int i = 0; i <= 30; i++) {
//            if (suma == 21) {
//                break;
//            }
//            suma= suma +i;
//            System.out.println(i);
//        }
//        String[] frutas = new String[]{"Tomate de árbol", "Maracuyá ", "Guayaba",  "Lulo", "Granadilla"};
//        
//        for (String f : frutas) { // para cada elemento f en la lista
//            System.out.println(f);
//            if ("Lulo".equals(f)){
//                break;
//            }
//        }

//        // Declarar el objeto e inicializa
//        Scanner sc = new Scanner(System.in);
//        // lee una cadena
//        String miCadena = sc.nextLine();
//        // Imprime la cadena le´ıda
//        System.out.println(miCadena);
//        String a = "hola";
//        String b = "hola";
//        String c = "HOLA";
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase(c));
        
//        String a = "hola Jorge";
//        String b = "Hola";
//
//        System.out.println(a.toLowerCase().contains(b.toLowerCase()));

       //   System.out.println("Hola Mundo".length());
        Scanner sc = new Scanner(System.in);
        int[] x = lee_arreglo_enteros(sc, 5);

         escribe_arreglo_enteros(x);
          
    }
    
}
