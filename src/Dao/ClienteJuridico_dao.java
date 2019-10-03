
package Dao;

import Model.ClienteJuridico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClienteJuridico_dao {
    PreparedStatement pst;
    String sql;
    public void salvar(ClienteJuridico jur) throws SQLException{
        sql = "INSERT INTO pessoaJuridica values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, jur.getMatricula());
        pst.setString(3, jur.getStatus());
        pst.setString(4, jur.getNomeFantazia());
        pst.setString(5, jur.getCNPJ());
        pst.setString(6, jur.getRasaoSocil());
        pst.setString(7, jur.getInscricao());
        pst.setString(8, jur.getBairro());
        pst.setString(9, jur.getRua());
        pst.setString(10, jur.getNumero());
        pst.setString(11, jur.getCidade());
        pst.setString(12, jur.getCep());
        pst.setString(13, jur.getEstado());
        pst.setString(14, jur.getComplemento());
        pst.setString(15, jur.getTelefone());
        pst.setString(16, jur.getCelular());
        pst.setString(17, jur.getEmail());
        
        pst.execute();
        pst.close();
    }
    public void alterar(ClienteJuridico jur) throws SQLException {

        sql = "Update pessoaJuridica  set matricula=?, estatus=?, nomeFantazia=?, cnpj=?, razaoSocial=?, inscricao=?, Bairro=?, Rua=?, Numero=?" +
                "Cidade=?,Cep=?, Estado=?, Complemento=?,Telefone=?, Celular=?, Email=?,  where Ip=?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, jur.getMatricula());
        pst.setString(2, jur.getStatus());
        pst.setString(3, jur.getNomeFantazia());
        pst.setString(4, jur.getCNPJ());
        pst.setString(5, jur.getRasaoSocil());
        pst.setString(6, jur.getInscricao());
        pst.setString(7, jur.getBairro());
        pst.setString(8, jur.getRua());
        pst.setString(9, jur.getNumero());
        pst.setString(10, jur.getCidade());
        pst.setString(11, jur.getCep());
        pst.setString(12, jur.getEstado());
        pst.setString(13, jur.getComplemento());
        pst.setString(14, jur.getTelefone());
        pst.setString(15, jur.getCelular());
        pst.setString(16, jur.getEmail());
        
        pst.setInt(17, jur.getId());
        pst.execute();
        pst.close();
    }
    public ClienteJuridico buscaJuridicaID(int ID) throws SQLException {
        ClienteJuridico jur = null;
        sql = ("Select * from pessoaJuridica where Ip= " + ID);
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);

        ResultSet rs = pst.getResultSet();
        while (rs.next()) {        
        jur = new ClienteJuridico(rs.getInt("Ip"), rs.getString("Matricula"),rs.getString("estatus"), rs.getString("nomeFantazia"), rs.getString("cnpj"),
        rs.getString("rasaoSocial"), rs.getString("inscricao"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getString("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento")
        , rs.getString("Telefone"),rs.getString("Celular"), rs.getString("Email"));
        }
        pst.close();
        return jur;
    }
public void excluir(int codigo) throws SQLException {
        sql = " delete from pessoaJuridica where Ip= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, codigo);
        pst.execute();
        pst.close();

    }
    public List<ClienteJuridico> todosJuridica() throws SQLException {
        ClienteJuridico jur;
        List<ClienteJuridico> jurs = new ArrayList<>();
        
        sql = "Select * from pessoaJuridica order by Nome";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
       
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

        jur = new ClienteJuridico(rs.getInt("Ip"), rs.getString("Matricula"),rs.getString("estatus"), rs.getString("nomeFantazia"), rs.getString("cnpj"),
        rs.getString("rasaoSocial"), rs.getString("inscricao"),rs.getString("Bairro"), rs.getString("Rua"),
        rs.getString("Numero"), rs.getString("Cidade"), rs.getString("Cep"), rs.getString("Estado"), rs.getString("Complemento")
        , rs.getString("Telefone"),rs.getString("Celular"), rs.getString("Email"));
        
        jurs.add(jur);
        }
        pst.close();
        return jurs;
    }
}
