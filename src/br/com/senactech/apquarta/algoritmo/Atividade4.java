/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.apquarta.algoritmo;

import java.util.Scanner;

/**
 *
 * @author 182110056
 */
public class Atividade4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] valores = new int[10][2];

        System.out.println(".: Entre com 10 números inteiros :.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "° número: ");
            int valor = ler.nextInt();
            if (valor % 2 == 0) {
                // par
                valores[i][0] = valor;
                valores[i][1] = 0;
            } else {
                // impar
                valores[i][0] = 0;
                valores[i][1] = valor;
            }
                 System.out.println("\n.: Lista de Valores :.");       
        }
        for (int i = 0; i < 10; i++) {
             System.out.printf("|%5d%3s%7d |\n",valores[i][0] , " | " , valores[i][1]);
        }
    }
}
