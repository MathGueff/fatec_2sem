/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaula08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Pessoa implements Comparable<Pessoa>{
   
    private int idade;
    private String nome;
            
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
            
    @Override
    public int compareTo(Pessoa p) {
        return nome.compareTo(p.nome);
    }
}
