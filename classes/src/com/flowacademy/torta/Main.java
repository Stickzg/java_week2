package com.flowacademy.torta;

public class Main {
    public static void main(String[] args) {
        SzulnapiTorta csokitorta = new SzulnapiTorta(12, "csoki");
        csokitorta.kivansagotTeljesít("Hulló csillag");

        Torta kavetorta = new Torta(10, "kávé");

        Torta[] tortak = new Torta[2];
        tortak[0] = csokitorta;
        tortak[1] = kavetorta;

        for( int i = 0; i < tortak.length; i++) {
            System.out.println(tortak[i].toString());
        }
    }
}
