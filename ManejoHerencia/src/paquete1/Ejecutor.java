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
        String persona = null;
        
        ArrayList<PrestamoAutomovil> prestamoAu = new ArrayList<>(); 
        ArrayList<PrestamoEducativo> prestamoEd = new ArrayList<>(); 

        do {
            persona = "beneficiario";
            System.out.println("      MENÚ");
            System.out.println("Ingrese [1] si quiere ingresar un préstamo de automovil");
            System.out.println("Ingrese [2] si quiere ingresar un préstamo eduactivo");
            op = entrada.nextInt();
            entrada.nextLine();
            
            switch (op) {
                case 1 -> {
                    
                    Persona beneficiario = ingresarPersona(persona);
                    
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = entrada.nextLine();
                    System.out.print("Ingrese los meses: ");
                    int meses = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Tipo de auto: ");
                    String tipo = entrada.nextLine();
                    System.out.print("Marca del auto: ");
                    String marca = entrada.nextLine();
                    
                    persona = "garante";
                    Persona garante = ingresarPersona(persona);
                    
                    System.out.print("Valor del auto: ");
                    double valorAu = entrada.nextDouble();
                    
                    PrestamoAutomovil prestamo1 = new PrestamoAutomovil(
                            tipo, marca, garante, valorAu, beneficiario, meses, ciudad);
                    
                prestamoAu.add(prestamo1);
                entrada.nextLine();
                }
                case 2 -> {
                    Persona beneficiario = ingresarPersona(persona);
                    
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
                    
                    prestamoEd.add(prestamo2);
                }
                default -> {
                    System.err.println("Opción inválida");
                    System.err.println("Inténtelo de nuevo");
                }
            }
            
            System.out.println("Ingrese 'S' si quiere seguir en el programa");
            System.out.println("Ingrese cualquier otra letra si ya no desea "
                    + "continuar en el programa");
            uwu = entrada.nextLine();
        } while (uwu.equals("S"));
        
        System.out.println("");
        System.out.println("PRESENTACIÓN DE LOS DATOS");
        
        for (int i=0; i<prestamoAu.size();i++){
            System.out.printf("\nPRÉSTAMO %d\n%s\n", i+1, prestamoAu.get(i));
        }
        
        for (int i=0; i<prestamoEd.size();i++){
            System.out.printf("\nPRÉSTAMO %d\n%s\n", i+1, prestamoEd.get(i));
        }
    }
    
    public static Persona ingresarPersona (String p) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del "+p+": ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido del "+p+": ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese el username del "+p+": ");
        String username = entrada.nextLine();
        
        Persona beneficiario = new Persona(nombre, apellido, username);
        return beneficiario;
    }
}

