/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criteriouno.criterio_dos_unidad_tres;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FelipeRC
 */
public class ValidacionDeExcepciones {
    public static Scanner leer = new Scanner(System.in);
    
    protected static String validarIngresoString(String e){
       
        while(!recorrer(e)){
            System.out.println("NO PUEDE INGRESAR NUMEROS EN EL NOMBRE");
            System.out.println("Nombre: ");
            e=leer.nextLine();
        }
        return e;
    }
    private static boolean recorrer(String e)
    {
             for (int i = 0; i < e.length(); i++){
            char caracter = e.toUpperCase().charAt(i);
            int valorASCII = (int)caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) return false;	
            }
        return true;
    }
    
     protected static float validacionExepcionesFloat(int position) throws Exception{
        boolean verifity=true;
        float a=0;
        do{
            try{
               verifity=true; 
               a = leer.nextFloat();
               if((a<0.2 || a>2.3) && position == 0) throw new RangoEstatura("ESTATURA INVALIDA (0.2m - 2.3m)");
               if((a<10 || a>150) && position ==1) throw new RangoPeso("PESO INVALIDO (10KG - 150KG)");
            }catch(InputMismatchException i){
                System.out.println("INGRESO INVALIDO - No puede contener letras");
                if(position==0)System.out.println("Estatura (En Metros): ");
                if(position==1)System.out.println("Peso: (En Kilogramos)");
                leer.next();
                verifity=false;
            }catch(RangoEstatura s){
                System.out.println(s.getMessage() + "\n Estatura (En Metros):");
                verifity=false;
            }catch(RangoPeso ra){
                System.out.println(ra.getMessage() + "\n Peso (En Kilogramos):");
                verifity=false;
            }
            
        }while(!verifity);
        return a;
    }
      protected static int validacionNacimiento(int positionAge) throws Exception{
        int a=0;
        boolean verifity = true;
        do{
        try{
            verifity=true;
            a = leer.nextInt();
            if((a<1 || a>31) && positionAge==0) throw new RangoDia("INGRESO INVALIDO - Rango (1 - 31)");
            if((a<1 || a>12) && positionAge==1) throw new RangoMes("INGRESO INVALIDO - Rango (1 - 12)");
            if((a<1 || a>10) && positionAge==-1) throw new RangoPersonas("INGRESO INVALIDO - Rango (1 - 10)");
        }catch(RangoDia lo){
            System.out.println(lo.getMessage() + "\n Dia:");
            verifity=false;
        }catch(InputMismatchException i){
            System.out.println("INGRESO INVALIDO-NO PUEDE CONTENER LETRAS O DECIMALES");
            if(positionAge==0)System.out.println("Dia: ");
            if(positionAge==1)System.out.println("Mes: ");
            if(positionAge==2)System.out.println("Año: ");
            if(positionAge==-1) System.out.println("Ingrese el Numero de Personas que se registraran (max 10):");
            leer.next();
            verifity = false;
        }catch(RangoMes pa){
            System.out.println(pa.getMessage() + "\n Mes:");
            verifity=false;
         }catch(RangoPersonas si){
             System.out.println(si.getMessage() + "\n Ingrese el Numero de Personas que se registraran (max 10):");
            verifity=false;
         }
        }while(!verifity);
        return a;
    }
      
      static class RangoEstatura extends Exception{
 
		public RangoEstatura(String mensajeExcepcion) {
			super(mensajeExcepcion);
		}
 
	}
      static class RangoPersonas extends Exception{
 
		public RangoPersonas (String mensajeExcepcion) {
			super(mensajeExcepcion);
		}
 
	}
      static class RangoDia extends Exception{
 
		public RangoDia(String mensajeExcepcion) {
			super(mensajeExcepcion);
                }
                
 
	}
        static class RangoMes extends Exception{
 
		public RangoMes(String mensajeExcepcion) {
			super(mensajeExcepcion);
                }
                
 
	}
    static class RangoPeso extends Exception{

            public RangoPeso(String mensajeExcepcion) {
                    super(mensajeExcepcion);
            }
    }
}
