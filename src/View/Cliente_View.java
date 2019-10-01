package View;

public class Cliente_View extends javax.swing.JInternalFrame {

    public Cliente_View() {
        initComponents();
        jPFisica.setVisible(false);
        jPJuridica.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
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
        FormattedTxtCEP = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtComplemento = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPFisica = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        TxDATA = new javax.swing.JFormattedTextField();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxCPF = new javax.swing.JTextField();
        TxRG = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        FormattedTxtTelefone1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        FormattedTxtTelefone = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 203, 248));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 220, 20);

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
            FormattedTxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(FormattedTxtCEP);
        FormattedTxtCEP.setBounds(330, 50, 240, 20);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 260, 590, 120);

        jPFisica.setBackground(new java.awt.Color(28, 203, 248));
        jPFisica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pessoa Física", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 11))); // NOI18N
        jPFisica.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel2.setText("ID:");
        jPFisica.add(jLabel2);
        jLabel2.setBounds(10, 20, 30, 20);
        jPFisica.add(TxtID);
        TxtID.setBounds(50, 20, 40, 20);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel3.setText("Matrícula:");
        jPFisica.add(jLabel3);
        jLabel3.setBounds(210, 20, 60, 20);
        jPFisica.add(TxtMatricula);
        TxtMatricula.setBounds(280, 20, 110, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel4.setText("Apelido:");
        jPFisica.add(jLabel4);
        jLabel4.setBounds(410, 50, 50, 20);
        jPFisica.add(TxtApelido);
        TxtApelido.setBounds(480, 50, 100, 20);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel5.setText("Estado Civil:");
        jPFisica.add(jLabel5);
        jLabel5.setBounds(10, 80, 80, 20);

        jComboBoxEstado.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado", "Solteiro" }));
        jPFisica.add(jComboBoxEstado);
        jComboBoxEstado.setBounds(90, 80, 90, 20);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel6.setText("Dt de Nasc:");
        jPFisica.add(jLabel6);
        jLabel6.setBounds(200, 110, 70, 20);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel7.setText("Estado Civil:");
        jPFisica.add(jLabel7);
        jLabel7.setBounds(400, 110, 80, 20);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel10.setText("Sexo:");
        jPFisica.add(jLabel10);
        jLabel10.setBounds(10, 110, 40, 20);

        jComboBoxSexo.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        jPFisica.add(jComboBoxSexo);
        jComboBoxSexo.setBounds(50, 110, 130, 20);

        try {
            TxDATA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPFisica.add(TxDATA);
        TxDATA.setBounds(280, 110, 110, 20);

        jComboBoxEstadoCivil.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado", "Solteiro" }));
        jComboBoxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoCivilActionPerformed(evt);
            }
        });
        jPFisica.add(jComboBoxEstadoCivil);
        jComboBoxEstadoCivil.setBounds(480, 110, 100, 20);

        jLabel19.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel19.setText("CPF:");
        jPFisica.add(jLabel19);
        jLabel19.setBounds(230, 80, 30, 14);

        jLabel20.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel20.setText("RG:");
        jPFisica.add(jLabel20);
        jLabel20.setBounds(420, 80, 40, 14);
        jPFisica.add(TxCPF);
        TxCPF.setBounds(280, 80, 110, 20);
        jPFisica.add(TxRG);
        TxRG.setBounds(480, 80, 100, 20);

        jLabel21.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel21.setText("Nome:");
        jPFisica.add(jLabel21);
        jLabel21.setBounds(10, 50, 40, 14);
        jPFisica.add(TxNome);
        TxNome.setBounds(50, 50, 340, 20);

        jLabel29.setText("Status:");
        jPFisica.add(jLabel29);
        jLabel29.setBounds(430, 20, 40, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Nao Ativo" }));
        jPFisica.add(jComboBox2);
        jComboBox2.setBounds(480, 20, 100, 20);

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Nao Ativo" }));
        jPJuridica.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, -1));

        jLayeredPane1.setLayer(jPFisica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPJuridica, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(jPFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(10, 100, 600, 160);

        jPanel1.setBackground(new java.awt.Color(28, 203, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha o tipo do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jRadioButton1.setBackground(new java.awt.Color(28, 203, 248));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jRadioButton1.setText("Pessoa Fisica");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(28, 203, 248));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jRadioButton2.setText("Pessoa Juridica");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 40, 530, 60);

        jPanel3.setBackground(new java.awt.Color(28, 203, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel8.setText("Telefone:");

        try {
            FormattedTxtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel9.setText("Celular:");

        try {
            FormattedTxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedTxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormattedTxtTelefoneActionPerformed(evt);
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
                        .addComponent(FormattedTxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FormattedTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEmail)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormattedTxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormattedTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 380, 590, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 460, 590, 100);

        setBounds(0, 0, 798, 629);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoCivilActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jPFisica.setVisible(true);
        jPJuridica.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jPFisica.setVisible(false);
        jPJuridica.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void FormattedTxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormattedTxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormattedTxtTelefoneActionPerformed

    private void TxIdjurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdjurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdjurActionPerformed

    private void TxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBairroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FormattedTxtCEP;
    private javax.swing.JFormattedTextField FormattedTxtTelefone;
    private javax.swing.JFormattedTextField FormattedTxtTelefone1;
    private javax.swing.JTextField TxCPF;
    private javax.swing.JTextField TxCnpj;
    private javax.swing.JFormattedTextField TxDATA;
    private javax.swing.JTextField TxIdjur;
    private javax.swing.JTextField TxIncricao;
    private javax.swing.JTextField TxMatriculaJuri;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxNomeFan;
    private javax.swing.JTextField TxRG;
    private javax.swing.JTextField TxRasao;
    private javax.swing.JTextField TxtApelido;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComplemento;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtMatricula;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtRua;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPFisica;
    private javax.swing.JPanel jPJuridica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables

}
