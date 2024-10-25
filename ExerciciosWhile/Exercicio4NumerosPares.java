/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4numerospares;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio4NumerosPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();
        int i = 2; // Começa em 2 porque é o primeiro número par
        
        while (i <= N) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
