/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinta;

import java.util.UUID;

/**
 *
 * @author leobusta
 */
public class Password {
    int longitud=8;
    String contrasenia; 
    
    public Password(int longitud){
        UUID uniqueKey = UUID.randomUUID();
        this.contrasenia = uniqueKey.toString().replace("-", "").substring(0,longitud);
    }

    public Password(){
        UUID uniqueKey = UUID.randomUUID();
        this.contrasenia = uniqueKey.toString().replace("-", "").substring(0,longitud);
    }
    
    @Override
    public String toString(){
        return "longitud: "+longitud+" contraseña:"+contrasenia;
    }
    
    public void changePassword(String pass){
        this.contrasenia = pass; 
        this.longitud = pass.length();
    }
    
    public boolean esFuerte(){
        int digitos=0; 
        boolean  tieneMayuscula = false; 
        boolean  tieneMinuscula = false;
        for(int i=0; i < this.contrasenia.length(); i++){
            char caracter = this.contrasenia.charAt(i);
            if(Character.isDigit(caracter))
                digitos++;
            else if(Character.isUpperCase(caracter))
                tieneMayuscula = true;
            else if (Character.isLowerCase(caracter))
                tieneMinuscula = true;
        }
        
        return  (tieneMayuscula  && tieneMinuscula && digitos >5 );
    }
}
