import java.util.Scanner;
public class PRAK104_2210817220019_DHEAAPRILINDAUTAMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String Abu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String Bagas = input.nextLine();
        int nilaiAbu = 0, nilaiBagas = 0;
        String hasil;

        int ronde= Math.min(Abu.length(), Bagas.length());
        for (int i = 0; i < ronde; i++) {
            char tanganAbu = Abu.charAt(i);
            char tanganBagas = Bagas.charAt(i);

            if (tanganAbu == tanganBagas) {
            } else if ((tanganAbu == 'B' && tanganBagas == 'G') ||
                    (tanganAbu == 'G' && tanganBagas == 'K') ||
                    (tanganAbu == 'K' && tanganBagas == 'B')) {
                nilaiAbu++;
            } else {
                nilaiBagas++;
            }
        }
        if (nilaiAbu > nilaiBagas) {
            hasil = "Abu";
        } else if (nilaiAbu < nilaiBagas) {
            hasil = "Bagas";
        } else {
            hasil = "Seri";
        }
        System.out.println(hasil);
    }
}
