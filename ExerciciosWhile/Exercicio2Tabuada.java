/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2tabuada;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio2Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;
        
        while (i <= 10){
            System.out.println(numero + "x" +i+ " = " + (numero * i));
            i++;
        }
    }
}
