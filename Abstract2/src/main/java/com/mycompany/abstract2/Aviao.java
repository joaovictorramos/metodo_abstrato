package com.mycompany.abstract2;

public class Aviao extends Veiculo{
    private long regAeronautico;
    private static boolean onOff = false;
    
    public Aviao(long regAeronautico){
        this.setRegAeronautico(regAeronautico);
        
        status();
    }
    
    public void status(){
        System.out.println("\nRegistro Aeronáutico: " + getRegAeronautico() +
                           "\n");
    }
    
    @Override
    public boolean ligar() {
        if(onOff == false){
            onOff = true;
            System.out.println("Avião ligado...");
            
        }else if(onOff){
            System.out.println("O avião já está ligado...");
        }
        
        return onOff;
    }

    @Override
    public boolean desligar() {
        if(onOff == true){
            onOff = false;
            System.out.println("Avião desligado...");
            
        }else if(onOff == false){
            System.out.println("O avião já se encontra desligado...");
        }
        
        return onOff;
    }

    @Override
    public String moverFrente() {
        String frase = "";
        if(onOff){
            frase = "Avião movendo para frente...";
            
        }else{
            frase = "Avião está desligado...";
        }
        
        return frase;
    }

    @Override
    public String re() {
        String frase = "";
        if(onOff){
            frase = "Avião dando ré...";
            
        }else{
            frase = "Avião está desligado...";
        }
        
        return frase;
    }

    @Override
    public String parar() {
        String frase = "";
        if(onOff){
            frase = "Avião dando ré...";
            
        }else{
            frase = "Avião está desligado...";
        }
        
        return frase;
    }
    
    public long getRegAeronautico(){
        return regAeronautico;
    }
    
    public void setRegAeronautico(long regAeronautico){
        this.regAeronautico = regAeronautico;
    }
}
