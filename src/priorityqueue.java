import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
        // Queue<Double> queue =  new LinkedList<>();
        // Queue<Double> queue =  new PriorityQueue<>(); // in this it will priotrize like store in assnding order
        Queue<Double> queue =  new PriorityQueue<>(Collections.reverseOrder());// in this it will priotrize in desending order 
  // it works on alphabet also like A, N, M, V


        queue.offer(5.0);
        queue.offer(8.0);
        queue.offer(4.0);
        queue.offer(2.0);
        queue.offer(1.0);
        // System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
