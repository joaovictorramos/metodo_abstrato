package com.mycompany.abstract1;

public class Dog extends Animal{
    private static int sono = 0;
    
    public void latir(){
        if(sono == 1){
            System.out.println("O cachorro está dormindo");
            
        }else{
            System.out.println("Au au!!!");
        }
    }

    @Override
    protected void respirar() {
        System.out.println("Cachorro respira...");
    }

    @Override
    protected void dormir() {
        sono++;
        if(sono == 1){
            System.out.println("Cachorro mimindo...");
            
        }else{
            System.out.println("Cachorro acordou...");
            sono = 0;
        }
    }

    @Override
    protected void comer() {
        if(sono == 1){
            System.out.println("O cachorro está dormindo...");
            
        }else{
            System.out.println("Cachorro comendo...");
        }
    }

    @Override
    protected void andar() {
        if(sono == 1){
            System.out.println("O cachorro está dormindo...");
            
        }else{
            System.out.println("Cachorro andando...");
        }
    }
}
