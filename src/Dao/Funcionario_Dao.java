package Dao;

import Model.Funcionario_Model;
import java.io.Serializable;
import java.sql.Date;
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
        int ID = 0;
        sql = "INSERT INTO funcionario values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, funcionario.getMatricula());
        pst.setString(3, funcionario.getNome());
         pst.setString(4, funcionario.getEstadocivil());
        pst.setDate(5, new java.sql.Date(funcionario.getDatanascimento().getTime()));
        pst.setString(6, funcionario.getSexo());
        pst.setString(7, funcionario.getCPF());
        pst.setString(8, funcionario.getTelefone());
        pst.setString(9, funcionario.getCelular());
        pst.setString(10, funcionario.getEmail());
        pst.setString(11, funcionario.getBairro());
        pst.setString(12, funcionario.getRua());
        pst.setInt(13, funcionario.getNumero());
        pst.setString(14, funcionario.getCidade());
        pst.setString(15, funcionario.getCep());
        pst.setString(16, funcionario.getEstado());
        pst.setString(17, funcionario.getComplemento());
        pst.setString(18, funcionario.getEscolaridade());
        pst.setString(19, funcionario.getRG());
        pst.setDate(20, new java.sql.Date(funcionario.getDataadmissao().getTime()));
        pst.setString(21, funcionario.getSalarioadmissao());
        pst.setDate(22, new java.sql.Date(funcionario.getDatademissao().getTime()));
        pst.setString(23, funcionario.getSalarioatual());
        pst.setInt(24, funcionario.getCargo().getID());
        pst.setString(25, funcionario.getStatus());
       
       
        pst.execute();
        pst.close();

    }
    
    public void alterar(Funcionario_Model funcionario) throws SQLException {

        sql = "Update funcionario  set Matricula=?, Nome=?, Estadocivil=?, Datanascimento=?, Sexo=?, CPF=?, Telefone=?, Celular=?, Email=?, Bairro=?, Rua=?, Numero=?, Cidade=?,Cep=?, Estado=?, Complemento=?, Escolaridade=?, RG=?, Datademissao=?,Salarioadmissao=?,Datademissao=?, Salarioatual=?, Cargo=?, Status=?  where ID=?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, funcionario.getMatricula());
        pst.setString(2, funcionario.getNome());
         pst.setString(3, funcionario.getEstadocivil());
        pst.setDate(4,new java.sql.Date(funcionario.getDatanascimento().getTime()));
        pst.setString(5, funcionario.getSexo());
        pst.setString(6, funcionario.getCPF());
        pst.setString(7, funcionario.getTelefone());
        pst.setString(8, funcionario.getCelular());
        pst.setString(9, funcionario.getEmail());
        pst.setString(10, funcionario.getBairro());
        pst.setString(11, funcionario.getRua());
        pst.setInt(12, funcionario.getNumero());
        pst.setString(13, funcionario.getCidade());
        pst.setString(14, funcionario.getCep());
        pst.setString(15, funcionario.getEstado());
        pst.setString(16, funcionario.getComplemento());
        pst.setString(17, funcionario.getEscolaridade());
        pst.setString(18, funcionario.getRG());
        pst.setDate(19,new java.sql.Date(funcionario.getDataadmissao().getTime()));
        pst.setString(20, funcionario.getSalarioadmissao());
        pst.setDate(21,new java.sql.Date(funcionario.getDatademissao().getTime()));
        pst.setString(22, funcionario.getSalarioatual());
        pst.setInt(23, funcionario.getCargo().getID());
        pst.setString(24, funcionario.getStatus());
        
        pst.setInt(25, funcionario.getID());
        pst.execute();
        pst.close();
    }
    
    public Funcionario_Model buscaFuncionarioID(int ID) throws SQLException {
        Funcionario_Model funcionario = null;
        sql = ("Select * from funcionario where ID= " + ID);
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);

        ResultSet rs = pst.getResultSet();
        while (rs.next()) {        
funcionario = new Funcionario_Model(rs.getInt("ID"), rs.getString("Matricula"), rs.getString("Nome"), rs.getString("Estadocivil"),
        rs.getDate("Datanascimento"), rs.getString("Sexo"), rs.getString("CPF"), rs.getString("Telefone"),
        rs.getString("Celular"), rs.getString("Email"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getInt("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento"), rs.getString("Escolaridade"), 
        rs.getString("RG"), rs.getDate("Dataadmissao"), rs.getString("Salarioadmissao"), rs.getDate("Datademissao"), rs.getString("Salarioatual"),
        rs.getString("Status"));
        }
        pst.close();
        return funcionario;
    }
    
    public void excluir(int codigo) throws SQLException {
        sql = " delete from funcionario where ID= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, codigo);
        pst.execute();
        pst.close();

    }
    
     public String validarNomeUsuario(String Nomecliente) throws SQLException {

        String resposta = new String();
        String sql = "select Nome from funcionario where Nome =?";

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

        funcionario = new Funcionario_Model(rs.getInt("ID"), rs.getString("Matricula"), rs.getString("Nome"), rs.getString("Estadocivil"),
        rs.getDate("Datanascimento"), rs.getString("Sexo"), rs.getString("CPF"), rs.getString("Telefone"),
        rs.getString("Celular"), rs.getString("Email"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getInt("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento"), rs.getString("Escolaridade"), 
        rs.getString("RG"), rs.getDate("Dataadmissao"), rs.getString("Salarioadmissao"), rs.getDate("Datademissao"), rs.getString("Salarioatual"),
        rs.getString("Status"));
        
          funcionarios.add(funcionario);
        }
        
        pst.close();

        return funcionarios;
    }

    public Funcionario_Model getFuncionarioById(int ID) throws SQLException {
        Funcionario_Model funcionario = null;
        sql = "Select * from funcionario where ID=?";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, ID);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            
        funcionario = new Funcionario_Model(rs.getInt("ID"), rs.getString("Matricula"), rs.getString("Nome"), rs.getString("Estadocivil"),
        rs.getDate("Datanascimento"), rs.getString("Sexo"), rs.getString("CPF"), rs.getString("Telefone"),
        rs.getString("Celular"), rs.getString("Email"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getInt("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento"), rs.getString("Escolaridade"), 
        rs.getString("RG"), rs.getDate("Dataadmissao"), rs.getString("Salarioadmissao"), rs.getDate("Datademissao"), rs.getString("Salarioatual"),
        rs.getString("Status"));
        
        }
      pst.close();

        return funcionario;
    }
    
    public String validarCpfFuncionario(String CPF) throws SQLException {

        String resposta = new String();
        String sql = "select CPF from funcionario where CPF =?";

        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, CPF);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            resposta = rs.getString("CPF");

        }
        rs.close();
        pst.close();

        return resposta;
    }
}
