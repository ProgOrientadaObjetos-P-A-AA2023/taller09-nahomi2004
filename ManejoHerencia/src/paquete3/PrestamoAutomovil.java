/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {
    /*  tipo de automóvil
        marca de automóvil
        garante1 tipo Persona
        valor de automóvil
        valor mensual de pago préstamo automóvil 
    
        El valor mensual del pago del préstamo del automóvil es igual al valor 
        del automóvil dividido para el número de meses. El método para 
        establecer la ciudad del préstamo de tipo PrestamoAutomovil debe 
        asignar el valor siempre en minúscula. */
    
    private String tipoAu;
    private String marcaAu;
    private Persona garante1;
    private double valorAu;
    private double valorMensual;

    public PrestamoAutomovil(String t, String ma, Persona g, double v, Persona b, int m, String c) {
        super(b, m, c.toLowerCase());
        tipoAu = t;
        marcaAu = ma;
        garante1 = g;
        valorAu = v;
    }

    public String obtenerTipoAu() {
        return tipoAu;
    }

    public void establecerTipoAu(String a) {
        tipoAu = a;
    }

    public String obtenerMarcaAu() {
        return marcaAu;
    }

    public void establecerMarcaAu(String a) {
        marcaAu = a;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public void establecerGarante1(Persona a) {
        garante1 = a;
    }

    public double obtenerValorAu() {
        return valorAu;
    }

    public void establecerValorAu(double a) {
        valorAu = a;
    }

    public double obtenerValorMensual() {
        calcularValorMensual();
        return valorMensual;
    }

    public void calcularValorMensual() {
        valorMensual = valorAu/meses;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("PRÉSTAMO AUTOMOVIL\n%s\n"
                + "\tTipo: %s\n"
                + "\tMarca: %s\n"
                + "\tNombre garante: %s\n"
                + "\tApellido garante: %s\n"
                + "\tUserName garante: %s\n"
                + "\tValor del auto: %.2f\n"
                + "\tValor mensual del préstamo: %.2f\n\n", 
                super.toString(),
                obtenerTipoAu(),
                obtenerMarcaAu(),
                obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(),
                obtenerGarante1().obtenerUsername(),
                obtenerValorAu(),
                obtenerValorMensual());
        return cadena;
    }
}
