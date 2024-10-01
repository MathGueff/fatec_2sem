/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import com.mycompany.banco.Cliente;
import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
    }
    
    Cliente c = new Cliente();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Cliente = new javax.swing.JLabel();
        lbl_Endereco = new javax.swing.JLabel();
        lbl_Numero = new javax.swing.JLabel();
        textField_Cliente = new javax.swing.JTextField();
        textField_Endereco = new javax.swing.JTextField();
        textField_Numero = new javax.swing.JTextField();
        btn_Gravar = new javax.swing.JButton();
        btn_Ler = new javax.swing.JButton();
        lbl_Bairro = new javax.swing.JLabel();
        txtField_Bairro = new javax.swing.JTextField();
        txtField_Cidade = new javax.swing.JTextField();
        lbl_Cidade = new javax.swing.JLabel();
        txtField_Cep = new javax.swing.JTextField();
        lbl_Cep = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txtField_Email = new javax.swing.JTextField();
        lbl_Telefone = new javax.swing.JLabel();
        txtField_Telefone = new javax.swing.JTextField();
        lbl_Cpf_Cnpj = new javax.swing.JLabel();
        txtField_Cpf_Cpnj = new javax.swing.JTextField();
        btn_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        lbl_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Cliente.setText("Nome do Cliente");

        lbl_Endereco.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Endereco.setText("Endereço do Cliente");

        lbl_Numero.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Numero.setText("Número");

        textField_Cliente.setBackground(new java.awt.Color(204, 204, 204));
        textField_Cliente.setForeground(new java.awt.Color(51, 51, 51));
        textField_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_ClienteActionPerformed(evt);
            }
        });

        textField_Endereco.setBackground(new java.awt.Color(204, 204, 204));
        textField_Endereco.setForeground(new java.awt.Color(51, 51, 51));

        textField_Numero.setBackground(new java.awt.Color(204, 204, 204));
        textField_Numero.setForeground(new java.awt.Color(51, 51, 51));
        textField_Numero.setToolTipText("");

        btn_Gravar.setText("Gravar");
        btn_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GravarActionPerformed(evt);
            }
        });

        btn_Ler.setText("Ler");
        btn_Ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LerActionPerformed(evt);
            }
        });

        lbl_Bairro.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Bairro.setText("Bairro");

        txtField_Bairro.setBackground(new java.awt.Color(204, 204, 204));
        txtField_Bairro.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Bairro.setToolTipText("");

        txtField_Cidade.setBackground(new java.awt.Color(204, 204, 204));
        txtField_Cidade.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Cidade.setToolTipText("");

        lbl_Cidade.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Cidade.setText("Cidade");

        txtField_Cep.setBackground(new java.awt.Color(204, 204, 204));
        txtField_Cep.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Cep.setToolTipText("");

        lbl_Cep.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Cep.setText("CEP");

        lbl_Email.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Email.setText("Email");

        txtField_Email.setBackground(new java.awt.Color(204, 204, 204));
        txtField_Email.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Email.setToolTipText("");

        lbl_Telefone.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Telefone.setText("Telefone");

        txtField_Telefone.setBackground(new java.awt.Color(204, 204, 204));
        txtField_Telefone.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Telefone.setToolTipText("");

        lbl_Cpf_Cnpj.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Cpf_Cnpj.setText("CPF/CNPJ");

        txtField_Cpf_Cpnj.setBackground(new java.awt.Color(204, 204, 204));
        txtField_Cpf_Cpnj.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Cpf_Cpnj.setToolTipText("");

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_Gravar)
                        .addGap(90, 90, 90)
                        .addComponent(btn_Limpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Cliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Numero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Bairro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cep, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cpf_Cnpj, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Telefone, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtField_Cpf_Cpnj, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Endereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(378, Short.MAX_VALUE)
                    .addComponent(btn_Ler)
                    .addGap(24, 24, 24)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cliente)
                    .addComponent(textField_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Endereco)
                    .addComponent(textField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Numero)
                    .addComponent(textField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Bairro)
                    .addComponent(txtField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cidade)
                    .addComponent(txtField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cep)
                    .addComponent(txtField_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email)
                    .addComponent(txtField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telefone)
                    .addComponent(txtField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cpf_Cnpj)
                    .addComponent(txtField_Cpf_Cpnj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Gravar)
                    .addComponent(btn_Limpar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(270, Short.MAX_VALUE)
                    .addComponent(btn_Ler)
                    .addGap(7, 7, 7)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_ClienteActionPerformed

    private void btn_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GravarActionPerformed
        //Gravar os dados no objeto cliente c
        c.setNome(textField_Cliente.getText());
        c.setEndereco(textField_Endereco.getText());
        c.setNumero(textField_Numero.getText());
        c.setBairro(txtField_Bairro.getText());
        c.setCidade(txtField_Cidade.getText());
        c.setCep(txtField_Cep.getText());
        c.setEmail(txtField_Email.getText());
        c.setTelefone(txtField_Telefone.getText());
        if(txtField_Cpf_Cpnj.getText() == "CPF"){
            c.setCep(txtField_Cpf_Cpnj.getText());
        }
        else if(txtField_Cpf_Cpnj.getText() == "CNPJ")
        {
            c.setCnpj(txtField_Cpf_Cpnj.getText());
        }
        JOptionPane.showMessageDialog(null, "Parabens, você se cadastrou");
        btn_LimparActionPerformed(evt);
    }//GEN-LAST:event_btn_GravarActionPerformed

    private void btn_LerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LerActionPerformed
        textField_Cliente.setText(c.getNome());
        textField_Endereco.setText(c.getEndereco());
        textField_Numero.setText(c.getNumero());
        txtField_Bairro.setText(c.getBairro());
        txtField_Cidade.setText(c.getCidade());
        txtField_Cep.setText(c.getCep());
        txtField_Telefone.setText(c.getTelefone());
        txtField_Email.setText(c.getEmail());
        if(c.getCpf().isEmpty())
        {
            txtField_Cpf_Cpnj.setText(c.getCpf());
        }
        else
        {
            txtField_Cpf_Cpnj.setText(c.getCnpj());
        }
    }//GEN-LAST:event_btn_LerActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        textField_Cliente.setText("");
        textField_Endereco.setText("");
        textField_Numero.setText("");
        txtField_Bairro.setText("");
        txtField_Cidade.setText("");
        txtField_Cep.setText("");
        txtField_Telefone.setText("");
        txtField_Email.setText("");
        txtField_Cpf_Cpnj.setText("");
        txtField_Cpf_Cpnj.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Gravar;
    private javax.swing.JButton btn_Ler;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JLabel lbl_Bairro;
    private javax.swing.JLabel lbl_Cep;
    private javax.swing.JLabel lbl_Cidade;
    private javax.swing.JLabel lbl_Cliente;
    private javax.swing.JLabel lbl_Cpf_Cnpj;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Endereco;
    private javax.swing.JLabel lbl_Numero;
    private javax.swing.JLabel lbl_Telefone;
    private javax.swing.JTextField textField_Cliente;
    private javax.swing.JTextField textField_Endereco;
    private javax.swing.JTextField textField_Numero;
    private javax.swing.JTextField txtField_Bairro;
    private javax.swing.JTextField txtField_Cep;
    private javax.swing.JTextField txtField_Cidade;
    private javax.swing.JTextField txtField_Cpf_Cpnj;
    private javax.swing.JTextField txtField_Email;
    private javax.swing.JTextField txtField_Telefone;
    // End of variables declaration//GEN-END:variables
}
