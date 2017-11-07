import com.flowacademy.com.flowacademy.ital.Ital;
import com.flowacademy.ember.Ember;
import com.flowacademy.ember.Kocsmáros;

public class Main {
    public static void main(String[] args) {
        Ember Jozsi = new Ember("Józsi", 25,true, 10,0,false);
        Ember Karoly = new Ember("Karcsika", 30, true, 20,0,false);
        Ember Tibi = new Ember("Tibi",35, true, 30, 0,false);
        Ember Jolan = new Ember("Jolán", 28, false, 22,0,false);

        Ember[] emberek = new Ember[4];
        emberek[0] = Jozsi;
        emberek[1] = Karoly;
        emberek[2] = Tibi;
        emberek[3] = Jolan;

        Ital whiskey = new Ital("whiskey",5, 15);
        Ital vodka = new Ital("vodka",4, 20);
        Ital sör = new Ital("sör",1,2);
        Ital bor = new Ital("bor",2,4);

        Ital[] italok = new Ital[4];
        italok[0] = whiskey;
        italok[1] = vodka;
        italok[2] = sör;
        italok[3] = bor;

        Kocsmáros Pista = new Kocsmáros(5);
        Kocsmáros Marcsi = new Kocsmáros(5);

        Kocsmáros[] kocsmárosok = new Kocsmáros[2];
        kocsmárosok[0] = Pista;
        kocsmárosok[1] = Marcsi;

        for (int i = 0; i < emberek.length; i++ ) {
            System.out.println("Emberek száma: " + emberek[i]);
        }
        float sum = 0;
        for (int i = 0; i < emberek.length ; i++) {
            sum += emberek[i].getKor();
        }
    //    System.out.println("Az átlag életkor: " + sum / emberek.length);
        System.out.println("Emberek száma " + Ember.getDarab());

        Tibi.jon();
        Jozsi.jon();
        Karoly.jon();
        Jolan.jon();

        Tibi.iszik(Pista, vodka);
        Jozsi.iszik(Marcsi, whiskey);

        System.out.println(Marcsi);
        System.out.println(Pista);

        Tibi.iszik(Marcsi, vodka);

        System.out.println(Pista.getKoszospohar());
        Pista.elmos();
        System.out.println(Pista.getKoszospohar());
    }
}
