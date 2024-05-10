import java.util.ArrayList;
import java.util.LinkedList;

public class difarraylinked {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

            long startTime;
            long endTime;
            long elepsedTime;

            for (int i = 0; i < 1000000; i++) {
                linkedList.add(i);
                arrayList.add(i);
            }

            //linked list ******
            startTime = System.nanoTime();

            //do something

            linkedList.get(0);

            endTime = System.nanoTime();
            elepsedTime = endTime - startTime;

            System.out.println("linkedlist:\t"+ elepsedTime + "ns");
    }
}
