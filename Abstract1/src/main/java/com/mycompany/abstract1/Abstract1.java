package com.mycompany.abstract1;

public class Abstract1 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Lion l1 = new Lion();
        Eagle e1 = new Eagle();
        Ornitorrinco o1 = new Ornitorrinco();
        
        d1.respirar();
        d1.andar();
        d1.comer();
        d1.dormir();
        d1.andar();
        d1.respirar();
        d1.dormir();
        d1.andar();
        d1.respirar();
        System.out.println("");
        
        l1.respirar();
        l1.andar();
        l1.comer();
        l1.dormir();
        l1.andar();
        l1.respirar();
        l1.dormir();
        l1.andar();
        l1.respirar();
        System.out.println("");
        
        e1.respirar();
        e1.andar();
        e1.comer();
        e1.dormir();
        e1.andar();
        e1.respirar();
        e1.dormir();
        e1.andar();
        e1.respirar();
        System.out.println("");
        
        o1.respirar();
        o1.andar();
        o1.comer();
        o1.dormir();
        o1.andar();
        o1.respirar();
        o1.dormir();
        o1.andar();
        o1.respirar();
        System.out.println("");
    }
}
