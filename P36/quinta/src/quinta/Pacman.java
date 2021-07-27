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
public class Pacman {
    public String color = "Amarillo";
    public int puntuacion = 0; 
    public int vidasRestantes = 3;
    
    public Pacman(){}
    
    public Pacman(String color,  int puntuacion, int vidasRestantes){
        this.color = color; 
        this.puntuacion = puntuacion; 
        this.vidasRestantes = vidasRestantes;
    }
    
    public void sumarPuntuacion(){
        this.puntuacion++;
    }
    
    public int obtenerPuntuacion() {
        return this.puntuacion;
    }
    
    public void restarVida(){
        this.vidasRestantes--;
    }
    
    public boolean sigueVivo(){
        return this.vidasRestantes > 0; 
    }
}
