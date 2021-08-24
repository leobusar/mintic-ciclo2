/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ILibroDAO;
import java.util.List;
import model.Libro;
import view.LibroView;

/**
 * Ahora creas el controlador, el controlador contiene 2 objetos el modelo,
 * la vista así como los getters y setters para llenar las propiedades del modelo
 * y un método(actualizarVista()) que llama a la vista que a su vez imprime las
 * propiedades del modelo cliente.
 * @author Arles
 */
public class LibroController {
    private LibroView vista;
    private ILibroDAO libroDAO;

    public LibroController(LibroView vista, ILibroDAO libroDAO) {
        this.vista = vista;
        this.libroDAO = libroDAO;
    }

    public LibroView getVista() {
        return vista;
    }
    
    public void actualizarVista(){
        List<Libro> libros = libroDAO.obtenerLibros();
        vista.imprimirDatosLibro(libros);
    }
}
