/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Movimentacao {
    private String num_conta;
    private String num_age;
    private String documento;
    private String data_mov;
    private String creditoDebito;
    private int id_his;
    private String compl_hist;
    private double valor;
    private double saldo;

    public Movimentacao(String num_conta, String num_age, String documento, String data_mov, String creditoDebito, int id_his, String compl_hist, double valor, double saldo) {
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

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        if(num_conta == null){
            JOptionPane.showMessageDialog(null, "Número da conta não pode ser vazio");
        }
        else{
            this.num_conta = num_conta;
        }
    }

    public String getNum_age() {
        return num_age;
    }

    public void setNum_age(String num_age) {
        if(num_age == null){
            JOptionPane.showMessageDialog(null, "Número da agência não pode ser vazio");
        }
        else{
            this.num_age = num_age;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        if(data_mov == null){
            JOptionPane.showMessageDialog(null, "Data da movimentação não pode ser vazio");
        }
        else{
            this.data_mov = data_mov;
        }
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(String creditoDebito) {
        if(creditoDebito == null){
            JOptionPane.showMessageDialog(null, "Cartão não pode ser vazio");
        }
        else{
            this.creditoDebito = creditoDebito;
        }
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        if(id_his == 0){
            JOptionPane.showMessageDialog(null, "Numero do histórico não pode ser vazio");
        }
        else{
            this.id_his = id_his;
        }
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
        if(valor == 0){
            JOptionPane.showMessageDialog(null, "Valor não pode ser vazio");
        }
        else{
            this.valor = valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo == 0){
            JOptionPane.showMessageDialog(null, "Saldo não pode ser vazio");
        }
        else{
            this.saldo = saldo;
        }
    }
}
