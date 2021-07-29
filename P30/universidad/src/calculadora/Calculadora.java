/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author leobusta
 */
public class Calculadora implements Operaciones, Constantes{
    
    public double suma(double a, double b){
        return  a +b;
    } 
    
    @Override
    public double resta(double a, double b){
        return a -b;
    }
    
    @Override
    public double multiplicacion(double a, double b){
        return a*b;
    }
    @Override
    public double division(double a, double b){
        return a/b;
    }
    
    public double areaCirculo(double radio){
        return  this.PI *radio*radio;
    }
    
}
