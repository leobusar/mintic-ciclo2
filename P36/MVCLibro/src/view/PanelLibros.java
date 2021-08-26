/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LibroController;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author leobusta
 */
public class PanelLibros extends JPanel{
    private JTable table; 
    LibroController controller;

    public PanelLibros(LibroController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
        table = new JTable();
        setLayout(new BorderLayout());
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        cargarLibros();
    }
    
    public void cargarLibros(){
        table.setModel(controller.consultarLibros());
    }

    public JTable getTable() {
        return table;
    }
    
}
