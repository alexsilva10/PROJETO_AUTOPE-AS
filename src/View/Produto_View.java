package View;


import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Produto_View extends javax.swing.JInternalFrame {

    public Produto_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        Btn_Pesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxGrupo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TxtCodigoDeBarras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPrecoVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPrecoCusto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TxtLocaliza = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        Btn_Novo = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Alterar = new javax.swing.JButton();
        Btn_Limpar = new javax.swing.JButton();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Salvar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de produtos");

        jPanel1.setBackground(new java.awt.Color(0, 149, 255));
        jPanel1.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel26.setText("ID:");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(20, 20, 16, 20);
        jPanel1.add(TxtID);
        TxtID.setBounds(40, 20, 130, 20);

        Btn_Pesquisar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Pesquisar.setText("Pesquisar");
        Btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Pesquisar);
        Btn_Pesquisar.setBounds(190, 10, 120, 30);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel1.setText("Descrição:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 60, 20);
        jPanel1.add(TxtDescricao);
        TxtDescricao.setBounds(90, 60, 590, 20);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel2.setText("Grupo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 100, 50, 20);

        ComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboBoxGrupo);
        ComboBoxGrupo.setBounds(90, 100, 130, 20);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel3.setText("Código de barras:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 100, 100, 20);
        jPanel1.add(TxtCodigoDeBarras);
        TxtCodigoDeBarras.setBounds(430, 100, 250, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel4.setText("Preço de venda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 100, 20);
        jPanel1.add(TxtPrecoVenda);
        TxtPrecoVenda.setBounds(130, 140, 150, 20);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel5.setText("Preço de custo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 140, 100, 20);
        jPanel1.add(TxtPrecoCusto);
        TxtPrecoCusto.setBounds(430, 140, 250, 20);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel6.setText("Margem de lucro:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 180, 110, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(130, 180, 150, 20);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel7.setText("Unidade de medida:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 180, 120, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(430, 180, 250, 20);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel8.setText("Localização:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 220, 80, 20);
        jPanel1.add(TxtLocaliza);
        TxtLocaliza.setBounds(130, 220, 150, 20);

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel9.setText("Fornecedor:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 220, 80, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(430, 220, 250, 20);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel10.setText("Marca:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 260, 50, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 260, 150, 20);

        jLabel11.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel11.setText("Data de cadastro:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(310, 260, 100, 20);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(430, 260, 250, 20);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel12.setText("Estoque:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 300, 60, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 300, 150, 20);

        jLabel13.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel13.setText("Data última venda:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(310, 300, 110, 20);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(430, 300, 250, 20);

        Btn_Novo.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Novo.setText("Novo");
        jPanel1.add(Btn_Novo);
        Btn_Novo.setBounds(590, 10, 90, 30);

        Btn_Cancelar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        jPanel1.add(Btn_Cancelar);
        Btn_Cancelar.setBounds(490, 10, 90, 30);

        Btn_Alterar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Alterar.setText("Alterar");
        jPanel1.add(Btn_Alterar);
        Btn_Alterar.setBounds(150, 350, 90, 30);

        Btn_Limpar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Limpar.setText("Limpar");
        jPanel1.add(Btn_Limpar);
        Btn_Limpar.setBounds(370, 350, 90, 30);

        Btn_Excluir.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Excluir.setText("Excluir");
        jPanel1.add(Btn_Excluir);
        Btn_Excluir.setBounds(260, 350, 90, 30);

        Btn_Salvar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Salvar.setText("Salvar");
        jPanel1.add(Btn_Salvar);
        Btn_Salvar.setBounds(590, 350, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PesquisarActionPerformed

    }//GEN-LAST:event_Btn_PesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Alterar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Excluir;
    private javax.swing.JButton Btn_Limpar;
    private javax.swing.JButton Btn_Novo;
    private javax.swing.JButton Btn_Pesquisar;
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JComboBox<String> ComboBoxGrupo;
    private javax.swing.JTextField TxtCodigoDeBarras;
    private javax.swing.JTextField TxtDescricao;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtLocaliza;
    private javax.swing.JTextField TxtPrecoCusto;
    private javax.swing.JTextField TxtPrecoVenda;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
