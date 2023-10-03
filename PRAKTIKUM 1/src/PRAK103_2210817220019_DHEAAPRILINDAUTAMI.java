import java.util.Scanner;
public class PRAK103_2210817220019_DHEAAPRILINDAUTAMI {
    public static void main(String[] args) {
        int jumlah, angka;

        Scanner input = new Scanner(System.in);
        jumlah = input.nextInt();
        angka = input.nextInt();

        int i=angka;
        do {
            if(i%2!=0) {
                System.out.print(i);
            }
            i++;
            if((i+1)%2!=0 && i<angka+jumlah*2-1) {
                System.out.print(", ");
            }
        }
        while(i<(angka+jumlah*2));
    }
}
