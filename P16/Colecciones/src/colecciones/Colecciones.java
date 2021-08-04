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

    public static void listaArreglos(){
         ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(5,3,20,18,43));
        ArrayList<Integer> arreglo2 = new ArrayList<>(Arrays.asList(1,2,5,3,40,18,45,3));
        ArrayList<Integer> interseccion = new ArrayList<>();
        
//        for (int i=1; i<=10; i++ ){
//            arreglo.add(i);
//        }

        System.out.println(arreglo.remove((Integer) 20));
        if(arreglo.contains(20)){
            System.out.println("Arreglo si contiene 20");
        }else
            System.out.println("Arreglo no contiene 20");
        //System.out.println(arreglo);
        
        //System.out.println(arreglo.containsAll(arreglo2));
        for(Integer elem: arreglo2){
        //for(int i=0; i < arreglo2.size(); i++ ){
            //System.out.println(": "+elem);
            if(arreglo.contains(elem) && !interseccion.contains(elem))
                interseccion.add(elem);
        }
        
        System.out.println("arreglo1"+arreglo);
        System.out.println("arreglo2"+arreglo2);
        System.out.println("interseccion"+interseccion);   
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
        System.out.println(mapa.get("nota4"));
        if (mapa.containsKey("nota2")) {
            Double valor = mapa.get("nota2");
            System.out.println("nota 2 === " + valor);
        }
        mapa.remove("nota1");
        System.out.println("HashMapFinal:");
// recorrer HashMap por llave y clave
//        for (Map.Entry<String, Double> elem : mapa.entrySet()) {
//            System.out.println(elem.getKey() + " : " + elem.getValue());
//        }
          for (String key: mapa.keySet()){
            System.out.println(key + " : " + mapa.get(key));
          }
    }
    
    public static LinkedList inversa(LinkedList<Integer> list){
        LinkedList<Integer> result= new LinkedList<>();
//        while(!list.isEmpty()){
//            Integer elem = list.removeLast();
//            result.add(elem);
//        }
        for(int i=list.size()-1; i>=0; i--){
            result.add(list.get(i));
        }
        
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mapas();
        //listaArreglos();
        LinkedList<Integer> arreglo = new LinkedList<>(Arrays.asList(5,3,20,18,43));
        System.out.println(inversa(arreglo));
    }
    
}
