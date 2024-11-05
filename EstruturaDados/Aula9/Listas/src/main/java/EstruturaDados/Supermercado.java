/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Alunos
 */
public class Supermercado {
    static int minuto = 0;
    static int hora = 10;
    
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("00");
        DecimalFormat dec2 = new DecimalFormat("#,###.00");
        
        Queue<Cliente> fila = new ArrayDeque<>();
        List<String> nomes = Arrays.asList("Ana", "Joao", "Maria", "Jose", "Antonio", "Solange");
        nomes.forEach(n ->{
            calcHora(5);
            Cliente cli = new Cliente(n, hora, minuto);
            fila.offer(cli);
        });
        
        fila.forEach(c ->{
            System.out.println("Cliente -> " + c.getNome() + " chegada: " + dec.format(c.getHoraChegada()) + ":" + dec.format(c.getMinutoChegada()));
        });
    }
    
    public static void calcHora(int t){
        minuto += t * Math.random() + 1;
        if(minuto > 60){
            hora++;
            minuto-=60;
        }
    }
}
