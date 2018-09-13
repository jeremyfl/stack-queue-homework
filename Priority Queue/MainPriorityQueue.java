/**
 * MainPriorityQueue
 */
public class MainPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);

        pq.enqueue(30);
        pq.enqueue(50);
        pq.enqueue(34);
        pq.enqueue(12);
        pq.enqueue(33);

        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }
    }
}
