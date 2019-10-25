
package View;

import Dao.ClienteJuridico_dao;
import Model.ClienteJuridico;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
        jLabel17 = new javax.swing.JLabel();
        TxtComplemento = new javax.swing.JTextField();
        TxtEstado = new javax.swing.JComboBox<>();
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
        ButtonSair = new javax.swing.JButton();

        setBackground(new java.awt.Color(113, 207, 231));
        setClosable(true);

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
        TxtBairro.setBounds(70, 20, 260, 20);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel12.setText("Rua:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(340, 20, 30, 20);
        jPanel2.add(TxtRua);
        TxtRua.setBounds(380, 20, 380, 20);

        jLabel13.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel13.setText("Número:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(810, 20, 50, 20);
        jPanel2.add(TxtNumero);
        TxtNumero.setBounds(870, 20, 110, 20);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel14.setText("Cidade:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 50, 50, 20);
        jPanel2.add(TxtCidade);
        TxtCidade.setBounds(70, 50, 160, 20);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel15.setText("CEP:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(520, 50, 30, 20);

        try {
            TxCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(TxCEP);
        TxCEP.setBounds(560, 50, 120, 20);

        jLabel16.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel16.setText("Estado:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(250, 50, 50, 20);

        jLabel17.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel17.setText("Complemento:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(710, 50, 90, 20);
        jPanel2.add(TxtComplemento);
        TxtComplemento.setBounds(800, 50, 180, 20);

        TxtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel2.add(TxtEstado);
        TxtEstado.setBounds(310, 50, 190, 20);

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
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_16px_1.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_2_16px.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_broom_16px_4.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_16px.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_16px.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_16px.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        Tabela_Funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matricula", "Nome Fantazia", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jPJuridica.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 18, 20));

        TxIdjur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdjurActionPerformed(evt);
            }
        });
        jPJuridica.add(TxIdjur, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 68, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel23.setText("Rasão Social:");
        jPJuridica.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));
        jPJuridica.add(TxRasao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, -1));
        jPJuridica.add(TxCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 140, -1));

        jLabel24.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel24.setText("CNPJ:");
        jPJuridica.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 40, 20));

        jLabel25.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel25.setText("Matricula:");
        jPJuridica.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 19, 60, 20));
        jPJuridica.add(TxMatriculaJuri, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 99, -1));
        jPJuridica.add(TxIncricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 340, -1));

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel26.setText("Incrição Estadual:");
        jPJuridica.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 100, 20));

        jLabel27.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel27.setText("Nome Fantazia:");
        jPJuridica.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 20));
        jPJuridica.add(TxNomeFan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 340, -1));

        jLabel28.setText("Status:");
        jPJuridica.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, 20));

        cbStatusJur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Nao Ativo" }));
        jPJuridica.add(cbStatusJur, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 140, -1));

        jLabel31.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel31.setText("Pessoa Juritica ID");

        btPesquisarid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_16px_1.png"))); // NOI18N
        btPesquisarid1.setText("Pesquisar");
        btPesquisarid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarid1ActionPerformed(evt);
            }
        });

        ButtonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_window_40px_2.png"))); // NOI18N
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisarid1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(btPesquisarid1)))
                    .addComponent(ButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
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
        cbStatusJur.setEnabled(Cep);
        TxCEP.setEnabled(Cep);
        TxtEstado.setEnabled(Est);
        TxtTelefone1.setEnabled(Cid);
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
      Botão(true, false, false, false, false, true, false);
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
        TxtEstado.setSelectedIndex(0);
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
                    jur.setEstado((String) TxtEstado.getSelectedItem());
                    jur.setComplemento(TxtComplemento.getText());


            try {
                jur_dao.salvar(jur);
            } catch (SQLException ex) {
                Logger.getLogger(PessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
            }
                        Limpar();
                        iniciar();
                        atualizarTabela();
                        JOptionPane.showMessageDialog(null, "Salvo!");

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
                jur.setEstado((String) TxtEstado.getSelectedItem());
                jur.setComplemento(TxtComplemento.getText());
                int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os Dados!");
                if( i == 0 )
                {

                    try {
                        jur_dao.alterar(jur);
                    } catch (SQLException ex) {
                        Logger.getLogger(PessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        iniciar();
                        Limpar();
                        atualizarTabela();
                        JOptionPane.showMessageDialog(null, "Salvo!");

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
            TxtEstado.setSelectedItem(jur.getEstado());
            TxtComplemento.setText(jur.getComplemento());
      
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Tabela_FuncionarioMouseClicked
   
                 //---------------------Fomataçao das tabelas--------------------------
    String tituloColuna[] = {"ID", "Matricula", "Nome Fantazia", "Celular", "Email"};
    public void modeloDATabela(String[][] a){
            modelo.setDataVector(a, tituloColuna);
            Tabela_Funcionario.setModel(new DefaultTableModel(a,tituloColuna){
            boolean[] canEdit = new boolean[]{
                false,false,false,false,false
            };
            public boolean isCellEditable(int rowIndex,int columnIndex){
                return canEdit[columnIndex];
            }
            });
            Tabela_Funcionario.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabela_Funcionario.getColumnModel().getColumn(1).setPreferredWidth(70);
            Tabela_Funcionario.getColumnModel().getColumn(2).setPreferredWidth(200);
            Tabela_Funcionario.getColumnModel().getColumn(3).setPreferredWidth(100);
            Tabela_Funcionario.getColumnModel().getColumn(4).setPreferredWidth(100);
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);            
            Tabela_Funcionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);            
            Tabela_Funcionario.setRowHeight(25);               
    } 
    
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
            modeloDATabela(dados);
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
            Logger.getLogger(PessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
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
        TxtEstado.setSelectedItem(jur.getEstado());
        TxtComplemento.setText(jur.getComplemento());
    }//GEN-LAST:event_btPesquisarid1ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        Campos(false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        Botão(false, true, false, false,true, false, true);
        Limpar();
    }//GEN-LAST:event_btNovoActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?") == 0)
        {
            this.dispose();
        }
    }//GEN-LAST:event_ButtonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSair;
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
    private javax.swing.JComboBox<String> TxtEstado;
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
