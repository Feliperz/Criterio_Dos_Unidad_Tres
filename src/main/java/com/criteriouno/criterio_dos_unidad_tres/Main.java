/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criteriouno.criterio_dos_unidad_tres;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main{ 
    static int position = -1, positionAge= -1, n=0;
       
    public static Scanner leer = new Scanner(System.in);
    public static ClasificacionImc persona = new ClasificacionImc();
    public static ValidacionDeExcepciones validar = new ValidacionDeExcepciones();
    
    public static void main(String[] args) throws Exception {
        System.out.println("REGISTRO DE DATOS\n");
        System.out.println("Ingrese el Numero de Personas que se registraran (max 10)");

        n = validar.validacionNacimiento(position);
        ingresarDatos(n);
        persona.calculoImc(n);
        
    }
    
    public static void ingresarDatos(int n) throws Exception{
        
        
        for(int i=0;i<n;i++){
        positionAge = position = 0;
         System.out.println("Persona " + (i+1));
        System.out.println("Nombre: ");
        persona.nombre[i] = leer.nextLine();
        persona.nombre[i] = validar.validarIngresoString(persona.nombre[i]);
        System.out.println("---Fecha de nacimiento (dd/mm/aaaa)--- \n Dia: ");
        persona.dia[i] = validar.validacionNacimiento(positionAge);
        positionAge++;
        System.out.println("Mes: ");
        persona.mes[i] = validar.validacionNacimiento(positionAge);
        positionAge++;
        System.out.println("Año: ");
        persona.año[i] = validar.validacionNacimiento(positionAge);
        positionAge++;
        System.out.println("Estatura (en Metros): ");
        persona.estatura[i] = validar.validacionExepcionesFloat(position);
        position++;
        System.out.println("Peso (En kilogramos) : ");
        persona.peso[i] = validar.validacionExepcionesFloat(position);
        
        

        }
    }
}
