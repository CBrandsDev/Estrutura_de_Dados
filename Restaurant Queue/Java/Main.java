public class Main {

    public static void main(String[] args) {
        Queueable queue = new Queue(10);
        queue.enqueue("Alisson");
        queue.call();
        queue.enqueue("João");
        queue.enqueue("Ana");
        queue.enqueue("Otavio");
        queue.dequeue();
        queue.call();
        queue.enqueue("Joana");
        queue.enqueue("Camila");
        queue.dequeue();
        queue.call();
        queue.dequeue();
        queue.call();
        queue.enqueue("Jessica");
        queue.enqueue("Pedro");
        queue.enqueue("Gustavo");
        queue.enqueue("Rafael");
        System.out.println(queue.print());
    }
    
}