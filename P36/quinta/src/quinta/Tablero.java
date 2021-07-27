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
public class Tablero {
    public Pacman personaje;
    public int nivel; 
    
    public Tablero(Pacman personaje){
        this.personaje = personaje;
        this.nivel = 0; 
    }
    
    public int comprobarNivelActual(){
        this.nivel = this.personaje.puntuacion / 25;
        
        return nivel;
    }
    
}
