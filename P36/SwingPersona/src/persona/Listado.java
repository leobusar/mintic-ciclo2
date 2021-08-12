/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author leobusta
 */
public class Listado extends JFrame {
    public Listado(ArrayList<Persona> persona, String title) {
        setTitle(title);
        String[] encabezados = {"Nombre", "Edad", "Email", "Ocupacion", "Genero"};
        String[][] valores = new String[persona.size()][encabezados.length];
        for(int i = 0; i < persona.size(); i++){
            valores[i][0] = persona.get(i).getNombre();
            valores[i][1] = ""+persona.get(i).getEdad();
            valores[i][2] = persona.get(i).getEmail();
            valores[i][3] = persona.get(i).getOcupacion();
            valores[i][4] = persona.get(i).getGenero();           
        }

        JTable table = new JTable(valores, encabezados);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        pack();
        setVisible(true);
    }    
}
