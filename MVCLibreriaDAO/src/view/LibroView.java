/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Libro;

/**
 * Luego creas la vista, la clase ClienteView.java, que es un clase que va hacer
 * de vista para el ejemplo y su función es presentar los datos del modelo.
 *
 * @author Arles
 */
public class LibroView {

    public void imprimirDatosLibro(List<Libro> libros) {
        for (Libro l : libros) {
            System.out.println("**** Datos Libro ****");
            System.out.println("Id: " + l.getLibId());
            System.out.println("Nombre: " + l.getLibNombre());
            System.out.println("Precio: " + l.getPrecio());
        }
    }
}
