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
public class Perro {
// Atributos
    public int edad;
    public String nombre;
    public String colorOjos;
    
    // Constructor
    public Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void saludar(boolean ladrar) {
        System.out.println("Hola, mi nombre es " + this.nombre);
        if (ladrar)
           this.ladrar();
    }
    
    public void quienEsMayor(Perro otroPerro) {
        if(this.edad > otroPerro.edad){
            System.out.println("Soy mayor que "+otroPerro.nombre);
        }else if (this.edad == otroPerro.edad){
            System.out.println("Tengo la misma edad que "+ otroPerro.nombre);
        }else{
            System.out.println("Soy menor que "+ otroPerro.nombre);           
        }
    }
    
    public void miNombreEsIgual(Perro otroPerro) {
        if(this.nombre.equals(otroPerro.nombre)){
            System.out.println("Tengo el mismo nombre que "+ otroPerro.nombre);
        }else{
            System.out.println("Mi nombre es distinto "+ otroPerro.nombre);
        }
    }
    
}
