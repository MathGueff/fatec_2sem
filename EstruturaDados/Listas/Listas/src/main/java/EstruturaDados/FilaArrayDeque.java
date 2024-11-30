/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Alunos
 */
public class FilaArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> fila = new ArrayDeque<>();
        fila.offer(10);
        fila.offer(20);
        fila.offer(30);
        System.out.println("Proximo a ser atendido: " + fila.peek());

        while(!fila.isEmpty()){ 
            System.out.println("Atendendo: " + fila.poll());
        }   
    }
}
