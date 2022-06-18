package com.mycompany.abstract1;

public class Eagle extends Animal{
    private static int sono = 0;
    
    public void voar(){
        System.out.println("Águia voando...");
    }

    @Override
    protected void respirar() {
        System.out.println("Águia respirando...");
    }

    @Override
    protected void dormir() {
        sono++;
        if(sono == 1){
            System.out.println("Águia mimindo...");
            
        }else{
            System.out.println("Águia acordou...");
            sono = 0;
        } 
    }

    @Override
    protected void comer() {
        if(sono == 1){
            System.out.println("A águia está dormindo...");
            
        }else{
            System.out.println("Águia comendo...");
        }
    }

    @Override
    protected void andar() {
        if(sono == 1){
            System.out.println("A águia está dormindo...");
            
        }else{
            System.out.println("Águia andando...");
        }
    }
}
