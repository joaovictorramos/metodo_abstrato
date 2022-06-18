package com.mycompany.abstrato3;

import java.util.ArrayList;

public class Pesquisa {
    ArrayList<Teses> teses = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<RevistasConf> revistas = new ArrayList<>();
    
    protected String nomePesquisa;
    protected String descricao;
    protected String dataInicio;
    protected String dataTermino;
    protected String statusData;
    protected String areaPesquisa;
    protected Coordenador principal;
    
    public Pesquisa(String nomePesquisa, String descricao, String dataInicio, String dataTermino, String statusData, String areaPesquisa, Coordenador principal, ArrayList<Teses> teses, ArrayList<Livro> livros, ArrayList<RevistasConf> revistas){
        this.setNomePesquisa(nomePesquisa);
        this.setDescricao(descricao);
        this.setDataInicio(dataInicio);
        this.setDataTermino(dataTermino);
        this.setStatusData(statusData);
        this.setAreaPesquisa(areaPesquisa);
        this.setPrincipal(principal);
        this.setTeses(teses);
        this.setLivros(livros);
        this.setRevistas(revistas);
    }

    public void bibliografias(){
        System.out.println("Nome da pesquisa: " + getNomePesquisa() +
                           "\nDescrição: " + getDescricao() +
                           "\nData de Início: " + getDataInicio() +
                           "\nData de Término: " + getDataTermino() +
                           " (" + getStatusData() + ") " +
                           "\nÁrea de Pesquisa: " + getAreaPesquisa() +
                           "\n");
        System.out.println("Coordenador: " + getPrincipal().getNome() +
                           "\nEmail do Coordenador: " + getPrincipal().getEmail() +
                           "\nInstituição: " + getPrincipal().getInstituicaoOrigem() +
                           "\nEndereço: " + getPrincipal().getEndereco() +
                           "\nFunção: " + getPrincipal().getFuncao() +
                           "\n");
        
        utilizado();
    }
    
    public void utilizado(){
        for(Teses tese : teses){
            if(!teses.isEmpty()){
                if(getAreaPesquisa().equalsIgnoreCase(tese.getAreaPesquisa()) && getNomePesquisa().equalsIgnoreCase(tese.getPesquisaEsp())){
                    tese.imprimirInformacoes();
                    
                }else{
                    System.out.println("Esta tese não corresponde a área e/ou a pesquisa!\n");
                }
            }
        }
        
        for(Livro livro : livros){
            if(!livros.isEmpty()){
                if(getAreaPesquisa().equalsIgnoreCase(livro.getAreaPesquisa()) && getNomePesquisa().equalsIgnoreCase(livro.getPesquisaEsp())){
                    livro.imprimirInformacoes();
                    
                }else{
                    System.out.println("Este livro não corresponde a área e/ou a pesquisa!\n");
                }
            }
        }
        
        for(RevistasConf revista : revistas){
            if(!revistas.isEmpty()){
                if(getAreaPesquisa().equalsIgnoreCase(revista.getAreaPesquisa()) && getNomePesquisa().equalsIgnoreCase(revista.getPesquisaEsp())){
                    revista.imprimirInformacoes();
                    
                }else{
                    System.out.println("Esta revista não corresponde a área e/ou a pesquisa!\n");
                }
            }
        }
    }

    public String getNomePesquisa() {
        return nomePesquisa;
    }

    public void setNomePesquisa(String nomePesquisa) {
        this.nomePesquisa = nomePesquisa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }
    
    public String getStatusData(){
        return statusData;
    }
    
    public void setStatusData(String statusDataTermino){
        this.statusData = statusDataTermino;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Coordenador getPrincipal() {
        return principal;
    }

    public void setPrincipal(Coordenador principal) {
        this.principal = principal;
    }
    
    public ArrayList<Teses> getTeses() {
        return teses;
    }

    public void setTeses(ArrayList<Teses> teses) {
        this.teses = teses;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<RevistasConf> getRevistas() {
        return revistas;
    }

    public void setRevistas(ArrayList<RevistasConf> revistas) {
        this.revistas = revistas;
    }
}
