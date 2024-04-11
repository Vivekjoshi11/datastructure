import java.util.LinkedList;

import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

// it can be use as both stack and queue..

//linkedlist as a stack
        // linkedList.push("A");
        // linkedList.push("B");                
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.pop();
        
        //linkedlist as a queue
        linkedList.offer("A");
        linkedList.offer("B");                
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();
        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());   // it remove head node
        System.out.println(linkedList.peekLast());  // it will remove tail
        
        linkedList.addFirst("0");
        linkedList.addLast("g");
        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        
        System.out.println(linkedList);
      }
}
