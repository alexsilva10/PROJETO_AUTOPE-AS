/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ALEX DIAS
 */
public class Produto_Model {
    private int IDproduto;
    private String Descricao;
    private Categoria Categoriaprod;
    private String Codigobarras;
    private String Precovenda;
    private String Precocusto;
    private String Margemlucro;
    private String Unidademedida;
    private String Localizacao;
    private Fornecedor Fornecedorprod;
    private String Marca;
    private Date Datacadastro;
    private String Estoque;
    private Date Dataultvenda;

    public Produto_Model() {
    }

    public Produto_Model(int IDproduto, String Descricao, Categoria Categoriaprod, String Codigobarras, String Precovenda, String Precocusto, String Margemlucro, String Unidademedida, String Localizacao, Fornecedor Fornecedorprod, String Marca, Date Datacadastro, String Estoque, Date Dataultvenda) {
        this.IDproduto = IDproduto;
        this.Descricao = Descricao;
        this.Categoriaprod = Categoriaprod;
        this.Codigobarras = Codigobarras;
        this.Precovenda = Precovenda;
        this.Precocusto = Precocusto;
        this.Margemlucro = Margemlucro;
        this.Unidademedida = Unidademedida;
        this.Localizacao = Localizacao;
        this.Fornecedorprod = Fornecedorprod;
        this.Marca = Marca;
        this.Datacadastro = Datacadastro;
        this.Estoque = Estoque;
        this.Dataultvenda = Dataultvenda;
    }

    public Produto_Model(int IDproduto, String Descricao, String Codigobarras, String Precovenda, String Precocusto, String Margemlucro, String Unidademedida, String Localizacao, String Marca, Date Datacadastro, String Estoque, Date Dataultvenda) {
        this.IDproduto = IDproduto;
        this.Descricao = Descricao;
        this.Codigobarras = Codigobarras;
        this.Precovenda = Precovenda;
        this.Precocusto = Precocusto;
        this.Margemlucro = Margemlucro;
        this.Unidademedida = Unidademedida;
        this.Localizacao = Localizacao;
        this.Marca = Marca;
        this.Datacadastro = Datacadastro;
        this.Estoque = Estoque;
        this.Dataultvenda = Dataultvenda;
    }

    public int getIDproduto() {
        return IDproduto;
    }

    public void setIDproduto(int IDproduto) {
        this.IDproduto = IDproduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Categoria getCategoriaprod() {
        return Categoriaprod;
    }

    public void setCategoriaprod(Categoria Categoriaprod) {
        this.Categoriaprod = Categoriaprod;
    }

    public String getCodigobarras() {
        return Codigobarras;
    }

    public void setCodigobarras(String Codigobarras) {
        this.Codigobarras = Codigobarras;
    }

    public String getPrecovenda() {
        return Precovenda;
    }

    public void setPrecovenda(String Precovenda) {
        this.Precovenda = Precovenda;
    }

    public String getPrecocusto() {
        return Precocusto;
    }

    public void setPrecocusto(String Precocusto) {
        this.Precocusto = Precocusto;
    }

    public String getMargemlucro() {
        return Margemlucro;
    }

    public void setMargemlucro(String Margemlucro) {
        this.Margemlucro = Margemlucro;
    }

    public String getUnidademedida() {
        return Unidademedida;
    }

    public void setUnidademedida(String Unidademedida) {
        this.Unidademedida = Unidademedida;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }

    public Fornecedor getFornecedorprod() {
        return Fornecedorprod;
    }

    public void setFornecedorprod(Fornecedor Fornecedorprod) {
        this.Fornecedorprod = Fornecedorprod;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Date getDatacadastro() {
        return Datacadastro;
    }

    public void setDatacadastro(Date Datacadastro) {
        this.Datacadastro = Datacadastro;
    }

    public String getEstoque() {
        return Estoque;
    }

    public void setEstoque(String Estoque) {
        this.Estoque = Estoque;
    }

    public Date getDataultvenda() {
        return Dataultvenda;
    }

    public void setDataultvenda(Date Dataultvenda) {
        this.Dataultvenda = Dataultvenda;
    }

}
