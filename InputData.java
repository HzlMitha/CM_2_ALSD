import java.util.Scanner;

public class InputData {
    Scanner scan;
    
    public InputData(Scanner scan) {
        this.scan = scan;
    }

    public Pasien inputPasien() {
        System.out.println("=== Input Data Pasien ===");
        System.out.print("Nama    : ");
        String nama = scan.nextLine();
        System.out.print("NIK     : ");
        String nik = scan.nextLine();
        System.out.print("Keluhan : ");
        String keluhan = scan.nextLine();

        return new Pasien(nama, nik, keluhan);
    }

    public Dokter inputDokter() {
        System.out.println("=== Proses Pelayanan ===");
        System.out.print("ID Dokter : ");
        String idDokter = scan.nextLine();
        System.out.print("Nama Dokter : ");
        String namaDokter = scan.nextLine();

        return new Dokter(idDokter, namaDokter);
    }

    public TransaksiLayanan inputDurasi(Pasien pasien, Dokter dokter) {
        System.out.print("Durasi Layanan (jam) : ");
        int durasi = scan.nextInt();
        scan.nextLine();

        return new TransaksiLayanan(pasien, dokter, durasi);
    }
}
