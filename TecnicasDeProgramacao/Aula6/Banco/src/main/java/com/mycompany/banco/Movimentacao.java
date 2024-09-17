/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Movimentacao {
    private char num_conta;
    private char num_age;
    private char documento;
    private String data_mov;
    private char creditoDebito;
    private int id_his;
    private String compl_hist;
    private double valor;
    private double saldo;

    public Movimentacao(char num_conta, char num_age, char documento, String data_mov, char creditoDebito, int id_his, String compl_hist, double valor, double saldo) {
        this.num_conta = num_conta;
        this.num_age = num_age;
        this.documento = documento;
        this.data_mov = data_mov;
        this.creditoDebito = creditoDebito;
        this.id_his = id_his;
        this.compl_hist = compl_hist;
        this.valor = valor;
        this.saldo = saldo;
    }

    public char getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(char num_conta) {
        this.num_conta = num_conta;
    }

    public char getNum_age() {
        return num_age;
    }

    public void setNum_age(char num_age) {
        this.num_age = num_age;
    }

    public char getDocumento() {
        return documento;
    }

    public void setDocumento(char documento) {
        this.documento = documento;
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        this.data_mov = data_mov;
    }

    public char getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(char creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        this.id_his = id_his;
    }

    public String getCompl_hist() {
        return compl_hist;
    }

    public void setCompl_hist(String compl_hist) {
        this.compl_hist = compl_hist;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
