package heap;

public class main {
    public static void main(String[] args) {

        BinaryHeap bh = new BinaryHeap();

        int[] nodes = {1, 12, 3 , 24, 19, 1, 50 , 16};

        for (int n : nodes){
            bh.minAdd(n);
        }

        System.out.println(bh.heap);
    }
}
