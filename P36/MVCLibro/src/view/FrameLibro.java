/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LibroController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import model.Libro;
import util.SpringUtilities;

/**
 *
 * @author leobusta
 */
public class FrameLibro extends JFrame{
    JTextField textFieldLibId; 
    JTextField textFieldLibNombre; 
    JTextField textFieldLibPub; 
    JTextField textFieldLibPrecio;
    PanelLibros listadoPanel;
    LibroController controller;
    boolean editar = false;
    
    FrameLibro(){
        controller = new LibroController();
        initComponents();
    }

    private void initComponents() {
        // Al cerrar la ventana se finaliza la ejecución del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Establece el titulo de la ventana
        setTitle("Administración Libros");
        
        // Establece el aspecto de la distribución utilizada
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JPanel panel = new JPanel(new SpringLayout());

        //Create and populate the panel.
        JLabel l = new JLabel("ID", JLabel.TRAILING);
        panel.add(l);
        textFieldLibId = new JTextField(20);
        //textFieldLibId.setEditable(false);
        l.setLabelFor(textFieldLibId);
        panel.add(textFieldLibId);

        l = new JLabel("Título", JLabel.TRAILING);
        panel.add(l);
        textFieldLibNombre = new JTextField(20);
        l.setLabelFor(textFieldLibNombre);
        panel.add(textFieldLibNombre);

        l = new JLabel("Año", JLabel.TRAILING);
        panel.add(l);
        textFieldLibPub = new JTextField(20);
        l.setLabelFor(textFieldLibPub);
        panel.add(textFieldLibPub);

        l = new JLabel("Precio", JLabel.TRAILING);
        panel.add(l);
        textFieldLibPrecio = new JTextField(20);
        l.setLabelFor(textFieldLibPrecio);
        panel.add(textFieldLibPrecio);
        
        JButton btnSubmit = new JButton("Guardar");
        panel.add(btnSubmit);
        JPanel panelBtn = new JPanel(new GridLayout());
        JButton btnClear = new JButton("Limpiar");
        panelBtn.add(btnClear);
        JButton btnListar = new JButton("Listado");
        panelBtn.add(btnListar);
        
        panel.add(panelBtn);
        
        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnSubmitClick();
            }
        });

        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnClearClick();
            }
        });

        btnListar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnListarClick();
            }
        });

        //Lay out the panel.
        SpringUtilities.makeCompactGrid(panel,
                                        5, 2, //rows, cols
                                        15, 15,        //initX, initY
                                        15, 15);       //xPad, yPad        

        JPanel panelPrincipal = new JPanel();
        
        setContentPane(panelPrincipal);
        panelPrincipal.add(panel);
        listadoPanel = new PanelLibros(controller);
        JPanel panelBtn2 = new JPanel();
        JButton btnEditar = new JButton("Editar");
        panelBtn2.add(btnEditar);
        JButton btnEliminar = new JButton("Eliminar");
        panelBtn2.add(btnEliminar);
        
        listadoPanel.add(panelBtn2, BorderLayout.PAGE_END);
        btnEditar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnEditarClick();
            }
        });

        btnEliminar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnEliminarClick();
            }
        });        
        
        panelPrincipal.add(listadoPanel);
                
        pack();
        // Permite ubicar la ventana en el centro de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, 
                (screenSize.height - frameSize.height) / 2);
        
        // Hace que la ventana de la aplicación sea visible
        setVisible(true);
        
    }
    
    private void btnSubmitClick(){
        int libId = Integer.parseInt(textFieldLibId.getText());
        String libNombre = textFieldLibNombre.getText();
        int libPub = Integer.parseInt(textFieldLibPub.getText());
        double libPrecio = Double.parseDouble(textFieldLibPrecio.getText());
        
        Libro libro = new Libro(libId, libNombre, libPub, 1, 1, libPrecio);
        if(!editar)
            controller.agregarLibro(libro);
        else{
            controller.actualizarLibro(libro);
            editar = false;
        }
            
        btnClearClick();
        listadoPanel.cargarLibros();
    }
 
    private void btnClearClick(){
        this.textFieldLibId.setText(null);
        this.textFieldLibNombre.setText(null);
        this.textFieldLibPrecio.setText(null);
        this.textFieldLibPub.setText(null);
    }

    private void btnListarClick(){
        controller.exportarLibros();
    }
    
    private void btnEliminarClick(){
        int selected = listadoPanel.getTable().getSelectedRow();
        if (selected != -1){
            String  id = (String) listadoPanel.getTable().getValueAt(selected, 0);
            
            controller.eliminarLibro(Integer.parseInt(id));
            listadoPanel.cargarLibros();           
        }
    } 
    private void btnEditarClick(){
        int selected = listadoPanel.getTable().getSelectedRow();
        if (selected != -1){
            JTable table = listadoPanel.getTable();
            this.textFieldLibId.setText((String) table.getValueAt(selected, 0));
            this.textFieldLibNombre.setText((String) table.getValueAt(selected, 1));
            this.textFieldLibPrecio.setText((String) table.getValueAt(selected, 3));
            this.textFieldLibPub.setText((String) table.getValueAt(selected, 2));
            editar = true;
        }     
    }     
    
    public static void main(String[] args){
        new FrameLibro();
    }
}
