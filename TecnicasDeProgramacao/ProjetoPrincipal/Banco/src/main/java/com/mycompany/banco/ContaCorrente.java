/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ContaCorrente{
    private String num_conta;
    private String num_agencia;
    private int id_cli;
    private double saldo;
    
    public ContaCorrente(String num_conta, String num_agencia, int id_cli, double saldo){
        this.num_conta = num_conta;
        this.num_agencia = num_agencia;
        this.id_cli = id_cli;
        this.saldo = saldo;
    }
    
    public ContaCorrente(){}

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        if(num_conta == null)
            JOptionPane.showMessageDialog(null, "Número da conta não pode ser vazio");
        else{
            this.num_conta = num_conta;
        }
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        if(num_agencia == null){
            JOptionPane.showMessageDialog(null, "Número da agência não pode ser vazio");
        }
        else{
            this.num_agencia = num_agencia;
        }
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        if(id_cli == 0){
            JOptionPane.showMessageDialog(null, "Número do cliente não pode ser vazio");
        }
        else{
            this.id_cli = id_cli;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
