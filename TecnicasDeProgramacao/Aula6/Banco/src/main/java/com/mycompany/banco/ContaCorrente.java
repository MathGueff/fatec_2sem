/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Alunos
 */
public class ContaCorrente {
    private char num_conta;
    private char num_agencia;
    private int id_cli;
    private int saldo;
    
    public ContaCorrente(char num_conta, char num_agencia, int id_cli, int saldo){
        this.num_conta = num_conta;
        this.num_agencia = num_agencia;
        this.id_cli = id_cli;
        this.saldo = saldo;
    }   

    public char getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(char num_conta) {
        this.num_conta = num_conta;
    }

    public char getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(char num_agencia) {
        this.num_agencia = num_agencia;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
