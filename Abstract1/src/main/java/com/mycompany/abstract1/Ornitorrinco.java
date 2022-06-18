package com.mycompany.abstract1;

public class Ornitorrinco extends Animal{
    private static int sono = 0;
    
    @Override
    protected void respirar() {
        System.out.println("Ornitorrinco respirando...");
    }

    @Override
    protected void dormir() {
        sono++;
        if(sono == 1){
            System.out.println("Ornitorrinco mimindo...");
            
        }else{
            System.out.println("Ornitorrinco acordou...");
            sono = 0;
        } 
    }

    @Override
    protected void comer() {
        if(sono == 1){
            System.out.println("O ornitorrinco está dormindo...");
            
        }else{
            System.out.println("Ornitorrinco comendo...");
        }
    }

    @Override
    protected void andar() {
        if(sono == 1){
            System.out.println("O ornitorrinco está dormindo...");
            
        }else{
            System.out.println("Ornitorrinco andando...");
        }
    }
}
