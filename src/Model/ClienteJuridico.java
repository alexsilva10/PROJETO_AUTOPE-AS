
package Model;

import java.util.Date;


public class ClienteJuridico {
    private int id;
    private String matricula,status;
    private String nomeFantazia,CNPJ,rasaoSocil,inscricao;
    private String bairro,rua,numero,cidade,cep,estado,complemento;
    private String telefone,celular,email;

    public ClienteJuridico() {
    }

    public ClienteJuridico(int id, String matricula, String status, String nomeFantazia, String CNPJ, String rasaoSocil, String inscricao, String bairro, String rua, String numero, String cidade, String cep, String estado, String complemento, String telefone, String celular, String email) {
        this.id = id;
        this.matricula = matricula;
        this.status = status;
        this.nomeFantazia = nomeFantazia;
        this.CNPJ = CNPJ;
        this.rasaoSocil = rasaoSocil;
        this.inscricao = inscricao;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeFantazia() {
        return nomeFantazia;
    }

    public void setNomeFantazia(String nomeFantazia) {
        this.nomeFantazia = nomeFantazia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRasaoSocil() {
        return rasaoSocil;
    }

    public void setRasaoSocil(String rasaoSocil) {
        this.rasaoSocil = rasaoSocil;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
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
    
}
