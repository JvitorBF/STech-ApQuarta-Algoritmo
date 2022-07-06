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
public class Atividade3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] valores = new int[10][2];
        System.out.println(".: Informe 10 números inteiros :.");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "° número: ");
            valores[i][0] = ler.nextInt();
            valores[i][1] = valores[i][0] * 5;
        }
        System.out.println("\n.: Valores :.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%5d%3s%7d |\n",valores[i][0] , " | " , valores[i][1]);
        }
        
    }
}
