
package View;

import Dao.ClienteJuridico_dao;
import Model.ClienteJuridico;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PessoaJuridica extends javax.swing.JInternalFrame {
    ClienteJuridico jur;
    ClienteJuridico_dao jur_dao;
    List <ClienteJuridico> juridicos;
    DefaultTableModel modelo = new DefaultTableModel();
    public PessoaJuridica() {
         jur_dao = new ClienteJuridico_dao();
        initComponents();
        atualizarTabela();
        Limpar();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxCEP = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtComplemento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TxtTelefone1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtCelular = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Funcionario = new javax.swing.JTable();
        jPJuridica = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        TxIdjur = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TxRasao = new javax.swing.JTextField();
        TxCnpj = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TxMatriculaJuri = new javax.swing.JTextField();
        TxIncricao = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TxNomeFan = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cbStatusJur = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        btPesquisarid1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(113, 207, 231));

        jPanel2.setBackground(new java.awt.Color(28, 203, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 11))); // NOI18N
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel11.setText("Bairro:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 20, 38, 20);

        TxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBairroActionPerformed(evt);
            }
        });
        jPanel2.add(TxtBairro);
        TxtBairro.setBounds(70, 20, 210, 20);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel12.setText("Rua:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 20, 30, 20);
        jPanel2.add(TxtRua);
        TxtRua.setBounds(330, 20, 240, 20);

        jLabel13.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel13.setText("Número:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 50, 50, 20);
        jPanel2.add(TxtNumero);
        TxtNumero.setBounds(69, 50, 60, 20);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel14.setText("Cidade:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(140, 50, 50, 20);
        jPanel2.add(TxtCidade);
        TxtCidade.setBounds(190, 50, 90, 20);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel15.setText("CEP:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(290, 50, 30, 20);

        try {
            TxCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(TxCEP);
        TxCEP.setBounds(330, 50, 240, 20);

        jLabel16.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel16.setText("Estado:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 80, 50, 20);
        jPanel2.add(TxtEstado);
        TxtEstado.setBounds(70, 80, 150, 20);

        jLabel17.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel17.setText("Complemento:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(230, 80, 90, 20);
        jPanel2.add(TxtComplemento);
        TxtComplemento.setBounds(330, 80, 240, 20);

        jPanel3.setBackground(new java.awt.Color(28, 203, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel8.setText("Telefone:");

        try {
            TxtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel9.setText("Celular:");

        try {
            TxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCelularActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel18.setText("E-mail:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        Tabela_Funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabela_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_FuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Funcionario);

        jPJuridica.setBackground(new java.awt.Color(28, 203, 248));
        jPJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pessoa Jurídica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 11))); // NOI18N
        jPJuridica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel22.setText("ID:");
        jPJuridica.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 18, -1));

        TxIdjur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdjurActionPerformed(evt);
            }
        });
        jPJuridica.add(TxIdjur, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 68, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel23.setText("Rasão Social");
        jPJuridica.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 57, -1, -1));
        jPJuridica.add(TxRasao, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 54, 99, -1));
        jPJuridica.add(TxCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, -1));

        jLabel24.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel24.setText("CNPJ:");
        jPJuridica.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 40, -1));

        jLabel25.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel25.setText("Matricula:");
        jPJuridica.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 19, 60, -1));
        jPJuridica.add(TxMatriculaJuri, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 99, -1));
        jPJuridica.add(TxIncricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 143, -1));

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel26.setText("Incrição Estadual:");
        jPJuridica.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 100, -1));

        jLabel27.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel27.setText("Nome Fantazia:");
        jPJuridica.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));
        jPJuridica.add(TxNomeFan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 144, -1));

        jLabel28.setText("Status:");
        jPJuridica.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, 20));

        cbStatusJur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Nao Ativo" }));
        jPJuridica.add(cbStatusJur, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, -1));

        jLabel31.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel31.setText("Pessoa Juritica ID");

        btPesquisarid1.setText("Pesquisar");
        btPesquisarid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarid1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarid1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(btPesquisarid1))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Campos(boolean Id,boolean status, boolean Mat, boolean NomFan, boolean cnpj, boolean razao, boolean inscricao,boolean Tel, boolean Cel, boolean Emai,boolean Bair, boolean Rua, boolean Num,
         boolean Cid, boolean Cep, boolean Est, boolean Comp )
    {      
        TxIdjur.setEnabled(Id);
        cbStatusJur.setEditable(status);
        TxMatriculaJuri.setEnabled(Mat);
        TxNomeFan.setEnabled(NomFan);
        TxCnpj.setEnabled(cnpj);
        TxRasao.setEnabled(razao);
        TxIncricao.setEnabled(inscricao);
        TxtCelular.setEnabled(Cel);
        txEmail.setEnabled(Emai);
        TxtBairro.setEnabled(Bair);
        TxtRua.setEnabled(Rua);
        TxtNumero.setEnabled(Num);
        TxtCidade.setEnabled(Cid);
        TxCEP.setEnabled(Cep);
        TxtEstado.setEnabled(Est);
        TxtComplemento.setEnabled(Comp);
    }
 
 public void Botão( boolean BtNov,boolean BtLim,boolean BtAlt, boolean BtExc, boolean BtSal, boolean BtPesq, boolean BtCanc)
    {
       btNovo.setEnabled(BtNov);
       btLimpar.setEnabled(BtLim);
       btAlterar.setEnabled(BtAlt);
       btExcluir.setEnabled(BtExc);
       btSalvar.setEnabled(BtSal);
       btPesquisarid1.setEnabled(BtPesq);
       btCancelar.setEnabled(BtCanc);
    }
   private void iniciar(){
      Campos(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
      Botão(true, false, false, false, false, true, true);
   }
    public void Limpar()
    {
        //txdate.setToolTipText("");
        //juridico
        TxIdjur.setText("");
        cbStatusJur.setSelectedItem("Selecionar");
        TxMatriculaJuri.setText("");
        TxNomeFan.setText("");
        TxCnpj.setText("");
        TxRasao.setText("");
        TxIncricao.setText("");
        
        TxtCelular.setText("");
        txEmail.setText("");
        TxtBairro.setText("");
        TxtRua.setText("");
        TxtNumero.setText("");
        TxtCidade.setText("");
        TxCEP.setText("");
        TxtEstado.setText("");
        TxtComplemento.setText("");
        TxtTelefone1.setText("");
    }
    public boolean verificarCampo(){
        if(cbStatusJur.getSelectedItem().equals("Selecione")||TxMatriculaJuri.getText().isEmpty()||
                TxNomeFan.getText().isEmpty()||TxRasao.getText().isEmpty()||TxCnpj.getText().isEmpty()||
                TxIncricao.getText().isEmpty()|| TxtTelefone1.getText().isEmpty()||TxtCelular.getText().isEmpty()|| 
                txEmail.getText().isEmpty() ||TxtBairro.getText().isEmpty() || TxtNumero.getText().isEmpty() ||
                TxtRua.getText().isEmpty() || TxtCidade.getText().isEmpty()){
                return false;
            }else{
                return true;
            }
    }
    private void TxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBairroActionPerformed

    private void TxtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCelularActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        boolean a = verificarCampo();
                if(a){
                    jur = new ClienteJuridico();
                    jur.setStatus((String) cbStatusJur.getSelectedItem());
                    jur.setMatricula(TxMatriculaJuri.getText());
                    jur.setNomeFantazia(TxNomeFan.getText());
                    jur.setCNPJ(TxCnpj.getText());
                    jur.setRasaoSocil(TxRasao.getText());
                    jur.setInscricao(TxIncricao.getText());

                    jur.setTelefone(TxtTelefone1.getText());
                    jur.setCelular(TxtCelular.getText());
                    jur.setEmail(txEmail.getText());
                    jur.setBairro(TxtBairro.getText());
                    jur.setRua(TxtRua.getText());
                    jur.setNumero(TxtNumero.getText());
                    jur.setCidade(TxtCidade.getText());
                    jur.setCep(TxCEP.getText());
                    jur.setEstado(TxtEstado.getText());
                    jur.setComplemento(TxtComplemento.getText());

                    try {
                        jur_dao.salvar(jur);
                        Limpar();
                        iniciar();
                        atualizarTabela();
                        JOptionPane.showMessageDialog(null, "Salvo!");
                    } catch (SQLException ex) {
                        Logger.getLogger(Cliente_View.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "a campos a serem preenchidos");
                }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        iniciar();
        Limpar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Limpar os Dados!");       
               if( i == 0 )
                {
                    Limpar();
                }
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir os Dados!");
        if( i == 0 ){

                try
                {
                    jur_dao.excluir(Integer.parseInt(TxIdjur.getText()));
                    Limpar();
                    iniciar();
                    atualizarTabela();
                    JOptionPane.showMessageDialog(null, "Removido com Sucesso");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERRO!");
                    e.printStackTrace();
                }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
         boolean a = verificarCampo();
         if(a){
                jur = new ClienteJuridico();
                jur.setId(Integer.parseInt(TxIdjur.getText()));
                jur.setStatus((String) cbStatusJur.getSelectedItem());
                jur.setMatricula(TxMatriculaJuri.getText());
                jur.setNomeFantazia(TxNomeFan.getText());
                jur.setCNPJ(TxCnpj.getText());
                jur.setRasaoSocil(TxRasao.getText());
                jur.setInscricao(TxIncricao.getText());

                jur.setTelefone(TxtTelefone1.getText());
                jur.setCelular(TxtCelular.getText());
                jur.setEmail(txEmail.getText());
                jur.setBairro(TxtBairro.getText());
                jur.setRua(TxtRua.getText());
                jur.setNumero(TxtNumero.getText());
                jur.setCidade(TxtCidade.getText());
                jur.setCep(TxCEP.getText());
                jur.setEstado(TxtEstado.getText());
                jur.setComplemento(TxtComplemento.getText());
                int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os Dados!");
                if( i == 0 )
                {
                    try {
                        jur_dao.alterar(jur);
                        iniciar();
                        Limpar();
                        atualizarTabela();
                        JOptionPane.showMessageDialog(null, "Salvo!");
                    } catch (SQLException ex) {
                        Logger.getLogger(Cliente_View.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                }else{
                JOptionPane.showMessageDialog(null, "a campos a serem preenchidos");
                }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void Tabela_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_FuncionarioMouseClicked
        int i = 0;
        Tabela_Funcionario.getModel();
        TxIdjur.setText(modelo.getValueAt(Tabela_Funcionario.getSelectedRow(), 0).toString());
        try {
             Campos(false, true, true, true, true, true, true, true, true, true, true, true, true,true, true, true, true);
             Botão(false, true, true, true, false, true, true);
            jur = jur_dao.buscaJuridicaID(Integer.parseInt(TxIdjur.getText()));

            cbStatusJur.setSelectedItem(jur.getStatus());
            TxMatriculaJuri.setText(jur.getMatricula());
            TxNomeFan.setText(jur.getNomeFantazia());
            TxRasao.setText(jur.getRasaoSocil());
            TxCnpj.setText(jur.getCNPJ());
            TxIncricao.setText(jur.getInscricao());
            TxtTelefone1.setText(jur.getTelefone());
            TxtCelular.setText(jur.getCelular());
            txEmail.setText(jur.getEmail());
            TxtBairro.setText(jur.getBairro());
            TxtRua.setText(jur.getRua());
            TxtNumero.setText(jur.getNumero());
            TxtCidade.setText(jur.getCidade());
            TxCEP.setText(jur.getCep());
            TxtEstado.setText(jur.getEstado());
            TxtComplemento.setText(jur.getComplemento());
      
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Tabela_FuncionarioMouseClicked
   public void atualizarTabela(){
        jur = new ClienteJuridico();
        try {
            juridicos = jur_dao.todosJuridica();
            String dados[][] = new String[juridicos.size()][10];
            int i = 0;
            for (ClienteJuridico u : juridicos) {
                dados[i][0] = String.valueOf(u.getId());
                dados[i][1] = u.getMatricula();
                dados[i][2] = u.getNomeFantazia();
                dados[i][3] = u.getCelular();
                dados[i][4] = u.getEmail(); 
                i++;
            }
            String tituloColuna[] = {"ID", "Matricula", "Nome Fantazia", "Celular", "Email"};
            modelo.setDataVector(dados, tituloColuna);
            Tabela_Funcionario.setModel(modelo);
            Tabela_Funcionario.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
    }
    private void TxIdjurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdjurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdjurActionPerformed

    private void btPesquisarid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarid1ActionPerformed

        String ID = JOptionPane.showInputDialog("Digite o ID do Cliente Juridico: ");
        jur = new ClienteJuridico();
        try {
            jur = jur_dao.buscaJuridicaID(Integer.parseInt(ID));
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(jur == null)
        {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
        Campos(false, true, true, true, true, true, true, true, true, true, true, true, true,true, true, true, true);
        Botão(false, true, true, true, false, true, true);
        TxIdjur.setText(ID);
        cbStatusJur.setSelectedItem(jur.getStatus());
        TxMatriculaJuri.setText(jur.getMatricula());
        TxNomeFan.setText(jur.getNomeFantazia());
        TxRasao.setText(jur.getRasaoSocil());
        TxCnpj.setText(jur.getCNPJ());
        TxIncricao.setText(jur.getInscricao());
        TxtTelefone1.setText(jur.getTelefone());
        TxtCelular.setText(jur.getCelular());
        txEmail.setText(jur.getEmail());
        TxtBairro.setText(jur.getBairro());
        TxtRua.setText(jur.getRua());
        TxtNumero.setText(jur.getNumero());
        TxtCidade.setText(jur.getCidade());
        TxCEP.setText(jur.getCep());
        TxtEstado.setText(jur.getEstado());
        TxtComplemento.setText(jur.getComplemento());
    }//GEN-LAST:event_btPesquisarid1ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        Campos(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        Botão(false, false, false, false, true, false, true);
        Limpar();
    }//GEN-LAST:event_btNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_Funcionario;
    private javax.swing.JFormattedTextField TxCEP;
    private javax.swing.JTextField TxCnpj;
    private javax.swing.JTextField TxIdjur;
    private javax.swing.JTextField TxIncricao;
    private javax.swing.JTextField TxMatriculaJuri;
    private javax.swing.JTextField TxNomeFan;
    private javax.swing.JTextField TxRasao;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JFormattedTextField TxtCelular;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComplemento;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtRua;
    private javax.swing.JFormattedTextField TxtTelefone1;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisarid1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbStatusJur;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPJuridica;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txEmail;
    // End of variables declaration//GEN-END:variables
}
