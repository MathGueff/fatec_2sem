/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import DAO.Cliente;
import DAO.connectDAO;
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
    String operacaoAtivaGlobal = "Nenhum";
    public Clientes(String operacaoAtiva){
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        String operacao = "Incluir";
        
        if(operacaoAtiva.equals(operacao)){
            jLabel1.setVisible(false);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            JTextField1.setVisible(false);
            JTextField2.setVisible(true);
            JTextField3.setVisible(true);
            JTextField4.setVisible(true);
            JTextField5.setVisible(true);
            JTextField6.setVisible(true);
            JTextField7.setVisible(true);
            JTextField8.setVisible(true);
            JTextField9.setVisible(true);
            JTextField10.setVisible(true);
            JTextField11.setVisible(true);
            JTextField12.setVisible(true);
            JComboBox.setVisible(true);
            JRadioButton1.setVisible(true);
            JRadioButton2.setVisible(true);
            jButton1.setText(operacaoAtivaGlobal + " BD");
        }
        operacao = "Alterar";
        if(operacaoAtiva.equals(operacao)){
            jLabel1.setVisible(true);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            JTextField1.setVisible(true);
            JTextField2.setVisible(false);
            JTextField3.setVisible(false);
            JTextField4.setVisible(false);
            JTextField5.setVisible(false);
            JTextField6.setVisible(false);
            JTextField7.setVisible(false);
            JTextField8.setVisible(false);
            JTextField9.setVisible(false);
            JTextField10.setVisible(false);
            JTextField11.setVisible(false);
            JTextField12.setVisible(false);
            JComboBox.setVisible(false);
            JRadioButton1.setVisible(false);
            JRadioButton2.setVisible(false);
            jButton1.setText(operacaoAtivaGlobal + " BD");;
        }
    }
    
    Cliente c = new Cliente();
    String identificacao = "";
    
    char sexoSelecionado = ' ';
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTextField2 = new javax.swing.JTextField();
        JTextField3 = new javax.swing.JTextField();
        JTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTextField5 = new javax.swing.JTextField();
        JTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JComboBox = new javax.swing.JComboBox<>();
        JRadioButton1 = new javax.swing.JRadioButton();
        JRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        JTextField1 = new javax.swing.JTextField();
        JTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JTextField12 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do Cliente");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Endereço do Cliente");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número");

        JTextField2.setBackground(new java.awt.Color(204, 204, 204));
        JTextField2.setForeground(new java.awt.Color(51, 51, 51));

        JTextField3.setBackground(new java.awt.Color(204, 204, 204));
        JTextField3.setForeground(new java.awt.Color(51, 51, 51));

        JTextField4.setBackground(new java.awt.Color(204, 204, 204));
        JTextField4.setForeground(new java.awt.Color(51, 51, 51));
        JTextField4.setToolTipText("");

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Ler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bairro");

        JTextField5.setBackground(new java.awt.Color(204, 204, 204));
        JTextField5.setForeground(new java.awt.Color(51, 51, 51));
        JTextField5.setToolTipText("");

        JTextField6.setBackground(new java.awt.Color(204, 204, 204));
        JTextField6.setForeground(new java.awt.Color(51, 51, 51));
        JTextField6.setToolTipText("");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cidade");

        JTextField7.setBackground(new java.awt.Color(204, 204, 204));
        JTextField7.setForeground(new java.awt.Color(51, 51, 51));
        JTextField7.setToolTipText("");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CEP");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email");

        JTextField8.setBackground(new java.awt.Color(204, 204, 204));
        JTextField8.setForeground(new java.awt.Color(51, 51, 51));
        JTextField8.setToolTipText("");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Telefone");

        JTextField9.setBackground(new java.awt.Color(204, 204, 204));
        JTextField9.setForeground(new java.awt.Color(51, 51, 51));
        JTextField9.setToolTipText("");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CPF/CNPJ");

        JTextField10.setBackground(new java.awt.Color(204, 204, 204));
        JTextField10.setForeground(new java.awt.Color(51, 51, 51));
        JTextField10.setToolTipText("");

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Sexo");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Estado do Cliente");

        JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        JRadioButton1.setText("Feminino");
        JRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioButton1ActionPerformed(evt);
            }
        });

        JRadioButton2.setText("Masculino");
        JRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioButton2ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id do Cliente");

        JTextField1.setBackground(new java.awt.Color(204, 204, 204));
        JTextField1.setForeground(new java.awt.Color(51, 51, 51));

        JTextField11.setBackground(new java.awt.Color(204, 204, 204));
        JTextField11.setForeground(new java.awt.Color(51, 51, 51));
        JTextField11.setToolTipText("");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Complemento");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Data de Nascimento");

        JTextField12.setBackground(new java.awt.Color(204, 204, 204));
        JTextField12.setForeground(new java.awt.Color(51, 51, 51));
        JTextField12.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel11)
                                    .addGap(86, 86, 86)
                                    .addComponent(JRadioButton1)
                                    .addGap(6, 6, 6)
                                    .addComponent(JRadioButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(33, 33, 33))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(158, 158, 158)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11))
                            .addComponent(JRadioButton1)
                            .addComponent(JRadioButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(JTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(JTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(JTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(JTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(JTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(JTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(JTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(JTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))
                            .addComponent(JTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Gravar os dados no objeto cliente c
        String operacao = "Incluir";
        if(operacaoAtivaGlobal.equals(operacao)){
            c.setId_cli(JTextField1.getText().isBlank() || JTextField1.getText().isEmpty() ? 0 : Integer.parseInt(JTextField1.getText()));
            c.setNome(JTextField2.getText());
            c.setEndereco(JTextField3.getText());
            c.setNumero(JTextField4.getText());
            c.setBairro(JTextField5.getText());
            c.setCidade(JTextField6.getText());
            c.setCep(JTextField7.getText());
            c.setEmail(JTextField8.getText());
            c.setTelefone(JTextField9.getText());
            c.setComplemento(JTextField11.getText());
            c.setDataNascimento(JTextField12.getText());
            
            switch (JTextField10.getText().length()) {
                case 11:
                    //CPF
                    c.setCpf(JTextField10.getText());
                    identificacao = "cpf";
                    break;
                case 14:
                    //CNPJ
                    c.setCnpj(JTextField10.getText());
                    identificacao = "cnpj";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite o CPF ou CNPJ");
            }
            if(JComboBox.getSelectedItem().toString() != "ESTADO"){
                c.setUf(JComboBox.getSelectedItem().toString());
            }
            c.setSexo(sexoSelecionado);
            JOptionPane.showMessageDialog(null, "Cadastrado");
            
            //Inserção no banco de dados
            connectDAO objcon = new connectDAO();
            objcon.connectDB();
            objcon.insereRegistroJFBD("CLIENTES", c.dadosSQLValues());
            
            JTextField2.setText("");
            JTextField3.setText("");
            JTextField4.setText("");
            JTextField5.setText("");
            JTextField6.setText("");
            JTextField7.setText("");
            JTextField9.setText("");
            JTextField8.setText("");
            JTextField10.setText("");
            JTextField11.setText("");
            JTextField12.setText("");
            JComboBox.setSelectedIndex(0);
            JRadioButton1.setSelected(false);
            JRadioButton2.setSelected(false);
            sexoSelecionado = ' ';
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        JTextField2.setText(c.getNome());
//        JTextField3.setText(c.getEndereco());
//        JTextField4.setText(c.getNumero());
//        JTextField5.setText(c.getBairro());
//        JTextField6.setText(c.getCidade());
//        JTextField7.setText(c.getCep());
//        JTextField8.setText(c.getEmail());
//        JTextField9.setText(c.getTelefone());
//        
//        if(identificacao == "cpf"){
//            JTextField10.setText(c.getCpf());
//        }
//        else if(identificacao == "cnpj"){
//            JTextField10.setText(c.getCnpj());
//        }
//        
//        JComboBox.setSelectedItem(c.getUf());
//        if(c.getSexo() == 'F')
//        {
//            JRadioButton1.setSelected(true);
//            JRadioButton2.setSelected(false);
//            sexoSelecionado = 'F';
//        }
//        else if(c.getSexo() == 'M')
//        {
//            JRadioButton1.setSelected(false);
//            JRadioButton2.setSelected(true);
//            sexoSelecionado = 'M';
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        JTextField2.setText("");
//        JTextField3.setText("");
//        JTextField4.setText("");
//        JTextField5.setText("");
//        JTextField6.setText("");
//        JTextField7.setText("");
//        JTextField9.setText("");
//        JTextField8.setText("");
//        JTextField10.setText("");
//        JComboBox.setSelectedIndex(0);
//        JRadioButton1.setSelected(false);
//        JRadioButton2.setSelected(false);
//        sexoSelecionado = ' ';
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioButton1ActionPerformed
       if(JRadioButton1.isSelected())
       {
           JRadioButton2.setSelected(false);
           sexoSelecionado = 'F';
       }
    }//GEN-LAST:event_JRadioButton1ActionPerformed

    private void JRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioButton2ActionPerformed
       if(JRadioButton2.isSelected())
       {
           JRadioButton1.setSelected(false);
           sexoSelecionado = 'M';
       }
    }//GEN-LAST:event_JRadioButton2ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBox;
    private javax.swing.JRadioButton JRadioButton1;
    private javax.swing.JRadioButton JRadioButton2;
    private javax.swing.JTextField JTextField1;
    private javax.swing.JTextField JTextField10;
    private javax.swing.JTextField JTextField11;
    private javax.swing.JTextField JTextField12;
    private javax.swing.JTextField JTextField2;
    private javax.swing.JTextField JTextField3;
    private javax.swing.JTextField JTextField4;
    private javax.swing.JTextField JTextField5;
    private javax.swing.JTextField JTextField6;
    private javax.swing.JTextField JTextField7;
    private javax.swing.JTextField JTextField8;
    private javax.swing.JTextField JTextField9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
