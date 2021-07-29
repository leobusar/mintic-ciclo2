/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author leobusta
 */
public class Empleado extends Persona {
    private String departamento;
    private double salario;
    private String cargo;

    public Empleado(String departamento, double salario, String cargo, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.departamento = departamento;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    
}
