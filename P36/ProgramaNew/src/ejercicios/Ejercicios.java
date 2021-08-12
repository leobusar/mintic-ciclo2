package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leobusta
 */
public class Ejercicios {
    public static ArrayList<Integer> resta(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        ArrayList<Integer> result = new ArrayList<>();
            for(Integer elem:arreglo1){
                if(!arreglo2.contains(elem) && !result.contains(elem))
                    result.add(elem);
            }
        return result;
    }
    
    public static boolean contiene(HashMap<String,Integer> map1, HashMap<String,Integer> map2){
        boolean result = true;
        
        for (String key: map1.keySet()){
            if(!map2.containsKey(key) || !(map2.get(key).equals(map1.get(key))))
                return false;
        }
        
        return result;
    }
    
    public static TreeMap<String,Integer> union(TreeMap<String,Integer> map1, TreeMap<String,Integer> map2){
//        TreeMap<String,Integer> result = (TreeMap<String,Integer>)map1.clone();
//        
//        for (String key: map2.keySet()){
//            if(!result.containsKey(key))
//                result.put(key, map2.get(key));
//        }
        TreeMap<String,Integer> result = (TreeMap<String,Integer>)map2.clone();
        
        result.putAll(map1);
        
        return result;
    }    

    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(1, 7, 2, 3, 61, 8, 7, 4, 1, 2));
        ArrayList<Integer> arreglo2 = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 9, 7, 4, 1));

        //[2,3,61,8]
//        System.out.println("resta: "+resta(arreglo, arreglo2));
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        
        map1.put("ssh", 22);
        map1.put("http", 80);
        map1.put("https", 443);
        map1.put("imap", 143);
        map1.put("smtp", 25);

        map2.put("ssh", 1022);
        map2.put("http", 80);
        map2.put("https", 443);
        map2.put("imap", 995);
        map2.put("smtp", 25);
        map2.put("postgresql", 5432);
        
        //System.out.println("contiene: "+contiene(map1,map2));
        
        int[] prueba  =  {1,2,3,4};
        
        //System.out.println("arreglo:"+prueba);
        TreeMap<String,Integer> arbol1 = new TreeMap<>();
        TreeMap<String,Integer> arbol2 = new TreeMap<>();
        
        arbol1.put("ssh", 22);
        arbol1.put("http", 80);
        arbol1.put("https", 443);
        arbol1.put("imap", 143);
        arbol1.put("smtp", 25);

        arbol2.put("ssh", 22);
        arbol2.put("http", 80);
        arbol2.put("https", 443);
        arbol2.put("imap", 143);
        arbol2.put("smtp", 25);
        arbol2.put("postgresql", 5432);
        
        System.out.println("contiene: "+union(arbol1,arbol2));
      
    }
}
