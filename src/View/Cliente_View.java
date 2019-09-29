package View;

public class Cliente_View extends javax.swing.JInternalFrame {

    public Cliente_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        FormattedTxtTelefone = new javax.swing.JFormattedTextField();
        FormattedTxtTelefone1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
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
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(28, 203, 248));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 220, 20);

        jPanel1.setBackground(new java.awt.Color(28, 203, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pessoa Física", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 30, 20);
        jPanel1.add(TxtID);
        TxtID.setBounds(50, 20, 130, 20);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel3.setText("Matrícula:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 20, 60, 20);
        jPanel1.add(TxtMatricula);
        TxtMatricula.setBounds(280, 20, 110, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel4.setText("Apelido:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 20, 50, 20);
        jPanel1.add(TxtApelido);
        TxtApelido.setBounds(480, 20, 110, 20);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel5.setText("Estado Civil:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 80, 20);

        jComboBox1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado", "Solteiro" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(90, 50, 90, 20);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel8.setText("Telefone:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 50, 60, 20);

        try {
            FormattedTxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(FormattedTxtTelefone);
        FormattedTxtTelefone.setBounds(480, 50, 110, 20);

        try {
            FormattedTxtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(FormattedTxtTelefone1);
        FormattedTxtTelefone1.setBounds(280, 50, 110, 20);

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel9.setText("Celular:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 50, 50, 20);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel6.setText("Dt de Nasc:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 80, 70, 20);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel7.setText("Estado Civil:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 80, 80, 20);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel10.setText("Sexo:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 80, 40, 20);

        jComboBox2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(50, 80, 130, 20);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(280, 80, 110, 20);

        jComboBox3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado", "Solteiro" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(480, 80, 110, 20);

        jPanel2.setBackground(new java.awt.Color(28, 203, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 11))); // NOI18N
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel11.setText("Bairro:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 20, 38, 20);
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

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 110, 580, 120);

        jPanel3.setBackground(new java.awt.Color(28, 203, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pessoa Jurídica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 11))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 240, 580, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 600, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FormattedTxtCEP;
    private javax.swing.JFormattedTextField FormattedTxtTelefone;
    private javax.swing.JFormattedTextField FormattedTxtTelefone1;
    private javax.swing.JTextField TxtApelido;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComplemento;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtMatricula;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtRua;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
