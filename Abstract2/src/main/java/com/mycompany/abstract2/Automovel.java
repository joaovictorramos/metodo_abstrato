package com.mycompany.abstract2;

public class Automovel extends Veiculo{
    private long numRenavam;
    private String placa;
    private static boolean onOff = false;
    
    public Automovel(long numRenavam, String placa){
        this.setNumRenavam(numRenavam);
        this.setPlaca(placa);
        
        status();
    }
    
    public void status(){
        System.out.println("\nNúmero de Renavam: " + getNumRenavam() +
                           "\nPlaca: " + getPlaca() +
                           "\n");
    }

    @Override
    public boolean ligar() {
        if(onOff == false){
            onOff = true;
            System.out.println("Automóvel ligado...");
            
        }else if(onOff){
            System.out.println("O automóvel já está ligado...");
        }
        
        return onOff;
    }

    @Override
    public boolean desligar() {
        if(onOff == true){
            onOff = false;
            System.out.println("Automóvel desligado...");
            
        }else if(onOff == false){
            System.out.println("O automóvel já se encontra desligado...");
        }
        
        return onOff;
    }

    @Override
    public String moverFrente() {
        String frase = "";
        if(onOff){
            frase = "Automóvel movendo para frente...";
            
        }else{
            frase = "Automóvel está desligado...";
        }
        
        return frase;
    }

    @Override
    public String re() {
        String frase = "";
        if(onOff){
            frase = "Automóvel dando ré...";
            
        }else{
            frase = "Automóvel está desligado...";
        }
        
        return frase;
    }

    @Override
    public String parar() {
        String frase = "";
        
        if(onOff){
            frase = "Automóvel parado...";
            
        }else{
            frase = "Automóvel está desligado...";
        }
        
        return frase;
    }
    
    public long getNumRenavam() {
        return numRenavam;
    }

    public void setNumRenavam(long numRenavam) {
        this.numRenavam = numRenavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
