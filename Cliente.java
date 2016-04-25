/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrar;

/**
 *
 * @author THIAGO-PC
 */
public class Cliente {
    
    private String CPF;
    private String telefone;
    private String nome;
    private String endereco;
    private String sexo;
    
    public Cliente(String CPF, String telefone, String nome, String endereco, String sexo){
        
        this.CPF = CPF;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        
    }

    public Cliente() {
        this.CPF = null;
        this.telefone = null;
        this.nome = null;
        this.endereco = null;
        this.sexo = null;
    }
    
    public String toString(){
        return "Nome: "+this.nome+"\nEndereco: "+this.endereco+"\nTelefone: "+this.telefone+"\nCPF: "+this.CPF+"\nSexo: "+this.sexo+"\n";
    }

 /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
