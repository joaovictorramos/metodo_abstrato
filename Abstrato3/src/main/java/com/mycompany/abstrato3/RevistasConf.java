package com.mycompany.abstrato3;

public class RevistasConf extends Publicacoes{
    public String nomePeriodico;
    public int volume;
    public int numero;
    
    public RevistasConf(String titulo, int ano, String autores, String areaPesquisa, String pesquisaEsp, String nomePeriodico, int volume, int numero){
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAutores(autores);
        this.setAreaPesquisa(areaPesquisa);
        this.setPesquisaEsp(pesquisaEsp);
        this.setNomePeriodico(nomePeriodico);
        this.setVolume(volume);
        this.setNumero(numero);
    }

    @Override
    protected void imprimirInformacoes() {
        System.out.println("Título da Revista: " + getTitulo() +
                           "\nAno: " + getAno() +
                           "\nAutores: " + getAutores() +
                           "\nÁrea de pesquisa: " + getAreaPesquisa() +
                           "\nPesquisa (especificada): " + getPesquisaEsp() +
                           "\nNome do periódico: " + getNomePeriodico() +
                           "\nVolume: " + getVolume() +
                           "\nNúmero: " + getNumero() +
                           "\n\n");
    }

    public String getNomePeriodico() {
        return nomePeriodico;
    }

    public void setNomePeriodico(String nomePeriodico) {
        this.nomePeriodico = nomePeriodico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
