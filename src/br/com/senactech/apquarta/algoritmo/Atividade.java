/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.senactech.apquarta.algoritmo;

import java.util.Scanner;

/**
 *
 * @author 182110056
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int[] valores = new int[5];
        int count = 0, soma = 0;
        System.out.println(".: Entrar com 5 números inteiros :.");
        do {
            System.out.println("Informe valor " + (count + 1) + ": ");
            valores[count] = ler.nextInt();
            soma += valores[count];
            count += 1;
        } while (count < 5);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("valor " + (i + 1) + ": " + valores[i]);
        }
    }
}
