public class object {
    String Nama;
    double Berat;
    double Harga;
    double Jumlah;
    double sblmdiskon;
    double totaldiskon;
    double stlhdiskon;
    int diskon;

    public object(String nama, double berat, double harga, double jumlah){
        Nama = nama;
        Berat = berat;
        Harga = harga;
        Jumlah = jumlah;
    }

    void cetak() {
        sblmdiskon = (Jumlah/Berat)*Harga;
        diskon = (int) (Jumlah/4);
        totaldiskon = (Harga*0.08)*diskon;
        stlhdiskon = sblmdiskon-totaldiskon;
        System.out.println("Nama Buah : " + Nama);
        System.out.println("Berat : " + Berat );
        System.out.println("Harga : " + Harga);
        System.out.println("Jumlah Beli : " + Jumlah +"Kg");
        System.out.println("Harga Sebelum Diskon : Rp" + String.format("%.02f", sblmdiskon));
        System.out.println("Total Diskon : Rp" + String.format("%.02f", totaldiskon));
        System.out.println("Harga Setelah Diskon : Rp" + String.format("%.02f", stlhdiskon));
        System.out.println( );
    }
}
