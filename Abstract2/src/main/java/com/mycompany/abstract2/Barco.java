package com.mycompany.abstract2;

public class Barco extends Veiculo{
    private long regEmbarcacao;
    private static boolean onOff = false;
    
    public Barco(long regEmbarcacao){
        this.setRegEmbarcacao(regEmbarcacao);
        
        status();
    }
    
    public void status(){
        System.out.println("\nRegistro de Embarcação: " + getRegEmbarcacao() +
                           "\n");
    }
    
    @Override
    public boolean ligar() {
        if(onOff == false){
            onOff = true;
            System.out.println("Barco ligado...");
            
        }else if(onOff){
            System.out.println("O barco já está ligado...");
        }
        
        return onOff;
    }

    @Override
    public boolean desligar() {
        if(onOff == true){
            onOff = false;
            System.out.println("Barco desligado...");
            
        }else if(onOff == false){
            System.out.println("O barco já se encontra desligado...");
        }
        
        return onOff;
    }

    @Override
    public String moverFrente() {
        String frase = "";
        if(onOff){
            frase = "Barco movendo para frente...";
            
        }else{
            frase = "Barco está desligado...";
        }
        
        return frase;
    }

    @Override
    public String re() {
        String frase = "";
        if(onOff){
            frase = "Barco dando ré...";
            
        }else{
            frase = "Barco está desligado...";
        }
        
        return frase;
    }

    @Override
    public String parar() {
        String frase = "";
        if(onOff){
            frase = "Barco dando ré...";
            
        }else{
            frase = "Barco está desligado...";
        }
        
        return frase;
    }
    
    public long getRegEmbarcacao(){
        return regEmbarcacao;
    }
    
    public void setRegEmbarcacao(long regEmbarcacao){
        this.regEmbarcacao = regEmbarcacao;
    }
}
