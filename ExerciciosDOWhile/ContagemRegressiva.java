/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemregressiva;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ContagemRegressiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um n�mero para iniciar a contagem regressiva: ");
        numero = scanner.nextInt(); // L� o n�mero fornecido pelo usu�rio

        do {
            System.out.println(numero);
            numero--; // Decrementa o n�mero
        } while (numero > 0); // O loop continua at� que o n�mero chegue a 0
    }
}
