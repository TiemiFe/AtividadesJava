/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaotemperatura;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ConversaoTemperatura {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        do {
            System.out.print("Digite a temperatura em Celsius (0 para sair): ");
            celsius = scanner.nextDouble(); 

            if (celsius != 0) {
                fahrenheit = (celsius * 9 / 5) + 32; 
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
            }
        } while (celsius != 0);
    }
}
