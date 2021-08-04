/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author leobusta
 */
public class Colecciones {

    public static void arreglos(){
        ArrayList<Integer> arreglo =  new ArrayList<>(Arrays.asList(1,7,2,9,12,32,61,9,7,4));
        
//        for (int i =2; i<15; i++)
//            arreglo.add(i);
        System.out.println("arreglo 10: "+arreglo.get(5));
        arreglo.set(5,2000);
        System.out.println("arreglo 10: "+arreglo.get(5));
        arreglo.remove((Integer) 3);
        arreglo.add(0,5);
        System.out.println("arreglo: "+arreglo);
        for(int i=0; i<arreglo.size(); i++){
            System.out.println("arreglo "+i+":"+arreglo.get(i));
        }
        
        for (Integer elem: arreglo)
             System.out.println("elem: "+ elem);        
    }
    
    public static void mapas(){

        // HashMap con claves string y valores double
        HashMap<String, Double> mapa = new HashMap<>();
        // agregar elementos al HashMap
        mapa.put("nota1", 3.2);
        mapa.put("nota2", 4.3);
        mapa.put("nota3", 3.9);
        // cantidad de elementos en el HashMap
        System.out.println("Tamaño: " + mapa.size());
        // impresi´on del HashMap
        System.out.println("HashMap 1: " + mapa);
        // verificaci´on de llave y extracci´on de valor
        if (mapa.containsKey("nota2")) {
            Double valor = mapa.get("nota2");
            System.out.println("nota 2 === " + valor);
        }
        System.out.println("No posicion: "+mapa.get("nota5"));
        mapa.remove("nota1");
        System.out.println("HashMapFinal:");
        // recorrer HashMap por llave y clave
//        for (Map.Entry<String, Double> elem : mapa.entrySet()) {
//            System.out.println(elem.getKey() + " : " + elem.getValue());
//        }
        for(String key: mapa.keySet()){
            System.out.println(key + " : " + mapa.get(key));
        }
    }
    
    public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> arreglo){
        ArrayList<Integer> result = new ArrayList<> ();
        
        for (Integer elem: arreglo)
            if (!result.contains(elem))
                result.add(elem);
        
        return result;
    }

    public static ArrayList<Integer> interseccion(ArrayList<Integer> arreglo, ArrayList<Integer> arreglo2){
        ArrayList<Integer> result = new ArrayList<> ();
        
        for (Integer elem: arreglo)
            if (arreglo2.contains(elem) && !result.contains(elem))
                result.add(elem);
        
        return result;
    }
    public static ArrayList<Integer> inversa(ArrayList<Integer> arreglo){
        ArrayList<Integer> result = new ArrayList<> ();
        for(int i=arreglo.size()-1; i >= 0; i--)
            result.add(arreglo.get(i));
        return result;
    }
    public static ArrayList<Double> inversa2(LinkedList<Double> arreglo){
        ArrayList<Double> result = new ArrayList<> ();
        while(!arreglo.isEmpty()){
            result.add(arreglo.removeLast());
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arreglos();
        //mapas();
        ArrayList<Integer>  arreglo =  new ArrayList<>(Arrays.asList(1,7,2,3,61,8,7,4,1));
        ArrayList<Integer>  arreglo2 =  new ArrayList<>(Arrays.asList(1,4,5,20,9,7,4,1));
        //System.out.println("sin duplicados:"+eliminarDuplicados(arreglo));
        //System.out.println("interseccion:"+eliminarDuplicados(interseccion(arreglo, arreglo2)));
        //System.out.println("interseccion:"+interseccion(arreglo, arreglo2));
        System.out.println("inversa: "+inversa(arreglo2));
        
        LinkedList<Double>  lista =  new LinkedList<>(Arrays.asList(1.2,4.3,5.1,20.0,9.1));
        System.out.println("inversa: "+inversa2(lista));
    }
    
}
