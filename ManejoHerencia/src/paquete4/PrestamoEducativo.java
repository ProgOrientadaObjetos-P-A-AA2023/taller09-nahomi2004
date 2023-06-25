/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    /*  nivel de estudio
        Centro educativo de tipo Institución Educativa
        valor de la carrera
        valor mensual del pago del préstamo del valor de la carrera 
    
        El valor mensual del pago del préstamo del valor de la carrera es igual
        al (valor de la carrera dividido para el número de meses) menos 10% 
        del (resultado del valor de la carrera dividido para el número de meses)
    */
    
    private String nivelB;
    private InstitucionEducativa centroEdu;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String n, InstitucionEducativa ce, double vc, Persona b, int m, String c) {
        super(b, m, c);
        nivelB = n;
        centroEdu = ce;
        valorCarrera = vc;
    }

    public String obtenerNivelB() {
        return nivelB;
    }

    public void establecerNivelB(String a) {
        nivelB = a;
    }

    public InstitucionEducativa obtenerCentroEdu() {
        return centroEdu;
    }

    public void establecerCentroEdu(InstitucionEducativa a) {
        centroEdu = a;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public void establecerValorCarrera(double a) {
        valorCarrera = a;
    }
    
    // (valor de la carrera dividido para el número de meses) menos 10% 
    //  del (resultado del valor de la carrera dividido para el número de meses)
    public double obtenerValorMensual() {
        calcularValorMensual();
        return valorMensual;
    }

    public void calcularValorMensual() {
        valorMensual = (valorCarrera/meses)-(0.1*(valorCarrera/meses));
    }
    
    @Override
    public String toString() {
        String cadena = String.format("PRÉSTAMO EDUCATIVO\n%s\n"
                + "\tNivel de educación: %s\n"
                + "\tInstitución Educativa\n"
                + "\t\tNombre: %s\n"
                + "\t\tSiglas: %s\n"
                + "\tValor de la carrera: %.2f\n"
                + "\tValor mensual del préstamo: %.2f\n\n", 
                super.toString(), 
                obtenerNivelB(),
                obtenerCentroEdu().obtenerNombre(),
                obtenerCentroEdu().obtenerSiglas(),
                obtenerValorCarrera(),
                obtenerValorMensual());
        return cadena;
    }
}
