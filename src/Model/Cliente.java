
package Model;

import java.util.Date;

public class Cliente {
    private int id;
    private String status,tipoPessoa;
    private String nome_razao,apelido_NomeFan,CPF_Cnpj,RG_inscEsta;
    private String bairro,rua,numero,cidade,cep,estado,complemento;

    public Cliente(int id, String status, String tipoPessoa, String nome_razao, String apelido_NomeFan, String CPF_Cnpj, String RG_inscEsta, String bairro, String rua, String numero, String cidade, String cep, String estado, String complemento, String telefone, String celular, String email) {
        this.id = id;
        this.status = status;
        this.tipoPessoa = tipoPessoa;
        this.nome_razao = nome_razao;
        this.apelido_NomeFan = apelido_NomeFan;
        this.CPF_Cnpj = CPF_Cnpj;
        this.RG_inscEsta = RG_inscEsta;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.complemento = complemento;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome_razao() {
        return nome_razao;
    }

    public void setNome_razao(String nome_razao) {
        this.nome_razao = nome_razao;
    }

    public String getApelido_NomeFan() {
        return apelido_NomeFan;
    }

    public void setApelido_NomeFan(String apelido_NomeFan) {
        this.apelido_NomeFan = apelido_NomeFan;
    }

    public String getCPF_Cnpj() {
        return CPF_Cnpj;
    }

    public void setCPF_Cnpj(String CPF_Cnpj) {
        this.CPF_Cnpj = CPF_Cnpj;
    }

    public String getRG_inscEsta() {
        return RG_inscEsta;
    }

    public void setRG_inscEsta(String RG_inscEsta) {
        this.RG_inscEsta = RG_inscEsta;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String telefone,celular,email;
}
