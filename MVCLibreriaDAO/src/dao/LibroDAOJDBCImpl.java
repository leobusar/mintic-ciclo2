/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Libro;
import util.Conexion;

/**
 *
 * @author Arles
 */
public class LibroDAOJDBCImpl implements ILibroDAO {

    @Override
    public List<Libro> obtenerLibros() {
        Connection conn = null;
        List<Libro> libros = new ArrayList();

        try {
            conn = Conexion.getConnection();
            String sql = " SELECT * FROM libro ";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                Libro libro = new Libro(result.getInt(1), result.getString(2), result.getInt(3),
                        result.getInt(4), result.getInt(5), result.getDouble(6));
                libros.add(libro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return libros;
    }

    @Override
    public Libro obtenerLibro(int id) {
        Connection conn = null;
        Libro libro = null;
        try {
            conn = Conexion.getConnection();
            String sql = " SELECT * FROM libro where libId=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                libro = new Libro(result.getInt(1), result.getString(2), result.getInt(3),
                        result.getInt(4), result.getInt(5), result.getDouble(6));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return libro;
    }

    @Override
    public void actualizarLibro(Libro libro) {
        Connection conn = null;
        try {
            conn = Conexion.getConnection();
            String sql = "UPDATE libro SET libNombre =?, libPub =  ?, libPrecio =  ? WHERE  libId =  ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, libro.getLibNombre());
            statement.setInt(2, libro.getLibPub());
            statement.setDouble(3, libro.getPrecio());
            statement.setInt(4, libro.getLibId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue "
                        + " actualizado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

    @Override
    public void eliminarLibro(int id) {
        Connection conn = null;
        try {
            conn = Conexion.getConnection();
            String sql = "DELETE FROM libro WHERE libId =?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println(" Borrado exitoso !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

}
