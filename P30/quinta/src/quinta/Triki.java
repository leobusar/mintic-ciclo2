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
    
    public Triki(){
        char[][] nueva = {{'a','a','a'},{'X','X','a'},{'a','X','a'}};
        
        this.tablero = nueva;
    }
    
    public void printMatriz(){
        for (char[] tablero1 : this.tablero) {
            for (int j = 0; j < tablero1.length; j++) {
                System.out.print(tablero1[j] + " ");
            }
            System.out.println("");
        }
    }
    
   public void marcarCasilla(char simbolo, int fila, int columna){
       if (this.tablero[fila][columna] != 'a' ){
           System.out.println("Casilla marcada");
       }else if ( simbolo == 'X' || simbolo == 'O' ){
           this.tablero[fila][columna] = simbolo;
       }else 
            System.out.println("Simbolo no válido");
   }
   
   public char verificarCasilla( int fila, int columna){
       if (fila > 3 || columna > 3){
           System.out.println("Error fuera de indice");
           return 'm';
       }
           
       
       return this.tablero[fila][columna];
   }
   
   public char verificarGanador(){
       if (this.tablero[0][0] != 'a' && this.tablero[0][0] == this.tablero[1][1]  && this.tablero[0][0] == this.tablero[2][2])
           return  this.tablero[0][0];
       else if (this.tablero[2][0] != 'a' && this.tablero[2][0] == this.tablero[1][1]  && this.tablero[2][0] == this.tablero[0][2])
           return  this.tablero[2][0];
       else{
           for(int i = 0; i< this.tablero.length ; i++){
               if (this.tablero[i][0] != 'a' && this.tablero[i][0] == this.tablero[i][1]  && this.tablero[i][0] == this.tablero[i][2])
                    return  this.tablero[i][0];
               if (this.tablero[0][i] != 'a' && this.tablero[0][i] == this.tablero[1][i]  && this.tablero[0][i] == this.tablero[2][i])
                    return  this.tablero[i][0];               
           }
       }
       
       return 'n';
           
   }
}
