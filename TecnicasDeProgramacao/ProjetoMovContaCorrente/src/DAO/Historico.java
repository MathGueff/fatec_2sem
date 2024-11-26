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
        try{
            if(id_his == 0){
                JOptionPane.showMessageDialog(null, "Digite um número de histórico");
            }
            else{
                this.id_his = id_his;
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um número válido");
        }
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        historico = historico.trim();
        if(historico.isBlank() || historico.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o histórico");
        }
        else{
            this.historico = historico;
        }
    }
    
    public String dadosSQLValues(){
        String dadosHistorico;
        dadosHistorico = 
            getSqlValue(getHistorico());
        return dadosHistorico;
    }
    
    // Função auxiliar para verificar se o valor é nulo ou vazio
    private String getSqlValue(String value) {
        String campo = (value == null || value.isEmpty()) ? "NULL" : "'" + value + "'";
        return campo;
    }
}
