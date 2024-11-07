public class BinaryHeap implements Heapifiable {
    private Object[] tree;
    private int endPointer;

    public BinaryHeap(int size) {
        tree = new Object[size];
        endPointer = -1;
    }
    public BinaryHeap() {
        this(10);
    }

    @Override
    public void insert(Object data) {
        if(!itsFull()) {
            endPointer++;
            tree[endPointer] = data;
            adjustAbove(endPointer);
        } else {
            System.err.println("Heap is full");
        }
    }
    private void adjustAbove(int index) {
        while(index > 0) {
            if((Integer) tree[index] < (Integer) tree[indexDad(index)]) {
                change(index, indexDad(index));
                index = indexDad(index);
            } else {
                break;
            }
        }
    }
    private void adjustBelow(int dad) {
        int leftSon = 2 * dad + 1;
        int rightSon = 2 * dad + 2;
        int  minus = dad;

        if(leftSon <= endPointer) {
            if((Integer) tree[leftSon] < (Integer) tree[minus]){
                minus = leftSon;
            }
        }

        if(rightSon <= endPointer) {
            if((Integer) tree[rightSon] < (Integer) tree[minus]) {
                minus = rightSon;
            }
        }

        if(minus != dad) {
            change(dad , minus);
            adjustBelow(minus);
        }
    }

    private void change(int i, int j) {
        Object temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }

    @Override
    public Object extract() {
        Object root = null;
        if(!itsEmpty()) {
            root = tree[0];
            tree[0] = tree[endPointer];
            endPointer--;
            adjustBelow(0);
        } else {
            System.err.println("Heap is Empty!");
        }
        return root;
    }

    @Override
    public Object obtainRoot() {
        Object rootData = null;
        if(!itsEmpty()) {
            rootData = tree[0];
        }
        return rootData;
    }
    @Override
    public  boolean itsEmpty() {
        return (endPointer == -1);
    }
    @Override
    public boolean itsFull() {
        return (endPointer == tree.length-1);
    }
    @Override
    public String print() {
        String result = "[";
        for(int i = 0; i < endPointer+1; i++) {
            if(i == endPointer) {
                result += tree[i];
            } else {
                result += tree[i] + ",";
            }
        }
        return result += "]";
    }
}
