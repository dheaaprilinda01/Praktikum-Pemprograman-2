public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //p1.nama = "Roi"
        // diakhir teringgal ";"(tanda titik koma)
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        // menambahkan sintak yang tertinggal
        p1.umur = 17;
        p1.setJabatan("Assasin");
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //System.out.println("Umur: " + p1.umur);
        // menambahkan + tahun setelah umur
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
