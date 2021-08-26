package view;

import controller.LibroController;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leobusta
 */
public class PanelLibros extends JPanel{
    private JTable table;
    private LibroController controller;

    public PanelLibros(LibroController controller) {
        this.controller = controller;
        initComponents();
        cargarLibros();
    }

    private void initComponents() {
        table = new JTable();
        setLayout(new BorderLayout());
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }

    public JTable getTable() {
        return table;
    }
    
    public void cargarLibros(){
        table.setModel(controller.consultarLibros());
        
    }
    
    
    
}
