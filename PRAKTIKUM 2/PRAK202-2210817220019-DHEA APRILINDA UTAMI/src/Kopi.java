public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    double pajak;

    private String pembeli;
    public String getPembeli() {
        return pembeli;
    }

    public void setPembeli(String newpembeli) {
        this.pembeli = newpembeli;
    }


    public double getPajak() {
        return pajak = (harga/100*11);
    }

    void info() {
        System.out.println("Nama Kopi : " + namaKopi);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Harga : Rp" + harga);
    }

}
