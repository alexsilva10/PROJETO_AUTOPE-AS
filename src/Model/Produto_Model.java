/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

public class Produto_Model {
    private int IDproduto;
    private String Descricao;
    private Categoria Categoriaprod;
    private String Codigobarras;
    private Double Precovenda;
    private Double Precocusto;
    private Double Margemlucro;
    private String Unidademedida;
    private String Localizacao;
    private Fornecedor Fornecedorprod;
    private String Marca;
    private Date Datacadastro;
    private int Estoque;
    private Date Dataultvenda;

    public Produto_Model() {
    }

    public Produto_Model(int IDproduto, String Descricao, Categoria Categoriaprod, String Codigobarras, Double Precovenda, Double Precocusto, Double Margemlucro, String Unidademedida, String Localizacao, Fornecedor Fornecedorprod, String Marca, Date Datacadastro,int estoque) {
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
        this.Estoque = estoque;
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

    public Double getPrecovenda() {
        return Precovenda;
    }

    public void setPrecovenda(Double Precovenda) {
        this.Precovenda = Precovenda;
    }

    public Double getPrecocusto() {
        return Precocusto;
    }

    public void setPrecocusto(Double Precocusto) {
        this.Precocusto = Precocusto;
    }

    public Double getMargemlucro() {
        return Margemlucro;
    }

    public void setMargemlucro(Double Margemlucro) {
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

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public Date getDataultvenda() {
        return Dataultvenda;
    }

    public void setDataultvenda(Date Dataultvenda) {
        this.Dataultvenda = Dataultvenda;
    }

    public Produto_Model(int IDproduto, String Descricao, Categoria Categoriaprod, String Localizacao, Fornecedor Fornecedorprod) {
        this.IDproduto = IDproduto;
        this.Descricao = Descricao;
        this.Categoriaprod = Categoriaprod;
        this.Localizacao = Localizacao;
        this.Fornecedorprod = Fornecedorprod;
    }
   
    

}
