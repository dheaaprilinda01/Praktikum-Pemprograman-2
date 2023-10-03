
import java.util.Scanner;

public class PRAK101_2210817220019_DHEAAPRILINDAUTAMI {
    public static void main(String[] args) {

        //deklarasi variable
        String nama, tempat, namabulan = null;
        int tanggal, bulan, tahun, tinggi;
        float berat;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tempat = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        bulan = input.nextInt();

        if(bulan==1)
        {
            namabulan="Januari";
        }
        else if (bulan==2)
        {
            namabulan="Februari";
        }
        else if (bulan==3)
        {
            namabulan="Maret";
        }
        else if (bulan==4)
        {
            namabulan="April";
        }
        else if (bulan==5)
        {
            namabulan="Mei";
        }
        else if (bulan==6)
        {
            namabulan="Juni";
        }
        else if (bulan==7)
        {
            namabulan="Juli";
        }
        else if (bulan==8)
        {
            namabulan="Agustus";
        }
        else if (bulan==9)
        {
            namabulan="September";
        }
        else if (bulan==10)
        {
            namabulan="Oktober";
        }
        else if (bulan==11)
        {
            namabulan="November";
        }
        else if (bulan==12)
        {
            namabulan="Desember";
        }


        System.out.print("Masukkan Tahun Lahir: ");
        tahun = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        tinggi = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        berat = input.nextFloat();



        //menampilkan output
        System.out.print("Nama Lengkap " + nama + ", Lahir di "+ tempat +" pada Tanggal "+ tanggal + " " + namabulan + " " + tahun + " Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");

    }
}
