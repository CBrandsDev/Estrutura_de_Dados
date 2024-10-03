public interface Stackable {
    // Main Methods
    void stack(Object data);
    Object spy();
    void update(Object data);
    Object unstack();
    // Aux Methods
    boolean itsEmpty();
    boolean itsFull();
    String print();
}
