/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author Alunos
 */
public class Polimorfismo {

    public static void main(String[] args) {
        //Capacidade de um mesmo objeto utilizar várias formas
        Animal cachorro = new Cachorro("Cachorrin");
        Cachorro cachorro2 = new Cachorro("Cachorrao");
        Animal gato = new Gato("Gatin");
        
        System.out.println(cachorro.fazerSom());
        System.out.println(cachorro2.fazerSom());
        System.out.println(gato.fazerSom());
    }
}
