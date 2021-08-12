/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

/**
 *
 * @author leobusta
 */
import javax.swing.*;

public class EjemploTabla extends JFrame {

    public EjemploTabla() {
        setTitle("Tabla de medalleria juegos olimpicos Tokyo 2020");
        String[] encabezados = {"Pais", "Oro", "Plata", "Bronce"};
        String[][] valores = {
            {"China", "29", "17", "16"},
            {"Estados Unidos", "22", "25", "17"},
            {"Jap´on", "17", "6", "10"}
        };
        JTable table = new JTable(valores, encabezados);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploTabla();
    }
}
