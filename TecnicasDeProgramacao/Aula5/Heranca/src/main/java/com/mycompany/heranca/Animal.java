/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Alunos
 */
public class Animal {
    private int idade;
    private String nome;
    private boolean vivo;

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
        this.vivo = true;
    }
    
    public void Info(){
        System.out.println("Nome do Animal -> " + getNome());
        System.out.println("Idade -> " + getIdade());
        System.out.println("O animal esta -> " + (isVivo() ? "Vivo" : "Morto"));
    }
    
    public void Aniversario(){
        setIdade(getIdade() + 1);
    }
    
    public void Morrer(){
        setVivo(false);
    }
    
    public void Reviver(){
        setVivo(true);
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
    
    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
