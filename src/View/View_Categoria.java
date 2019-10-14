/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Dao.Dao_CadastroCategoria;
import Model.Categoria;
import Util.LimitaDigitos;
import Util.LimitaDigitosNum;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruna
 */
public class View_Categoria extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Categoria> categorias;
    Dao_CadastroCategoria daoCategoria;
    Categoria c;


    /**
     * Creates new form View_Categoria
     */
    public View_Categoria() {
        c = new Categoria();
        daoCategoria = new Dao_CadastroCategoria();
        categorias = new ArrayList<>();
        initComponents();
        TextCodigo.setDocument(new LimitaDigitosNum(11));
        TextNome.setDocument(new LimitaDigitos(30));
        TextNomeCons.setDocument(new LimitaDigitos(30));
        atualizarTabela();
        inicio();
    }
    private void inicio(){
        campo(false,false);
        botao(true, false, false, true, false, true, true);
    }
    private void alterar(){
        campo(false,true);
        botao(false, false, true, true, true, true, true);
    }
    public void campo(boolean codigo ,boolean nome){
        this.TextNome.setEnabled(nome);
        this.TextCod.setEnabled(codigo);
    }
    private void botao(boolean novo, boolean salvar, boolean limpar, boolean sair, 
            boolean salvarAterar, boolean pesCodigo, boolean pesNome){
        ButtonNovo.setEnabled(novo);
        ButtonSalvar1.setEnabled(salvar);
        ButtonLimpar.setEnabled(limpar);
        ButtonSair.setEnabled(sair);
        ButtonSalvarAlterar.setEnabled(salvarAterar);
        ButtonPesqCod.setEnabled(pesCodigo);
        ButtonPesqNome.setEnabled(pesNome);
        
    }
    //---------------------Fomataçao das tabelas--------------------------
    String tituloColuna[] = {"codigo", "nome",};
    public void modeloDATabela(String[][] a){
            modelo.setDataVector(a, tituloColuna);
            JTabCadastro.setModel(new DefaultTableModel(a,tituloColuna){
            boolean[] canEdit = new boolean[]{
                false,false
            };
            public boolean isCellEditable(int rowIndex,int columnIndex){
                return canEdit[columnIndex];
            }
            });
            JTabCadastro.getColumnModel().getColumn(0).setPreferredWidth(100);
            JTabCadastro.getColumnModel().getColumn(1).setPreferredWidth(500);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);            
            JTabCadastro.getColumnModel().getColumn(0).setCellRenderer(centralizado);            
            JTabCadastro.setRowHeight(25);               
    }
    //---------------------------------------------------------------------
    public void atualizarTabela(){
       c = new Categoria();
        try {
            categorias = (ArrayList<Categoria>) daoCategoria.todosUsuarios();
            String dados[][] = new String[categorias.size()][2];
            int i = 0;
            for (Categoria c : categorias) {
                dados[i][0] = String.valueOf(c.getCodigo());
                dados[i][1] = c.getNome();
                i++;
            }

            modeloDATabela(dados);
           
            JTabCadastro.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void BuscaCodigo(){
       c = new Categoria();
        try {
            c = daoCategoria.getCategoriaByCodigo(Integer.valueOf(TextCodigo.getText()));
            String dados[][] = new String[1][2];
            dados[0][0] = String.valueOf(c.getCodigo());
            dados[0][1] = c.getNome();

            modeloDATabela(dados);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void BuscaTabela(){
        c = new Categoria();
        try {
           categorias = (ArrayList<Categoria>) daoCategoria.BuscaCategoriaNome(TextNomeCons.getText());
            String dados[][] = new String[categorias.size()][4];
            int i = 0;
            for (Categoria c : categorias) {
                dados[i][0] = String.valueOf(c.getCodigo());
                dados[i][1] = c.getNome();
                i++;
            }
            modeloDATabela(dados);
            JTabCadastro.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextCod = new javax.swing.JTextField();
        ButtonSair = new javax.swing.JButton();
        ButtonSalvarAlterar = new javax.swing.JButton();
        ButtonNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ButtonSalvar1 = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabCadastro = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        ButtonPesqCod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TextNomeCons = new javax.swing.JTextField();
        ButtonPesqNome = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Categoria");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(82, 203, 248));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(82, 203, 248));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        TextNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 80, 680, 100);

        ButtonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSair);
        ButtonSair.setBounds(610, 510, 90, 30);

        ButtonSalvarAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSalvarAlterar.setText("Alterar");
        ButtonSalvarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSalvarAlterar);
        ButtonSalvarAlterar.setBounds(520, 200, 90, 30);

        ButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonNovo.setText("Novo");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonNovo);
        ButtonNovo.setBounds(30, 190, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cadastro de Categoria");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 210, 22);

        ButtonSalvar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSalvar1.setText("Salvar");
        ButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvar1ActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSalvar1);
        ButtonSalvar1.setBounds(320, 200, 75, 30);

        ButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonLimpar);
        ButtonLimpar.setBounds(620, 200, 80, 30);

        JTabCadastro.setBackground(new java.awt.Color(82, 203, 248));
        JTabCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabCadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTabCadastro);
        if (JTabCadastro.getColumnModel().getColumnCount() > 0) {
            JTabCadastro.getColumnModel().getColumn(0).setMinWidth(50);
            JTabCadastro.getColumnModel().getColumn(0).setPreferredWidth(100);
            JTabCadastro.getColumnModel().getColumn(0).setMaxWidth(150);
            JTabCadastro.getColumnModel().getColumn(1).setMinWidth(300);
            JTabCadastro.getColumnModel().getColumn(1).setMaxWidth(700);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 680, 107);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(617, 360, 80, 25);

        jPanel1.setBackground(new java.awt.Color(82, 203, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Código");

        TextCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ButtonPesqCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPesqCod.setText("Buscar");
        ButtonPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesqCodActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nome");

        TextNomeCons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ButtonPesqNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPesqNome.setText("Buscar");
        ButtonPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesqNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(360, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextNomeCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesqCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextNomeCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesqNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 390, 680, 110);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(430, 200, 73, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(719, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesqNomeActionPerformed
        if(TextNomeCons.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite o que esta procurando");
        }else{
            BuscaTabela();
        }
    }//GEN-LAST:event_ButtonPesqNomeActionPerformed

    private void ButtonPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesqCodActionPerformed
        if(TextCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Escolha um codigo");
        }
        else{
            try{
                c = daoCategoria.getCategoriaByCodigo(Integer.parseInt(TextCodigo.getText()));
                if(c == null){
                    JOptionPane.showMessageDialog(null, "Usuario não encontrado");
                }
                else{
                    TextCod.setText(String.valueOf(c.getCodigo()));
                    TextNome.setText(c.getNome());
                    BuscaCodigo();
                    alterar();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
           
        }
    }//GEN-LAST:event_ButtonPesqCodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizarTabela();
        limpar();
        inicio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTabCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabCadastroMouseClicked
        if (JTabCadastro.getSelectedRow() != -1) {
            TextCodigo.setText(JTabCadastro.getValueAt(JTabCadastro.getSelectedRow(), 0).toString());
            TextCod.setText(JTabCadastro.getValueAt(JTabCadastro.getSelectedRow(), 0).toString());
            TextNome.setText(JTabCadastro.getValueAt(JTabCadastro.getSelectedRow(), 1).toString());
            alterar();
        }
    }//GEN-LAST:event_JTabCadastroMouseClicked

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limpar();
        inicio();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvar1ActionPerformed
        if(!TextNome.getText().isEmpty()){
            int s = JOptionPane.showConfirmDialog(null,"------- Salvar Como ------\nNome: "+TextNome.getText());
            if(s==0){
            c = new Categoria();
            c.setNome(TextNome.getText());
            try {
                daoCategoria.salvar(c);
            } catch (SQLException ex) {
                Logger.getLogger(View_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpar();
            atualizarTabela();
            }
        }else{
            JOptionPane.showMessageDialog(null, "A dados a serem inceridos");
        }
    }//GEN-LAST:event_ButtonSalvar1ActionPerformed

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Realizar Registro?");
        if (i == 0) {
        limpar();
        campo(false,true);
        botao(false, true, true, true, false, true, true);
        }
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void ButtonSalvarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarAlterarActionPerformed
        if (!TextNome.getText().isEmpty()) {
          int s = JOptionPane.showConfirmDialog(null,"------- Alterar Como ------\nNome: "+TextNome.getText());
           if(s==0){         
            c = new Categoria();
            c.setCodigo(Integer.parseInt(TextCod.getText()));
            c.setNome(TextNome.getText());
            try {
                daoCategoria.getAlterar(c);
            } catch (SQLException ex) {
                Logger.getLogger(View_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            atualizarTabela();
            limpar();
           }
        }
    }//GEN-LAST:event_ButtonSalvarAlterarActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?") == 0)
        {
            this.dispose();
        }
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        campo(false, true);
        botao(false, false, true, true, true, true, true);
    }//GEN-LAST:event_jButton3ActionPerformed
        private void limpar(){
        inicio();
        TextCodigo.setText("");
        TextCod.setText("");
        TextNome.setText("");
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(View_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(View_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(View_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(View_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View_Categoria().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonPesqCod;
    private javax.swing.JButton ButtonPesqNome;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JButton ButtonSalvar1;
    private javax.swing.JButton ButtonSalvarAlterar;
    private javax.swing.JTable JTabCadastro;
    private javax.swing.JTextField TextCod;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextNomeCons;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
