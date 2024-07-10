import java.util.ArrayList;
import java.util.LinkedList;

public class arraylist {

    public static void main(String[] args) {
        
    
    
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    ArrayList<Integer> arraylist = new ArrayList<Integer>();

    long startTime;
    long endTime;
    long elapsedTime;

    for(int i=0; i < 1000000; i++){
        linkedList.add(i);
        arraylist.add(i);
    }



    //  linked list  
   
    startTime = System.nanoTime();

    // linkedList.get(0);
    linkedList.get(500000);
    

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;
    System.out.println("LinkedList: " + elapsedTime + " nanoseconds");

    //  arraylist  

    startTime = System.nanoTime();

    // arraylist.get(0);
    arraylist.get(500000);
    

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;
    System.out.println("arrayList: " + elapsedTime + " nanoseconds");

}
}
