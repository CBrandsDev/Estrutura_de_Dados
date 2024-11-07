public interface Heapifiable {
    void insert(Object data); // Create
    Object extract();  // Delete
    Object obtainRoot();

    String print();
    boolean itsEmpty();
    boolean itsFull();


}