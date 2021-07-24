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

    public static void partirCadena(String cadena){
        String[] line = cadena.split(",");
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
    
    public static void escribe_arreglo_enteros(int[] x) {
        int n = x.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
    
    public static double suma_arreglo_reales(double[] A) {
        double s = 0;
        for (int i = 0; i < A.length; i++) {
            s += A[i];
        }
        return s;
    }
    public static double suma_arreglo_reales2(double[] A) {
        double s = 0;
        for (double x : A) {
            s += x;
        }
        return s;
    }
    
    public static int pos_maximo(double[] A) {
        int m = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[m]) {
                m = i;
            }
        }
        return m;
    }

    public static int[][] cuadrados_matriz(int[][] X) {
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
                System.out.print(" "+(X[i][j]));
            }
            System.out.println("");
        }
    }

    public static boolean matriz_simetrica(int[][] X){
        //boolean bandera = true;
        for (int i = 0; i < X.length - 1; i++) {
            for (int j = i + 1; j < X.length; j++) {
                //bandera &= (X[i][j] == X[j][i]);
                if(X[i][j] != X[j][i])
                    return false;
            }
        }
        return true;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
//        int[][] matriz = new int[2][2];
//        matriz[0][0] = 8;
//        matriz[0][1] = 7;
//        matriz[1][0] = 2;
//        matriz[1][1] = 3;
        int[][] matriz =  {{3,4,2},{4,3,1},{2,1,0}};
        imprimirMatriz(matriz);
        int[][] cuadrados = cuadrados_matriz(matriz);
        //imprimirMatriz(cuadrados);
        System.out.println(matriz_simetrica(matriz));
//        double[] arr = {1.3,1.4,1.2,5.1};
//        System.out.println(pos_maximo(arr));
//        int[] arr = lee_arreglo_enteros(sc, 5);
//        escribe_arreglo_enteros(arr);
//        System.out.println("Ingrese el número: ");
//        int num = sc.nextInt();
//        factorial(num);
       // String cadena = sc.nextLine();
        //String cadena = new String("Hola mundo");
        //System.out.println(cadena);
        
//        String a = "hola";
//        String b = "hola";
//        String c = "HOLA";
//        System.out.println(c.compareTo(a));
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase(c));
//        String a = "hola Jorge";
//        String b = "Hola";
//        System.out.println(a.toUpperCase().contains(b.toUpperCase()));
//            String s = "Programar es genial!";
//            System.out.println(s.substring(10, 15));
//        partirCadena("Juan,030,1.60");
            
          
    }
    
}
