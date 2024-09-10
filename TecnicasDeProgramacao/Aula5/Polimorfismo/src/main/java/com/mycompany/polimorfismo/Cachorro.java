/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author Alunos
 */
public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public String fazerSom(){
        return "O " + getNome()+ " faz au au au";
    }
    
}
