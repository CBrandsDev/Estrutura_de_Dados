class Queue implements Queueable {

    private int initialPointer = 0;
    private int finalPointer = -1;
    private Object[] clients;

    public Queue(int size) {
        clients = new Object[size];
    }

    @Override
    public void enqueue(Object data) {
        if (!itsFull()) {
            finalPointer++;
            clients[finalPointer] = data;
        } else {
            System.out.println("The queue is full");
        }
    }

    @Override
    public Object call() {
        Object firstClient = null;
        if (!itsEmpty()) {
            firstClient = clients[initialPointer];
            System.out.println("The next customer is " + firstClient);
        } else {
            System.out.println("The queue is empty");
        }
        return firstClient;
    }

    @Override
    public void update(Object data) {
        if (!itsEmpty()) {
            clients[initialPointer] = data;
        } else {
            System.out.println("The queue is empty");
        }
    }

    @Override
    public Object dequeue() {
        Object nextClient = null;
        if (!itsEmpty()) {
            nextClient = clients[initialPointer];
            initialPointer++;
        } else {
            System.out.println("The queue is empty");
        }
        return nextClient;
    }

    @Override
    public boolean itsEmpty() {
        return initialPointer == finalPointer + 1;
    }

    @Override
    public boolean itsFull() {
        return finalPointer == clients.length - 1;
    }

    @Override
    public String print() {
        StringBuilder result = new StringBuilder("[");
        for (int i = initialPointer; i <= finalPointer; i++) {
            if (i == finalPointer) {
                result.append(clients[i]);
            } else {
                result.append(clients[i]).append(", ");
            }
        }
        return result.append("]").toString();
    }
}