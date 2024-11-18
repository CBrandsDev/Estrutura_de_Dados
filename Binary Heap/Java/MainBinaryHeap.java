public class MainBinaryHeap {

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(10);

        heap.insert(7);
        heap.insert(14);
        heap.insert(8);
        heap.insert(2);
        System.out.println(heap.print());
        System.out.println(heap.extract());
        System.out.println(heap.obtainRoot());
        System.out.println(heap.obtainRoot());
        System.out.println(heap.print());
    }
}
