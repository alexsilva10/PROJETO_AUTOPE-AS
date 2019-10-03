
package Dao;

import Model.ClienteFisico;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteFisico_dao {
    PreparedStatement pst;
    String sql;
    public void salvar(ClienteFisico jur) throws SQLException{
        sql = "INSERT INTO pessoaFisica values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, jur.getMatricula());
        pst.setString(3, jur.getStatus());
        pst.setString(4, jur.getNome());
        pst.setString(5, jur.getApelido());
        pst.setString(6, jur.getEstadoCivil());
        pst.setString(7, jur.getCPF());
        pst.setString(8, jur.getRG());
        pst.setString(9, jur.getSexo());
        pst.setDate(10,new java.sql.Date(jur.getDtNasc().getTime()));
        pst.setString(11, jur.getBairro());
        pst.setString(12, jur.getRua());
        pst.setString(13, jur.getNumero());
        pst.setString(14, jur.getCidade());
        pst.setString(15, jur.getCep());
        pst.setString(16, jur.getEstado());
        pst.setString(17, jur.getComplemento());
        pst.setString(18, jur.getTelefone());
        pst.setString(19, jur.getCelular());
        pst.setString(20, jur.getEmail());
        
        pst.execute();
        pst.close();
    }
    public void alterar(ClienteFisico jur) throws SQLException {

        sql = "Update pessoaFisica  set matricula=?, estatus=?, nome=?, apelido=?, estadoCivil=?, cpf=?, rg =?, sexo=?, dtNasc=?, Bairro=?, Rua=?, Numero=?" +
                "Cidade=?,Cep=?, Estado=?, Complemento=?,Telefone=?, Celular=?, Email=?,  where Ip=?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, jur.getMatricula());
        pst.setString(2, jur.getStatus());
        pst.setString(3, jur.getNome());
        pst.setString(4, jur.getApelido());
        pst.setString(5, jur.getEstadoCivil());
        pst.setString(6, jur.getCPF());
        pst.setString(7, jur.getRG());
        pst.setString(8, jur.getSexo());
        pst.setDate(9, (Date) jur.getDtNasc());
        pst.setString(10, jur.getBairro());
        pst.setString(11, jur.getRua());
        pst.setString(12, jur.getNumero());
        pst.setString(13, jur.getCidade());
        pst.setString(14, jur.getCep());
        pst.setString(15, jur.getEstado());
        pst.setString(16, jur.getComplemento());
        pst.setString(17, jur.getTelefone());
        pst.setString(18, jur.getCelular());
        pst.setString(19, jur.getEmail());
        
        pst.setInt(20, jur.getId());
        pst.execute();
        pst.close();
    }
    public ClienteFisico buscaJuridicaID(int ID) throws SQLException {
        ClienteFisico jur = null;
        sql = ("Select * from pessoaFisica where Ip= " + ID);
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);

        ResultSet rs = pst.getResultSet();
        while (rs.next()) {        
        jur = new ClienteFisico(rs.getInt("Ip"), rs.getString("Matricula"),rs.getString("estatus"), rs.getString("nome"), rs.getString("apelido"),
        rs.getString("estadoCivil"), rs.getString("cpf"),rs.getString("rg"),rs.getString("sexo"),rs.getDate("dtNasc"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getString("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento")
        , rs.getString("Telefone"),rs.getString("Celular"), rs.getString("Email"));
        }
        pst.close();
        return jur;
    }
public void excluir(int codigo) throws SQLException {
        sql = " delete from pessoaFisica where Ip= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, codigo);
        pst.execute();
        pst.close();
    }
    public List<ClienteFisico> todosJuridica() throws SQLException {
        ClienteFisico jur;
        List<ClienteFisico> jurs = new ArrayList<>();
        
        sql = "Select * from pessoaJuridica order by Nome";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
       
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
        jur = new ClienteFisico(rs.getInt("Ip"), rs.getString("Matricula"),rs.getString("estatus"), rs.getString("nome"), rs.getString("apelido"),
        rs.getString("estadoCivil"), rs.getString("cpf"),rs.getString("rg"),rs.getString("sexo"),rs.getDate("dtNasc"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getString("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento")
        , rs.getString("Telefone"),rs.getString("Celular"), rs.getString("Email"));
        jurs.add(jur);
        }
        pst.close();
        return jurs;
    }
    
}
