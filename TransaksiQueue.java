public class TransaksiQueue {
    TransaksiLayanan[] data;
    int front;
    int rear;
    int size;
    int max;
    AntrianKlinik antrian = new AntrianKlinik();

    public TransaksiQueue(int n) {
        max = n;
        data = new TransaksiLayanan[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
    
    public void tambahTransaksi(TransaksiLayanan transaksi) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = transaksi;
        size++;
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
        System.out.println();
    }
    
    public void tampilkanRiwayatTransaksi(){
        System.out.println("--- Riwayat Transaksi ---");
        System.out.println("Daftar Transaksi:");
        if (isEmpty()) {
            System.out.println("(Belum ada transaksi yang dicatat)");
            return;
        }
        for (int i = 0; i < size; i++) {
            TransaksiLayanan t = data [i];
            System.out.println(t.pasien.nama + " (" + t.durasiLayanan + "jam): Rp. " + t.biaya);
        }
        System.out.println();
    }
}
