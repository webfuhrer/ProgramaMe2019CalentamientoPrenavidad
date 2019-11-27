/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciospiderman;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n_casos=sc.nextInt();
        sc.nextLine();
        String[] datos_entrada=new String[n_casos];
        int n=0;
        while(n<n_casos)
        {
            datos_entrada[n]=sc.nextLine();
            n++;
        }
        for(int i=0; i<datos_entrada.length; i++)
        {
            int distancia=calcularDistancia(datos_entrada[i]);
            System.out.println(distancia);
        }
    }

    private static int calcularDistancia(String string) {
        String[] datos=string.split(" ");
        int S=Integer.parseInt(datos[0]);
        int A=Integer.parseInt(datos[1]);
        int B=Integer.parseInt(datos[2]);
        //DISTANCIAS:
        int SA=Math.abs(A-S);
        int AB=Math.abs(A-B);
        int distancia_1=SA+AB;
        
        int SB=Math.abs(S-B);
        int BA=Math.abs(A-B);
        int distancia_2=SB+BA;
        
        if (distancia_1<=distancia_2)
        {
            return distancia_1;
        }
        else
        {
            return distancia_2;
        }
        
        
        
       
    }
}
