/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinta;

/**
 *
 * @author leobusta
 */
public class Persona {
    public int edad;
    public char genero;
    public String nombre;
    public double peso;
    public double estatura;

    public Persona(String nombre, int edad, char genero, double peso, double estatura) {
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public double calcularIMC(){
        return this.peso/Math.pow(this.estatura,2);
    }
    
    public boolean esMayorDeEdad(){
        return this.edad >=18;
    }
    
    @Override
    public String toString(){
        return  this.nombre+ " "+this.edad+" genero:"+this.genero+ " estatura:"+this.estatura + " peso: "+this.peso;
    }
    
}
