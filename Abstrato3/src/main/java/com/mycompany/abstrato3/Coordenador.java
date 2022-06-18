package com.mycompany.abstrato3;

public class Coordenador {
    protected String nome;
    protected String email;
    protected String instituicaoOrigem;
    protected String endereco;
    protected String funcao;
    
    public Coordenador(String nome, String email, String instituicao, String endereco, String funcao){
        this.setNome(nome);
        this.setEmail(email);
        this.setInstituicaoOrigem(instituicao);
        this.setEndereco(endereco);
        this.setFuncao(funcao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
