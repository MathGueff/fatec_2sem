/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
        num_conta = num_conta.trim();
        if(num_conta.isBlank() || num_conta.isEmpty())
            JOptionPane.showMessageDialog(null, "Digite um número da conta");
        else{
            this.num_conta = num_conta;
        }
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        num_agencia = num_agencia.trim();
        if(num_agencia.isBlank() || num_agencia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite um número da agência");
        }
        else{
            this.num_agencia = num_agencia;
        }
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        try{
            if(id_cli == 0){
                JOptionPane.showMessageDialog(null, "Digite um cliente válido");
            }
            else{
                this.id_cli = id_cli;
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um número válido");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        try{
            if(saldo < 0 || saldo == 0){
                JOptionPane.showMessageDialog(null, "Digite um saldo válido");
            }
            else{
                this.saldo = saldo;
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um saldo válido");
        }
    }
    
    public String dadosSQLValues(){
        String dadosContaCorrente;
        dadosContaCorrente = 
            "'" + this.getNum_agencia()+ "'," +
            "'" + this.getId_cli()+ "'," +   
            "'" + this.getSaldo()+ "'";
        return dadosContaCorrente;        
    }
}
