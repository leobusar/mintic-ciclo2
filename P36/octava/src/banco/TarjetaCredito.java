/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Date;

/**
 *
 * @author leobusta
 */
public class TarjetaCredito {
    private String numero;
    private int code;
    private Date expires;
    private Banco banco;
    private Cliente cliente;

    public TarjetaCredito(String numero, int code, Date expires, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.code = code;
        this.expires = expires;
        this.banco = banco;
        this.cliente = cliente;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
