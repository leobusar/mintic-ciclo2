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
public class TarjetaCredito {
    private int cupo; 
    private int numero;
    private String fechaExp;
    private int codigo;
    private Cliente cliente;
    private Banco banco;

    public TarjetaCredito(int cupo, int numero, String fechaExp, int codigo, Cliente cliente, Banco banco) {
        this.cupo = cupo;
        this.numero = numero;
        this.fechaExp = fechaExp;
        this.codigo = codigo;
        this.cliente = cliente;
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
