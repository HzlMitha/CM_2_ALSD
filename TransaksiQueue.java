public class TransaksiQueue {
    TransaksiLayanan[] data;
    int front;
    int rear;
    int size;
    int max;

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
    
}
