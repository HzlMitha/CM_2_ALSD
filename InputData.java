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
}
