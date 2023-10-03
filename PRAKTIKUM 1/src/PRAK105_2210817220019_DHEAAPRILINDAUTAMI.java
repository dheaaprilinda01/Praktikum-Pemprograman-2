import java.util.Scanner;
public class PRAK105_2210817220019_DHEAAPRILINDAUTAMI {
    public static void main(String[] args) {
        float jari, tinggi, volume;
        float phi=(float) 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();
        System.out.print("Masukkan Tinggi: ");
        tinggi = input.nextFloat();

        volume = jari*jari*phi*tinggi;

        System.out.print("Volume tabung dengan jari jari "+ jari + " cm dan tinggi " + tinggi + " cm adalah "+ volume+ " m3");
    }
}
