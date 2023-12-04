package soal2;
import java.util.Scanner;

public class HewanPeliharaan {
    Scanner input = new Scanner(System.in);
    String nama;
    String ras;
    Integer pilihan;

    public HewanPeliharaan(String r, String n) {
        nama = n;
        ras = r;
    }

    public HewanPeliharaan() {

    }



    void display() {

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing ");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan Pilihan: ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            Kucing kucing = new Kucing("", "", "");
            kucing.displayDetailKucing();
        }
        if (pilihan == 2){
            Anjing Anjing = new Anjing("", "", "", "");
            Anjing.displayDetailAnjing();
        }
    }
}
class Kucing extends HewanPeliharaan{
    private String Warnabulu;
    public Kucing (String r, String n, String w){
        super(r, n);
        Warnabulu = w;
    }
     void displayDetailKucing(){
        System.out.print("Nama hewan Peliharaan: ");
        nama = input.nextLine();
        System.out.print("Ras: ");
        ras = input.nextLine();
        System.out.print("Warna bulu: ");
        Warnabulu = input.nextLine();

        System.out.println("");
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + Warnabulu);
    }
}
class Anjing extends HewanPeliharaan{
    private String Warnabulu;
    private String Kemampuan;
    public Anjing (String r, String n, String w, String k){
        super(r, n);
        Warnabulu = w;
        Kemampuan = k;
    }
    void displayDetailAnjing(){
        System.out.print("Nama hewan Peliharaan: ");
        nama = input.nextLine();
        System.out.print("Ras: ");
        ras = input.nextLine();
        System.out.print("Warna bulu: ");
        Warnabulu = input.nextLine();
        System.out.print("kemampuan: ");
        Kemampuan = input.nextLine();

        System.out.println("");
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + Warnabulu);
        System.out.println("Memiliki Kemampuan : " + Kemampuan);
    }
}