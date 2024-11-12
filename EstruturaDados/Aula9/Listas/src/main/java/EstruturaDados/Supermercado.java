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
        List<String> nomes = Arrays.asList("Ana", "Joao", "Maria", "Jose", "Antonio","Marcos", "Solange");
        nomes.forEach(n ->{
            calcHora(5);
            Cliente cli = new Cliente(n, hora, minuto);
            fila.offer(cli);
        });
        
        fila.forEach(c ->{
            System.out.println("Cliente -> " + c.getNome() + " chegada: " + dec.format(c.getHoraChegada()) + ":" + dec.format(c.getMinutoChegada()));
        });
        
        hora = fila.peek().getHoraChegada();
        minuto = fila.peek().getMinutoChegada();
        int tempo = 0;
        double valor = 0;
        while(!fila.isEmpty()){
            Cliente c = fila.poll();
            calcHora(10);
            c.setHoraAtendimento(hora);
            c.setMinutoAtendimento(minuto);
            c.setValorGasto(Math.random() * 1000);
            valor += c.getValorGasto();
            System.out.println("Atendendo Cliente: " + c.getNome());
            System.out.println("Hora de Chegada: " + dec.format(c.getHoraChegada()) + ":"  + c.getMinutoChegada());
            System.out.println("Hora do Atendimento: " + dec.format(c.getHoraAtendimento()) + ":" + dec.format(c.getMinutoAtendimento()));
            int minutos = (c.getHoraAtendimento() * 60 + c.getMinutoAtendimento() - c.getHoraChegada() * 60 + c.getMinutoChegada());
            tempo += minutos;
        }
    }
    
    public static void calcHora(int t){
        minuto += t * Math.random() + 1;
        if(minuto > 60){
            hora++;
            minuto-=60;
        }
    }
}
