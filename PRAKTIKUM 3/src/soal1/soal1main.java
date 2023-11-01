package soal1;

import java.util.Scanner;

public class soal1main {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        dadu bilangan = new dadu();

        bilangan.angka = nilai.nextInt();
        bilangan.acakNilai();

        }
    }

