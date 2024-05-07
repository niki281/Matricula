/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matricula;

import java.util.Scanner;

/**
 *
 * @author nicke
 */
public class Matricula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una matricula-(formato: 4 digitos separados por un espacio y 3 letras)");

        String matricula = sc.nextLine();

        String[] partes = matricula.split(" ");

        int num = Integer.parseInt(partes[0]);
        String letras = partes[1];

        System.out.println("Esta es el numero: " + num);
        System.out.println("Esta es la letra: " + letras);

        if (num < 9999) {
            num++;
        } else {
            num = 0000; 
            
            
            letras = incrementarLetras(letras);
        }

        System.out.println("Matricula siguiente: " + num + " " + letras);
    }
    
    
    public static String incrementarLetras(String letras) {
        char[] letrasSinVocales = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 
                                   'L', 'M', 'P', 'Q', 'R', 'S', 'T', 'V', 
                                   'W', 'X', 'Y', 'Z'};
        char[] letrasMatricula = letras.toCharArray();
        
        
        for (int i = letrasMatricula.length - 1; i >= 0; i--) {
            char letra = letrasMatricula[i];
            
            
            if (letra != 'Z') {
                int index = letra - 'B'; 
                letrasMatricula[i] = letrasSinVocales[index + 1]; 
                break;
            } else {
                letrasMatricula[i] = 'B'; 
            }
        }
        
        return String.valueOf(letrasMatricula);
    }
}
