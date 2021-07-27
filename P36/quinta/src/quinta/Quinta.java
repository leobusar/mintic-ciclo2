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
public class Quinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Perro miPerro = new Perro(5,"firulais", "gris");
//        
//        System.out.println("edad:"+miPerro.edad);
//        
//        miPerro.saludar(true);
//        Perro miPerro1 = new Perro(8, "Toby", "Azul");
//        Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
//        Perro miPerro3 = new Perro(5, "Bony", "Amarillo");
//        
//        miPerro2.quienEsMayor(miPerro3);
//        miPerro2.quienEsMayor(miPerro1);
//        miPerro2.quienEsMayor(miPerro2);

//          Password myPass = new Password();
//          
//          System.out.println("pass: "+ myPass.contrasenia);
//          
//          System.out.println("Clase: "+myPass);
//          
//          myPass.changePassword("Pepito123456");
//           System.out.println("Clase: "+myPass);
//           
//          System.out.println("fuerte: "+myPass.esFuerte());
         
            Pacman person = new Pacman();
            
            Tablero myboard = new Tablero(person);
            
            myboard.personaje.restarVida();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            myboard.personaje.sumarPuntuacion();
            System.out.println("puntuacion: "+myboard.personaje.obtenerPuntuacion());
            
            myboard.comprobarNivelActual();
            
            System.out.println("nivel: "+myboard.nivel);
            
    }
    
}
