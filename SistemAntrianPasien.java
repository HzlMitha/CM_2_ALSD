import java.util.Scanner;

public class SistemAntrianPasien {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        InputData input = new InputData(sc05);
        AntrianKlinik sistem = new AntrianKlinik();
        TransaksiQueue transaksiMasuk = new TransaksiQueue(100);

        int pilihan;
        do {
            System.out.println("=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi ");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc05.nextInt();
            sc05.nextLine();

            switch (pilihan) {
                case 1:
                    Pasien p = input.inputPasien();
                    sistem.tambahkanPasien(p);
                    break;

                case 2:
                    sistem.tampilkanAntrian();
                    break;

                case 3:
                    Pasien pasienDilayani = sistem.layaniPasien();
                    if (pasienDilayani != null) {
                        Dokter d = input.inputDokter();
                        TransaksiLayanan transaksi = input.inputDurasi(pasienDilayani, d);
                        transaksiMasuk.catatTransaksi(transaksi);
                    }
                    break;

                case 4:

                    break;

                case 5:
                    
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Pengelolaan Antrian Klinik");
                    break;

                default:
                    System.out.println("Pilihan menu tidak ada");
                    break;
            }
        } while (pilihan != 0);

        sc05.close();
    }
}
