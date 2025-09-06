package com.mycompany.proyectofinaleacl;

import java.util.Scanner;

public class ProyectoFinalEACL {

    public static void main(String[] args) {
        // DECLARAMOS VARIABLES PARA EL PROBLEMA   :
        String nombre;
        double compra_1, compra_2, compra_3, tc, prom, igv;
        Scanner lectura=new Scanner(System.in);
        
        // Datos de entrada :
        System.out.print("Ingresar el nombre del cliente:");
        nombre=lectura.nextLine();
        
        System.out.print("Ingresar Compra 1:");
        compra_1=lectura.nextDouble();
    
        System.out.print("Ingresar Compra 2:");
        compra_2=lectura.nextDouble();
        
        System.out.print("Ingresar Compra 3:");
        compra_3=lectura.nextDouble();
        
        // Procesando dato:
        
        tc = compra_1 + compra_2 + compra_3;
        prom = tc/3;
        igv = tc * 0.18;
        
        // Datos de Salida :
        
         System.out.println("------RESULTADOS-----");
         System.out.println("Nombre del Cliente:" + nombre);
         System.out.println("Compra 1:" + compra_1);
         System.out.println("Compra 2:" + compra_2);
         System.out.println("Compra 3:" + compra_3);
         System.out.println("Total Compra:" + tc);
         System.out.println("IGV de Compra:" + igv);
         System.out.println("Promedio Compra:" + prom);
                
    }
}
