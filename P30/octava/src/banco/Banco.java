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
public class Banco extends Empresa {
    Cliente[] clientes;
    TarjetaCredito[] tarjetas;
    double acervo;
    String[] tiposCuenta;

    public Banco(double acervo, String[] tiposCuenta, String nombre, String direccion, int telefono, String representante) {
        super(nombre, direccion, telefono, representante);
        this.acervo = acervo;
        this.tiposCuenta = tiposCuenta;
    }
    
    
}
