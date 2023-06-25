/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author D E L L
 */
public class InstitucionEducativa {
    // Crear una clase Institución Educativa en lenguaje Java 
    // - Atributos: - Nombre - Siglas
    
    private String nombre; 
    private String siglas; 

    public InstitucionEducativa(String n, String s) {
        this.nombre = n;
        this.siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }
}
