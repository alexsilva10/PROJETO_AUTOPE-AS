
package Model;

import java.sql.Date;

public class Funcionario_Model {
    private int ID;
    private String Matricula;
    private String Nome;
    private String Estadocivil;
    private Date Datanascimento; 
    private String Sexo; 
    private String CPF;
    private String Telefone; 
    private String Telefoneadicional;
    private String Celular;;
    private String Email;
    private String Emailadicional;
    
    private String Bairro;
    private String Rua; 
    private int Numero;
    private String Cidade;
    private String Cep;
    private String Estado;
    private String Complemento;
    
    private String Escolaridade;
    private String RG;
    private String Dataadmissao;
    private String Salarioadmissao;
    private String Datademissao;
    private String Salarioatual;
    private String Cargo;
    private String Status;

    public Funcionario_Model() {
    }
  
    public Funcionario_Model(int ID, String Matricula, String Nome, String Estadocivil, Date Datanascimento, String Sexo, String CPF, String Telefone, String Telefoneadicional, String Celular, String Email, String Emailadicional, String Bairro, String Rua, int Numero, String Cidade, String Cep, String Estado, String Complemento, String Escolaridade, String RG, String Dataadmissao, String Salarioadmissao, String Datademissao, String Salarioatual, String Cargo, String Status) {
        this.ID = ID;
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.Estadocivil = Estadocivil;
        this.Datanascimento = Datanascimento;
        this.Sexo = Sexo;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Telefoneadicional = Telefoneadicional;
        this.Celular = Celular;
        this.Email = Email;
        this.Emailadicional = Emailadicional;
        this.Bairro = Bairro;
        this.Rua = Rua;
        this.Numero = Numero;
        this.Cidade = Cidade;
        this.Cep = Cep;
        this.Estado = Estado;
        this.Complemento = Complemento;
        this.Escolaridade = Escolaridade;
        this.RG = RG;
        this.Dataadmissao = Dataadmissao;
        this.Salarioadmissao = Salarioadmissao;
        this.Datademissao = Datademissao;
        this.Salarioatual = Salarioatual;
        this.Cargo = Cargo;
        this.Status = Status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEstadocivil() {
        return Estadocivil;
    }

    public void setEstadocivil(String Estadocivil) {
        this.Estadocivil = Estadocivil;
    }

    public Date getDatanascimento() {
        return Datanascimento;
    }

    public void setDatanascimento(Date Datanascimento) {
        this.Datanascimento = Datanascimento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTelefoneadicional() {
        return Telefoneadicional;
    }

    public void setTelefoneadicional(String Telefoneadicional) {
        this.Telefoneadicional = Telefoneadicional;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmailadicional() {
        return Emailadicional;
    }

    public void setEmailadicional(String Emailadicional) {
        this.Emailadicional = Emailadicional;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataadmissao() {
        return Dataadmissao;
    }

    public void setDataadmissao(String Dataadmissao) {
        this.Dataadmissao = Dataadmissao;
    }

    public String getSalarioadmissao() {
        return Salarioadmissao;
    }

    public void setSalarioadmissao(String Salarioadmissao) {
        this.Salarioadmissao = Salarioadmissao;
    }

    public String getDatademissao() {
        return Datademissao;
    }

    public void setDatademissao(String Datademissao) {
        this.Datademissao = Datademissao;
    }

    public String getSalarioatual() {
        return Salarioatual;
    }

    public void setSalarioatual(String Salarioatual) {
        this.Salarioatual = Salarioatual;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }  
}
