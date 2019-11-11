
package Dao;

import Model.Cliente;
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
    public void salvar(Cliente cli) throws SQLException{
        sql = "INSERT INTO cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cli.getStatus());
        pst.setString(3, cli.getNome_razao());
        pst.setString(4, cli.getApelido_NomeFan());
        pst.setString(5, cli.getCPF_Cnpj());
        pst.setString(6, cli.getRG_inscEsta());
        pst.setString(7, cli.getTipoPessoa());
        pst.setString(8, cli.getBairro());
        pst.setString(9, cli.getRua());
        pst.setString(10, cli.getNumero());
        pst.setString(11, cli.getCidade());
        pst.setString(12, cli.getCep());
        pst.setString(13, cli.getEstado());
        pst.setString(14, cli.getComplemento());
        pst.setString(15, cli.getTelefone());
        pst.setString(16, cli.getCelular());
        pst.setString(17, cli.getEmail());
        pst.execute();
        pst.close();
    }
    public void alterar(Cliente cli) throws SQLException {

        sql = "Update cliente  set estatus=?, nome_razao=?, apelido_nomeFant=?, cpf_cnpj=?, rg_InscEstadual =?, tipoPessoa=?, bairro=?, rua=?, numero=?," +
                "cidade=?,cep=?, estado=?, complemento=?,telefone=?, celular=?, email=?  where Ip=?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(17, cli.getId());
        pst.setString(1, cli.getStatus());
        pst.setString(2, cli.getNome_razao());
        pst.setString(3, cli.getApelido_NomeFan());
        pst.setString(4, cli.getCPF_Cnpj());
        pst.setString(5, cli.getRG_inscEsta());
        pst.setString(6, cli.getTipoPessoa());
        pst.setString(7, cli.getBairro());
        pst.setString(8, cli.getRua());
        pst.setString(9, cli.getNumero());
        pst.setString(10, cli.getCidade());
        pst.setString(11, cli.getCep());
        pst.setString(12, cli.getEstado());
        pst.setString(13, cli.getComplemento());
        pst.setString(14, cli.getTelefone());
        pst.setString(15, cli.getCelular());
        pst.setString(16, cli.getEmail());
        pst.execute();
        pst.close();
    }
    public Cliente buscaClienteByID(int ID) throws SQLException {
        Cliente cli = null;
        sql ="Select * from cliente where ip = ? ";
        Statement st;
        pst = Conexao2.getInstance().prepareStatement(sql);
        pst.setInt(1, ID);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()){        
        cli = new Cliente(rs.getInt("ip"), rs.getString("estatus"), rs.getString("tipoPessoa"), rs.getString("nome_razao"),
        rs.getString("apelido_nomeFant"), rs.getString("cpf_cnpj"),rs.getString("rg_InscEstadual"),rs.getString("bairro"), rs.getString("rua"),
        rs.getString("numero"), rs.getString("cidade"), rs.getString("cep"), rs.getString("estado"), rs.getString("complemento")
        , rs.getString("telefone"),rs.getString("celular"), rs.getString("email"));
        }
        pst.close();
        return cli;
    }
    public void excluir(int codigo) throws SQLException {
        sql = " delete from cliente where Ip= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, codigo);
        pst.execute();
        pst.close();
    }
    public List<Cliente> todosFisicos() throws SQLException {
        Cliente cli;
        List<Cliente> clis = new ArrayList<>();
        
        sql = "Select * from cliente order by ip";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
        cli = new Cliente(rs.getInt("ip"), rs.getString("estatus"), rs.getString("tipoPessoa"), rs.getString("nome_razao"),
        rs.getString("apelido_nomeFant"), rs.getString("cpf_cnpj"),rs.getString("rg_InscEstadual"),rs.getString("bairro"), rs.getString("rua"),
        rs.getString("numero"), rs.getString("cidade"), rs.getString("cep"), rs.getString("estado"), rs.getString("complemento")
        , rs.getString("telefone"),rs.getString("celular"), rs.getString("email"));
        clis.add(cli);
        }
        pst.close();
        return clis;
    }
    
}
