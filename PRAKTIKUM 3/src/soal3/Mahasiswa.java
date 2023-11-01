package soal3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mahasiswa {
    Scanner input = new Scanner(System.in);
    Map<String, String> mahasiswa = new HashMap<>();
    String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public Mahasiswa() {

    }

    void isi(){

        int pilihan;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            if(pilihan == 1){
                System.out.print("Masukkan Nama Mahasiswa: ");
                input.nextLine();
                nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                nim = input.nextLine();
                if (mahasiswa.containsKey(nim)) {
                    System.out.println("NIM sudah terdaftar. Silakan coba NIM lain.");
                } else {
                    mahasiswa.put(nim, nama);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }
            }
            else if(pilihan == 2){
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                nim = input.next();
                if (mahasiswa.containsKey(nim)) {
                    mahasiswa.remove(nim);
                    System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                } else {
                    System.out.println("NIM tidak ditemukan.");
                }
            }
            else if(pilihan == 3){
                System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                nim = input.next();
                if (mahasiswa.containsKey(nim)) {
                    System.out.println("NIM: " + nim + ", Nama: " + mahasiswa.get(nim));
                } else {
                    System.out.println("NIM tidak ditemukan.");
                }
            }
            else if (pilihan == 4){
                System.out.println("Daftar Mahasiswa:");
                for (Map.Entry<String, String> entry : mahasiswa.entrySet()) {
                    System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
                }
            }
            else if (pilihan == 0){
                System.out.println("Terima kasih!");
            }
            else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        }while (pilihan != 0);
    }
}
