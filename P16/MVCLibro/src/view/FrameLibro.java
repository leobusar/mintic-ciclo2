/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LibroController;
import dao.ILibroDAO;
import dao.LibroDAOJDBCImpl;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class FrameLibro extends JFrame {
    JTextField txtLibId;
    JTextField txtLibNombre;
    JTextField txtLibPub;
    JTextField txtLibPrecio;
    LibroController controller;
    PanelLibros panelListado;
    boolean editar = false;
   
    FrameLibro(){
        ILibroDAO dao = new LibroDAOJDBCImpl();
        controller = new LibroController(dao);
        initComponents();
    }
    
    public void initComponents(){
        // Al cerrar la ventana se finaliza la ejecución del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Establece el titulo de la ventana
        setTitle("Administración de Libros");
        
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
        txtLibId = new JTextField(20);
        l.setLabelFor(txtLibId);
        panel.add(txtLibId);

        l = new JLabel("Nombre", JLabel.TRAILING);
        panel.add(l);
        txtLibNombre = new JTextField(20);
        l.setLabelFor(txtLibNombre);
        panel.add(txtLibNombre);

        l = new JLabel("Año", JLabel.TRAILING);
        panel.add(l);
        txtLibPub = new JTextField(20);
        l.setLabelFor(txtLibPub);
        panel.add(txtLibPub);

        l = new JLabel("Precio", JLabel.TRAILING);
        panel.add(l);
        txtLibPrecio = new JTextField(20);
        l.setLabelFor(txtLibPrecio);
        panel.add(txtLibPrecio);
        
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
        // Sirve de panel principal de la ventana
        JPanel  panelPrincipal = new JPanel();
        setContentPane(panelPrincipal);
        panelPrincipal.add(panel);
        panelListado = new  PanelLibros(controller);

        panelBtn = new JPanel();
        JButton btnEditar = new JButton("Editar");
        panelBtn.add(btnEditar);
        JButton btnEliminar = new JButton("Eliminar");
        panelBtn.add(btnEliminar);
        panelListado.add(panelBtn, BorderLayout.PAGE_END);

        btnEliminar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnEliminarClick();
            }
        }); 
        btnEditar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btnEditarClick();
            }
        });           
        panelPrincipal.add(panelListado);
        
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
        try {
            int libId = Integer.parseInt(txtLibId.getText());
            String libNombre = txtLibNombre.getText();
            int libPub = Integer.parseInt(txtLibPub.getText());
            double libPrecio = Double.parseDouble(txtLibPrecio.getText());
            Libro  libro = new Libro(libId, libNombre, libPub, 1, 1, libPrecio);
            if(!editar)
                controller.agregarLibro(libro);
            else
                controller.actualizarLibro(libro);
            btnClearClick();
            editar = false;
            panelListado.cargarLibros();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa los valores correctos");
        }
    }
    
    private void btnClearClick(){
        txtLibId.setText(null);
        txtLibNombre.setText(null);
        txtLibPub.setText(null);
        txtLibPrecio.setText(null);    
    }
    private void btnListarClick(){
        panelListado.cargarLibros();
    }

    private void btnEliminarClick(){
        int  selected = panelListado.getTable().getSelectedRow();
        if (selected != -1){
            String selectedCellValue = (String) panelListado.getTable().getValueAt(selected,0);
            //System.out.println(selectedCellValue);
            controller.eliminarLibro(Integer.parseInt(selectedCellValue));
            panelListado.cargarLibros();
        }
            
    }
    private void btnEditarClick(){
        int  selected = panelListado.getTable().getSelectedRow();
        JTable table = panelListado.getTable();
        if (selected != -1){
            txtLibId.setText((String) table.getValueAt(selected, 0));
            txtLibNombre.setText((String) table.getValueAt(selected, 1));
            txtLibPub.setText((String) table.getValueAt(selected, 2));
            txtLibPrecio.setText((String) table.getValueAt(selected, 3));
            editar = true;
        }        
    }    
    public  static void main(String[] args){
        new FrameLibro();
    }   
}
