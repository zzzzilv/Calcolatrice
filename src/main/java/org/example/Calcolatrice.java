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
    public double potenza (double a, double b){ return Math.pow(a, b);}
    public double radiceAllaB (double a, double b){return Math.pow(a,1/b);}
    private double a, b;
}
