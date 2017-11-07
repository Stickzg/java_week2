package com.flowacademy.negyzet;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Negyzet elso = new Negyzet(3, 5);
        Negyzet masodik = new Negyzet(3, 7);
        Negyzet harmadik = new Negyzet(5, 8);
        Negyzet negyedik = new Negyzet(4, 12);

        Negyzet[] negyzetek = new Negyzet [4];
                negyzetek[0] = elso;
                negyzetek[1] = masodik;
                negyzetek[2] = harmadik;
                negyzetek[3] = negyedik;
        Random random = new Random();
        Negyzet[] negyzetek2 = new Negyzet [4];
        for (int i=0; i < 4; i++) {
            negyzetek2[i] = new Negyzet(random.nextFloat(), random.nextFloat());
        }

    float sumKerulet = 0;
    float sumTerulet = 0;

    for (int i=0; i < negyzetek.length ; i++ ) {
        sumKerulet+= negyzetek[i].kerulet();
        sumTerulet+= negyzetek[i].terulet();
        }

        System.out.println("A négyzetek kerületének átlaga: " + sumKerulet / negyzetek.length);
        System.out.println("A négyzetek területének átlaga: " + sumTerulet / negyzetek.length);
    }
}
