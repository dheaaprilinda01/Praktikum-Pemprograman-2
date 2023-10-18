public class Pegawai {
    public String nama;
    //public char asal;
    // harusya tidak mengunakn character tetapi mengunakan string karena jumalah datanya terdiri dari beberapa huruf
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    /*public void setJabatan() {
        this.jabatan = j;
    }*/
    // memasukan string dalam set jabatan string j
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
