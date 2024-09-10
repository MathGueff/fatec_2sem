/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Alunos
 */
public class Animal {
    private String nome;
    private boolean vivo;

    public Animal(String nome) {
        this.nome = nome;
        vivo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public String fazerSom(){
        return "O " + getNome() + " faz ...";
    }
}
