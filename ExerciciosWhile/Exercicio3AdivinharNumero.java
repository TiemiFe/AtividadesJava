/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3adivinharnumero;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio3AdivinharNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCorreto = 37;
        int palpite, tentativas = 0;
        
        System.out.println("Adivinhe o número entre 1 e 100:");
        do {
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite > numeroCorreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroCorreto) {
                System.out.println("Muito baixo! Tente novamente.");
            }
        } while (palpite != numeroCorreto);
        
        System.out.println("Você acertou! O número era " + numeroCorreto + ".");
        System.out.println("Você fez " + tentativas + " tentativas.");
        }
    }

