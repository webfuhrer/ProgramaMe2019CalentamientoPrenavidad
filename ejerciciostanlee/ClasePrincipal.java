/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciostanlee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int ocurrencia=0;
        String nombre="STAN LEE";
        char[] lista_letras_nombre=nombre.toCharArray();
        String texto="Estabamos en la cerveceria con stan lee y sacaboaron las tapas en el restaurante stan lee stan lee";
        String texto_mayusculas=texto.toUpperCase();
        int indice_nombre=0;
        for (int indice_texto=0;indice_texto<texto_mayusculas.length(); indice_texto ++)
        {
            if (texto_mayusculas.charAt(indice_texto)==lista_letras_nombre[indice_nombre])
            {
                System.out.println("Encontrada:"+lista_letras_nombre[indice_nombre]);
                if (indice_nombre==7)
                {
                    ocurrencia++;
                    texto_mayusculas=texto_mayusculas.substring(indice_texto);
                    indice_nombre=0;
                    indice_texto=0;
                    System.out.println("OCURRENCIA: "+ocurrencia);
                }
                else
                {
                indice_nombre++;
                }
            }
        }
        
    }
}
