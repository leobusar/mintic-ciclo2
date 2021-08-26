/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpersona;

import java.awt.Dimension;
import java.awt.GridLayout;
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
    SwingPersona app; 
    JTextField jTextFieldNombre;
    JTextField jTextFieldEdad;
    JRadioButton jRadioButtonM;
    JRadioButton jRadioButtonF;
    JTextField jTextFieldEmail;
    JComboBox jComboBoxOcupacion;
    
    public  PersonaGui(SwingPersona app){
        this.app = app;
        initComponents();
    }

    private void initComponents() {
        // Al cerrar la ventana se finaliza la ejecución del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Establece el titulo de la ventana
        setTitle("Inscripción Programa "+app.getNombrePrograma());
        
        // Establece el aspecto de la distribución utilizada
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JPanel panelPrincipal  = new JPanel();
        
        //Create and populate the panel.
        JPanel panel = new JPanel(new SpringLayout());
        JLabel l = new JLabel("Nombre", JLabel.TRAILING);
        panel.add(l);
        jTextFieldNombre = new JTextField(30);
        l.setLabelFor(jTextFieldNombre);
        panel.add(jTextFieldNombre);

        l = new JLabel("Edad", JLabel.TRAILING);
        panel.add(l);
        jTextFieldEdad = new JTextField(30);
        l.setLabelFor(jTextFieldEdad);
        panel.add(jTextFieldEdad);
        
        l = new JLabel("Genero", JLabel.TRAILING);
        panel.add(l);
        JPanel panelGenero = new JPanel();
        ButtonGroup buttonGroup  = new ButtonGroup();
        jRadioButtonF = new JRadioButton("Femenino");
        buttonGroup.add(jRadioButtonF);
        panelGenero.add(jRadioButtonF);
        jRadioButtonM = new JRadioButton("Masculino");
        buttonGroup.add(jRadioButtonM);
        panelGenero.add(jRadioButtonM);
        panel.add(panelGenero);
        
        l = new JLabel("Email", JLabel.TRAILING);
        panel.add(l);
        jTextFieldEmail = new JTextField(30);
        l.setLabelFor(jTextFieldEmail);
        panel.add(jTextFieldEmail);

        l = new JLabel("Ocupacion", JLabel.TRAILING);
        panel.add(l);
        jComboBoxOcupacion = new JComboBox();
        jComboBoxOcupacion.addItem("Seleccione");
        jComboBoxOcupacion.addItem("Ingeniero");
        jComboBoxOcupacion.addItem("Estudiante");
        jComboBoxOcupacion.addItem("Profesor");
        jComboBoxOcupacion.addItem("Doctor");
        jComboBoxOcupacion.addItem("Otro");
        panel.add(jComboBoxOcupacion);

        JButton btnSubmit = new JButton("Guardar");
        panel.add(btnSubmit);
        JButton btnClear = new JButton("Clear");
        panel.add(btnClear);
        
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnSubmitClick();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnClearClick();
            }
        });
        
        //Lay out the panel.
        SpringUtilities.makeCompactGrid(panel,
                                        6, 2, //rows, cols
                                        15, 15,        //initX, initY
                                        15, 15);  //xPad, yPad
        

//        JPanel panelPrincipal = new JPanel(new GridLayout(0,1));
        setContentPane(panelPrincipal);
        add(panel);
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
    private void btnClearClick() {
        jTextFieldNombre.setText(null);
        jTextFieldEdad.setText(null);
        jTextFieldEmail.setText(null);
        jRadioButtonM.setSelected(false);
        jRadioButtonF.setSelected(false);
        jComboBoxOcupacion.setSelectedItem("Seleccione");
    }    

    private void btnSubmitClick() {
        try {
            String nombre = jTextFieldNombre.getText();
            int edad = Integer.parseInt(jTextFieldEdad.getText());
            String genero;
            String email = jTextFieldEmail.getText();
            String ocupacion = jComboBoxOcupacion.getSelectedItem().toString();
            if(jRadioButtonM.isSelected())
                genero = "M";
            else
                genero = "F";

            Persona persona = new Persona(nombre, edad, genero, email, ocupacion);

            app.addPerson(persona);
            
            app.listarPersonas();
            JOptionPane.showMessageDialog(null, "Persona inscrita con éxito");
            btnClearClick();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Datos incorrectos!!");
        }
        
        //System.out.println("persona "+ persona);
    }
    
}
