/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        String uwu;
        ArrayList<Prestamo> prestamo = null; 

        do {
            System.out.println("      MENÚ");
            System.out.println("Ingrese [1] si quiere ingresar un préstamo de automovil");
            System.out.println("Ingrese [2] si quiere ingresar un préstamo eduactivo");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1 -> {
                    Persona beneficiario = ingresarPersona();
                    entrada.nextLine();
                    
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = entrada.nextLine();
                    System.out.print("Ingrese los meses: ");
                    int meses = entrada.nextInt();
                    System.out.print("Tipo de auto: ");
                    String tipo = entrada.nextLine();
                    System.out.print("Marca del auto: ");
                    String marca = entrada.nextLine();
                    
                    Persona garante = ingresarPersona();
                    entrada.nextLine();
                    
                    System.out.print("Valor del auto: ");
                    double valorAu = entrada.nextDouble();
                    
                    PrestamoAutomovil prestamo1 = new PrestamoAutomovil(
                            tipo, marca, garante, valorAu, beneficiario, meses, ciudad);
                    
                    prestamo.add(prestamo1);
                }
                case 2 -> {
                    Persona beneficiario = ingresarPersona();
                    entrada.nextLine();
                    
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = entrada.nextLine();
                    System.out.print("Ingrese los meses: ");
                    int meses = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Nivel de educación: ");
                    String nivel = entrada.nextLine();
                    System.out.print("Valor de la carrera: ");
                    double valorC = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("Nombre de la institución: ");
                    String nombreI = entrada.nextLine();
                    System.out.print("Siglas de la institución: ");
                    String siglas = entrada.nextLine();
                    InstitucionEducativa ins = new InstitucionEducativa(nombreI, siglas);
                    
                    PrestamoEducativo prestamo2 = new PrestamoEducativo(
                            nivel, ins, valorC, beneficiario, meses, ciudad);
                    
                    prestamo.add(prestamo2);
                }
                default -> {

                }
            }
        } while (uwu!="S");
    }
    
    public static Persona ingresarPersona () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del beneficiario: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido del beneficiario: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese el username del beneficiario: ");
        String username = entrada.nextLine();
        
        Persona beneficiario = new Persona(nombre, apellido, username);
        return beneficiario;
    }
}

