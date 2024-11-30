/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alunos
 */
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Alice");
        fila.offer("Bob");
        fila.offer("Carol");
        fila.offer("Duardo");
        
        System.out.println("Proximo a ser atendido: " + fila.peek());
        
        while(!fila.isEmpty()){ 
            System.out.println("Atendendo: " + fila.poll());
        }
    }
}
