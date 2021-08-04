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
//        ArrayList<Integer> arreglo = new ArrayList<>();
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(4,36,2,1,8,9));
//        for(int i = 1; i <= 12; i++)
//            arreglo.add(i);
        
        System.out.println(arreglo);
        
        arreglo.remove(4);
        System.out.println(arreglo);
        
        arreglo.set(4,1000);
        arreglo.add(0,40);
        System.out.println(arreglo);
        //for (Integer elem: arreglo){
        for(int i =0; i< arreglo.size(); i++){
//            System.out.println("elem "+elem);
            System.out.println(i+" elem: "+arreglo.get(i));
        }     
    }
    
    public static void mapas(){
        HashMap<String, Double> mapa = new HashMap<>();
        // agregar elementos al HashMap
        mapa.put("nota1", 3.2);
        mapa.put("nota2", 4.3);
        mapa.put("nota3", 3.9);
        
        // cantidad de elementos en el HashMap
        System.out.println("Tamaño: " + mapa.size());
        // impresi´on del HashMap
        System.out.println("HashMap 1: " + mapa);
        
        System.out.println("keyset: "+mapa.keySet());
        
        System.out.println("values: "+mapa.values());
        
        //for(String key: mapa.keySet())
            //System.out.println(key + ":"+ mapa.get(key));
        
        for (Map.Entry<String, Double> elem: mapa.entrySet())    
            System.out.println(elem.getKey()+ ":"+ elem.getValue());


    }
    
    public static ArrayList<Integer> inversa(LinkedList<Integer> arreglo){
        ArrayList<Integer> result = new ArrayList<>();
        
//        for(int i=arreglo.size()-1; i >=0; i--){
//            result.add(arreglo.get(i));
//        }
        while(!arreglo.isEmpty()){
            result.add(arreglo.removeLast());
        }
        
        return result;
    }
    public static ArrayList<Integer> interseccion(ArrayList<Integer> arreglo,ArrayList<Integer> arreglo2){
        ArrayList<Integer> result = new ArrayList<>();
        
        for (Integer elem: arreglo){
            if(arreglo2.contains(elem) && !result.contains(elem)){
                result.add(elem);
            }
        }
        
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arreglos();
        //mapas();
        
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(4,2,6,8,1,21,15,45,4));
        ArrayList<Integer> arreglo2 = new ArrayList<>(Arrays.asList(6,3,4,2,32,21,18));
        //LinkedList<Integer> arreglo = new LinkedList<>(Arrays.asList(4,2,6,8,1,21,15,45));
        
        //System.out.println("Inversa:"+inversa(arreglo));
        System.out.println("Interseccion:"+interseccion(arreglo, arreglo2));
    }
    
}
