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
public class Triki {
    public char[][] tablero;
    
    Triki(){
        char[][] mitablero = {{'a','a','a'},{'a','a','a'},{'a','a','a'}};
        this.tablero = mitablero;
    }
    
    public void marcarCasilla(char  simbolo, int fila, int columna){
        if( simbolo=='X' || simbolo == 'O' )
            if(this.tablero[fila][columna] == 'a')
                this.tablero[fila][columna] = simbolo;
            else
                System.out.println("Casilla ya marcada");
        else
            System.out.println("Simbolo no adecuado");
    }
    
    public void imprimirJuego(){
        for(int i =0; i < this.tablero.length; i++){
            for (int j=0; j < this.tablero[i].length; j++){
                System.out.print(this.tablero[i][j]+" ");
            }
            System.out.println("");            
        }
    }
    
    public void verificarCasilla(int fila, int columna){
        System.out.println(this.tablero[fila][columna]);
    }
    
    public void verificarGanador(){
        boolean hayGanador = false;
        if (this.tablero[0][0] != 'a' && this.tablero[0][0] == this.tablero[1][1] && this.tablero[0][0] == this.tablero[2][2]){
            System.out.println("El ganador es "+ this.tablero[0][0]);
            hayGanador = true;
        }else if(this.tablero[2][0] != 'a' && this.tablero[2][0] == this.tablero[1][1] && this.tablero[2][0] == this.tablero[0][2]){
            System.out.println("El ganador es "+ this.tablero[2][0]);
            hayGanador = true;
        }else {
            for(int i=0; i < tablero.length; i++){
                if(this.tablero[i][0] != 'a' && this.tablero[i][0] == this.tablero[i][1] && this.tablero[i][0] == this.tablero[i][2]){
                    System.out.println("El ganador es "+ this.tablero[i][0]);
                    hayGanador = true;
                    break;
                } 
                if(this.tablero[0][i] != 'a' && this.tablero[0][i] == this.tablero[1][i] && this.tablero[0][i] == this.tablero[2][i]){
                    System.out.println("El ganador es "+ this.tablero[i][0]);
                    hayGanador = true;
                    break;
                }                 
            }
            if (!hayGanador)
                System.out.println("No hay ganador");
            
        }

    }
}
