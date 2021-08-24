/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leobusta
 */
public class Crud {

    public static void select(Connection conn){
        try {
            String sql = "SELECT * FROM libro ";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                String titulo = result.getString(2);
                int pub = result.getInt(3);
                Double costo = result.getDouble(6);
                System.out.println("Título : "
                        + titulo + " Año publicación: " + pub
                        + " Costo : " + costo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void insert(Connection conn){
        try {
            String sql = "INSERT INTO libro (libId , libNombre ,libPub ,ediId ,autId , libPrecio ) VALUES( ?,?,  ?,  ?,  ?,  ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 1010);
            statement.setString(2, "La Hojarasca ");
            statement.setInt(3, 1955);
            statement.setInt(4, 1);
            statement.setInt(5, 1);
            statement.setDouble(6, 95000.0);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(" Inserción exitosa !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dbURL
                = "jdbc:mysql://localhost:3306/libreria";
        String username = "libreria36";
        String password = "libros123";
// conectar
        try {
            Connection conn = DriverManager.getConnection(
                    dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //insert(conn);
                select(conn);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
}
