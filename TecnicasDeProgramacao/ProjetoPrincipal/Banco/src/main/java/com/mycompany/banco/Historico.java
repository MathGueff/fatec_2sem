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
public class Historico {
    private int id_his;
    private String historico;
    
    public Historico(int id_his, String historico){
        this.id_his = id_his;
        this.historico = historico;
    }
    
    public Historico(){}

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        if(id_his == 0){
            JOptionPane.showMessageDialog(null, "Número do histórico não pode ser vazio");
        }
        else{
            this.id_his = id_his;
        }
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        if(historico == null){
            JOptionPane.showMessageDialog(null, "Histórico não pode ser vazio");
        }
        else{
            this.historico = historico;
        }
    }
}
