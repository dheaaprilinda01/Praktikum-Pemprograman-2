package soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public negara() {

    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }

    public void masuk() {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        jumlah = sc.nextInt();
        sc.nextLine();

        LinkedList<negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        for (int i = 1; i <= jumlah; i++) {
            String nama = sc.nextLine();
            String jenisKepemimpinan = sc.nextLine();
            String namaPemimpin = sc.nextLine().trim();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = sc.nextInt();
                bulanKemerdekaan = sc.nextInt();
                tahunKemerdekaan = sc.nextInt();
            }
            sc.nextLine();
            negara negara = new negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }
        for (negara negara : negaraList) {
            System.out.print("Negara " + negara.getNama() + " mempunyai " + negara.getJenisKepemimpinan());

            if (negara.getJenisKepemimpinan().equals("presiden")) {
                System.out.println(" bernama " + negara.getNamaPemimpin());
            } else if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println();
            }
            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + bulanMap.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
                System.out.println();
            }
        }
    }
}