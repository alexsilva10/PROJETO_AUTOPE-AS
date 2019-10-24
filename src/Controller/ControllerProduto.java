
package Controller;

import Dao.Produto_Dao;
import Model.Produto_Model;
import java.sql.SQLException;

public class ControllerProduto {
    Produto_Dao pro = new Produto_Dao();
    public Produto_Model retornaProduto(int codigo) throws SQLException{
        return this.pro.getProdutoById(codigo);
    }
}
