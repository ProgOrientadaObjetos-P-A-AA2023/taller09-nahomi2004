/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    // Atributos:
    // beneficiario - de tipo Persona
    // tiempo de préstamo en meses
    // ciudad del préstamo (de tipo String)
    // La clase debe tener un constructor que reciba los parámetros para 
    // beneficiario, tiempo de préstamo en meses y ciudad del préstamo.
    
    protected Persona beneficiario;
    protected int meses;
    protected String ciudad;

    public Prestamo(Persona b, int m, String c) {
        beneficiario = b;
        meses = m;
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }

    public int obtenerMeses() {
        return meses;
    }

    public void establecerMeses(int n) {
        meses = n;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("BENEFICIARIO\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUserName: %s\n"
                + "Tiempo de préstamo (meses): %d\n"
                + "Ciudad del préstamo: %s\n", 
                obtenerBeneficiario().obtenerNombre(),
                obtenerBeneficiario().obtenerApellido(),
                obtenerBeneficiario().obtenerUsername(),
                obtenerMeses(),
                obtenerCiudad());
        return cadena;
    }
}
