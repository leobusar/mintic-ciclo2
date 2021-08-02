/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author leobusta
 */
public class Cliente {
    String nombre;
    int cedula;
    int telefono;
    String direccion;
    TarjetaCredito[] tarjetaCredito;
    Banco[] banco;

    public Cliente(String nombre, int cedula, int telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
}
