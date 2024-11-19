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
    
    public Movimentacao(){}

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        num_conta = num_conta.trim();
        if(num_conta.isBlank() || num_conta.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o número da conta");
        }
        else{
            this.num_conta = num_conta;
        }
    }

    public String getNum_age() {
        return num_age;
    }

    public void setNum_age(String num_age) {
        num_age = num_age.trim();
        if(num_age.isBlank() || num_age.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o número da agência");
        }
        else{
            this.num_age = num_age;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        documento = documento.trim();
        if(documento.isBlank() || documento.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o número de documento");
        }
        else{
            this.documento = documento;
        }
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        data_mov = data_mov.trim();
        if(data_mov.isBlank() || data_mov.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite a data");
        }
        else{
            this.data_mov = data_mov;
        }
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(String creditoDebito) {
        creditoDebito = creditoDebito.trim();
        if(creditoDebito.isBlank() || creditoDebito.isEmpty()){
            JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
        }
        else if(creditoDebito == "c" || creditoDebito == "d"){
            this.creditoDebito = creditoDebito;
        }
        else{
            JOptionPane.showMessageDialog(null, "Escolha entre credito e débito");
        }
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        if(id_his == 0){
            JOptionPane.showMessageDialog(null, "Digite o número do histórico");
        }
        else{
            this.id_his = id_his;
        }
    }

    public String getCompl_hist() {
        return compl_hist;
    }

    public void setCompl_hist(String compl_hist) {
        compl_hist = compl_hist.trim();
        this.compl_hist = compl_hist;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor == 0 || valor < 0){
            JOptionPane.showMessageDialog(null, "Digite um valor válido");
        }
        else{
            this.valor = valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo == 0 || saldo < 0){
            JOptionPane.showMessageDialog(null, "Digite um saldo válido");
        }
        else{
            this.saldo = saldo;
        }
    }
    
     public String dadosSQLValues(){
        String dadosMovimentacao;
        dadosMovimentacao = 
            "'" + this.getNum_age()+ "'," +
            "'" + this.getNum_conta()+ "'," +
            "'" + this.getData_mov()+ "'," +
            "'" + this.getNum_age()+ "'," +
            "'" + this.getDocumento()+ "'," +
            "'" + this.getCreditoDebito()+ "'," +
            "'" + this.getId_his()+ "'," +
            "'" + this.getCompl_hist()+ "'," +
            "'" + this.getValor()+ "'," +
            "'" + this.getSaldo()+ "'";
        return dadosMovimentacao;
    }
}
