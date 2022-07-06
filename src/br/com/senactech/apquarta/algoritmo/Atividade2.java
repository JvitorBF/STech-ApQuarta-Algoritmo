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
public class Atividade2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        int count = 0, soma = 0;
        System.out.println(".: Entrar com 5 nomes :.");
        do {
            System.out.println("Entre com o " + (count + 1) + "° nome: ");
            nomes[count] = ler.next();
            count++;
        } while (count < 5);
        System.out.println("\n.: Lista de Nomes :.");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "° nome: " + nomes[i]);
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println((i + 1) + "° nome: " + nomes[i]);
        }
    }
}
