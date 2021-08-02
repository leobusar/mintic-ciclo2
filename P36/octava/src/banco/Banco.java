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
public class Banco extends Empresa{
    private Cliente[] clientes;
    private String[] sucursales;
    private String[] productos;

    public Banco(String[] sucursales, String[] productos, String nombre, String direccion, String gerente, String telefono) {
        super(nombre, direccion, gerente, telefono);
        this.sucursales = sucursales;
        this.productos = productos;
        this.clientes = new Cliente[10];
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public String[] getSucursales() {
        return sucursales;
    }

    public void setSucursales(String[] sucursales) {
        this.sucursales = sucursales;
    }

    
}
