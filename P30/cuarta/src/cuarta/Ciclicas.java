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
            //System.out.println(i+" "+s);
        }
        return s;
    }

    public static void forEach() {
        String[] frutas = new String[]{"Tomate de árbol", "Maracuyá", "Guayaba", "Lulo", "Guanabana"};
        for (String f : frutas) { // para cada elemento f en la lista
            System.out.println(f);
            if ("lulo".equals(f))
                break;
        }
    }
    
    public static void partirCadena(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String s = "Juan; 30; 1.68";
        String[] line = s.split(",");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");    
    }

    public static int[] lee_arreglo_enteros(Scanner sc, int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Componente " + i + "-ésima?");
            x[i] = sc.nextInt();
        }
        return x;
    }
    
    public static void escribe_arreglo_reales(int[] x) {
        int n = x.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }   

    public static int[][] cuadradosMatriz(int[][] X) {
        int[][] Y = new int[X.length][X[0].length];
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                Y[i][j] = X[i][j] * X[i][j];
            }
        }
        return Y;
    }

    public static void imprimirMatriz(int[][] X) {
        for (int i = 0; i < X.length; i++) {
            
            for (int j = 0; j < X[i].length; j++) {
                 System.out.print(X[i][j] +"  ") ;
            }
            System.out.println("");
        }
    }
    
    public static boolean matriz_simetrica(char[][] X) {
        boolean bandera = true;
        for (int i = 0; i < X.length - 1; i++) {
            for (int j = i + 1; j < X.length; j++) {
//                bandera &= (X[i][j] == X[j][i]);
//                bandera = bandera && (X[i][j] == X[j][i]);
                  if ((X[i][j] != X[j][i]))
                      return false;
            }
        }
        return true;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz= new int[2][3];
        matriz[0][0] = 1;
        matriz[0][1] = 3;
        matriz[0][2] = 2;
        matriz[1][0] = 4;
        matriz[1][1] = 1;
        matriz[1][2] = 5;

        int[][] matriz2 = {{1,4,5}, {5,3,2}, {4,5,6}};
        
        int[][] ret = cuadradosMatriz(matriz2);
        imprimirMatriz(matriz2);
        System.out.println("");
        imprimirMatriz(ret);
//        int[] arr = lee_arreglo_enteros(sc, 5);

        
//        escribe_arreglo_reales(arr);
//        partirCadena();
//          String[] x = new String[] {"prueba", "2" };
//        String s = "Programar es genial!";
//        System.out.println(s.substring(10, s.length()));        
//        String a = "hola Jorge";
//        String b = "Hola";
//        System.out.println(a.toLowerCase().contains(b.toLowerCase()));        
//        String a = "hola";
//        String b = "hola";
//        String c = "HOLA";
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase(c));
        //forEach();
        // lee una cadena
//        String miCadena = sc.nextLine();
//        // Imprime la cadena le´ıda
//        System.out.println(miCadena);

//        for (int i = 0; i <= 30; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }

    }
}
