import java.util.Scanner;

public class PRAK105_2210817220019_dheaaprilindautami {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.printf("Masukan Makanan Favorit: ");
        String makanan = myObj.nextLine();
        System.out.printf("Masukan Hobi: ");
        String hobi = myObj.nextLine();
        System.out.printf("Aku Suka Makan " + makanan + ", dan Hobiku " + hobi);
    }
}
