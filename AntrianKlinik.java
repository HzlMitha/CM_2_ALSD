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


}
