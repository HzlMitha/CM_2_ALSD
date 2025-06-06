import java.util.Scanner;

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
        }
    }
      

}
