public class AntrianKlinik {
    NodePasien head;
    NodePasien tail;
    int size = 0;

    boolean isEmpty() {
        return (head == null);
    }

    public void tambahkanPasien(Pasien input) {
        NodePasien ndInput = new NodePasien(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(">> Pasien masuk ke dalam antrian.");
        System.out.println();
    }

    public Pasien layaniPasien() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
            return null;
        } 
        Pasien pasienDilayani = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        System.out.println(">> Pasien " + pasienDilayani.nama + " dipanggil.");
        return pasienDilayani;
    }


    public void tampilkanAntrian() {
        if (!isEmpty()) {
            NodePasien tmp = head;
            System.out.println(">> Antrian Pasien:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println(">> Antrian Pasien kosong."); 
            System.out.println();
        }
    }
      

}
