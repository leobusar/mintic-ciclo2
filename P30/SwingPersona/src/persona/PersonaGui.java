/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import layout.SpringUtilities;


/**
 *
 * @author leobusta
 */
public class PersonaGui extends JFrame{
    
    private Inscripciones app;
    JTextField textFieldNombre; 
    JTextField textFieldEdad;
    JTextField textFieldEmail;
    JRadioButton radioButtonM;
    JRadioButton radioButtonF;
    JComboBox comboBoxOcupacion;
    
    
    PersonaGui(Inscripciones  app){
        this.app = app;
        initComponents();
    }

    private void initComponents() {
        // Al cerrar la ventana se finaliza la ejecución del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Establece el titulo de la ventana
        setTitle("Inscripciones "+app.getNombre());
        
        // Establece el aspecto de la distribución utilizada
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JPanel panel = new JPanel(new SpringLayout());

        //Create and populate the panel.
        JLabel l = new JLabel("Nombre", JLabel.TRAILING);
        panel.add(l);
        textFieldNombre = new JTextField(20);
        l.setLabelFor(textFieldNombre);
        panel.add(textFieldNombre);
        
        l = new JLabel("Edad", JLabel.TRAILING);
        panel.add(l);
        textFieldEdad = new JTextField(20);
        l.setLabelFor(textFieldEdad);
        panel.add(textFieldEdad);
        
        l = new JLabel("Email", JLabel.TRAILING);
        panel.add(l);
        textFieldEmail = new JTextField(20);
        l.setLabelFor(textFieldEmail);
        panel.add(textFieldEmail);

        l = new JLabel("Genero", JLabel.TRAILING);
        panel.add(l);
        JPanel panelGenero = new JPanel();
        ButtonGroup  buttonGroup = new  ButtonGroup();
        radioButtonM = new JRadioButton("Masculino");
        panelGenero.add(radioButtonM);
        buttonGroup.add(radioButtonM);
        radioButtonF = new JRadioButton("Femenino");
        panelGenero.add(radioButtonF);
        buttonGroup.add(radioButtonF);
        panel.add(panelGenero);
        
        l = new JLabel("Ocupacion", JLabel.TRAILING);
        panel.add(l);
        comboBoxOcupacion = new JComboBox();
        comboBoxOcupacion.addItem("Seleccione");
        comboBoxOcupacion.addItem("Ingeniero");
        comboBoxOcupacion.addItem("Estudiante");
        comboBoxOcupacion.addItem("Profesor");
        comboBoxOcupacion.addItem("Doctor");
        comboBoxOcupacion.addItem("Otro");
        panel.add(comboBoxOcupacion);
        
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
                                        6, 2, //rows, cols
                                        15, 15,        //initX, initY
                                        15, 15);       //xPad, yPad        
        // Sirve de panel principal de la ventana


        setContentPane(panel);
        
        // Adjusta el tamaño de la ventana para que quepan todos los componentes
        pack();
        //setSize(800, 600);
        
        // Permite ubicar la ventana en el centro de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, 
                (screenSize.height - frameSize.height) / 2);
        
        // Hace que la ventana de la aplicación sea visible
        setVisible(true);
        
    }
    
    private void btnSubmitClick() {
        try {
            String nombre = textFieldNombre.getText();
            int edad = Integer.parseInt(textFieldEdad.getText());
            String genero ;
            String email = textFieldEmail.getText();
            String ocupacion = comboBoxOcupacion.getSelectedItem().toString();
            if (radioButtonM.isSelected())
                genero = "M";
            else 
                genero = "F";

            Persona persona = new Persona(nombre, edad, genero, email, ocupacion);
            app.addPersona(persona);
            //app.listarPersonas();
            JOptionPane.showMessageDialog(null, "La persona ha sido inscrita exitosamente");
            btnClearClick();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingresa un número en la edad");
        }
        
        //System.out.println("persona = " + persona);
    }
    private void btnClearClick() {
        textFieldNombre.setText(null);
        textFieldEdad.setText(null);
        textFieldEmail.setText(null);
        comboBoxOcupacion.setSelectedItem("Seleccione");
        radioButtonM.setSelected(false);
        radioButtonF.setSelected(false);
    }

    private void btnListarClick() {
           new Listado(app.getPersonas(), this.getTitle());
    }      
}
