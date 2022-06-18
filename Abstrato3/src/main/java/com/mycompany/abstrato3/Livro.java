package com.mycompany.abstrato3;

public class Livro extends Publicacoes{
    protected String editora;
    protected String localPublicacao;
    
    public Livro(String titulo, int ano, String autores, String areaPesquisa, String pesquisaEsp, String editora, String localPublicacao){
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAutores(autores);
        this.setAreaPesquisa(areaPesquisa);
        this.setPesquisaEsp(pesquisaEsp);
        this.setEditora(editora);
        this.setLocalPublicacao(localPublicacao);
    }

    @Override
    protected void imprimirInformacoes() {
        System.out.println("Título do Livro: " + getTitulo() +
                           "\nAno: " + getAno() +
                           "\nAutores: " + getAutores() +
                           "\nÁrea de pesquisa: " + getAreaPesquisa() +
                           "\nPesquisa (especificada): " + getPesquisaEsp() +
                           "\nEditora: " + getEditora() +
                           "\nLocal de Publicação: " + getLocalPublicacao() +
                           "\n\n");
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalPublicacao() {
        return localPublicacao;
    }

    public void setLocalPublicacao(String localPublicacao) {
        this.localPublicacao = localPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public String getPesquisaEsp() {
        return pesquisaEsp;
    }

    public void setPesquisaEsp(String pesquisaEsp) {
        this.pesquisaEsp = pesquisaEsp;
    }
}
