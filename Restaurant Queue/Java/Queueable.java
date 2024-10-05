interface Queueable {
    // Main Methods
    void enqueue(Object data);
    Object call();
    void update(Object data);
    Object dequeue();
    // Aux Methods
    boolean itsEmpty();
    boolean itsFull();
    String print();
}