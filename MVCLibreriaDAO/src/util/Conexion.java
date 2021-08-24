/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Arles
 */
public class Conexion {

    public static Connection getConnection() {
        // conectar
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    Properties.dbURL, Properties.username, Properties.password);
            if (conn != null) {
                System.out.println("*** Conected to database ***");
                return conn;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
