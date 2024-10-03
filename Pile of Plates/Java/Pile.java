public class Pile implements Stackable {
    
    private int topPointer;
    private Object plates[];

    public Pile(int size) {
        topPointer = -1;
        plates = new Object[size];
    }

    public Pile() {
        this(10);
    }

    @Override
    public void stack(Object data) {
        if(!itsFull()) {
            topPointer++;
            plates[topPointer] = data;
        } else {
            System.err.println("The stack is full");
        }
    }
    @Override
    public Object spy(){
        Object topData = null;
        if(!itsEmpty()) {
            topData = plates[topPointer];
        } else {
            System.err.println("The stack is empty");
        }
        return topData;
    }
    @Override
    public void update(Object data){
        if(!itsEmpty()) {
            plates[topPointer] = data;
        } else {
            System.err.println("The stack is empty");
        }
    }
    @Override
    public Object unstack(){
        Object topData = null;
        if(!itsEmpty()) {
            topData = plates[topPointer];
            topPointer--;
        }
        return topData;
    }

    @Override
    public boolean itsEmpty(){return (topPointer == -1);}
    @Override
    public boolean itsFull(){return (topPointer == plates.length - 1);}
    @Override
    public String print(){
        String result = "[";
        for(int i = topPointer; i >=0; i--) {
            if(i == 0) {
                result += plates[i];
            } else {
                result += plates[i] + ",";
            }
        }
        return result + "]";
    }

}
