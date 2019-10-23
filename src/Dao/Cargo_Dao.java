/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cargo_Model;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEX DIAS
 */
public class Cargo_Dao implements Serializable{
    PreparedStatement pst;
    String sql;

    public void salvar(Cargo_Model cargo) throws SQLException {
        int ID = 0;
        sql = "INSERT INTO cargo values(?,?)";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cargo.getNomecargo());
 
        pst.execute();
        pst.close();

    }
    
    public void alterar(Cargo_Model cargo) throws SQLException {

        sql = "Update cargo  set Nomecargo=? where ID=?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, cargo.getNomecargo());
        
        pst.setInt(2, cargo.getID());
        pst.execute();
        pst.close();
    }
    
    public Cargo_Model buscaCargoID(int ID) throws SQLException {
        Cargo_Model cargo = null;
        sql = ("Select * from cargo where ID= " + ID);
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);

        ResultSet rs = pst.getResultSet();
        while (rs.next()) {        
            cargo = new Cargo_Model(rs.getInt("ID"), rs.getString("Nomecargo"));
        }
        pst.close();
        return cargo;
    }
    
    public void excluir(int ID) throws SQLException {
        sql = " delete from cargo where ID= ?";
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, ID);
        pst.execute();
        pst.close();

    }
    
    public List<Cargo_Model> todosCargos() throws SQLException {
        Cargo_Model cargo;
        List<Cargo_Model> cargos = new ArrayList<>();
        
        sql = "Select * from cargo order by Nomecargo";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
       
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

        cargo = new Cargo_Model(rs.getInt("ID"), rs.getString("Nomecargo"));
        
          cargos.add(cargo);
        }
        
        pst.close();

        return cargos;
    }

    public Cargo_Model getCargoById(int ID) throws SQLException {
        Cargo_Model cargo = null;
        sql = "Select * from cargo where ID=?";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setInt(1, ID);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            
        cargo = new Cargo_Model(rs.getInt("ID"), rs.getString("Nomecargo"));
        }
      pst.close();

        return cargo;
    }
    
     public String validarNomeCargo(String Nomecargo) throws SQLException {

        String resposta = new String();
        String sql = "select Nomecargo from cargo where Nomecargo =?";

        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, Nomecargo);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            resposta = rs.getString("Nomecargo");
        }
        rs.close();
        pst.close();

        return resposta;
    }
       public Cargo_Model getCargoByNome(String Nome) throws SQLException {
        Cargo_Model cargo = null;
        sql = "Select * from cargo where Nomecargo=?";
        Statement st;
        pst = Conexao.getConnection().prepareStatement(sql);
        pst.setString(1, Nome);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            
        cargo = new Cargo_Model(rs.getInt("ID"), rs.getString("Nomecargo"));
        }
        pst.close();

        return cargo;
    }
    
}
