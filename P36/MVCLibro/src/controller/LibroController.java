/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ILibroDAO;
import dao.LibroDAOJDBCImpl;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Libro;

/**
 *
 * @author leobusta
 */
public class LibroController {
    private ILibroDAO libroDAO;
    
    public LibroController(){
        libroDAO = new LibroDAOJDBCImpl();
    }
    
    public void exportarLibros(){
        try {
            FileWriter file  = new FileWriter("c:\\Users\\leobusta\\file.txt");
            file.write("ID, Título, Año, Precio\n");
            List<Libro> libros = libroDAO.obtenerLibros();
            for (Libro libro: libros){
                String fila = "";
                fila+= libro.getLibId()+",";
                fila+= libro.getLibNombre()+",";
                fila+= libro.getLibPub()+",";
                fila+= libro.getPrecio()+"\n";
                file.write(fila);
            }
            file.close();
            
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error creando el archivo");
        }
    }
    
    
    public DefaultTableModel consultarLibros(){
        String[] titulos = {"ID", "Título", "Año", "Precio"};
        
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        List<Libro> libros = libroDAO.obtenerLibros();
        for (Libro libro: libros){
            String[] fila = new String[4];
            fila[0] = libro.getLibId()+"";
            fila[1] = libro.getLibNombre();
            fila[2] = libro.getLibPub()+"";
            fila[3] = libro.getPrecio()+"";
            model.addRow(fila);
        }
        
        
        
        return model;
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
