/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author leobusta
 */
public class Colecciones {
    
    public static ArrayList<Integer> sinDuplicados(ArrayList<Integer> arreglo){
       ArrayList<Integer> result = new ArrayList<>(); 
       
       for(Integer elem: arreglo){
           if(!result.contains(elem))
               result.add(elem);
       }
       
       return result;
    }
    
    public static ArrayList<Integer> noIsB(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList result= new ArrayList();
        
        for(Integer i: a){
            if(!b.contains(i) && !result.contains(i))
                result.add(i);
        }
        return result;
    }
    
    public static boolean contenido(HashMap<String,Integer> map1, HashMap<String,Integer> map2){
        boolean  result = true;
        
        for(String key: map1.keySet()){
            if(!map2.containsKey(key) || !(map2.get(key).equals(map1.get(key))))
               return false;
        }
               
        return result;
    }
    
    public static TreeMap<String, Integer> union(TreeMap<String,Integer> map1, TreeMap<String,Integer> map2){
        //TreeMap<String, Integer> result = (TreeMap<String, Integer>) map1.clone();
        TreeMap<String, Integer> result = (TreeMap<String, Integer>) map2.clone();
//        for(String key: map2.keySet()){
//            if(!result.containsKey(key))
//                result.put(key,map2.get(key));
//        }
        result.putAll(map1);
        
        return result;
    }
    
    public static void main(String[] args) {
         ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(0,0,5,3,20,5,3,5,20,43));
         ArrayList<Integer> arreglo2 = new ArrayList<>(Arrays.asList(5,3,20));
         //   [0,43]         
         //System.out.println("A-B"+noIsB(arreglo, arreglo2));
         HashMap<String,Integer> map1 = new HashMap<>();
         HashMap<String,Integer> map2 = new HashMap<>();
         
         map1.put("ssh",22);
         map1.put("telnet",23);
         map1.put("http",80);
         map1.put("https",443);
         map1.put("imap",143);
         
         map2.put("ssh",22);
         map2.put("telnet",23);
         map2.put("http",80);
         map2.put("https",443);
         map2.put("imap",143);
         map2.put("imaps", 995);
       
         TreeMap<String,Integer> arbol1 = new TreeMap<>();
         TreeMap<String,Integer> arbol2 = new TreeMap<>();
         
         arbol1.put("ssh",1022);
         arbol1.put("mysql",3306);
         arbol1.put("http",80);
         arbol1.put("https",443);
         arbol1.put("imap",143);
         arbol1.put("pgsql",5432);
         
         arbol2.put("ssh",22);
         arbol2.put("telnet",23);
         arbol2.put("http",8080);
         arbol2.put("https",8443);
         arbol2.put("imap",143);
         arbol2.put("imaps", 995);
         
         System.out.println("Union? "+ union(arbol1,arbol2));
    }    
    
}
