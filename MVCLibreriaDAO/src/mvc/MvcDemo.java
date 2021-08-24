/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controller.LibroController;
import dao.ILibroDAO;
import dao.LibroDAOJDBCImpl;
import view.LibroView;

/**
 *
 * @author Arles
 */
public class MvcDemo {
    public static void main(String[] args) {
        LibroView vista = new LibroView();
        ILibroDAO control = new LibroDAOJDBCImpl();
        LibroController controlador = new LibroController(vista, control);
        controlador.actualizarVista();
        //controlador.actualizarLibro("El otoño del patriarca", 1975);
        //controlador.actualizarVista();
    }

}
