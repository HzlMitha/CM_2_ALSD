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
        front = rear = -1;
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
    }

    public Pasien layaniPasienQueue(Dokter dokter,int durasiLayanan) {
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian");
            return null;
        }
        return antrian.layaniPasien();
    }

    public void catatTransaksi(TransaksiLayanan t) {
        tambahTransaksi(t);
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
        System.out.println();
    }
}
