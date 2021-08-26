/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
/**
 *
 * @author leobusta
 */
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Listado extends JPanel {

    public Listado(ArrayList<Persona> personas, String title) {
//        setTitle(title);
        System.out.println(personas);
        String[] encabezados = {"Nombre", "Edad", "Genero", "Email", "Ocupacion"};
        String[][] valores = new String[personas.size()][encabezados.length];
        for(int i=0; i < personas.size(); i++){
            valores[i][0] = personas.get(i).getNombre();
            valores[i][1] = ""+personas.get(i).getEdad();
            valores[i][2] = personas.get(i).getGenero();
            valores[i][3] = personas.get(i).getEmail();
            valores[i][4] = personas.get(i).getOcupacion();  
        }
        JTable table = new JTable(valores, encabezados);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
//        pack();
//        setVisible(true);
    }
    
    
}
