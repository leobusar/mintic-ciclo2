/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leobusta
 */
public class Directorio {
    public String nombre;
    List<Directorio> subdirs;
    List<String> archivos;

    Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirs = new ArrayList<Directorio>();
        this.archivos = new ArrayList<String>();
    }

    public String espacios(int nivel) {
        String s = "";
        for (int i = 0; i < nivel; i++) {
            s += ' ';
        }
        return s;
    }

    String toString(int nivel) {
        String s = espacios(nivel) + nombre + '\n';
        for (Directorio d : subdirs) {
            s += d.toString(nivel + 1) + '\n';
        }
        for (String a : archivos) {
            s += espacios(nivel + 1) + a + '\n';
        }
        return s;
    }

    @Override
    public String toString() {
        return this.toString(0);
    }

    public static void main(String[] args) {
        Directorio root = new Directorio("root");
// Primer nivel
        root.subdirs.add(new Directorio("bin"));
        root.subdirs.add(new Directorio("home"));
        root.subdirs.add(new Directorio("lib"));
// Segundo nivel
        root.subdirs.get(0).subdirs.add(new Directorio("will"));
        root.subdirs.get(0).subdirs.add(new Directorio("other"));
        root.subdirs.get(0).subdirs.add(new Directorio("new"));
        System.out.println(root);
    }
}
