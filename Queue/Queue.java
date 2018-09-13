/**
 * Queue
 */
public class Queue {

    private int maxSize;
    private long queArray[];
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    void enqueue(long j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queArray[++rear] = j;
        nItems++;
    }

    long dequeue() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;

        return temp;
    }

    boolean isEmpty() {
        return (nItems == 0);
    }
}
