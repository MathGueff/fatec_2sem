/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author Alunos
 */
public class Heranca {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(12,"Nenhum");
        Gato gato = new Gato(8, "Nenhum2");
        Piriquito piri = new Piriquito(1,"Perequeto");
        Piriquito piri2 = new Piriquito(2,"Diper");
        Condor condor = new Condor(1,"SemDor");
        
        condor.Crocitar();
    }
}
