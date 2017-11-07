package com.flowacademy.torta;

public class Torta {
    protected int szelet;
    protected String iz;

    public int getSzelet() {
        return szelet;
    }

    public void setSzelet(int szelet) {
        this.szelet = szelet;
    }

    public Torta(int szelet, String íz) {
        this.szelet = szelet;
        this.iz = íz;
    }

    @Override
    public String toString() {
        return " Ez a torta{" +
                szelet +
                " szeletes és " + iz +
                " ízű}";
    }
}
