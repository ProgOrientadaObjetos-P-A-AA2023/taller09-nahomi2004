/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author D E L L
 */
public class Persona {
    // Crear una clase Persona en lenguaje Java 
    // - Atributos: - Nombre - Apellido - Username
    
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona (String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String n) {
       apellido = n;
    }

    public String obtenerUsername() {
        return username;
    }

    public void establecerUsername(String n) {
        username = n;
    }
}
