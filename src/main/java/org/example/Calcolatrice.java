package org.example;

public class Calcolatrice {

    public Calcolatrice(){
        this.a = 0;
        this.b = 0;
    }

    public double somma(double a, double b){
        return a + b;
    }
    public double multiplicazione(double a, double b){
        return a * b;
    }
    public double sottrazione(double a, double b) { return a - b;}
    public double divisione(double a, double b){ if(b != 0) {return a / b;} else return 0;}

    private double a, b;
}
