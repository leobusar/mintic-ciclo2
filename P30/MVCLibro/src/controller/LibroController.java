/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ILibroDAO;
import dao.LibroDAOJDBCImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Libro;

/**
 *
 * @author leobusta
 */
public class LibroController {
    private ILibroDAO libroDAO;

    public LibroController() {
        
        this.libroDAO = new LibroDAOJDBCImpl();
    }
    
    public DefaultTableModel consultarLibros(){
        String[] titulos  =  {"Id", "Título", "Año", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        List <Libro>  libros  = libroDAO.obtenerLibros();
        for(Libro libro: libros){
            String[] registro = new String[4];
            registro[0] = libro.getLibId()+"";
            registro[1] = libro.getLibNombre();
            registro[2] = libro.getLibPub()+"";
            registro[3] = libro.getPrecio()+"";
            modelo.addRow(registro);
        }
        
        return modelo;
    }

    public void agregarLibro(Libro libro){
        libroDAO.agregarLibro(libro);
    }
 
    public void actualizarLibro(Libro libro){
        libroDAO.actualizarLibro(libro);
    }

    public void eliminarLibro(int id){
        libroDAO.eliminarLibro(id);
    }    
}
