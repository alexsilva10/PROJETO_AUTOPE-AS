/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.Produto_Model;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author ALEX DIAS
 */
public class Produto_Dao {
    PreparedStatement pst;
    String sql;
    Dao_CadastroCategoria categoria = new Dao_CadastroCategoria();
    Dao_CadastroFornecedores fornecedor = new Dao_CadastroFornecedores();

    public void salvar(Produto_Model produto) throws SQLException {
        int ID = 0;
        sql = "INSERT INTO produto values(?,?,?,?,?,?,?,?,?,?,?,now(),?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getDescricao());
        pst.setInt(3, produto.getCategoriaprod().getCodigo());
        pst.setString(4, produto.getCodigobarras());
        pst.setDouble(5, produto.getPrecovenda());
        pst.setDouble(6, produto.getPrecocusto());
        pst.setDouble(7, produto.getMargemlucro());
        pst.setString(8, produto.getUnidademedida());
        pst.setString(9,produto.getLocalizacao());
        pst.setInt(10, produto.getFornecedorprod().getCodigo());
        pst.setString(11, produto.getMarca());
        //pst.setDate(12, new java.sql.Date(produto.getDatacadastro().getTime()));
        pst.setInt(12, produto.getEstoque());
        pst.setDate(13, null);

        pst.execute();
        pst.close();

    }
    
    public void alterar(Produto_Model produto) throws SQLException {

        sql = "Update produto  set Descricao=?, Categoriaprod=?, Codigobarras=?,"
                + " Precovenda=?, Precocusto=?, Margemlucro=?, Unidademedida=?, Localizacao=?, "
                + "Fornecedorprod=?, Marca=?, Estoque=?, where ID=?";
         pst.setInt(1, 0);
        pst.setString(2, produto.getDescricao());
        pst.setInt(3, produto.getCategoriaprod().getCodigo());
        pst.setString(4, produto.getCodigobarras());
        pst.setDouble(5, produto.getPrecovenda());
        pst.setDouble(6, produto.getPrecocusto());
        pst.setDouble(7, produto.getMargemlucro());
        pst.setString(8, produto.getUnidademedida());
        pst.setString(9,produto.getLocalizacao());
        pst.setInt(10, produto.getFornecedorprod().getCodigo());
        pst.setString(11, produto.getMarca());
        //pst.setDate(12, new java.sql.Date(produto.getDatacadastro().getTime()));
        pst.setInt(13, produto.getEstoque());
        //pst.setDate(14, new java.sql.Date(produto.getDataultvenda().getTime()));
   
        pst.setInt(13, produto.getIDproduto());
        pst.execute();
        pst.close();
    }
    
    public Produto_Model buscaProdutoID(int ID) throws SQLException {
        Produto_Model produto = null;
        sql = ("Select * from produto where ID= " + ID);
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);

        ResultSet rs = pst.getResultSet();
        while (rs.next()) {        
        produto = new Produto_Model(rs.getInt("ID"), rs.getString("Descricao"),
        categoria.getCategoriaByCodigo(rs.getInt("id_categoria")), rs.getString("Codigobarras"),
        rs.getDouble("Precovenda"), rs.getDouble("Precocusto"), rs.getDouble("Margemlucro"), rs.getString("Unidademedida"),
        rs.getString("Localizacao"),fornecedor.getUsuarioByCodigo(rs.getInt("id_fornecedor")),
        rs.getString("Marca"), rs.getDate("Datacadastro"),rs.getInt("estoque"));
        }
        pst.close();
        return produto;
    }
    
    public void excluir(int ID) throws SQLException {
        sql = " delete from produto where ID= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, ID);
        pst.execute();
        pst.close();
    }
    
     public String validarNomeProduto(String Descricao) throws SQLException {

        String resposta = new String();
        String sql = "select Descricao from produto where Descricao =?";

        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, Descricao);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            resposta = rs.getString("Descricao");
        }
        rs.close();
        pst.close();

        return resposta;
    }
    
    public List<Produto_Model> todosProdutos() throws SQLException {
        Produto_Model produto;
        List<Produto_Model> produtos = new ArrayList<>();
        
        sql = "Select * from produto order by Descricao";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
        produto = new Produto_Model(rs.getInt("id"), rs.getString("descricao"),
        categoria.getCategoriaByCodigo(rs.getInt("id_categoria")), rs.getString("Codigobarras"),
        rs.getDouble("Precovenda"), rs.getDouble("Precocusto"), rs.getDouble("Margemlucro"), rs.getString("Unidademedida"),
        rs.getString("Localizacao"),fornecedor.getUsuarioByCodigo(rs.getInt("id_fornecedor")),
        rs.getString("Marca"), rs.getDate("Datacadastro"),rs.getInt("estoque"));
        
        produtos.add(produto);
        }
        
        pst.close();

        return produtos;
    }

    public Produto_Model getProdutoById(int ID) throws SQLException {
        Produto_Model produto = null;
        sql = "Select * from produto where ID=?";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, ID);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {           
        produto = new Produto_Model(rs.getInt("id"), rs.getString("Descricao"),
        categoria.getCategoriaByCodigo(rs.getInt("id_categoria")), rs.getString("Codigobarras"),
        rs.getDouble("Precovenda"), rs.getDouble("Precocusto"), rs.getDouble("Margemlucro"), rs.getString("Unidademedida"),
        rs.getString("Localizacao"),fornecedor.getUsuarioByCodigo(rs.getInt("id_fornecedor")),
        rs.getString("Marca"), rs.getDate("Datacadastro"),rs.getInt("estoque"));
        }
      pst.close();

        return produto;
    } 
    
            public boolean gerarRelatorioProduto() throws SQLException, JRException, IOException {
                sql = "SELECT\n" +
            "     *,\n" +
            "     produto.`descricao`,\n" +
            "     categoria.`nome`,\n" +
            "     produto.`localizacao`,\n" +
            "     fornecedores.`razao`,\n" +
            "     produto.`id_categoria` AS produto_id_categoria,\n" +
            "     produto.`codigobarras` AS produto_codigobarras,\n" +
            "     produto.`precovenda` AS produto_precovenda,\n" +
            "     produto.`precocusto` AS produto_precocusto,\n" +
            "     produto.`margemlucro` AS produto_margemlucro,\n" +
            "     produto.`UnidadeMedida` AS produto_UnidadeMedida,\n" +
            "     produto.`id_fornecedor` AS produto_id_fornecedor,\n" +
            "     produto.`marca` AS produto_marca,\n" +
            "     produto.`Datacadastro` AS produto_Datacadastro,\n" +
            "     produto.`estoque` AS produto_estoque,\n" +
            "     produto.`dataUltvenda` AS produto_dataUltvenda,\n" +
            "     categoria.`codigo` AS categoria_codigo,\n" +
            "     fornecedores.`codigo` AS fornecedores_codigo,\n" +
            "     fornecedores.`nomeFantasia` AS fornecedores_nomeFantasia,\n" +
            "     fornecedores.`CNPJ_CPF` AS fornecedores_CNPJ_CPF,\n" +
            "     fornecedores.`Inscricao_RG` AS fornecedores_Inscricao_RG,\n" +
            "     fornecedores.`rua` AS fornecedores_rua,\n" +
            "     fornecedores.`numero` AS fornecedores_numero,\n" +
            "     fornecedores.`complemento` AS fornecedores_complemento,\n" +
            "     fornecedores.`bairro` AS fornecedores_bairro,\n" +
            "     fornecedores.`cidade` AS fornecedores_cidade,\n" +
            "     fornecedores.`estado` AS fornecedores_estado,\n" +
            "     fornecedores.`cep` AS fornecedores_cep,\n" +
            "     fornecedores.`banco` AS fornecedores_banco,\n" +
            "     fornecedores.`agencia` AS fornecedores_agencia,\n" +
            "     fornecedores.`conta` AS fornecedores_conta,\n" +
            "     fornecedores.`telefone` AS fornecedores_telefone,\n" +
            "     fornecedores.`telefone2` AS fornecedores_telefone2,\n" +
            "     fornecedores.`email` AS fornecedores_email,\n" +
            "     fornecedores.`dataCadastro` AS fornecedores_dataCadastro,\n" +
            "     produto.`id`\n" +
            "FROM\n" +
            "     `produto` produto INNER JOIN `categoria` categoria ON produto.`id_categoria` = categoria.`codigo`\n" +
            "     INNER JOIN `fornecedores` fornecedores ON produto.`id_fornecedor` = fornecedores.`codigo`";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(pst.getResultSet());
        
        InputStream caminho = this.getClass().getClassLoader().getResourceAsStream("relatorios/produto.jasper");
        JasperPrint jasper = JasperFillManager.fillReport(caminho, new HashMap(),jrRS);
        JasperExportManager.exportReportToPdfFile(jasper,"C:/Users/User/Downloads/jcalendar-1.1.4.jar/produto.pdf");
        File file =new File("C:/Users/User/Downloads/jcalendar-1.1.4.jar/produto.pdf");
        Desktop.getDesktop().open(file);
        file.deleteOnExit();
        
        pst.close();
        return true;
    }
}
