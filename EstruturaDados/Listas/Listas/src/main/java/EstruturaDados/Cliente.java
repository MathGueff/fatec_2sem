/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

/**
 *
 * @author Alunos
 */
public class Cliente {
    private String nome;
    private int horaChegada;
    private int minutoChegada;
    private int horaAtendimento;
    private int minutoAtendimento;
    private double valorGasto;

    public Cliente(String nome, int horaChegada, int minutoChegada) {
        this.nome = nome;
        this.horaChegada = horaChegada;
        this.minutoChegada = minutoChegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(int horaChegada) {
        this.horaChegada = horaChegada;
    }

    public int getMinutoChegada() {
        return minutoChegada;
    }

    public void setMinutoChegada(int minutoChegada) {
        this.minutoChegada = minutoChegada;
    }

    public int getHoraAtendimento() {
        return horaAtendimento;
    }

    public void setHoraAtendimento(int horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }

    public int getMinutoAtendimento() {
        return minutoAtendimento;
    }

    public void setMinutoAtendimento(int minutoAtendimento) {
        this.minutoAtendimento = minutoAtendimento;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }
}
