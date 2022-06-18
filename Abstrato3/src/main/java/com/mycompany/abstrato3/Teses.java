package com.mycompany.abstrato3;

public class Teses extends Publicacoes{
    protected String grau;
    protected String instituicao;
    
    public Teses(String titulo, int ano, String autores, String areaPesquisa, String pesquisaEsp, String grau, String instituicao){
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAutores(autores);
        this.setAreaPesquisa(areaPesquisa);
        this.setPesquisaEsp(pesquisaEsp);
        this.setGrau(grau);
        this.setInstituicao(instituicao);
    }

    @Override
    protected void imprimirInformacoes() {
        System.out.println("Título da Tese: " + getTitulo() +
                           "\nAno: " + getAno() +
                           "\nAutores: " + getAutores() +
                           "\nÁrea de pesquisa: " + getAreaPesquisa() +
                           "\nPesquisa (especificada): " + getPesquisaEsp() +
                           "\nGrau: " + getGrau() +
                           "\nInstituição: " + getInstituicao() +
                           "\n");
    }
    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        if(!"M.Sc".equalsIgnoreCase(grau) && !"D.Sc".equalsIgnoreCase(grau) && !"Ph.D".equalsIgnoreCase(grau)){
            grau = "NULL";
        }
        
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
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
