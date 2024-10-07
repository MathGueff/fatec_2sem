/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosaula08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ExerciciosAula08 {

    public static void main(String[] args) {
        //Exercício 1
        System.out.println("----EXERCICIO 1----");
        List cores = new ArrayList();
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Verde");
        
        //List sem ordenação
        System.out.println("Lista sem ordenacao: " +cores);
        
        //Ordenando a lista
        Collections.sort(cores);
        
        //Exibindo lista ordenada
        System.out.println("Lista ordenada: " +cores);
        
        //Removendo o segundo elemento (posição 1)
        cores.remove(1);
        Collections.sort(cores);
        
        //Exibindo lista com o segundo elemento removido
        System.out.println("Lista ordenada sem o segundo elemento: " +cores);
        
        //Exercício 2
        System.out.println("----EXERCICIO 2----");
        List<Pessoa> p = new ArrayList();
        Pessoa p1 = new Pessoa("Cirilino",10);
        Pessoa p2 = new Pessoa("Jorge",8);
        Pessoa p3 = new Pessoa("Girino",12);
        Pessoa p4 = new Pessoa("Wesley",15);
        Pessoa p5 = new Pessoa("Adalberto",20);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        System.out.println("Lista de Pessoas sem ordenacao:");
        p.forEach((pessoa) ->{
            System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        });
        Collections.sort(p);
        System.out.println("\nLista de Pessoas com ordenacao por nome:");
        p.forEach((pessoa) ->{
            System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        });
    }
}