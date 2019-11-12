package View;


import Controller.ControllerProduto;
import Dao.Dao_CadastroCategoria;
import Dao.Dao_CadastroFornecedores;
import Dao.Produto_Dao;
import Model.Categoria;
import Model.Fornecedor;
import Model.Produto_Model;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class Produto_View extends javax.swing.JInternalFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    Produto_Model produto;
    Produto_Dao prod_Dao;
    
    Dao_CadastroCategoria categoria_Dao;
    List<Categoria> categoria;
    Dao_CadastroFornecedores fornecedores_Dao;
    List<Fornecedor> fornecedores;
    
    List<Produto_Model> produtos;
    DefaultTableModel modelo = new DefaultTableModel();
    
    String user = "";
    String user2;
    
    public Produto_View() {
        initComponents();
        prod_Dao = new Produto_Dao();
        categoria_Dao = new Dao_CadastroCategoria();
        categoria = new ArrayList<>();
        fornecedores_Dao = new Dao_CadastroFornecedores();
        fornecedores = new ArrayList<>();
         
        initComponents();
        this.setVisible(true);
        Campos(false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        
        Campos_Botão(true, false, false, false, false,true,false);
        atualizarTabela();
        preencheComboCategoria();
        preencheComboFornecedor();
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
        TxtCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TxtCodigoDeBarras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPrecoVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPrecoCusto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtMargemlucro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtUnidademedida = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TxtLocaliza = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtFornecedor = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TxtMarca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtDtcadastro = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtDtutlvenda = new javax.swing.JFormattedTextField();
        Btn_Novo = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Alterar = new javax.swing.JButton();
        Btn_Limpar = new javax.swing.JButton();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Produto = new javax.swing.JTable();
        ButtonSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de produtos");
        setPreferredSize(new java.awt.Dimension(1078, 637));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 149, 255));
        jPanel1.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel26.setText("ID:");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(20, 20, 16, 20);
        jPanel1.add(TxtID);
        TxtID.setBounds(40, 20, 130, 20);

        Btn_Pesquisar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_16px_1.png"))); // NOI18N
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
        jLabel1.setBounds(50, 60, 60, 20);
        jPanel1.add(TxtDescricao);
        TxtDescricao.setBounds(120, 60, 350, 20);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel2.setText("Categoria:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 90, 60, 20);

        TxtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCategoria);
        TxtCategoria.setBounds(120, 90, 160, 20);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel3.setText("Código de barras:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(750, 90, 100, 20);
        jPanel1.add(TxtCodigoDeBarras);
        TxtCodigoDeBarras.setBounds(860, 90, 130, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel4.setText("Preço de venda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 100, 20);
        jPanel1.add(TxtPrecoVenda);
        TxtPrecoVenda.setBounds(120, 120, 130, 20);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel5.setText("Preço de custo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 120, 100, 20);

        TxtPrecoCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecoCustoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPrecoCusto);
        TxtPrecoCusto.setBounds(350, 120, 120, 20);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel6.setText("Margem de lucro:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 120, 110, 20);
        jPanel1.add(TxtMargemlucro);
        TxtMargemlucro.setBounds(590, 120, 150, 20);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel7.setText("Unidade de medida:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 60, 120, 20);

        TxtUnidademedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(TxtUnidademedida);
        TxtUnidademedida.setBounds(600, 60, 140, 20);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel8.setText("Localização:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(780, 120, 80, 20);
        jPanel1.add(TxtLocaliza);
        TxtLocaliza.setBounds(860, 120, 130, 20);

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel9.setText("Fornecedor:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 90, 80, 20);

        jPanel1.add(TxtFornecedor);
        TxtFornecedor.setBounds(560, 90, 180, 20);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel10.setText("Marca:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(760, 60, 50, 20);
        jPanel1.add(TxtMarca);
        TxtMarca.setBounds(810, 60, 180, 20);

        jLabel11.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel11.setText("Data de cadastro:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 150, 100, 20);

        try {
            TxtDtcadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(TxtDtcadastro);
        TxtDtcadastro.setBounds(120, 150, 130, 20);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel12.setText("Estoque:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 90, 50, 20);
        jPanel1.add(TxtEstoque);
        TxtEstoque.setBounds(350, 90, 120, 20);

        jLabel13.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel13.setText("Data última venda:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(270, 150, 110, 20);

        try {
            TxtDtutlvenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(TxtDtutlvenda);
        TxtDtutlvenda.setBounds(380, 150, 210, 20);

        Btn_Novo.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_16px.png"))); // NOI18N
        Btn_Novo.setText("Novo");
        Btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NovoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Novo);
        Btn_Novo.setBounds(10, 200, 90, 30);

        Btn_Cancelar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_2_16px.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cancelar);
        Btn_Cancelar.setBounds(120, 200, 103, 30);

        Btn_Alterar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_16px.png"))); // NOI18N
        Btn_Alterar.setText("Alterar");
        Btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AlterarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Alterar);
        Btn_Alterar.setBounds(780, 200, 110, 30);

        Btn_Limpar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_broom_16px_4.png"))); // NOI18N
        Btn_Limpar.setText("Limpar");
        Btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimparActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Limpar);
        Btn_Limpar.setBounds(260, 200, 110, 30);

        Btn_Excluir.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_16px.png"))); // NOI18N
        Btn_Excluir.setText("Excluir");
        Btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Excluir);
        Btn_Excluir.setBounds(610, 200, 100, 30);

        Btn_Salvar.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        Btn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_16px_1.png"))); // NOI18N
        Btn_Salvar.setText("Salvar");
        Btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalvarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Salvar);
        Btn_Salvar.setBounds(910, 200, 100, 30);

        Tabela_Produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descricao", "Categoria", "Cod.barras"
            }
        ));
        Tabela_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Produto);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 980, 310);

        ButtonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_window_40px_2.png"))); // NOI18N
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSair);
        ButtonSair.setBounds(1020, 0, 40, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_activity_history_16px.png"))); // NOI18N
        jButton1.setText("Relatorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 200, 95, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void preencheComboCategoria(){
    
        try {
            categoria = categoria_Dao.todosUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Categoria categoria : categoria){
            TxtCategoria.addItem(categoria.getNome());
        }
    }
     
     public void preencheComboFornecedor(){
        try {
            fornecedores = fornecedores_Dao.todosUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Fornecedor fornecedores : fornecedores){
            TxtFornecedor.addItem(fornecedores.getNomeFantasia());
        }
    }
    
    public void Limpar()
    {
        TxtID.setText(""); 
        TxtCategoria.setSelectedItem("");
        TxtCodigoDeBarras.setText("");
        TxtDescricao.setText("");
        TxtDtcadastro.setText("");
        TxtDtutlvenda.setText("");
        TxtEstoque.setText("");
        TxtFornecedor.setSelectedItem("");
        TxtLocaliza.setText("");
        TxtMarca.setText("");
        TxtMargemlucro.setText("");
        TxtPrecoCusto.setText("");
        TxtPrecoVenda.setText("");
        TxtUnidademedida.setSelectedItem("Selecionar");
         
    }
 public void Campos(boolean Id, boolean Mat, boolean Nom, boolean Estc, boolean Dtnasc, boolean Sex, boolean Cpf, boolean Tel, boolean Cel, boolean Emai,boolean Bair, boolean Rua, boolean Num,
         boolean Cid )
    {
      
        TxtID.setEnabled(Id);
        TxtDescricao.setEnabled(Mat);
        TxtCategoria.setEnabled(Nom);
        TxtCodigoDeBarras.setEnabled(Estc);
        TxtPrecoVenda.setEnabled(Dtnasc);
        TxtPrecoCusto.setEnabled(Sex);
        TxtMargemlucro.setEnabled(Cpf);
        TxtUnidademedida.setEnabled(Tel);
        TxtLocaliza.setEnabled(Cel);
        TxtFornecedor.setEnabled(Emai);
        TxtMarca.setEnabled(Bair);
        TxtDtcadastro.setEnabled(Rua);
        TxtEstoque.setEnabled(Num);
        TxtDtutlvenda.setEnabled(Cid);
        
    }
 
 public void Campos_Botão( boolean BtNov,boolean BtLim,boolean BtAlt, boolean BtExc, boolean BtSal, boolean BtPesq, boolean BtCanc)
    {
       
       Btn_Novo.setEnabled(BtNov);
       Btn_Limpar.setEnabled(BtLim);
       Btn_Alterar.setEnabled(BtAlt);
       Btn_Excluir.setEnabled(BtExc);
       Btn_Salvar.setEnabled(BtSal);
       Btn_Pesquisar.setEnabled(BtPesq);
       Btn_Cancelar.setEnabled(BtCanc);
    }
 
    
    private void Btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PesquisarActionPerformed

        String ID = JOptionPane.showInputDialog("Digite o ID do Produto: ");
        produto = new Produto_Model();
  
            try {
               produto = new ControllerProduto().retornaProduto(Integer.parseInt(TxtID.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    if(produto == null)
    {
         JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
    }
               Campos(false, true, true, true, true, true, true, true, true, true, true, true, true, true);          
               Campos_Botão(false, true, true, true, false, false,true);
            
                TxtID.setText(ID);
                TxtDescricao.setText(produto.getDescricao());
                TxtCategoria.setSelectedItem(produto.getCategoriaprod().getNome());
                TxtCodigoDeBarras.setText(produto.getCodigobarras());
                TxtPrecoVenda.setText(String.valueOf(produto.getPrecovenda()));
                TxtPrecoCusto.setText(String.valueOf(produto.getPrecocusto()));
                TxtMargemlucro.setText(String.valueOf(produto.getMargemlucro()));
                TxtUnidademedida.setSelectedItem(produto.getCodigobarras());
                TxtLocaliza.setText(produto.getLocalizacao());
                TxtFornecedor.setSelectedItem(produto.getFornecedorprod().getNomeFantasia());
                TxtMarca.setText(produto.getMarca());
                TxtDtcadastro.setText(sdf.format(produto.getDatacadastro()));
                TxtEstoque.setText(String.valueOf(produto.getEstoque()));
                TxtDtutlvenda.setText(sdf.format(produto.getDataultvenda()));
                
                user = produto.getDescricao();
        
    }//GEN-LAST:event_Btn_PesquisarActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
       Campos(false, false, false, false, false, false, false, false, false, false, false, false, false, false);

        Campos_Botão(true, false, false, false, false,true,false);
        Limpar();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NovoActionPerformed
        Campos(false, true, true, true, true, true, true, true, true, true, true, false, true, false);
        Campos_Botão(false, false, false, false, true, false, true);
        Limpar();
    }//GEN-LAST:event_Btn_NovoActionPerformed

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
     try {
            if (TxtDescricao.getText().isEmpty() || TxtCategoria.getSelectedItem().equals("") || TxtCodigoDeBarras.getText().isEmpty() || TxtPrecoVenda.getText().isEmpty() || TxtPrecoCusto.getText().isEmpty() || TxtMargemlucro.getText().isEmpty() ||
                     TxtUnidademedida.getSelectedItem().equals("Selecionar") || TxtLocaliza.getText().isEmpty() || TxtFornecedor.getSelectedItem().equals("") || TxtMarca.getText().isEmpty() || TxtEstoque.getText().isEmpty())
                {    
                 JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                 TxtDescricao.requestFocusInWindow();
                } 
                           
             else {           
                 user2 = prod_Dao.validarNomeProduto(TxtDescricao.getText());          
                 if (!user.equals(TxtDescricao.getText()) && user2.equals(TxtDescricao.getText())) {           
                     JOptionPane.showMessageDialog(null, "Já existe um cargo com este nome");
                            } 
                            
                        else{  
                                produto.setDescricao(TxtDescricao.getText());
                                
                                produto.setCategoriaprod(categoria.get(TxtCategoria.getSelectedIndex()));
                                
                                produto.setCodigobarras(TxtCodigoDeBarras.getText());
                                produto.setPrecovenda(Double.parseDouble(TxtPrecoVenda.getText()));
                                produto.setPrecocusto(Double.parseDouble(TxtPrecoCusto.getText()));
                                produto.setMargemlucro(Double.parseDouble(TxtMargemlucro.getText()));
                                produto.setUnidademedida(String.valueOf(TxtUnidademedida.getSelectedItem()));
                                produto.setLocalizacao(TxtLocaliza.getText());
                                produto.setFornecedorprod(fornecedores.get(TxtFornecedor.getSelectedIndex()));
                                produto.setMarca(TxtMarca.getText());
                                //produto.setDatacadastro(sdf.parse(TxtDtcadastro.getText()));
                                produto.setEstoque(Integer.parseInt(TxtEstoque.getText()));
                                //produto.setDataultvenda(sdf.parse(TxtDtutlvenda.getText()));
                                    try {
                                        prod_Dao.salvar(produto);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                   

                                    JOptionPane.showMessageDialog(null, "Gravado com Sucesso");
                                    atualizarTabela();
                                    Campos(false, false, false, false, false, false, false, false, false, false, false, false, false, false);   
                                    Campos_Botão(true, false, false, false, false,true,false);
                            }                                   
                        }     
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO!");
            ex.printStackTrace();

                }
     
     
    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void Btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimparActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Limpar os Dados!");       
               if( i == 0 )
                {
                    Limpar();
                    Campos(false, false, false, false, false, false, false, false, false, false, false, false, false, false);

                    Campos_Botão(true, false, false, false, false, true,true);
                }
    }//GEN-LAST:event_Btn_LimparActionPerformed

    private void Btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExcluirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir os Dados!");
            if( i == 0 )
            {
                 try 
                {  
                  prod_Dao.excluir(Integer.parseInt(TxtID.getText()));
                  atualizarTabela();
                  Limpar();
                  JOptionPane.showMessageDialog(null, "Removido com Sucesso"); 
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO!");
                        e.printStackTrace();
                    }
            }
    }//GEN-LAST:event_Btn_ExcluirActionPerformed

    private void Btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AlterarActionPerformed
        try {
             if (TxtDescricao.getText().isEmpty() || TxtCategoria.getSelectedItem().equals("") || TxtCodigoDeBarras.getText().isEmpty() || TxtPrecoVenda.getText().isEmpty() || TxtPrecoCusto.getText().isEmpty() || TxtMargemlucro.getText().isEmpty() ||
                     TxtUnidademedida.getSelectedItem().equals("Selecionar") || TxtLocaliza.getText().isEmpty() || TxtFornecedor.getSelectedItem().equals("") || TxtMarca.getText().isEmpty() || TxtDtcadastro.getText().isEmpty() || TxtEstoque.getText().isEmpty() || TxtDtutlvenda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            TxtDescricao.requestFocusInWindow();
                } 
            
             else {
                            user2 = prod_Dao.validarNomeProduto(TxtDescricao.getText());
                            if (!user.equals(TxtDescricao.getText()) && user2.equals(TxtDescricao.getText())) {
                                JOptionPane.showMessageDialog(null, "Já existe um produto com este nome");
                            }  else {
                                
                              produto = new Produto_Model();
                                
                                produto.setIDproduto(Integer.parseInt(TxtID.getText()));
                                produto.setDescricao(TxtDescricao.getText());
                                produto.setCategoriaprod(categoria.get(TxtCategoria.getSelectedIndex()));
                                produto.setCodigobarras(TxtCodigoDeBarras.getText());
                                produto.setPrecovenda(Double.parseDouble(TxtPrecoVenda.getText()));
                                produto.setPrecocusto(Double.parseDouble(TxtPrecoCusto.getText()));
                                produto.setMargemlucro(Double.parseDouble(TxtMargemlucro.getText()));
                                produto.setUnidademedida(String.valueOf(TxtUnidademedida.getSelectedItem()));
                                produto.setLocalizacao(TxtLocaliza.getText());
                                produto.setFornecedorprod(fornecedores.get(TxtFornecedor.getSelectedIndex()));
                                produto.setMarca(TxtMarca.getText());
                                produto.setDatacadastro(sdf.parse(TxtDtcadastro.getText()));
                                produto.setEstoque(Integer.parseInt(TxtEstoque.getText()));
                                produto.setDataultvenda(sdf.parse(TxtDtutlvenda.getText()));
                               

                                int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os Dados!");   
                                if( i == 0 )
                                { 
                                prod_Dao.alterar(produto);
                                
                                JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                                atualizarTabela();
                                Limpar(); 
                                }
                            }
 
            }

        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO!");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_Btn_AlterarActionPerformed
//
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked
//
    private void Tabela_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ProdutoMouseClicked
        int i = 0;
        Tabela_Produto.getModel();
        TxtID.setText(modelo.getValueAt(Tabela_Produto.getSelectedRow(), 0).toString());
        try {
             Campos(false, true, true, true, true, true, false, true, true, true, true, true, true, true);        
             Campos_Botão(false, true, true, true, false, true,true);
            
                produto = new ControllerProduto().retornaProduto(Integer.parseInt(TxtID.getText()));
                
                TxtDescricao.setText(produto.getDescricao());

                TxtCategoria.setSelectedItem(produto.getCategoriaprod().getNome());
                
                TxtCodigoDeBarras.setText(produto.getCodigobarras());
                TxtPrecoVenda.setText(String.valueOf(produto.getPrecovenda()));
                TxtPrecoCusto.setText(String.valueOf(produto.getPrecocusto()));
                TxtMargemlucro.setText(String.valueOf(produto.getMargemlucro()));
                TxtUnidademedida.setSelectedItem(produto.getCodigobarras());
                TxtLocaliza.setText(produto.getLocalizacao());
                
                TxtFornecedor.setSelectedItem(produto.getFornecedorprod().getNomeFantasia());
                TxtMarca.setText(produto.getMarca());
                TxtDtcadastro.setText(sdf.format(produto.getDatacadastro()));
                TxtEstoque.setText(String.valueOf(produto.getEstoque()));
                //TxtDtutlvenda.setText(sdf.format(produto.getDataultvenda()));

                user = produto.getDescricao();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Tabela_ProdutoMouseClicked

    private void TxtPrecoCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecoCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecoCustoActionPerformed

    private void TxtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCategoriaActionPerformed

    }//GEN-LAST:event_TxtCategoriaActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?") == 0)
        {
            this.dispose();
        }
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        try {
            prod_Dao.gerarRelatorioProduto();
        } catch (SQLException ex) {
            Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Produto_View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

     public void atualizarTabela() {
        produto = new Produto_Model();
        try {
            produtos = prod_Dao.todosProdutos();
            String dados[][] = new String[produtos.size()][7];
            int i = 0;
            for (Produto_Model u : produtos) {
                dados[i][0] = String.valueOf(u.getIDproduto());
                dados[i][1] = u.getDescricao();
                dados[i][2] = u.getUnidademedida();
                dados[i][3] = String.valueOf(u.getCategoriaprod().getNome());
                dados[i][4] = u.getCodigobarras();
                dados[i][5] = String.valueOf(u.getPrecocusto());
                dados[i][6] = u.getFornecedorprod().getNomeFantasia();
                i++;
            }
            String tituloColuna[] = {"ID", "Descrição", "UniMedida","Categoria", "Cod.barras", "Preço","Fornecedor"};
            modelo.setDataVector(dados, tituloColuna);
            Tabela_Produto.setModel(modelo);
            Tabela_Produto.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Alterar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Excluir;
    private javax.swing.JButton Btn_Limpar;
    private javax.swing.JButton Btn_Novo;
    private javax.swing.JButton Btn_Pesquisar;
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JTable Tabela_Produto;
    private javax.swing.JComboBox<String> TxtCategoria;
    private javax.swing.JTextField TxtCodigoDeBarras;
    private javax.swing.JTextField TxtDescricao;
    private javax.swing.JFormattedTextField TxtDtcadastro;
    private javax.swing.JFormattedTextField TxtDtutlvenda;
    private javax.swing.JTextField TxtEstoque;
    private javax.swing.JComboBox<String> TxtFornecedor;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtLocaliza;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtMargemlucro;
    private javax.swing.JTextField TxtPrecoCusto;
    private javax.swing.JTextField TxtPrecoVenda;
    private javax.swing.JComboBox<String> TxtUnidademedida;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
