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

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        numero = scanner.nextInt(); // Lê o número fornecido pelo usuário

        do {
            System.out.println(numero);
            numero--; // Decrementa o número
        } while (numero > 0); // O loop continua até que o número chegue a 0
    }
}
