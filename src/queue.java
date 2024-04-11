import java.util.LinkedList;
import java.util.Queue;

public class queue {
    
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();


        //enqueue = offer()   or add()
        // dequeue = poll()
        // peek( ) = tells which is on the top or whos next


        queue.offer("vivek"); //add element at the end of the queue
        queue.offer("vicky");
        queue.offer("megh");
        queue.offer("Aiyush");

        queue.add("Rahul");  // throws exception if the queue is full, not applicable for linked list as

        System.out.println(queue);
        System.out.println(queue.peek());

        // queue.poll();
        // System.out.println(queue);

       System.out.println(queue.contains("vivek"));  // it will check if entered element is in the queue or not and after that it will return true or false
    }
}
