package com.flowacademy.torta;

public class SzulnapiTorta extends Torta{
    private int gyertyakSzama;

    public void kivansagotTeljesít(String kivansag) {
        System.out.println(kivansag + " kívánság teljesítve");
    }

    public SzulnapiTorta(int szelet, String iz) {
        super(szelet, iz);
        this.gyertyakSzama = gyertyakSzama;
    }

    @Override
    public String toString() {
        return "SzulnapiTorta{" +
                "gyertyakSzama=" + gyertyakSzama +
                ", szelet=" + szelet +
                ", iz='" + iz + '\'' +
                '}';
    }
}

