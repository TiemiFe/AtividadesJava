/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1whileedowhile;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio1WhileEDOWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        
        System.out.println("Insira números inteiros, para sair, insira um número negativo: ");
        while (true){
            numero = scanner.nextInt();
            if (numero < 0) break;
            soma += numero;
        }
        System.out.println("Soma dos números positivos: " + soma);
    }
}
