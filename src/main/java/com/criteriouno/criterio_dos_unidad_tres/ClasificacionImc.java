/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criteriouno.criterio_dos_unidad_tres;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class ClasificacionImc extends DatosPersona {
   
    protected static void calculoImc(float n){
        System.out.println("\n DATOS DE PERSONAS \n");
       
        for(int i=0; i<n;i++){
        Calendar fechaNac = new GregorianCalendar(año[i],mes[i],dia[i]);
        Calendar fechaHoy = Calendar.getInstance();
        int edad = fechaHoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
         System.out.println("Registro " + (i+1));
         System.out.println("Nombre: " + nombre[i] + "  edad: " + edad);
         System.out.println("Estatura: " + estatura[i] + "m    Peso: " + peso[i] + "Kg");
        
        float imc = (float) (peso[i]/(Math.pow(estatura[i],2)));
        
        
        if(imc<16){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: INFRAPESO");
            System.out.println("Los riesgo para su salud son:\n Dolencias pulmonares"
                    + ", anorexia nerviosa, desnutricion, Etc.");
        }
        if(imc>16 && imc<18.5){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: DELGADEZ");
            System.out.println("Los riesgo para su salud son:\n Sin riesgo pero con"
                    + " precaucion de no adelgazar mas.");
        }
        if(imc>18.5 && imc<25){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: NORMAL");
            System.out.println("Los riesgo para su salud son:\n Ninguno"
                    + ", su estado es saludable");
        }
        if(imc>25 && imc<26){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: SOBREPESO");
            System.out.println("Los riesgo para su salud son:\n Sin riesgo pero con"
                    + " precaucion de no engordar mas.");
        }
        if(imc>26 && imc<30){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: OBESIDAD TIPO 1");
            System.out.println("Los riesgo para su salud son:\n Sobrecarga de articulaciones"
                    + ", cansancion excesivo y un cierto riesgo de enfermedades cardiovasculares");
        }
        if(imc>30 && imc<35){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: OBESIDAD TIPO 2");
            System.out.println("Los riesgo para su salud son:\n Problemas cardiacos, diabetes"
                    + ", hipertension, enfermedad de vesicula y algunos canceres");
        }
        if(imc>35 && imc<40){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: OBESIDAD TIPO 3");
            System.out.println("Los riesgo para su salud son:\n Serios riesgos para la salud, disminucion"
                    + " de la calidad de vida. Visita a un Medico");
        }
        if(imc>40){
            System.out.println("Su imc es : " + imc);
            System.out.println("Su estado es de: OBESIDAD MORBIDA");
            System.out.println("Los riesgo para su salud son:\n Riesgo inmediato. Precisara "
                    + " siempre bajo control medico. tratamiento farmacologico o quirurjico");
        }
            System.out.println("");    
       }
   }
}
