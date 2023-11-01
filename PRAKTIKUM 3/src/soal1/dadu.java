package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.lang.*;

public class dadu {
    int angka, hasil, acak;
    int maks = 6;
    int min = 1;

    Random rand = new Random();
    LinkedList<Integer> jumlah = new LinkedList<Integer>();

    public dadu() {
        this.angka = angka;
    }

    void acakNilai() {
        for (int i = 1; i <= angka; i++) {
            for (int j= 1; j <= i; j++){
                acak = rand.nextInt(maks - min + 1) + min;
            }
            System.out.println("Dadu ke-" + i +" bernilai " + acak);
            jumlah.add(acak);
            hasil = hasil + acak;
        }

        System.out.println("Total nilai dadu keseluruhan "+hasil);
    }
}
