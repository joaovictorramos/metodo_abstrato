package com.mycompany.abstract2;

public class Abstract2 {

    public static void main(String[] args) {
        Automovel a1 = new Automovel(11111111, "PLACA011");
        a1.ligar();
        a1.ligar();
        System.out.println(a1.moverFrente());
        System.out.println(a1.re());
        a1.desligar();
        a1.desligar();
        System.out.println(a1.parar());
        a1.ligar();
        System.out.println(a1.parar());
        a1.desligar();
        System.out.println("");
        
        Aviao av1 = new Aviao(22222222);
        av1.ligar();
        av1.ligar();
        System.out.println(av1.moverFrente());
        System.out.println(av1.re());
        av1.desligar();
        av1.desligar();
        System.out.println(av1.parar());
        av1.ligar();
        System.out.println(av1.parar());
        av1.desligar();
        System.out.println("");
        
        Barco b1 = new Barco(33333333);
        b1.ligar();
        b1.ligar();
        System.out.println(b1.moverFrente());
        System.out.println(b1.re());
        b1.desligar();
        b1.desligar();
        System.out.println(b1.parar());
        b1.ligar();
        System.out.println(b1.parar());
        b1.desligar();
        System.out.println("");
    }
}
