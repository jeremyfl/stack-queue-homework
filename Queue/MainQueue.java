/**
 * MainQueue
 */
public class MainQueue {

    public static void main(String[] args) {
        Queue que = new Queue(5);

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);

        que.dequeue();
        que.dequeue();
        que.dequeue();

        que.enqueue(50);
        que.enqueue(60);
        que.enqueue(70);
        que.enqueue(80);

        while (!que.isEmpty()) {
            System.out.println(que.dequeue());
        }
    }
}
