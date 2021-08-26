/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ILibroDAO;
import model.Libro;

/**
 *
 * @author leobusta
 */
public class LibroController {
    private ILibroDAO libroDAO;
    
    public LibroController (ILibroDAO libroDAO){
        this.libroDAO = libroDAO;
    }
    
    public void  agregarLibro(Libro libro){
        libroDAO.agregarLibro(libro);
    }

    public void  actualizarLibro(Libro libro){
        libroDAO.actualizarLibro(libro);
    }

    public void  eliminarLibro(int id){
        libroDAO.eliminarLibro(id);
    }
}
