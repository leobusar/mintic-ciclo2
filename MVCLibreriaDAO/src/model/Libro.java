/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * El modelo: Para usar este patrón de diseño en Java, 
 * primero creas el modelo, que es una clase en java y 
 * se llama Cliente.java, esta clase sólo contiene los 
 * atributos, constructor, getters y setters.
 * 
 * @author Arles
 */
public class Libro {
    private int libId;
    private String libNombre;
    private int libPub;
    private int ediId;
    private int autId;
    private double precio;

    public Libro(int libId, String libNombre, int libPub, int ediId, int autId, double precio) {
        this.libId = libId;
        this.libNombre = libNombre;
        this.libPub = libPub;
        this.ediId = ediId;
        this.autId = autId;
        this.precio = precio;
    }

    public int getLibId() {
        return libId;
    }

    public String getLibNombre() {
        return libNombre;
    }

    public int getLibPub() {
        return libPub;
    }

    public int getEdiId() {
        return ediId;
    }

    public int getAutId() {
        return autId;
    }

    public double getPrecio() {
        return precio;
    }

    public void setLibNombre(String libNombre) {
        this.libNombre = libNombre;
    }

    public void setLibPub(int libPub) {
        this.libPub = libPub;
    }        
}
