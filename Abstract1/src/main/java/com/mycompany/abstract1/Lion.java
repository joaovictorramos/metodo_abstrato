package com.mycompany.abstract1;

public class Lion extends Animal{
    private static int sono = 0;
    
    @Override
    protected void respirar() {
        System.out.println("Leão respirando...");
    }

    @Override
    protected void dormir() {
        sono++;
        if(sono == 1){
            System.out.println("Leão mimindo...");
            
        }else{
            System.out.println("Leão acordou...");
            sono = 0;
        }    
    }

    @Override
    protected void comer() {
        if(sono == 1){
            System.out.println("O Leão está dormindo...");
            
        }else{
            System.out.println("Leão comendo...");
        }
    }

    @Override
    protected void andar() {
        if(sono == 1){
            System.out.println("O Leão está dormindo...");
            
        }else{
            System.out.println("Leão andando...");
        }
    }
}
