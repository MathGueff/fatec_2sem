/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;

/**
 * 
 * @author Alunos
 */
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um valor: ");
        int valor; //Definindo uma variável do tipo inteiro
        valor = sc.nextInt();
        System.out.printf("Hello World %d%n", valor); //Imprimindo uma mensagem com a variável
        valor = Integer.parseInt(System.console().readLine("Digite um valor: "));
        System.out.printf("Hello World %d%n", valor); //Imprimindo uma mensagem com a variável
    }
}
