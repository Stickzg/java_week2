package com.flowacademy.negyzet;

public class Negyzet {
    private float a;
    private float b;

    public Negyzet(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float kerulet(){
        return  2*(a + b);
    }
    public float terulet(){
        return a*b;
    }
}
