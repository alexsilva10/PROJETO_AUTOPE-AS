package Dao;

import Model.Funcionario_Model;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Funcionario_Dao implements Serializable{
    PreparedStatement pst;
    String sql;

    public void salvar(Funcionario_Model funcionario) throws SQLException {
        int codigo = 0;
        sql = "INSERT INTO cliente values(?,?,?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, funcionario.getMatricula());
        pst.setString(3, funcionario.getNome());
         pst.setString(4, funcionario.getEstadocivil());
        pst.setDate(5,new java.sql.Date(funcionario.getDatanascimento().getTime()));
        pst.setString(6, funcionario.getSexo());
        pst.setString(7, funcionario.getCPF());
        pst.setString(8, funcionario.getTelefone());
        pst.setString(9, funcionario.getTelefoneadicional());
        pst.setString(10, funcionario.getCelular());
        pst.setString(11, funcionario.getEmail());
        pst.setString(12, funcionario.getEmailadicional());
        pst.setString(13, funcionario.getBairro());
        pst.setString(14, funcionario.getRua());
        pst.setInt(15, funcionario.getNumero());
        pst.setString(16, funcionario.getCidade());
        pst.setString(17, funcionario.getCep());
        pst.setString(18, funcionario.getEstado());
        pst.setString(19, funcionario.getComplemento());
        pst.setString(20, funcionario.getEscolaridade());
        pst.setString(21, funcionario.getRG());
        pst.setString(22, funcionario.getDataadmissao());
        pst.setString(23, funcionario.getSalarioadmissao());
        pst.setString(24, funcionario.getDatademissao());
        pst.setString(25, funcionario.getSalarioatual());
        pst.setString(26, funcionario.getCargo());
        pst.setString(27, funcionario.getStatus());
       
       
        pst.execute();
        pst.close();

    }
    
    public void alterar(Funcionario_Model funcionario) throws SQLException {

        sql = "Update funcionario  set Matricula=?, Nome=?, Estadocivil=?, Datanascimento=?, Sexo=?, CPF=? " + 
                "Telefone=?,Telefoneadicional=?, Celular=?, Email=?, Emailadicional=?, Bairro=?, Rua=?, Numero=?" +
                "Cidade=?,Cep=?, Estado=?, Complemento=?, Escolaridade=?, RG=?" +
                "Datademissao=?,Salarioadmissao=?,Datademissao=?, Salarioatual=?, Cargo=?, Status=?,  where ID=?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, funcionario.getMatricula());
        pst.setString(2, funcionario.getNome());
         pst.setString(3, funcionario.getEstadocivil());
        pst.setDate(4,new java.sql.Date(funcionario.getDatanascimento().getTime()));
        pst.setString(5, funcionario.getSexo());
        pst.setString(6, funcionario.getCPF());
        pst.setString(7, funcionario.getTelefone());
        pst.setString(8, funcionario.getTelefoneadicional());
        pst.setString(9, funcionario.getCelular());
        pst.setString(10, funcionario.getEmail());
        pst.setString(11, funcionario.getEmailadicional());
        pst.setString(12, funcionario.getBairro());
        pst.setString(13, funcionario.getRua());
        pst.setInt(14, funcionario.getNumero());
        pst.setString(15, funcionario.getCidade());
        pst.setString(16, funcionario.getCep());
        pst.setString(17, funcionario.getEstado());
        pst.setString(18, funcionario.getComplemento());
        pst.setString(19, funcionario.getEscolaridade());
        pst.setString(20, funcionario.getRG());
        pst.setString(21, funcionario.getDataadmissao());
        pst.setString(22, funcionario.getSalarioadmissao());
        pst.setString(23, funcionario.getDatademissao());
        pst.setString(24, funcionario.getSalarioatual());
        pst.setString(25, funcionario.getCargo());
        pst.setString(26, funcionario.getStatus());
        
        pst.setInt(27, funcionario.getID());
        pst.execute();
        pst.close();
    }
    
    public Funcionario_Model buscaClienteID(int ID) throws SQLException {
        Funcionario_Model funcionario = null;
        sql = ("Select * from funcionario where ID= " + ID);
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);

        ResultSet rs = pst.getResultSet();
        while (rs.next()) {        
//funcionario = new Funcionario_Model(rs.getInt("ID"), rs.getString("Matricula"), rs.getString("Enderecocliente"), rs.getString("Bairrocliente"));
        }
        pst.close();
        return funcionario;
    }
    
    public void excluir(int codigo) throws SQLException {
        sql = " delete from cliente where codigo= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, codigo);
        pst.execute();
        pst.close();

    }
    
     public String validarNomeUsuario(String Nomecliente) throws SQLException {

        String resposta = new String();
        String sql = "select Nome from cliente where Nome =?";

        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, Nomecliente);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            resposta = rs.getString("Nome");
        }
        rs.close();
        pst.close();

        return resposta;
    }
    
    public List<Funcionario_Model> todosFuncionarios() throws SQLException {
        Funcionario_Model funcionario;
        List<Funcionario_Model> funcionarios = new ArrayList<>();
        
        sql = "Select * from funcionario order by Nome";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
       
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

        // funcionario = new Funcionario_Model(rs.getInt("Codigo"), rs.getString("Nomecliente"), rs.getString("Enderecocliente"), rs.getString("Bairrocliente"));
        
          //funcionarios.add(funcionario);
        }
        
        pst.close();

        return funcionarios;
    }

    public Funcionario_Model getUsuarioById(int Codigo) throws SQLException {
        Funcionario_Model funcionario = null;
        sql = "Select * from funcionario where ID=?";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            
  //funcionario = new Funcionario_Model(rs.getInt("Codigo"), rs.getString("Nomecliente"), rs.getString("Enderecocliente"), rs.getString("Bairrocliente"));
 
        }
      pst.close();

        return funcionario;
    }
}