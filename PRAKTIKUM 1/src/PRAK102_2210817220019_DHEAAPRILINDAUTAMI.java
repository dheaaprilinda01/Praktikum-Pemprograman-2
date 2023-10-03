
import java.util.Scanner;
public class PRAK102_2210817220019_DHEAAPRILINDAUTAMI {
    public static void main(String[] args) {
        int angka;

        Scanner input = new Scanner(System.in);
        angka = input.nextInt();

        int i=angka;
        while(i < angka+11) {
            if(i%5==0) {
                System.out.print(i/5-1);
            }
            else {
                System.out.print(i);
            }
            if (i < angka+10) {
                System.out.print(", ");
            }
            i++;
        }
    }
}
