/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.Funcionario_Dao;
import Model.Funcionario_Model;
import java.sql.SQLException;

public class ControllerFuncionario {
    Funcionario_Dao funcioanrio = new Funcionario_Dao();
    public Funcionario_Model retornaFuncionario(int id) throws SQLException{
        return this.funcioanrio.getFuncionarioById(id);
    }
}
