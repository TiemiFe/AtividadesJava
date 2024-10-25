/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarimpares;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ContarImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, impares = 0;

        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            numero = scanner.nextInt(); // Lê o número fornecido pelo usuário

            if (numero % 2 != 0) { // Verifica se o número é ímpar
                impares++; // Incrementa o contador de ímpares
            }
        } while (numero != 0); // O loop continua até que o usuário digite 0

        System.out.println("Total de números ímpares inseridos: " + impares);
    }
}
