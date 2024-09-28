/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Collections {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        
        c1.setMarca("UNO");
        c1.setAno(1990);
        c2.setMarca("Palio");
        c2.setAno(2000);
        
        List<Carro> carros = new ArrayList();
        carros.add(c1);
        carros.add(c2);
        for(int i = 0; i < carros.size(); i++)
        {
            System.out.printf("Carro %d: %s \n", i+1, carros.get(i).getMarca());
        }
        for(Carro c : carros)
        {
            System.out.println(c.getMarca());
        }
        
        carros.forEach((car) -> {
            System.out.println(car.getMarca() + " - " + car.getAno());
        });
    }
}
