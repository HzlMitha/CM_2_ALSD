public class Pasien {
    String nama;
    String nik;
    String keluhan;

    public Pasien (String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    void tampilkanInformasi() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("NIK Pasien : " + nik);
        System.out.println("Keluhan  : " + keluhan);
    }
}