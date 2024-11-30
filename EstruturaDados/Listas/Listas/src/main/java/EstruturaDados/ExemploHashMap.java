/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alunos
 */
public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Alice", 90);
        notas.put("Joao", 85);
        notas.put("Ana", 95);
        System.out.println("Nota da Ana: " + notas.get("Ana"));
        if(notas.containsKey("João")){
            System.out.println("Joao esta no mapa!");
        }
        System.out.println("Chaves no mapa: " + notas.keySet());
    }
}
