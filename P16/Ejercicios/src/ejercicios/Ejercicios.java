/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author leobusta
 */
public class Ejercicios {
    
    public static ArrayList<Integer> sinDuplicados(ArrayList<Integer> arreglo){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer elem: arreglo){
            if(!result.contains(elem))
                result.add(elem);
        }        
        return result;
    }
    
    public static boolean contiene(HashMap<String, Integer> mapa1, HashMap<String, Integer> mapa2){
        boolean  result=true;
//        for (Map.Entry<String, Integer> entry: mapa1.entrySet()){
//            if(!mapa2.containsKey(entry.getKey()) || !mapa2.containsValue(entry.getValue())){
//                result = false;
//            }
//        }        
        for (String key: mapa1.keySet() ){
            if(!mapa2.containsKey(key) || !mapa2.containsValue(mapa1.get(key))){
                result = false;
            }
        }
        
        return result;
    }

    public static TreeMap<String, Integer> union(TreeMap<String, Integer> arbol1, TreeMap<String, Integer> arbol2){
        TreeMap<String, Integer>  result=(TreeMap<String, Integer>) arbol1.clone();
        
        for (String key: arbol2.keySet() ){
            if(!result.containsKey(key)){
                result.put(key, arbol2.get(key));
            }
        }
        
        return result;
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(1,2,3,5,1,3,4,1));
        System.out.println("Sin Duplicados: "+sinDuplicados(arreglo));
        
        HashMap<String, Integer> mapa = new HashMap<>();
        HashMap<String, Integer> mapa2 = new HashMap<>();
        
        mapa.put("ssh",22);
        mapa.put("http",80);
        mapa.put("https",443);
        mapa.put("ftp", 21);

        mapa2.put("ssh",22);
        mapa2.put("http",80);
        mapa2.put("https",443);
        mapa2.put("ftp", 21);        
        mapa2.put("squid", 3128);
        
        TreeMap<String, Integer> arbol = new TreeMap<>();
        TreeMap<String, Integer> arbol2 = new TreeMap<>();
        
        arbol.put("telnet",23);
        arbol.put("mysql",3306);
        arbol.put("pgsql",5432);
        arbol.put("ftp", 20);

        arbol2.put("ssh",22);
        arbol2.put("http",80);
        arbol2.put("https",443);
        arbol2.put("ftp", 21);   
        arbol2.put("squid", 3128);      
        
        System.out.println("Contiene:"+ union(arbol,arbol2));
    }
    
}
