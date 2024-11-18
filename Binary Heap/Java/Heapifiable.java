public interface Heapifiable {
    void insert(Object data); 
    Object extract();  
    Object obtainRoot();

    String print();
    boolean itsEmpty();
    boolean itsFull();


}