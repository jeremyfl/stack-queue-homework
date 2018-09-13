/**
 * PriorityQueue
 */
public class PriorityQueue {

    private int maxSize;
    private int[] queArray;
    private int nItems;

    public PriorityQueue(int size) {
        this.maxSize = size;
        this.queArray = new int[this.maxSize];
        this.nItems = 0;
    }

    void enqueue(int item) {
        int j;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
            }

            queArray[j + 1] = item;
            nItems++;
        }
    }

    int dequeue() {
        return queArray[--nItems];
    }

    int peekMin() {
        return queArray[nItems - 1];
    }

    boolean isEmpty() {
        return (nItems == 0);
    }
}
